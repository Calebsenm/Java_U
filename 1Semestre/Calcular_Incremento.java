/*

El club UTP cobra incrementos sobre el pago mensual a sus socios según el
servicio, tal como figura en el siguiente cuadro:

    Servicio    Incremento
    Casino      8.3%
    Hospedaje   16.5 %
    Canchas     5.4 %
    Restaurante 13.8 %
    Piscinas    6.8%

A demás si el socio tiene más de 40 años recibe un descuento del 15.8 %, 
si el socio tiene más de 25 años y menos de 40 años recibe un descuento del 12.5%, 
si tiene de 15 a 24 años tiene un descuento de 8.5% sobre el pago mensual ya
incrementado.


Diseñar una clase que calcule el monto del incremento y el total a pagar por el
socio.

*/

// imports
import java.util.Scanner;

class Calcular_IncrementoMonto {

    private int años;
    private double Casino, Hospedaje, Canchas, Restaurante, Piscinas;
    private int tipoServicio;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int valor;
        int tipo;

        Calcular_IncrementoMonto socio1 = new Calcular_IncrementoMonto();

        try {

            System.out.print("Ingrese la cantidad de años -> ");
            valor = input.nextInt();
            socio1.setAños(valor);

            System.out.print(""
                    + "1 Casino \n"
                    + "2 Hospedaje\n"
                    + "3 Canchas\n"
                    + "4 restaurante\n"
                    + "5 picina\n"

                    + "Ingrese el servicio -> ");
            valor = input.nextInt();

            switch (valor) {
                case 1:
                    System.out.print("Ingrese la cantidad de Casino -> ");
                        valor = input.nextInt();
                        socio1.setCasino(valor);
                        socio1.setTipo(1);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de Hospedaje -> ");
                    valor = input.nextInt();
                    socio1.setHospedaje(valor);
                    socio1.setTipo(2);

                    break;
                case 3:

                    System.out.print("Ingrese la cantidad de Cancha -> ");
                    valor = input.nextInt();
                    socio1.setCanchas(valor);
                    socio1.setTipo(3);

                    break;
                case 4:

                    System.out.print("Ingrese la cantidad de Restaurante -> ");
                    valor = input.nextInt();
                    socio1.setRestaurante(valor);
                    socio1.setTipo(4);
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad de Picina -> ");
                    valor = input.nextInt();
                    socio1.setPiscinas(valor);
                    socio1.setTipo(5);
                    break;
                default:
                    break;
            }

            socio1.mostrar();

        } catch (Exception e) {
            System.out.println("Error de tipo de dato");
        }
    }

    // constructor
    public Calcular_IncrementoMonto() {
        Casino = 0;
        Hospedaje = 0;
        Canchas = 0;
        Restaurante = 0;
        Piscinas = 0;
        tipoServicio = 0;
        

    }

    // metodo que calcula el incremeto el cual lo hace para todo los servicios
    public double totalIncremento() {

        double incremento;

        if(getTipo() == 1){
                incremento = getCasino() + (getCasino() * 8.3 / 100);
        }   else if(getTipo() == 2){
                incremento = getHospedaje() + (getHospedaje() * 15.5 / 100);
        }   else if(getTipo() == 3){
                incremento =  getCanchas() + (getCanchas() * 5.4 / 100);
        }   else if(getTipo() == 4){    
                incremento = getCanchas()+ (getRestaurante() * 13.8 / 100);
        }   else if (getTipo() == 5){
                incremento =  getCanchas() +(getPiscinas() * 6.8 / 100);
        }   else{
            incremento = 0;
        }
        return incremento;
    }

  

    // metodo de total a pagar
    public double totalPagar() {
        double total;

        if (getAños() >= 40) {
            total = totalIncremento() - (totalIncremento() * 15.8 / 100);

        } else if (getAños() >= 25 && getAños() < 40) {
            total = totalIncremento() - (totalIncremento() * 12.5 / 100);

        } else if (getAños() >= 15 && getAños() <= 24) {
            total = totalIncremento() - (totalIncremento() * 8.5/100);
        } else {
            total = totalIncremento() ;
        }
        return total ;
    }

    public void mostrar() {
        System.out.println("El incremento total es -> " + totalIncremento()+"$");
        System.out.println("El total a pagar por el socio es -> " + totalPagar()+"$");
    }

    // metodos setter y getters

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public double getCasino() {
        return Casino;
    }

    public void setCasino(double casino) {
        Casino = casino;
    }

    public double getHospedaje() {
        return Hospedaje;
    }

    public void setHospedaje(double hospedaje) {
        Hospedaje = hospedaje;
    }

    public double getCanchas() {
        return Canchas;
    }

    public void setCanchas(double canchas) {
        Canchas = canchas;
    }

    public double getRestaurante() {
        return Restaurante;
    }

    public void setRestaurante(double restaurante) {
        Restaurante = restaurante;
    }

    public double getPiscinas() {
        return Piscinas;
    }

    public void setPiscinas(double piscinas) {
        Piscinas = piscinas;
    }

    public int  getTipo() {
        return tipoServicio;
    }

    public void setTipo(int tipo) {
        tipoServicio = tipo;
    }
}
