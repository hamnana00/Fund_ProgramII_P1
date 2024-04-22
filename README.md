# Fund_ProgramII_P1
Practica 1 de laboratorio de Fundamentos de Programación II
Una conocida cadena de tiendas de calcetines ha preparado una oferta especial de aniversario. 
La oferta consiste en la venta de paquetes de tres pares de calcetines, a elegir por el cliente, a 
un precio especial. Cada par de calcetines tiene un modelo (“Cuadros”, “Rayas”, “Puntos” o 
“Liso”), talla (S, M o L) y precio. El precio por defecto será de 10€ por cada par de calcetines, sin 
posibilidad de modificar ese valor (aunque se diseñarán los métodos necesarios para obtenerlo).
Sobre cada paquete se necesita conocer los tres pares de calcetines seleccionados, que podrán 
definirse bien como atributos por separado, o como un único atributo array. Se debe controlar 
mediante un método si el paquete es válido, es decir, si los tres pares seleccionados en un mismo 
paquete son de la misma talla.
La compra se realiza a través de un pedido en el que se conoce el nombre del cliente, su 
dirección, y el paquete que se quiere comprar (por simplificar, solo se puede comprar un 
paquete en cada pedido). Para cada paquete se aplicará un descuento que se calculará mediante 
un método en función de la talla seleccionada:
• Paquete talla S: 10% de descuento sobre el precio total de los pares por separado
• Paquete talla M: 15% de descuento sobre el precio total de los pares por separado
• Paquete talla L: 20% de descuento sobre el precio total de los pares por separado
El precio final se calculará mediante otro método que recibirá como parámetro el descuento 
anteriormente calculado.
Se pide:
a) Dibujar en UML el diagrama de clases indicando las relaciones entre las mismas y los 
miembros que hay en cada una. Debe incluir métodos para la consulta de todos los atributos y 
todos los métodos que sean necesarios para la resolución del ejercicio.
b) Implementar en Java dichas clases.
c) Implementar un programa principal donde se realicen los siguientes apartados:
 c.1) Crear los siguientes pares de calcetines y paquetes:
(ya creados en main)
c.2) Crear un pedido a nombre de Pepe Pérez, dirección Calle Mayor, 2, y paquete 
seleccionado pack1. El resultado mostrado en pantalla debe ser:
El paquete seleccionado es válido
------------------------------------------------
RESUMEN DE LA COMPRA:
Cliente: Pepe Pérez
Dirección: Calle Mayor, 2
PRODUCTOS:
---> Talla: M
---> Modelo par 1: Rayas
---> Modelo par 2: Cuadros
---> Modelo par 3: Puntos
------------------------------------------------
DESCUENTO APLICADO: 15.0%
PRECIO FINAL: 25.5€
c.3) Crear un pedido a nombre de Pepe Pérez, dirección Calle Mayor, 2, y paquete 
seleccionado pack2. El resultado mostrado en pantalla debe ser:
El paquete que usted ha creado no es válido. Las tallas no coinciden
# Nota: 8/10
Documentación: https://drive.google.com/drive/folders/18DB9g2KZ593RS6ZHL8i2WUQN_XjKAtuG?usp=sharing
