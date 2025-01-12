package sample;
import com.sun.javafx.fxml.FXMLLoaderHelper;
import dataClass.MovieReviewData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import validation.DateConverter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

//public class Controller1 { @FXML
//private TextField ReviewerNameTextField;
//
//  @FXML
//  private ComboBox<String> MovieNameComboBox;
//
//  @FXML
//  private RadioButton StoryRating5StarsRadioButton;
//
//  @FXML
//  private RadioButton StoryRating4StarsRadioButton;
//
//  @FXML
//  private RadioButton StoryRating3StarsRadioButton;
//
//  @FXML
//  private RadioButton StoryRating2StarsRadioButton;
//
//  @FXML
//  private RadioButton StoryRating1StarsRadioButton;
//
//  @FXML
//  private RadioButton ActingRating5StarsRadioButton;
//
//  @FXML
//  private RadioButton ActingRating4StarsRadioButton;
//
//  @FXML
//  private RadioButton ActingRating3StarsRadioButton;
//
//  @FXML
//  private RadioButton ActingRating2StarsRadioButton;
//
//  @FXML
//  private RadioButton ActingRating1StarsRadioButton;
//
//  @FXML
//  private RadioButton DialogueRating5StarsRadioButton;
//
//  @FXML
//  private RadioButton DialogueRating4StarsRadioButton;
//
//  @FXML
//  private RadioButton DialogueRating3StarsRadioButton;
//
//  @FXML
//  private RadioButton DialogueRating2StarsRadioButton;
//
//  @FXML
//  private RadioButton DialogueRating1StarsRadioButton;
//
//  @FXML
//  private RadioButton VisualRating5StarsRadioButton;
//
//  @FXML
//  private RadioButton VisualRating4StarsRadioButton;
//
//  @FXML
//  private RadioButton VisualRating3StarsRadioButton;
//
//  @FXML
//  private RadioButton VisualRating2StarsRadioButton;
//
//  @FXML
//  private RadioButton VisualRating1StarsRadioButton;
//
//  @FXML
//  private DatePicker dateOfReviewPicker;
//
//  @FXML
//  private TextField ShortReviewMassageTextField;
//
//  @FXML
//  private Button TakeInput;
//
//  @FXML
//  private ListView<MovieReviewData> MovieListView;
//
//  @FXML
//  private Button EditSelectedMovieReviewButton;
//
//  @FXML
//  private Button ViewDetailButton;
//
//  @FXML
//  void HandleClearFormButtonClicked(ActionEvent event) {
//    this.resetUI();
//
//  }
//
//  @FXML
//  void HandleEditSelectedMovieReviewButtonClicked(ActionEvent event) {
//
//  }
//
//  @FXML
//  void HandleViewDetailButtonClicked(ActionEvent event) {
//
//  }
//
//
//
//  @FXML
//  void handleTextViewClicked(MouseEvent event) {
//
//  }
//
//  @FXML
//  private Button ViewLatestReviewButton;
//
//  private final ToggleGroup ActingRatingToggleGroup = new ToggleGroup();
//  private final ToggleGroup StoryRatingToggleGroup = new ToggleGroup();
//  private final ToggleGroup DialogueRatingToggleGroup = new ToggleGroup();
//  private final ToggleGroup VisualRatingToggleGroup = new ToggleGroup();
//
////  private HashSet<MovieReviewData> MovieReviewList;
//
//  //private ArrayList<MovieReviewData> MovieReviewList;
//  private ArrayList<MovieReviewData> MovieReviewList=null;
//  private ObservableList<MovieReviewData> ObservableMovieReviewList=null;
//
//  @FXML
//  void handleViewLatestReviewButtonClick(ActionEvent event) throws IOException {
//
//    //got the latest object
//    MovieReviewData latest=this.MovieReviewList.get(this.MovieReviewList.size()-1);
//
//
//    //loaded the fxml, get the controller,transferred object
//    System.out.println("Clicking latest review button");
//    FXMLLoader loader=new FXMLLoader(getClass().getResource("DetailView.Fxml"));
//    Pane root=(Pane) loader.load();
//    DetailViewController detailViewController=loader.getController();
//    detailViewController.setMovieReviewDataObject(latest);
//
//
//    //For showing the newly loaded DetailView fxml
//    Stage detailViewStage= new Stage();
//    Scene detailViewScene= new Scene(root);
//    detailViewStage.setScene(detailViewScene);
//    detailViewStage.setTitle("Detail view");
//    detailViewStage.sizeToScene();
//    detailViewStage.show();
//
//
//
//  }
//
//
//
//  @FXML
//  void handleTakeInputButtonNext(ActionEvent event) {
////    System.out.println("You are Clicking 'Next' button,It Is inside handleTakeInputButtonNext method , which is handler of next button");
//    String ReviewerName= this.ReviewerNameTextField.getText();
//    String MovieOrTvSeriesName= this.MovieNameComboBox.getSelectionModel().getSelectedItem();
//    String ShortReview=this.ShortReviewMassageTextField.getText();
//    LocalDate chooseDate=(this.dateOfReviewPicker.getValue());
//
//
//
//
//
////    int StoryRating= (int) this.StoryRatingToggleGroup.getSelectedToggle().getUserData();
//
//    String StoryRating= null;
//    if (this.StoryRatingToggleGroup.getSelectedToggle() != null){
//      StoryRating = (String) this.StoryRatingToggleGroup.getSelectedToggle().getUserData();
//    }
//
////    int ActingRating= (int) this.ActingRatingToggleGroup.getSelectedToggle().getUserData();
//    String ActingRating=null;
//    if (this.ActingRatingToggleGroup.getSelectedToggle()!=null){
//      ActingRating= (String) this.ActingRatingToggleGroup.getSelectedToggle().getUserData();
//    }
////   int DialogueRating= (int) this.DialogueRatingToggleGroup.getSelectedToggle().getUserData();
//    String DialogueRating=null;
//    if (this.DialogueRatingToggleGroup.getSelectedToggle()!=null){
//      DialogueRating= (String) this.DialogueRatingToggleGroup.getSelectedToggle().getUserData();
//    }
////    int VisualRating= (int) this.VisualRatingToggleGroup.getSelectedToggle().getUserData();
//    String VisualRating =null;
//    if (this.VisualRatingToggleGroup.getSelectedToggle()!=null){
//      VisualRating= (String) this.VisualRatingToggleGroup.getSelectedToggle().getUserData();
//    }
//
//
//
//
//    System.out.println("Information:");
//    System.out.println(ReviewerName);
//    System.out.println(MovieOrTvSeriesName);
//    System.out.println("Story Rating:"+StoryRating);
//    System.out.println("Acting Rating:"+ActingRating);
//    System.out.println("Dialogue Rating:"+DialogueRating);
//    System.out.println("Visual Rating:"+VisualRating);
//
//    try {
//      MovieReviewData MovieReviewObject=new MovieReviewData(ReviewerName,MovieOrTvSeriesName,StoryRating,ActingRating,DialogueRating,VisualRating,ShortReview,chooseDate);
//      System.out.println(MovieReviewObject);
//      this.MovieReviewList.add((MovieReviewData) MovieReviewObject);
//      this.ObservableMovieReviewList.add(MovieReviewObject);
//      System.out.println(this.MovieReviewList);
//      this.resetUI();   // resetUI method will clear the form
//    } catch (Exception exception){
//      System.err.println(exception.getMessage());
////      System.err.println(exception.toString());
//
//    }
//
//  }
//
//
//
//  //This method will help us to clear out the form in the display
//  public void resetUI(){
//    this.ReviewerNameTextField.setText("");
//    this.MovieNameComboBox.setValue(null);
//    this.StoryRatingToggleGroup.selectToggle(null);
//    this.ActingRatingToggleGroup.selectToggle(null);
//    this.DialogueRatingToggleGroup.selectToggle(null);
//    this.VisualRatingToggleGroup.selectToggle(null);
//    this.ShortReviewMassageTextField.setText("");
//    this.dateOfReviewPicker.setValue(null);
//  }
//
//
//
//
//
//  public void initialize(){
//    System.out.println("From initialize Method");
//
//    //TODO: replace with deserialization call
//    this.MovieReviewList=new ArrayList<>();
//    this.ObservableMovieReviewList=FXCollections.observableArrayList(MovieReviewList);
//    this.MovieListView.setItems(ObservableMovieReviewList);
//
//
//
//
//    //    this.MovieReviewList=new HashSet<>();
//    this.MovieReviewList=new ArrayList<>();
//
//    // (Movie / TV series Combo Box)
//    ArrayList<String> MovieAndTvSeriesOption=new ArrayList<>();
//    MovieAndTvSeriesOption.add("The God Father");
//    MovieAndTvSeriesOption.add("Parasite");
//    MovieAndTvSeriesOption.add("Departed");
//    MovieAndTvSeriesOption.add("The Dark Knight");
//    MovieAndTvSeriesOption.add("Joker");
//    MovieAndTvSeriesOption.add("Breaking Bad");
//    MovieAndTvSeriesOption.add ("Batter call saul");
//    MovieAndTvSeriesOption.add("Inception");
//    MovieAndTvSeriesOption.add("Interstellar");
//    MovieAndTvSeriesOption.add("Martian");
//    MovieAndTvSeriesOption.add("Lord of the Rings");
//    MovieAndTvSeriesOption.add("Gladiator");
//
//    ObservableList<String> MovieAndTvSeriesObservableArrayList= FXCollections.observableArrayList(MovieAndTvSeriesOption);
//    this.MovieNameComboBox.setItems(MovieAndTvSeriesObservableArrayList);
//
//
//
//
//    //    Fixing the Radio Buttons , with toggle group :
//    //    1.Radio Button of "Story Rating":
//    this.StoryRating5StarsRadioButton.setToggleGroup(StoryRatingToggleGroup);
//    this.StoryRating5StarsRadioButton.setUserData("5");
//    this.StoryRating4StarsRadioButton.setToggleGroup(StoryRatingToggleGroup);
//    this.StoryRating4StarsRadioButton.setUserData("4");
//    this.StoryRating3StarsRadioButton.setToggleGroup(StoryRatingToggleGroup);
//    this.StoryRating3StarsRadioButton.setUserData("3");
//    this.StoryRating2StarsRadioButton.setToggleGroup(StoryRatingToggleGroup);
//    this.StoryRating2StarsRadioButton.setUserData("2");
//    this.StoryRating1StarsRadioButton.setToggleGroup(StoryRatingToggleGroup);
//    this.StoryRating1StarsRadioButton.setUserData(1);
//
////    2.Radio Button of "Acting Rating":
//    this.ActingRating5StarsRadioButton.setToggleGroup(ActingRatingToggleGroup);
//    this.ActingRating5StarsRadioButton.setUserData("5");
//    this.ActingRating4StarsRadioButton.setToggleGroup(ActingRatingToggleGroup);
//    this.ActingRating4StarsRadioButton.setUserData("4");
//    this.ActingRating3StarsRadioButton.setToggleGroup(ActingRatingToggleGroup);
//    this.ActingRating3StarsRadioButton.setUserData("3");
//    this.ActingRating2StarsRadioButton.setToggleGroup(ActingRatingToggleGroup);
//    this.ActingRating2StarsRadioButton.setUserData("2");
//    this.ActingRating1StarsRadioButton.setToggleGroup(ActingRatingToggleGroup);
//    this.ActingRating1StarsRadioButton.setUserData("1");
//
////    3.Radio Button of "Dialogue Rating":
//    this.DialogueRating5StarsRadioButton.setToggleGroup(DialogueRatingToggleGroup);
//    this.DialogueRating5StarsRadioButton.setUserData("5");
//    this.DialogueRating4StarsRadioButton.setToggleGroup(DialogueRatingToggleGroup);
//    this.DialogueRating4StarsRadioButton.setUserData("4");
//    this.DialogueRating3StarsRadioButton.setToggleGroup(DialogueRatingToggleGroup);
//    this.DialogueRating3StarsRadioButton.setUserData("3");
//    this.DialogueRating2StarsRadioButton.setToggleGroup(DialogueRatingToggleGroup);
//    this.DialogueRating2StarsRadioButton.setUserData("2");
//    this.DialogueRating1StarsRadioButton.setToggleGroup(DialogueRatingToggleGroup);
//    this.DialogueRating1StarsRadioButton.setUserData("1");
//
////    4.Radio Button of "Visual Rating":
//    this.VisualRating5StarsRadioButton.setToggleGroup(VisualRatingToggleGroup);
//    this.VisualRating5StarsRadioButton.setUserData("5");
//    this.VisualRating4StarsRadioButton.setToggleGroup(VisualRatingToggleGroup);
//    this.VisualRating4StarsRadioButton.setUserData("4");
//    this.VisualRating3StarsRadioButton.setToggleGroup(VisualRatingToggleGroup);
//    this.VisualRating3StarsRadioButton.setUserData("3");
//    this.VisualRating2StarsRadioButton.setToggleGroup(VisualRatingToggleGroup);
//    this.VisualRating2StarsRadioButton.setUserData("2");
//    this.VisualRating1StarsRadioButton.setToggleGroup(VisualRatingToggleGroup);
//    this.VisualRating1StarsRadioButton.setUserData("1");
//
//
//  }

//}
