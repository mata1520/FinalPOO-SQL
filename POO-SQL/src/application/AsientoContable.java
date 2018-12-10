package application;
import javafx.fxml.FXML;
public class AsientoContable {
	private Main main;
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	@FXML
	public void esenaAgregarCuenta(){
		main.esenaAgregarCuenta();
	}
	@FXML
	public void esenaAgregarSubCuenta(){
		main.esenaAgregarSubCuenta();
	}
	@FXML
	public void regresarPrincipal(){
		main.regresarPrincipal();
	}
}

