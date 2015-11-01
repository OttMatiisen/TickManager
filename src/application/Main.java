package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private Scene createMainScene(BorderPane root){
		Scene scene = new Scene(root, 400, 250);
		Tab allTab = new Tab("All");
		Tab personalTab = new Tab("Personal");
		TabPane pane = new TabPane();
		pane.getTabs().add(allTab);
		pane.getTabs().add(personalTab);
		root.setCenter(pane);
		return scene;
	}

	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = createMainScene(root);
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
