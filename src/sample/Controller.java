package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {


    public void returnToServer(ActionEvent event) {
        System.out.println("You clicked me!");
        //Here I want to swap the screen!
        // Swap screen
//        currentStage.setScene(new Scene(new Pane()));
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CategoryScene.fxml"));
            Stage currentStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            currentStage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }

    }

}
