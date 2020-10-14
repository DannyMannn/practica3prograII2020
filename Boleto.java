public abstract class Boleto {
	protected String nombrePasajero;
	protected int edadPasajero;
	protected String generoPasajero;
	protected EnumClase clasePasajero;
	protected int numAsiento;
	protected int numVuelo;
	protected String aerolinea;
	protected String destino;
	protected EnumVuelo tipoVuelo;

	public Boleto(String nombrePasajero,
			int edadPasajero,
			String generoPasajero,
			EnumClase clasePasajero,
			int numAsiento,
			int numVuelo,
			String aerolinea,
			String destino) {
		this.nombrePasajero = nombrePasajero;
		this.edadPasajero = edadPasajero;
		this.generoPasajero = generoPasajero;
		this.clasePasajero = clasePasajero;
		this.numAsiento = numAsiento;
		this.numVuelo = numVuelo;
		this.aerolinea = aerolinea;
		this.destino = destino;
	}

	public abstract String mostrar();
}

