package de.uzl.ifis.Starqlpostgres.View;

import de.uzl.ifis.Starqlpostgres.Main.Constants;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MappingInputView extends ScrollPane {
	private Button loadMapping;
	private Button backMapping;
	private Button nextMapping;
	private TextArea mappingTextArea;
	
	public MappingInputView() {
		Label infoMapping = new Label("Please enter a Mapping:");
		infoMapping.setMinWidth(Constants.WINDOW_X - 40);
		mappingTextArea = new TextArea();
		mappingTextArea.setMaxWidth(Constants.WINDOW_X - 40);
		mappingTextArea.setMinHeight(400);

		/**
		 * HBox mappingControl
		 */
		HBox mappingControl = new HBox();
		mappingControl.setAlignment(Pos.CENTER);

		loadMapping = new Button("Load");
		loadMapping.setMinWidth(150);
		loadMapping.setMinHeight(30);
		backMapping = new Button("Back");
		backMapping.setMinWidth(150);
		backMapping.setMinHeight(30);
		nextMapping = new Button("Run Query");
		nextMapping.setMinWidth(150);
		nextMapping.setMinHeight(30);

		mappingControl.getChildren().addAll(backMapping, loadMapping, nextMapping);

		/**
		 * VBox mappingVBox
		 */
		VBox mappingVBox = new VBox();
		mappingVBox.getChildren().addAll(infoMapping, mappingTextArea, mappingControl);
		mappingVBox.setSpacing(5);
		mappingVBox.setAlignment(Pos.CENTER);

		setFitToHeight(true);
		setFitToWidth(true);
		setContent(mappingVBox);
	}

	public Button getLoadMapping() {
		return loadMapping;
	}

	public Button getBackMapping() {
		return backMapping;
	}

	public Button getNextMapping() {
		return nextMapping;
	}

	public TextArea getMappingTextArea() {
		return mappingTextArea;
	}
}
