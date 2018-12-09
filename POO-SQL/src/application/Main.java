package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;



public class Main extends Application {
	
	private ControlAcceso controlAcceso;
	public Stage getPrincipal() {
		return principal;
	}
	public void setPrincipal(Stage principal) {
		this.principal = principal;
	}
	private Scene asientoContable;
	private Scene partidaDoble;
	private Scene registro;
	private Scene balanceGeneral;
	private Scene estadoResultados;
	private Scene nuevoUsuario;
	private Scene listaUsuarios;
	
	private Stage principal;
	private Stage interfasControl;
	
	private AsientoContable controlContable;
	private BalanceGeneral controlGeneral;
	private EstadoResultados controlResultados;
	private ListaUsuarios controlUsuarios;
	private NuevoUsuarios controlUsuariosN;
	private Registro controlRegistro;
	private PartidaDoble controlDoble;
	
	
	
	public void start(Stage acceso) {
		principal=acceso;
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Acceso.fxml"));
			acceso.initStyle(StageStyle.UNDECORATED); 
			AnchorPane accesoUsuario = (AnchorPane)loader.load();
			Scene accesoPas = new Scene(accesoUsuario,300,130);
			accesoPas.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			acceso.setScene(accesoPas);
			controlAcceso = loader.getController();
			controlAcceso.setMain(this);
			acceso.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void abrirPrincipa() {
		try {
			interfasControl= new Stage();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Scene.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			Scene scene = new Scene(root);
			interfasControl.setTitle("POO-SQL");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			interfasControl.setScene(scene);
			//controlPrincipal = loader.getController();
			//controlPrincipal.setMain(this);
			//interfasControl.initOwner(principal);
			//interfasControl.initModality(Modality.WINDOW_MODAL);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		interfasControl.show();
	}
	public void esenaAsientoContable() {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
