package de.uzl.ifis.Starqlpostgres.View;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class ComputeView extends ScrollPane {
	private ProgressBar progressBar;
	
	public ComputeView() {
		Label waitLabel = new Label("Please wait...");
		
		progressBar = new ProgressBar();
		progressBar.setMinWidth(500);
		progressBar.setMinHeight(20);
		progressBar.setCenterShape(true);
		
		setFitToWidth(true);
		setFitToHeight(true);
		
		VBox barVBox = new VBox();
		barVBox.setAlignment(Pos.CENTER);
		barVBox.setSpacing(5);
		barVBox.getChildren().addAll(waitLabel, progressBar);
		
		setContent(barVBox);
	}
	
	public ProgressBar getProgressBar() {
		return progressBar;
	}
}
