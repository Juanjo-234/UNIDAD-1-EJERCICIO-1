class reservaAirbnb{
String nombreHuesped;
int noches;
double precioNoche;

public reservaAirbnb(String nombreHuesped, int noches, double precioNoche){
this.nombreHuesped = nombreHuesped;
this.noches = noches;
this.precioNoche = precioNoche;
}   

void calcularTotal(){
    if(noches < 0 && precioNoche <= 0){
        System.out.println("Ingrese un precio y cantidad de noches válido");
    }
double total = precioNoche * noches;
System.out.println("-------------------------------");
System.out.println("Precio final: " + total);
}

void mostrardetalle(){
    System.out.println("====================================");
System.out.println("Nombre del huesped: " + nombreHuesped);
System.out.println("Nohces: " + noches);
System.out.println("Precio por noche: " + precioNoche);
System.out.println("====================================");
}

public static void main(String[] args) {
    reservaAirbnb r1 = new reservaAirbnb("JOSE MARTIN", 2, 20000);

    r1.calcularTotal();
    r1.mostrardetalle();
}
}