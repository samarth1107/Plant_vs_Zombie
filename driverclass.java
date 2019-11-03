package application;


import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import java.awt.*;
import java.io.IOException;
import java.util.*;
import org.w3c.dom.events.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import javafx.scene.image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


public class driverclass{
    
	@FXML
	public ImageView basicZom1;
	@FXML
	public ImageView peeshoot;
	@FXML
	public ImageView pea;
	@FXML
	public ImageView sun;
	@FXML
	public Text Coins;
	
    public void ExitButton(){
        System.exit(0);
    }
    @FXML
    public void moveZombie() {
//    	basicZom1 = new ImageView();
    	System.out.println("kuch bhi likh de");
		basicZom1.setX(600);
		basicZom1.setFocusTraversable(true);
		
		AnimationTimer timer = new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				System.out.println("moving left");
				if(basicZom1.getX()!= 0) {
					basicZom1.setX(basicZom1.getX() - 0.2);
				}
			}
		};
		timer.start();
    }
    
    @FXML
    public void getPeeShooter() {
    	
    	
    	sun.setY(0);
    	peeshoot.setX(200);
//    	peeshoot.setY(600);
    	peeshoot.setFocusTraversable(true);
    	
    	
    	pea.setX(200);
    	pea.setFocusTraversable(true);
    	
    	AnimationTimer timer = new AnimationTimer() {
    		@Override
    		public void handle(long now) {
    			System.out.println("moving right");
//    			if(pea.getX() <= );)
    			pea.setX(pea.getX() + 0.5);
    			
    			sun.setY(sun.getY() + 0.1);
    		}
    	};
    	timer.start();
    	
    }
    
    @FXML
    public void Loadmainscreen()
    {
    	try
    	{
    		
    		
//    		basicZom1 = new ImageView();
//    		basicZom1.setX(600);
//    		basicZom1.setFocusTraversable(true);
//    		
//    		AnimationTimer timer = new AnimationTimer() {
//				
//				@Override
//				public void handle(long now) {
//					System.out.println("moving left");
//					basicZom1.setX(basicZom1.getX() - 0.2);
//				}
//			};
//			timer.start();
//    		
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello.fxml"));
    		Parent root = (Parent) fxmlLoader.load();
    		Stage stage = new Stage();
    		stage.setTitle("Mainscreen");
    		stage.setScene(new Scene(root));  
    		stage.show();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    @FXML
    public void collectSun() {
    	sun.setY(0);
//    	Coins += 25;
    
    	
    }
}