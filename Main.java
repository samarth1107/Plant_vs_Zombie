package application;
	
import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.animation.AnimationTimer;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) 
	{
//		Image image = new Image("file:application.jpeg");
//		
//		ImageView mv = new ImageView(image);
//			
//		Group root = new Group();
//		root.getChildren().addAll(mv);
//		
//		Scene scene = new Scene(root,500,300);
//		Stage stage = new Stage();
//		stage.setScene(scene);
//		stage.setResizable(false);
//		stage.show();
//		
//		try 
//		{
//			File driverFile,lawn;
//			ImageView ivDiver = new ImageView();
//			ImageView ivZom = new ImageView();
//			
//			driverFile = new File("/Users/general/eclipse-workspace/PlantVZOM/src/application.jpeg");
//			lawn = new File("/Users/general/eclipse-workspace/PlantVZOM/src/application/mainBG.png");
//			
//			
//			if(driverFile.exists()) {
//				Image driverImage = new Image(driverFile.toURI().toString());
//	            ivDiver.setImage(driverImage);
//			}
//			if(lawn.exists()) {
//				Image zomImage = new Image(lawn.toURI().toString());
//				ivZom.setImage(zomImage);
//			}
//			
//			
//			ivDiver.setX(600.0);
//			
//			ivDiver.setFocusTraversable(true);
//			ivZom.setFocusTraversable(true);
//			
//			AnimationTimer timer = new AnimationTimer() {
//				
//				@Override
//				public void handle(long now) {
//					System.out.println("moving zombie left");
//					ivDiver.setX(ivDiver.getX() - 0.02);
//				}
//			};
//			timer.start();
////			
////			StackPane stackPane = new StackPane();
////			stackPane.getChildren().addAll(ivZom,ivDiver))
////			
//			Pane root = new Pane();
//			root.getChildren().addAll(ivZom,ivDiver);
//			Scene scene = new Scene(root,600,800);
//			
//			
//			
////			Parent root = FXMLLoader.load(getClass().getResource("Loading.fxml"));
//			primaryStage.setTitle("Transition!!");
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} 
//		catch(Exception e) 
//		{
//			e.printStackTrace();
//		}
		
		
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("Loading.fxml"));
			primaryStage.setTitle("Loading screen");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
