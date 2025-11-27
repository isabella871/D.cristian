import java.util.ArrayList;

public class Procesos {
	
	public void iniciar() {
		Camion miCamion=null;
		ArrayList<Camion> listCamiones=new ArrayList<Camion>();
		
		Vehiculo camionOBJ=new Camion();
		
		camionOBJ.conducir();
	
		
		if (camionOBJ instanceof Camion) {
			//((Camion) camionOBJ).cargarElementos();
			//((Camion) camionOBJ).transportar();
			
			miCamion=(Camion) camionOBJ;
			miCamion.setEstadoCarga(ITransporte.PENDIENTE_DESPACHO);
			miCamion.cargarElementos();
			
			miCamion.transportar();
			
		}
		
		
		listCamiones.add(miCamion);
	}

} 
