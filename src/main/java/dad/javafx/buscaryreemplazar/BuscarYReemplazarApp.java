package dad.javafx.buscaryreemplazar;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazarApp extends Application {
	
	private Label buscarLabel;
	private Label reemplazarLabel;
	private Label huecoLabel;
	private Label huecoLabel2;
	private TextField buscarText;
	private TextField reemplazarText;
	private CheckBox mayminCheckbox;
	private CheckBox buscarCheckbox;
	private CheckBox expresionCheckbox;
	private CheckBox resaltarCheckbox;
	private Button buscarButton;
	private Button reemplazarButton;
	private Button reemplazartodoButton;
	private Button cerrarButton;
	private Button	ayudaButton;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		buscarLabel = new Label("Buscar: ");
		reemplazarLabel = new Label("Reemplazar con: ");
		huecoLabel = new Label("");
		huecoLabel2 = new Label("");
		
		buscarText = new TextField();
		reemplazarText = new TextField();
		
		mayminCheckbox = new CheckBox("Mayúsculas y minúsculas ");
		buscarCheckbox = new CheckBox("Buscar hacia atrás ");
		expresionCheckbox = new CheckBox("Expresión regular ");
		resaltarCheckbox = new CheckBox("Resaltar resultados ");
		
		buscarButton = new Button("Buscar");
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazartodoButton = new Button("Reemplazar todo");
		reemplazartodoButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		
		GridPane grid = new GridPane();
//		grid.setGridLinesVisible(true);
		grid.addRow(0, buscarLabel, buscarText);
		grid.addRow(1, reemplazarLabel, reemplazarText);
		grid.addRow(2, huecoLabel, mayminCheckbox, buscarCheckbox);
		grid.addRow(3, huecoLabel2, expresionCheckbox, resaltarCheckbox);
		
		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints(),

		};
		
		cols[2].setHgrow(Priority.ALWAYS);
		cols[2].setFillWidth(true);
		cols[2].setHalignment(HPos.LEFT);
		
		GridPane.setColumnSpan(buscarText, 2);
		GridPane.setColumnSpan(reemplazarText, 2);
		
		grid.getColumnConstraints().setAll(cols);
		
		VBox cajaVertical = new VBox(buscarButton, reemplazarButton, reemplazartodoButton, cerrarButton, ayudaButton);
		cajaVertical.setFillWidth(true);
		
		BorderPane bpane = new BorderPane();
		bpane.setRight(cajaVertical);
		bpane.setCenter(grid);
		
		Scene scene = new Scene(bpane, 500, 200);
		
		primaryStage.setTitle("Buscar Y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
