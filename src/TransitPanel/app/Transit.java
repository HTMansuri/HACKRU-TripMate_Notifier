package TransitPanel.app;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import TransitPanel.control.DepartureVisionController;
import TransitPanel.control.TransitData;

public class Transit extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		try
		{
			TransitData.readFromAFile();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/DepartureVision.fxml"));
			primaryStage.setTitle("Transit");
			AnchorPane root = (AnchorPane)loader.load();
			DepartureVisionController msc = loader.getController();
			msc.start();
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}