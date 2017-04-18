package de.uzl.ifis.Starqlpostgres.Controller;

import de.uzl.ifis.Starqlpostgres.Model.Model;
import de.uzl.ifis.Starqlpostgres.View.MainView;
import de.uzl.ifis.Starqlpostgres.View.OntologyInputView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OntologyInputController implements EventHandler<ActionEvent> {
	private MainView view;
	private Model model;
	private OntologyInputView ontologyInputView;
	
	public OntologyInputController(MainView view, Model model) {
		this.view = view;
		this.model = model;
		this.ontologyInputView = view.getOntologyInputView();
		
		ontologyInputView.getBackOntology().setOnAction(this);
		ontologyInputView.getLoadOntology().setOnAction(this);
		ontologyInputView.getNextOntology().setOnAction(this);
	}
	
	public void handle(ActionEvent e) {
		if (e.getSource().equals(ontologyInputView.getBackOntology())) {
			view.setStarqlInputView();
		} else if (e.getSource().equals(ontologyInputView.getLoadOntology())) {
			ontologyInputView.getOntologyTextArea().setText(model.loadOntology());
		} else if (e.getSource().equals(ontologyInputView.getNextOntology())) {
			if (!ontologyInputView.getOntologyTextArea().getText().isEmpty()) {
				model.write(ontologyInputView.getOntologyTextArea().getText(), "ontology.owl");
				view.setMappingInputView();
			}
		}
	}
}
