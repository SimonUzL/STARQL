package de.uzl.ifis.Starqlpostgres.View;

import de.uzl.ifis.Starqlpostgres.Model.Model;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class WelcomeView extends BorderPane {
	private Model model;
	
	private static int LABEL_WIDTH = 100;
	private static int TEXTFIELD_WIDTH = 220;
	
	private TextField ipTextField;
	private TextField portTextField;
	private TextField userTextField;
	private PasswordField passwdTextField;
	private TextField databaseTextField;
	
	private Button endButton;
	private Button connectButton;
	
	public WelcomeView() {
		/**
		 * Login GridPane
		 */
		GridPane loginGridPane = new GridPane();
		
		Label ipLabel = new Label("IP-Adress");
		ipLabel.setMinWidth(LABEL_WIDTH);
		ipTextField = new TextField();
		ipTextField.setMinWidth(TEXTFIELD_WIDTH);
		
		Label portLabel = new Label("Port");
		portLabel.setMinWidth(LABEL_WIDTH);
		portTextField = new TextField();
		portTextField.setMinWidth(TEXTFIELD_WIDTH);
		
		Label userLabel = new Label("User");
		userLabel.setMinWidth(LABEL_WIDTH);
		userTextField = new TextField();
		userTextField.setMinWidth(TEXTFIELD_WIDTH);
		
		Label passwdLabel = new Label("Password");
		passwdLabel.setMinWidth(LABEL_WIDTH);
		passwdTextField = new PasswordField();
		passwdTextField.setMinWidth(TEXTFIELD_WIDTH);
		
		Label databaseLabel = new Label("Database");
		databaseLabel.setMinWidth(LABEL_WIDTH);
		databaseTextField = new TextField();
		databaseTextField.setMinWidth(TEXTFIELD_WIDTH);
		
		loginGridPane.add(ipLabel, 0, 0);
		loginGridPane.add(ipTextField, 1, 0);
		loginGridPane.add(portLabel, 0, 1);
		loginGridPane.add(portTextField, 1, 1);
		loginGridPane.add(userLabel, 0, 2);
		loginGridPane.add(userTextField, 1, 2);
		loginGridPane.add(passwdLabel, 0, 3);
		loginGridPane.add(passwdTextField, 1, 3);
		loginGridPane.add(databaseLabel, 0, 4);
		loginGridPane.add(databaseTextField, 1, 4);
		loginGridPane.setVgap(5);
		loginGridPane.setAlignment(Pos.CENTER);
		
		/**
		 * Control HBox
		 */
		HBox loginHBox = new HBox();
		endButton = new Button("Exit");
		endButton.setMinWidth(150);
		endButton.setMinHeight(40);
		connectButton = new Button("Connect");
		connectButton.setMinWidth(150);
		connectButton.setMinHeight(40);
		loginHBox.getChildren().addAll(endButton, connectButton);
		loginHBox.setSpacing(5);
		loginHBox.setAlignment(Pos.CENTER);
		
		/**
		 * Login VBox
		 */
		VBox loginVBox = new VBox();
		loginVBox.getChildren().addAll(loginGridPane, loginHBox);
		loginVBox.setAlignment(Pos.CENTER);
		loginVBox.setSpacing(10);
		
		setCenter(loginVBox);
	}
	
	public Button getEndButton() {
		return endButton;
	}
	
	public Button getConnectButton() {
		return connectButton;
	}
	
	public TextField getIpTextField() {
		return ipTextField;
	}

	public TextField getPortTextField() {
		return portTextField;
	}

	public TextField getUserTextField() {
		return userTextField;
	}

	public PasswordField getPasswdTextField() {
		return passwdTextField;
	}

	public TextField getDatabaseTextField() {
		return databaseTextField;
	}
	
	public void update() {
		ipTextField.setText(model.getIp());
		portTextField.setText(model.getPort());
		userTextField.setText(model.getUser());
		databaseTextField.setText(model.getDatabase());
	}
	
	public void setModel(Model model) {
    	this.model = model;
    }
}
