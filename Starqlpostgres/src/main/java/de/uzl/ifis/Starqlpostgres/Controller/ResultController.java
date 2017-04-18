package de.uzl.ifis.Starqlpostgres.Controller;

import de.uzl.ifis.Starqlpostgres.Model.Model;
import de.uzl.ifis.Starqlpostgres.View.MainView;
import de.uzl.ifis.Starqlpostgres.View.ResultView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ResultController implements EventHandler<ActionEvent> {
	private MainView view;
	private Model model;
	private ResultView resultView;
	
	public ResultController(MainView view, Model model) {
		this.view = view;
		this.model = model;
		this.resultView = view.getResultView();
		
		resultView.getBackResult().setOnAction(this);
		resultView.getSaveToTextFile().setOnAction(this);
		resultView.getBeendenResult().setOnAction(this);
	}
	
	public void handle(ActionEvent e) {
		if (e.getSource().equals(resultView.getSaveToTextFile())) {
			model.saveResultToFile();
		} else if (e.getSource().equals(resultView.getBackResult())) {
			view.setMappingInputView();
		} else if (e.getSource().equals(resultView.getBeendenResult())) {
			System.exit(0);
		}
	}
}
