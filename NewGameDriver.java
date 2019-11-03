package application;




import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import java.awt.*;
import java.util.*;
import org.w3c.dom.events.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import javafx.scene.image;
import javafx.scene.image.ImageView;

public class NewGameDriver {
	@FXML
	public ImageView basicZom1;
	
    public void ExitButton(){
        System.exit(0);
    }
    
    public void Loadmainscreen()
    {
    	try
    	{
    		
    		
    		basicZom1 = new ImageView();
    		basicZom1.setX(600);
    		basicZom1.setFocusTraversable(true);
    		
    		AnimationTimer timer = new AnimationTimer() {
				
				@Override
				public void handle(long now) {
					System.out.println("moving left");
					basicZom1.setX(basicZom1.getX() - 0.2);
				}
			};
			timer.start();
    		
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello.fxml"));
    		Parent root = (Parent) fxmlLoader.load();
    		Stage stage = new Stage();
    		stage.setTitle("zombieRun");
    		stage.setScene(new Scene(root));  
    		stage.show();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}





