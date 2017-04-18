package de.uzl.ifis.Starqlpostgres.Controller;

import de.uzl.ifis.Starqlpostgres.Model.Model;
import de.uzl.ifis.Starqlpostgres.View.MainView;
import de.uzl.ifis.Starqlpostgres.View.WelcomeView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class WelcomeViewController implements EventHandler<ActionEvent> {
	private MainView view;
	private Model model;
	private WelcomeView welcomeView;
	
	public WelcomeViewController(MainView view, Model model) {
		this.view = view;
		this.model = model;
		this.welcomeView = view.getWelcomeView();
		
		welcomeView.getEndButton().setOnAction(this);
		welcomeView.getConnectButton().setOnAction(this);
	}
	
	public void handle(ActionEvent e) {
		if (e.getSource().equals(welcomeView.getEndButton())) {
			System.exit(0);
		} else if (e.getSource().equals(welcomeView.getConnectButton())) {
			if (model.checkConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText())) {
				model.setConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText());
				model.saveConnection();
				view.setStarqlInputView();
			} else {
				view.warn();
			}
		}
	}
}
