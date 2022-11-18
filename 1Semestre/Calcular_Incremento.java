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


class Calcular_Incremento{

    private int años;
    
    private double 
    Casino,
    Canchas,
    Restaurante,
    Piscinas;
    
    
    


    public Calcular_Incremento(){
        años = 0;
        pagoMensual = 0;
    }


    public static void main(String[] args){

        Calcular_Incremento persona1 = new Calcular_Incremento();

    }


    public float calcularDescuento(){
        float  descuento = 0;
        
        if(getEdad() >= 40){
            descuento = 15.8;
    
        }   else if(getEdad() > 25 && getEdad() < 40 ){
                descuento =  12.5;
        }   else if(getEdad() >= 15 && getEdad() <= 24 ){
                descuento = 8.5;
        }   
        return descuento;
    
    }

    public double totalPagar(){
        return ;

    }

    public void setAños(int años){
        años = años;
    }

    public int getAños(){
        return   años;
    }

    public void setPagoMes(double pago){
        pagoMensual = pago;
    }
    public double getPagoMes(){
        return pagoMensual;
    }

    public double getCasino(){
        return Casino;
    }     

    public void setCasino(double casino){
        Casino = casino;
    }
    


    public double setHospedaje(){
        return Hospedaje;

    }
    public void setHospedaje(double hospedaje){
        Hospedaje = hospedaje;

    }
    
    public double getHospedaje(){
        return Hospedaje;
    }
    

    public void setRestaurante(double restaurante){
        Restaurante = restaurante;
    }

    public double getRestaurante(){
        return Restaurante;
    }

    public void setCanchas(double canchas){
        Canchas = canchas;
    }        

    public canchas getCanchas(){
        return Canchas;
    }

    public void setPicinas(double piscinas){
        Piscinas = piscinas;
    }
    public double getPiscinas(){
        return Piscinas;
    }

}
 




