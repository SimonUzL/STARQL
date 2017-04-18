package de.uzl.ifis.Starqlpostgres.Controller;

import de.uzl.ifis.Starqlpostgres.Model.Model;
import de.uzl.ifis.Starqlpostgres.View.MainView;
import de.uzl.ifis.Starqlpostgres.View.WelcomeView;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class WelcomeViewKey implements EventHandler<KeyEvent> {
	private MainView view;
	private Model model;
	private WelcomeView welcomeView;

	public WelcomeViewKey(MainView view, Model model) {
		this.view = view;
		this.model = model;
		this.welcomeView = view.getWelcomeView();

		welcomeView.getIpTextField().setOnKeyPressed(this);
		welcomeView.getPortTextField().setOnKeyPressed(this);
		welcomeView.getUserTextField().setOnKeyPressed(this);
		welcomeView.getPasswdTextField().setOnKeyPressed(this);
		welcomeView.getDatabaseTextField().setOnKeyPressed(this);
	}

	public void handle(KeyEvent e) {
		if (e.getCode() == KeyCode.ENTER) {
			if (e.getSource().equals(welcomeView.getIpTextField())) {
				if (model.checkConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText())) {
					model.setConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText());
					model.saveConnection();
					view.setStarqlInputView();
				}
			} else if (e.getSource().equals(welcomeView.getPortTextField())) {
				if (model.checkConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText())) {
					model.setConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText());
					model.saveConnection();
					view.setStarqlInputView();
				}
			} else if (e.getSource().equals(welcomeView.getUserTextField())) {
				if (model.checkConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText())) {
					model.setConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText());
					model.saveConnection();
					view.setStarqlInputView();
				}
			} else if (e.getSource().equals(welcomeView.getPasswdTextField())) {
				if (model.checkConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText())) {
					model.setConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText());
					model.saveConnection();
					view.setStarqlInputView();
				}
			} else if (e.getSource().equals(welcomeView.getDatabaseTextField())) {
				if (model.checkConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText())) {
					model.setConnection(view.getWelcomeView().getIpTextField().getText(), view.getWelcomeView().getPortTextField().getText(), view.getWelcomeView().getUserTextField().getText(), view.getWelcomeView().getPasswdTextField().getText(), view.getWelcomeView().getDatabaseTextField().getText());
					model.saveConnection();
					view.setStarqlInputView();
				}
			}
		}
	}
}
