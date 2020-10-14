import java.lang.Exception;

public class PasajeroEjecutivo extends Pasajero {
	private Maleta[] maletas;
	private int numMaletasDocumentadas = 0;
	
	public PasajeroEjecutivo() {
		this.maletas = new Maleta[2];
	}

	@Override
	public void documentarMaleta(Maleta maleta) throws Exception {
		try {
			this.maletas[this.numMaletasDocumentadas] = maleta;
			this.numMaletasDocumentadas++;
		} catch (IndexOutOfBoundsException e) {
			throw new Exception("Número de maletas excedido.");
		}
	}

	public Maleta[] getMaletas() {
		return this.maletas;
	}
}

