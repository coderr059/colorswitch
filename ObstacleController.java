package application;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.animation.Timeline;
//import javafx.animation.KeyFrame;
import javafx.beans.property.*;
import javafx.util.Duration;
//import javafx.collections.ObservableList;
import javafx.animation.*;

public class ObstacleController {
	@FXML
	ImageView rotateImage;
	
	
	Timeline rotate = new Timeline();
	
	public void rotateImage() {
		DoubleProperty r=rotateImage.rotateProperty();
		
		rotate.getKeyFrames().addAll(
			new KeyFrame (new Duration(0) , new KeyValue(r,0)),
			new KeyFrame (new Duration(1000) , new KeyValue(r,-360))
		);
			rotate.setCycleCount(Animation.INDEFINITE);
			rotate.play();
		}
	}
	

