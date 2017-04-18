package de.uzl.ifis.Starqlpostgres.View;

import de.uzl.ifis.Starqlpostgres.Main.Constants;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class OntologyInputView extends ScrollPane {
	private Button loadOntology;
	private Button backOntology;
	private Button nextOntology;
	private TextArea ontologyTextArea;

	public OntologyInputView() {
		
		Label infoOntology = new Label("Please enter a Ontology:");
		infoOntology.setMinWidth(Constants.WINDOW_X - 40);
		ontologyTextArea = new TextArea();
		ontologyTextArea.setMaxWidth(Constants.WINDOW_X - 40);
		ontologyTextArea.setMinHeight(400);

		/**
		 * HBox ontologyControl
		 */
		HBox ontologyControl = new HBox();
		ontologyControl.setAlignment(Pos.CENTER);

		loadOntology = new Button("Load");
		loadOntology.setMinWidth(150);
		loadOntology.setMinHeight(30);
		backOntology = new Button("Back");
		backOntology.setMinWidth(150);
		backOntology.setMinHeight(30);
		nextOntology = new Button("Next");
		nextOntology.setMinWidth(150);
		nextOntology.setMinHeight(30);

		ontologyControl.getChildren().addAll(backOntology, loadOntology, nextOntology);

		/**
		 * VBox ontologyVBox
		 */
		VBox ontologyVBox = new VBox();
		ontologyVBox.getChildren().addAll(infoOntology, ontologyTextArea, ontologyControl);
		ontologyVBox.setSpacing(5);
		ontologyVBox.setAlignment(Pos.CENTER);

		setFitToHeight(true);
		setFitToWidth(true);
		setContent(ontologyVBox);
	}

	public Button getLoadOntology() {
		return loadOntology;
	}

	public Button getBackOntology() {
		return backOntology;
	}

	public Button getNextOntology() {
		return nextOntology;
	}

	public TextArea getOntologyTextArea() {
		return ontologyTextArea;
	}
}
