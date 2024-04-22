package Práctica1_JaraJahuira;

public class Paquete {
	//Atributos
		private Par[] pares; 
		
		//Método constructor
		public Paquete(Par[] pares) {
			this.pares = pares;
			
		}
		

		public String getModeloPar(int i) {
			return pares[i].getModelo();
		}
		public char getTallasPar(int i) {
			return pares[i].getTalla();
		}
		//Creo atributo que me permita llamar precio desde paquete
		public final double getPrecioDesde(int i) {
			return pares[i].getPrecio();
		}
		//Compruebo validez
		public String Validez() {
			if(pares[0].getTalla()==pares[1].getTalla()&&pares[1].getTalla()==pares[2].getTalla()) {
				return "¡El paquete es válido! YASS MAMA";
			}else {
				return "¡El paquete no es válido! bruh baby thats not it";
			}
		}
}
