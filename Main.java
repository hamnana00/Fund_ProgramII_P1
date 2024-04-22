package Práctica1_JaraJahuira;

public class Main {
public static void main(String[] args) {
		
		//Creo objetos por cada medias
		Par par1 = new Par ("Rayas",'M');
		Par par2 = new Par ("Cuadros",'M');
		Par par3 = new Par ("Puntos",'M');
		Par par4 = new Par ("Liso",'S');
		Par par5 = new Par ("Cuadros",'S');
		Par par6 = new Par ("Puntos",'L');
		
		//asigno cada media como elemento del array
		Par[] paq1= new Par[3];
		paq1[0]=par1;
		paq1[1]=par2;
		paq1[2]=par3;
		Par[] paq2=new Par[3];
		paq2[0]=par4;
		paq2[1]=par5;
		paq2[2]=par6;
		//ya definidos
		//les asigno como paquete
		Paquete pack1 = new Paquete (paq1);
		Paquete pack2 = new Paquete (paq2);
		
		//Objeto de los pedidos
		Pedido pedido_1 = new Pedido("Pepe Perez", "Calle Mayor, 2",pack1);
		Pedido pedido_2 = new Pedido("Pepe Perez", "Calle Mayor 2",pack2);
		
		//Impresiones
		System.out.println(pack1.Validez());
		System.out.println("---------------------------");
		System.out.println("RESUMEN DE LA COMPRA");
		System.out.println("Cliente: "+pedido_1.getNombre()+"\nDirección: "+pedido_1.getDireccion()+"\nPRODUCTOS:");
		System.out.println("-->Talla: "+par1.getTalla());
		System.out.println("-->Modelo 1: "+par1.getModelo());
		System.out.println("-->Modelo 2: "+par2.getModelo());
		System.out.println("-->Modelo 3: "+par3.getModelo());
		System.out.println("---------------------------");
		System.out.println("Descuento aplicado: "+pedido_1.calcularDescuento()*100+"%");
		System.out.println("El precio es: "+pedido_1.calcularPrecio());
		System.out.print("------Gracias por su compra---------");
		System.out.println("\n\n"+pack2.Validez());
		System.out.println("\nRESUMEN DE LA COMPRA");
		System.out.print("Cliente: "+pedido_2.getNombre()+"\nDirección: "+pedido_2.getDireccion());
		
		

	}
}
