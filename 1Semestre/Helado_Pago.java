
/*
 
3. En una tienda de helados se da un descuento por compra a sus clientes con membresía
dependiendo de su tipo, sólo existen tres tipos de membresía.
Los descuentos son los siguientes:

    Tipo            Descuento (%)
    Vip             24%
    Especial        19%
    Normal          11%

Si el cliente no tiene membresía, no se le aplica descuento.

Los precios de los helados son los siguientes:

Nombre              Precio (S/.)
Simple              4.5
Barquimie           8.3
l Doble             6.8
Vasito              9.5


Luego de ingresar el tipo de helado y la cantidad, la clase debe mostrar por
pantalla el subtotal, descuento, IVA (18%) y total a pagar.
*/

import java.util.Scanner;


public class Helado_Pago {
    
    private String TipoMembresia;
    private String NombeElado;
    private int cantidadDeHelado;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Helado_Pago precio1 = new Helado_Pago();

        System.out.print("\n"
        + " 1 Vip \n"
        + " 2 Especial \n"
        + " 3 Normal \n"
        + "\n Ingresa el numero de la membresia ->  "
        );

        int valor = in.nextInt();
        if(valor == 1){
            precio1.setTipoMembresia("Vip");
        
        }   else if(valor == 2){
                precio1.setTipoMembresia("Especial");
        }   else{
                precio1.setTipoMembresia("Normal");
        }

        System.out.print("\n"
        +"1 Simple \n"
        +"2 Barmiquie \n"
        +"3 l Doble \n"
        +"4 Vasito \n"
        +" \nIngresa el numero del helado -> ");
        valor = in.nextInt();

        if(valor == 1){
            precio1.setNombeElado("Simple");
        
        }   else if(valor == 2){
                precio1.setNombeElado("Barquimie");
        }   else if(valor == 3){
                precio1.setNombeElado("l Doble");
        }   else{
                precio1.setNombeElado("Vasito");
        }
        System.out.print("Ingresa las unidades de helado -> ");
        int helado = in.nextInt();
        precio1.setCantidadDeHelado(helado);

        precio1.mostrar();
    }
    

    public Helado_Pago() {
        TipoMembresia = "Vip";
        NombeElado = "";
        cantidadDeHelado = 0;

    }

    public double calcularDescuento(){
        double descuento;

        if(getTipoMembresia() == "Vip"){
            descuento = calcularSubTotal() * 24 / 100;

        }   else if (getTipoMembresia() == "Especial"){
                descuento = calcularSubTotal()* 19 /100;

        }   else if (getTipoMembresia() == "Normal"){
                descuento = calcularSubTotal() * 11 /100;
        }   else{
                descuento = 0;
        }
        return descuento;

    }

    public double verificarPrecioHelado(){
        
        double precio = 0;
        if("Simple" == getNombeElado()){
            precio = 4.5;
        }   else if("Barquimie" == getNombeElado()){
                precio = 8.5;

        }   else if("l Doble" == getNombeElado()){
                precio = 6.8;
        }   else if("Vasito" == getNombeElado()){
                precio = 9.5;
        }   else{

        }

        return precio;
    }


    public double calcularIva(){
        return (calcularSubTotal() * 18)/100;
    } 

    public double calcularSubTotal(){
        return getCantidadDeHelado() * verificarPrecioHelado();
    }
    public double calcularTotal(){
        return calcularSubTotal() + calcularIva() -calcularDescuento() ;
    }

    public void mostrar(){

        System.out.println("El Subtotal es - " + calcularSubTotal() +"$");
        System.out.println("EL Descuento es - " + calcularDescuento() +"$");
        System.out.println("El Iva total es - " + calcularIva()+"$");
        System.out.println("El Total a pagar es - " + calcularTotal()+"$");
    }
 

    public String getTipoMembresia() {
        return TipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        TipoMembresia = tipoMembresia;
    }

    public String getNombeElado() {
        return NombeElado;
    }

    public void setNombeElado(String nombeElado) {
        NombeElado = nombeElado;
    }

    public int getCantidadDeHelado() {
        return cantidadDeHelado;
    }

    public void setCantidadDeHelado(int cantidadDeHelado) {
        this.cantidadDeHelado = cantidadDeHelado;
    }
    

    
}
