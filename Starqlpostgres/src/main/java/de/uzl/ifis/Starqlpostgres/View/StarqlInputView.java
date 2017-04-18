package de.uzl.ifis.Starqlpostgres.View;

import de.uzl.ifis.Starqlpostgres.Main.Constants;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class StarqlInputView extends ScrollPane {

	private Button loadStarql;
	private Button backStarql;
	private Button nextStarql;
	private TextArea starqlTextArea;

	public StarqlInputView() {
		Label infoStarql = new Label("Please enter a STARQL Query:");
		infoStarql.setMinWidth(Constants.WINDOW_X - 40);
		starqlTextArea = new TextArea();
		starqlTextArea.setMaxWidth(Constants.WINDOW_X - 40);
		starqlTextArea.setMinHeight(400);

		/**
		 * HBox starqlControl
		 */
		HBox starqlControl = new HBox();
		starqlControl.setAlignment(Pos.CENTER);

		loadStarql = new Button("Load");
		loadStarql.setMinWidth(150);
		loadStarql.setMinHeight(30);
		backStarql = new Button("Back");
		backStarql.setMinWidth(150);
		backStarql.setMinHeight(30);
		nextStarql = new Button("Next");
		nextStarql.setMinWidth(150);
		nextStarql.setMinHeight(30);

		starqlControl.getChildren().addAll(backStarql, loadStarql, nextStarql);

		/**
		 * VBox starqlVBox
		 */
		VBox starqlVBox = new VBox();
		starqlVBox.getChildren().addAll(infoStarql, starqlTextArea, starqlControl);
		starqlVBox.setSpacing(5);
		starqlVBox.setAlignment(Pos.CENTER);

		setFitToHeight(true);
		setFitToWidth(true);
		setContent(starqlVBox);
	}

	public Button getLoadStarql() {
		return loadStarql;
	}

	public Button getBackStarql() {
		return backStarql;
	}

	public Button getNextStarql() {
		return nextStarql;
	}

	public TextArea getStarqlTextArea() {
		return starqlTextArea;
	}
}
