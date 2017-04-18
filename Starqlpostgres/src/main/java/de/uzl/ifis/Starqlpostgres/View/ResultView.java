package de.uzl.ifis.Starqlpostgres.View;

import de.uzl.ifis.Starqlpostgres.Main.Constants;
import de.uzl.ifis.Starqlpostgres.Model.Model;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ResultView extends ScrollPane {
	private Model model;
	
	private Button backResult;
	private Button saveToTextFile;
	private Button beendenResult;
	
	private TextArea starqlOutputArea;
	
	public ResultView() {
		Label infoMapping = new Label("Output Console:");
		infoMapping.setMinWidth(Constants.WINDOW_X - 40);
		starqlOutputArea = new TextArea();
		starqlOutputArea.setMaxWidth(Constants.WINDOW_X - 40);
		starqlOutputArea.setMinHeight(400);

		/**
		 * HBox resultHBox
		 */
		HBox resultHBox = new HBox();
		
		backResult = new Button("Back");
		backResult.setMinWidth(170);
		backResult.setMinHeight(30);
		saveToTextFile = new Button("Save Result to File");
		saveToTextFile.setMinWidth(170);
		saveToTextFile.setMinHeight(30);
		beendenResult = new Button("Beenden");
		beendenResult.setMinWidth(170);
		beendenResult.setMinHeight(30);
		
		resultHBox.getChildren().addAll(backResult, saveToTextFile, beendenResult);
		resultHBox.setAlignment(Pos.CENTER);
		
		/**
		 * VBox resultVBox
		 */
		VBox resultVBox = new VBox();
		resultVBox.getChildren().addAll(starqlOutputArea, resultHBox);
		resultVBox.setAlignment(Pos.CENTER);
		resultVBox.setSpacing(5);
		
		setFitToHeight(true);
		setFitToWidth(true);
		setContent(resultVBox);
	}

	public Button getBackResult() {
		return backResult;
	}

	public Button getSaveToTextFile() {
		return saveToTextFile;
	}

	public Button getBeendenResult() {
		return beendenResult;
	}
	
	public void update() {
		starqlOutputArea.setText(model.getLog());
	}
	
	public void setModel(Model model) {
		this.model = model;
	}
}
