public abstract class Pasajero {
	protected Boleto boleto;

	public Pasajero(Boleto boleto) {
		this.boleto = boleto;
	}

	public abstract void documentarMaleta(Maleta maleta) throws Exception;

	public Boleto getBoleto() {
		return this.boleto;
	}
}

