package Práctica1_JaraJahuira;

	public class Par {
		//Atributos
		private String modelo;
		private char talla;
		private final double precio = 10;
		
		//Método constructor
		public Par(String modelo, char talla) {
			this.modelo = modelo;
			this.talla = talla;
			//no incluyo precio porque es algo que se sabe
		}	
			//Métodos set y get
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public char getTalla() {
			return talla;
		}
		public void setTalla(char talla) {
			this.talla = talla;
		}
		public final double getPrecio() {
			return precio;
		}
		
	}
