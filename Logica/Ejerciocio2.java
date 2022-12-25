import java.util.Scanner;

public class Ejerciocio2 {

    private int numero;

    int i = 0;        // pimer valor
    int j = 1;        // segundo valor
    int h = 0;        // guarda el valor anterior a la suma
   
   
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Ejerciocio2 numero = new Ejerciocio2();

        System.out.print("Ingresa un numero -> ");
        numero.setNumero(in.nextInt());
        numero.CalcularFibonaci();
        
    }
    public void CalcularFibonaci(){

         
        i = 0;
        j = 1;
        h = 0;

        int pt = 0;
        while(pt <= getNumero()){
            System.out.print(i + ", "); 
            h = i;
            i = i + j;
            j = h; 
            pt++;
            
        }
        System.out.println();
    }

    public  Ejerciocio2 (){
        numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
