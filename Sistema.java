public class Sistema {
	public static void main(String[] args) {
		BoletoInternacional bolInt = new BoletoInternacional(
				"Pasajero 1",
				29,
				"Masculino",
				EnumClase.TURISTA,
				18,
				982,
				"Interjet",
				"Hawaii",
				1892293123,
				EnumVisa.TURISTA,
				10);

		BoletoNacional bolNac = new BoletoNacional(
				"Pasajero 1",
				29,
				"Masculino",
				EnumClase.TURISTA,
				18,
				982,
				"Interjet",
				"Hawaii",
				"PSAGE1029130HADSKJ2");

		System.out.println(bolInt.mostrar());
		System.out.println(bolNac.mostrar());
	}
}
