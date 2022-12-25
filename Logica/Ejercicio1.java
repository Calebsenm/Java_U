// Actividad 1: Dado un numero x que indica la cantidad de términos a determinar
// para la siguiente serie de números 0,3,6,9,12,15.... Diseñar una clase que nos
// permita obtener la sumatoria de los términos de la serie

import java.util.Scanner;

public class Ejercicio1{

    private int numero ;
  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Ejercicio1 numero1 = new Ejercicio1();

        System.out.print("Ingresa un numero -> ");
        numero1.setNumero(input.nextInt());
        
        System.out.println("Tu la suma de tu sucesion es -> " + numero1.CalcularNumero());
        System.out.println("Tu la suma de tu sucesion es -> " + numero1.CalcularNumeroWhile());
        System.out.println("Tu la suma de tu sucesion es -> " + numero1.CalcularNumeroDOWhile());
    }

    public Ejercicio1(){
        numero = 0;
    }

    public int CalcularNumero(){
        System.out.println("Con for  ");
        int numero = 0;
        int U = 1;
        int i= 0;

        for (  ;  i <= getNumero();   i += 3 ) {
            numero += i; 
            System.out.println( U+"- "+numero +" -> "+i);
            U++;
        }
        return numero;
    }




    public int CalcularNumeroWhile(){
        System.out.println("Con While ");
        int numero = 0;
        int i = 0;
        int ii= 1;
        while(ii <= getNumero()){
            numero += i; 
            System.out.println( ii +"- "+numero +" -> "+i);
            ii++;
            i += 3;
        }
    
        return numero;
    }




    
    public int CalcularNumeroDOWhile(){
        
        System.out.println("Con Do while ");
        int numero = 0;
        int i = 0;
        int ii= 1;
        do{
            numero += i; 
            System.out.println( ii +"- "+numero +" -> "+i);
            ii++;
            i += 3;
        }while(ii <= getNumero());
    
        return numero;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}