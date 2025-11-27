public interface ITransporte {

	public int VACIO = 0;
	public int LLENO = 1;
	public int MEDIO_LLENO=2;
	public static final int PENDIENTE_DESPACHO=3;
	
	public void transportar();
	
	
}