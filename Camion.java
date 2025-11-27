import javax.swing.JOptionPane;

public class Camion extends Vehiculo implements ITransporte{

	private int estadoCarga=LLENO;
	
	
	@Override
	public void conducir() {
		System.out.println("El camion está siendo conducido");
	}
	
	public void cargarElementos() {
		System.out.println("Está cargando los elementos");
	
		switch (estadoCarga) {
		case VACIO: System.out.println("Esta vacio"); break;
		case LLENO: System.out.println("Esta lleno"); break;
		case MEDIO_LLENO: System.out.println("Esta medio cargado"); break;
		case PENDIENTE_DESPACHO: System.out.println("Esta pendiente de despacho"); break;
		default: System.out.println("No corresponde");
		}
		
		JOptionPane.showMessageDialog(null, "Esta cargando elementos","ESTADO",JOptionPane.ERROR_MESSAGE);
		
	}

	@Override
	public void transportar() {
		System.out.println("El camion se transporta");
	}

	public int getEstadoCarga() {
		return estadoCarga;
	}

	public void setEstadoCarga(int estadoCarga) {
		this.estadoCarga = estadoCarga;
	}

}
