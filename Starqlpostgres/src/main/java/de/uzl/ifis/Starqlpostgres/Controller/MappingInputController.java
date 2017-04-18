package de.uzl.ifis.Starqlpostgres.Controller;

import de.uzl.ifis.Starqlpostgres.Model.Model;
import de.uzl.ifis.Starqlpostgres.Model.QueryThread;
import de.uzl.ifis.Starqlpostgres.View.MainView;
import de.uzl.ifis.Starqlpostgres.View.MappingInputView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MappingInputController implements EventHandler<ActionEvent> {
	private MainView view;
	private Model model;
	private MappingInputView mappingInputView;
	private QueryThread queryThread;
	
	public MappingInputController(MainView view, Model model, QueryThread queryThread) {
		this.view = view;
		this.model = model;
		this.mappingInputView = view.getMappingInputView();
		this.queryThread = queryThread;
		
		mappingInputView.getBackMapping().setOnAction(this);
		mappingInputView.getLoadMapping().setOnAction(this);
		mappingInputView.getNextMapping().setOnAction(this);
	}
	
	public void handle(ActionEvent e) {
		if (e.getSource().equals(mappingInputView.getBackMapping())) {
			view.setOntologyInputView();
		} else if (e.getSource().equals(mappingInputView.getLoadMapping())) {
			mappingInputView.getMappingTextArea().setText(model.loadMapping());
		} else if (e.getSource().equals(mappingInputView.getNextMapping())) {
			if (!mappingInputView.getMappingTextArea().getText().isEmpty()) {
				model.write(mappingInputView.getMappingTextArea().getText(), "mapping.obda");
				queryThread.start();
			}
		}
	}
}
