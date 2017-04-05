package user;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class NewUser{

    public TextField firstNameCredentials;
    public TextField lastNameCredentials;

    private static Stage window;

    public static void display() throws IOException {
        window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle("New User Credentials");

        window.setScene(new Scene(FXMLLoader.load(NewUser.class.getResource("newUser.fxml"))));

        window.showAndWait();
    }

    public void validate()
    {

    }

     public void cancel()
    {
        window.close();
    }
}
