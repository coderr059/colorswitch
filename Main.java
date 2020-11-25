package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.shape.*;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//other gui components are commented out 
		try {
			//Homepage display
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("HomePage.fxml"));
			
			//obstacles animation
			/*AnchorPane obs = (AnchorPane)FXMLLoader.load(getClass().getResource("Obstacle.fxml"));
			Rectangle bg=new Rectangle(600,600);
			bg.setFill(Color.BLACK);
			Group root=new Group(bg,obs);*/
			
			//Settings
			//AnchorPane obs = (AnchorPane)FXMLLoader.load(getClass().getResource("Settings.fxml"));
			
			//Resume game display
			//AnchorPane obs = (AnchorPane)FXMLLoader.load(getClass().getResource("resume.fxml"));
			Scene scene = new Scene(root,600,600);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
