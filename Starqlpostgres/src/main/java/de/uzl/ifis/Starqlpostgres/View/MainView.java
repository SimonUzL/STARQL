package de.uzl.ifis.Starqlpostgres.View;

import de.uzl.ifis.Starqlpostgres.Main.Constants;
import de.uzl.ifis.Starqlpostgres.Model.Model;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainView {
	private Scene scene;
	private Model model;
	private WelcomeView welcomeView = new WelcomeView();
	private StarqlInputView starqlInputView = new StarqlInputView();
	private OntologyInputView ontologyInputView = new OntologyInputView();
	private MappingInputView mappingInputView = new MappingInputView();
	private ComputeView computeView = new ComputeView();
	private ResultView resultView = new ResultView();
	
	public MainView(Model model) {
		this.model = model;
		welcomeView.setModel(model);
		welcomeView.update();
		this.scene = new Scene(welcomeView, Constants.WINDOW_X, Constants.WINDOW_Y);
		starqlInputView.translateXProperty().bind(scene.widthProperty().subtract(starqlInputView.widthProperty()).divide(2));
		ontologyInputView.translateXProperty().bind(scene.widthProperty().subtract(ontologyInputView.widthProperty()).divide(2));
		mappingInputView.translateXProperty().bind(scene.widthProperty().subtract(mappingInputView.widthProperty()).divide(2));
		resultView.translateXProperty().bind(scene.widthProperty().subtract(resultView.widthProperty()).divide(2));
		computeView.translateXProperty().bind(scene.widthProperty().subtract(starqlInputView.widthProperty()).divide(2));
		computeView.setDisable(true);
	}
	
	public void setWelcomeView() {
		this.scene.setRoot(welcomeView);
	}
	
	public WelcomeView getWelcomeView() {
		return welcomeView;
	}
	
	public void setStarqlInputView() {
		this.scene.setRoot(starqlInputView);
	}
	
	public StarqlInputView getStarqlInputView() {
		return starqlInputView;
	}
	
	public void setOntologyInputView() {
		this.scene.setRoot(ontologyInputView);
	}
	
	public OntologyInputView getOntologyInputView() {
		return ontologyInputView;
	}
	
	public void setMappingInputView() {
		this.scene.setRoot(mappingInputView);
	}
	
	public MappingInputView getMappingInputView() {
		return mappingInputView;
	}
	
	public void setComputeView() {
		computeView.setDisable(false);
		this.scene.setRoot(computeView);
	}
	
	public ComputeView getComputeView() {
		return computeView;
	}
	
	public void setResultView() {
		computeView.setDisable(true);
		resultView.setModel(model);
		resultView.update();
		this.scene.setRoot(resultView);
	}
	
	public void warn() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Connection Error");
		alert.setHeaderText("Connection exception");
		alert.setContentText("Could not connect to the database! ");
		alert.showAndWait();
	}
	
	public ResultView getResultView() {
		return resultView;
	}
	
	public Scene getScene() {
        return scene;
    }
}
