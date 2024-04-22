package Práctica1_JaraJahuira;

public class Pedido {
	// Atributos
		private String nombre;
		private String direccion;
		private Paquete paquete;// paquete

		// Método constructor
		public Pedido(String nombre, String direccion, Paquete paquete) {
			this.nombre = nombre;
			this.direccion = direccion;
			this.paquete = paquete;
		}

		// Metodos get y set
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public double calcularDescuento() {
			double descuento = 0;
			
			// Accedo a las tallas mediante paquete.getTallasPar (que ya es un array)
			if (paquete.getTallasPar(0) == paquete.getTallasPar(1) && paquete.getTallasPar(1) == paquete.getTallasPar(2)) {
				if (paquete.getTallasPar(0) == 'M') {
					descuento = 0.15;
				} else if (paquete.getTallasPar(0) == 'S') {
					descuento = 0.1;
				} else if (paquete.getTallasPar(0) == 'L') {
					descuento = 0.20;
				}
			}
			return descuento;
		}

		public double calcularPrecio() {
			//Llamo a mi método de precio en paquetes y sumo cada elemento del array (los 3 de 10)
			double precio = paquete.getPrecioDesde(0)+paquete.getPrecioDesde(1)+paquete.getPrecioDesde(2);
			double descuento1 = precio*calcularDescuento();
			double preciofinal = precio-descuento1;
			return preciofinal;
		}
}
