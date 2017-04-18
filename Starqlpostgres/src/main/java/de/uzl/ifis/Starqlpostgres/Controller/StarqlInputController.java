package de.uzl.ifis.Starqlpostgres.Controller;

import de.uzl.ifis.Starqlpostgres.Model.Model;
import de.uzl.ifis.Starqlpostgres.View.MainView;
import de.uzl.ifis.Starqlpostgres.View.StarqlInputView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class StarqlInputController implements EventHandler<ActionEvent> {
	private MainView view;
	private Model model;
	private StarqlInputView starqlInputView;
	
	public StarqlInputController(MainView view, Model model) {
		this.view = view;
		this.model = model;
		this.starqlInputView = view.getStarqlInputView();
		
		starqlInputView.getBackStarql().setOnAction(this);
		starqlInputView.getLoadStarql().setOnAction(this);
		starqlInputView.getNextStarql().setOnAction(this);
	}
	
	public void handle(ActionEvent e) {
		if (e.getSource().equals(starqlInputView.getBackStarql())) {
			view.setWelcomeView();
		} else if (e.getSource().equals(starqlInputView.getLoadStarql())) {
			starqlInputView.getStarqlTextArea().setText(model.loadStarqlQuery());
		} else if (e.getSource().equals(starqlInputView.getNextStarql())) {
			if (!starqlInputView.getStarqlTextArea().getText().isEmpty()) {
				model.write(starqlInputView.getStarqlTextArea().getText(), "starql.txt");
				view.setOntologyInputView();
			}
		}
	}
}
