package de.flapdoodle.grapheditor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GraphEditorPlayground extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		primaryStage.setScene(new Scene(pane, 800, 600));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
