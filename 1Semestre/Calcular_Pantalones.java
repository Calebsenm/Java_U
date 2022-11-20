import java.util.Scanner;

/* 
4. Un cliente, por campaña navideña, desea comprar panetones, donde según su
marca tiene un precio:

Marca del Panteón   Precio Unitario
Donofrio            35.8
Motta               40.5
Todinno             26.5
Gloria              30.6
Sayón               21.7


Si el cliente desea comprar más de 300 soles en panetones de una misma
marca, se le aplicará un descuento del 15% sobre el monto de la compra

• Si compra más de 100 soles y menos de 200 soles de una misma marca, se le
aplicará un descuento del 6.8%,

• Si compra más de 200 soles en panetones y menos de 300 soles de una misma
marca, se le aplicará un descuento del 10% sobre el monto de la compra
obteniendo así el neto, que es la diferencia entre el monto y el descuento.

Ingrese por teclado el nombre del cliente, la marca del panetón y la cantidad de
panetones a comprar; visualice el precio unitario del panteón, el monto de la compra,
el descuento y el neto a pagar.
*/


public class Calcular_Pantalones {


    private int MarcaPantalon;
    private String Nombre;
    private int cantidadPantalones;

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Calcular_Pantalones compra1 = new Calcular_Pantalones();
        System.out.print("\nIngrese su nombre ");
        compra1.setNombre(in.nextLine());

        System.out.print("Ingresa la cantidad de pantalones a comprar ");
        compra1.setCantidadPantalones(in.nextInt());

        System.out.print("\n"
        +" 1 Donofrio\n"
        +" 2 Motta\n"
        +" 3 Todinno\n"
        +" 4 Gloria\n"
        +" 5 Sayón\n"
        +"\n"
        +"Ingresa el numero correpondiente a la marca = ");
        compra1.setMarcaPantalon(in.nextInt());

        compra1.identificarPrecioPant();
        compra1.calcularMonto();
        compra1.calcularDescuento();
        compra1.calcularPrecioNeto();
        compra1.mostrar();




    }


    public Calcular_Pantalones() {
        MarcaPantalon = 0;
        Nombre = "";
        cantidadPantalones = 0;
    }

    public double identificarPrecioPant(){
        double precio;
        
        switch (MarcaPantalon) {
            case 1:
                precio = 35.8;
                break;

            case 2:
                precio = 40.5;
                break;
            case 3:
                precio = 26.5;
                break;
            
            case 4:
                precio = 30.6;
                    break;
            case 5:
                precio = 21.7;
                break;
            
            default:
                precio = 0;
                break;
        }

        return precio;

    }

    public double calcularMonto(){
        return identificarPrecioPant() * getCantidadPantalones();
    }

    public double calcularDescuento(){
        double descuento;
            if(calcularMonto() > 300){
                descuento = (calcularMonto() * 15)/100;
            
            
            }   else if(calcularMonto() > 100  && calcularMonto() < 200 ){
                    descuento = (calcularMonto() * 6.8) / 100;
            
            }   else if (calcularMonto() >= 200 &&  calcularMonto() <300){
                    descuento = (calcularMonto() *10 ) / 100;

            }   else{
                descuento = 0;
            }  

        return descuento;

    }

    public double calcularPrecioNeto(){
        return calcularMonto() - calcularDescuento();
    }

    public void mostrar(){
        System.out.println();
        System.out.println("Señor " + getNombre() + " Usted compró " + getCantidadPantalones() + " pantalones ");
        System.out.println(" El precio unitario del modelo que eligio es " + identificarPrecioPant()+"$");    
        System.out.println(" El monto total de su compra es  " + calcularMonto() + "$");
        System.out.println(" El descuento de la compra es " + calcularDescuento()+ "$");
        System.out.println(" El precio neto a pagar es " + calcularPrecioNeto()+ "$");

    
    }   

    public int getMarcaPantalon() {
        return MarcaPantalon;
    }
    public void setMarcaPantalon(int marcaPantalon) {
        MarcaPantalon = marcaPantalon;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCantidadPantalones() {
        return cantidadPantalones;
    }
    public void setCantidadPantalones(int cantidadPantalones) {
        this.cantidadPantalones = cantidadPantalones;
    }



    
}


