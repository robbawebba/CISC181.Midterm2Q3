package customerInformation;

import java.io.IOException; 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import customerInformation.view.CustomerController;

public class MainApp extends Application {
	
	private Stage primaryStage; 

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		primaryStage.setTitle("Customer Information");
		
		showCustomerScreen();	
	}

	private void showCustomerScreen() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/CustomerScreen.fxml"));
			AnchorPane customerScreen = (AnchorPane) loader.load();

			Scene customerScene = new Scene(customerScreen);

			primaryStage.setScene(customerScene);
			primaryStage.show();

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		launch(args);
	}
}
