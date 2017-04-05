import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.web.HTMLEditor;
import user.NewUser;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public Button addUser;

//    public Button removeUser;

    public Button saveButton;



    public TableView<Person> userTable;
    public TableColumn<Person, String> username;
    public TableColumn<Person, String> firstName;
    public TableColumn<Person, String> lastName;
    public TableColumn<Person, String> primaryEmail;

    public HTMLEditor htmlEditor;

    public Tab profileTab;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        username.setCellValueFactory(new PropertyValueFactory<>("username"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        userTable.getItems().add(new Person());

        toolBar = htmlEditor.lookupAll(".tool-bar").toArray(new Node[0]);

        profileTab.closableProperty().setValue(true);
    }

    public void addUser() throws IOException {
        NewUser.display();
    }

    private Node[] toolBar;

    public void toggleHTMLFormatter() {
//        htmlEditor.lookup("ToolBar").setVisible(false);
        htmlEditor.setVisible(false);
        Platform.runLater(() -> {

            for(Node node : toolBar)
            {
                node.setVisible(!node.isVisible());
                node.setManaged(!node.isManaged());
            }
            htmlEditor.setVisible(true);
        });
    }
}
