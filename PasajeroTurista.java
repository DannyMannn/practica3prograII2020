import java.lang.Exception;

public class PasajeroTurista extends Pasajero {
	private Maleta maleta;
	
	@Override
	public void documentarMaleta(Maleta maleta) throws Exception {
		if (maleta != null) throw new Exception("Número de maletas excedido.");
		this.maleta = maleta;
	}

	public Maleta getMaleta() {
		return this.maleta;
	}
}

