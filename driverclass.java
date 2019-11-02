package application;


import javafx.fxml.FXML;
import java.awt.*;
import java.util.*;
import org.w3c.dom.events.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class driverclass{
    
	@FXML
    public void ExitButton(){
        System.exit(0);
    }
    
    @FXML
    public void Loadmainscreen()
    {
    	try
    	{
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Mainscreen.fxml"));
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
}