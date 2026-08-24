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
double total = precioNoche * noches;
System.out.println("Precio final: " + total);
}

void mostrardetalle(){
System.out.println("Nombre del huesped: " + nombreHuesped);
System.out.println("Nohces: " + noches);
System.out.println("Precio por noche: " + precioNoche);
}

public static void main(String[] args) {
    reservaAirbnb r1 = new reservaAirbnb("JOSE MARTIN", 2, 20000);

    r1.calcularTotal();
    r1.mostrardetalle();
}

}