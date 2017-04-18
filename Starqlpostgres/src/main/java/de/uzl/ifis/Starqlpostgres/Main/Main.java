package de.uzl.ifis.Starqlpostgres.Main;

import java.util.Optional;

import de.uzl.ifis.Starqlpostgres.Controller.MappingInputController;
import de.uzl.ifis.Starqlpostgres.Controller.OntologyInputController;
import de.uzl.ifis.Starqlpostgres.Controller.ResultController;
import de.uzl.ifis.Starqlpostgres.Controller.StarqlInputController;
import de.uzl.ifis.Starqlpostgres.Controller.WelcomeViewController;
import de.uzl.ifis.Starqlpostgres.Controller.WelcomeViewKey;
import de.uzl.ifis.Starqlpostgres.Model.Model;
import de.uzl.ifis.Starqlpostgres.Model.QueryThread;
import de.uzl.ifis.Starqlpostgres.View.MainView;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("unused")
	public void start(Stage stage) {
		Platform.setImplicitExit(false);

		Model model = new Model();
		model.loadConnection();

		MainView view = new MainView(model);

		QueryThread queryThread = new QueryThread(view, model);

		WelcomeViewController welcomeViewController = new WelcomeViewController(view, model);
		WelcomeViewKey welcomeViewKey = new WelcomeViewKey(view, model);
		StarqlInputController starqlInputController = new StarqlInputController(view, model);
		OntologyInputController ontologyInputController = new OntologyInputController(view, model);
		MappingInputController mappingInputController = new MappingInputController(view, model, queryThread);
		ResultController resultController = new ResultController(view, model);

		stage.setTitle("STARQL");
		stage.setScene(view.getScene());
		stage.show();

		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			public void handle(WindowEvent event) {
				if (!view.getComputeView().isDisable()) {
					Alert alert = new Alert(AlertType.CONFIRMATION);
					alert.setTitle("Warning");
					alert.setHeaderText("Are you sure to exit?");
					alert.setContentText("This will interrupt the computation!");

					Optional<ButtonType> result = alert.showAndWait();
					if (result.get() == ButtonType.OK) {
						queryThread.interrupt();
						Platform.exit();
					}
					event.consume();
				} else {
					Platform.exit();
				}
			}
		});
	}
}
