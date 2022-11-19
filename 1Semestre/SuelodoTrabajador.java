/*
UNIVERSIDAD DE CORDOBA
INGENIERIA DE SISTEMAS
ING. MARIO MACEA ANAYA
Tutor. Lógica Computacional 


2. El sueldo bruto de los empleados de una empresa se calcula sumando el
sueldo básico más la bonificación por hijos.

El sueldo básico se calcula multiplicando las horas trabajadas por la tarifa horaria.
La tarifa horaria depende de la categoría del empleado de acuerdo con la siguiente
tabla:
        Categoría            TarifaHoraria (S/.)
        Empleado Especial    55.700
        Empleado Destacado   46.300
        Contrato Normal      40.500
        Contrato Temporal    37.600


La bonificación por hijos se calcula de acuerdo con la siguiente tabla:

Numero de Hijos     Bonificación (S/.)
    Más de 5        S/. 55.600 por c/hijo
    De 4 a 5        S/. 43.700 por c/hijo
    Hasta 3         S/. 31.200 por c/hijo

Por ley, todo trabajador está sujeto a un porcentaje de descuento sobre
el sueldo bruto de acuerdo con la siguiente tabla:

    Sueldo Bruto        Descuento (%)
    >= 5.500.000        7.8%
    < 5.500.000         5.9%

Luego de ingresar la categoría y la cantidad de horas trabajadas de un
empleado, la clase nos debe mostrar por pantalla el sueldo básico, el
sueldo bruto, el descuento y el sueldo neto del trabajador.

*/

// importar escanner

import java.util.Scanner;

public class SuelodoTrabajador {

    private int horasTrabajadas;
    private int tipoEmpleado;
    private int numeroHijos;
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SuelodoTrabajador sueldo1 = new SuelodoTrabajador();
     
        System.out.print("Ingresa el total de horas trabajada-> ");
        sueldo1.setHorasTrabajadas(input.nextInt());

        System.out.print("\n"
        +" 1 Empleado Especial \n"
        +" 2 Empleado Destacado \n"
        +" 3 Contrato Normal \n"
        +" 4 Contrato Temporal \n\n"
        + "Ingrese el numero al cual pertenece -> ");
    
        sueldo1.setTipoEmpleado(input.nextInt());
        
        System.out.print("Ingrese la cantidad de Hijos que usted posee -> ");
        sueldo1.setNumeroHijos(input.nextInt());

        sueldo1.mostrar();

    }


    public SuelodoTrabajador() {
        this.horasTrabajadas = 0;
        this.tipoEmpleado = 0;
        this.tipoEmpleado = 0;

    }


    // metodo para calcular el sueldo basico 
    public double calcularSueldoBasico(){
        double sueldoBasico; 
       
        switch (getTipoEmpleado()) {
            case 1:
                sueldoBasico =  getHorasTrabajadas() * 55.700;
                break;
            case 2:
                sueldoBasico =  getHorasTrabajadas() * 46.300;
                break;

            case 3:
                sueldoBasico =  getHorasTrabajadas() * 40.500;
                break;

            case 4: 
                sueldoBasico =  getHorasTrabajadas() * 37.600;
                break;

            default:
                sueldoBasico =  getHorasTrabajadas() * 40.500;
                break;
        }

        return sueldoBasico;
        
    }

    // metodo para calcular la bonficacion por hijo 
    public double calcularBoniHijo(){
        double bonificación = 0;
        if(getNumeroHijos() > 5){
            bonificación = 55.600 * getNumeroHijos();
        
        }   else if(getNumeroHijos() == 4 || getNumeroHijos() == 5){
                bonificación = 43.700 * getNumeroHijos();
        
        }   else if (getNumeroHijos() >0 && getNumeroHijos() <= 3){
                bonificación = 31.200 * getNumeroHijos();
        
        }   else{
                bonificación = 0 * getHorasTrabajadas();
        }

        return bonificación;
    }

    // metodo para calcular el sueldo bruto
    
    public double calcularSueldoBruto(){
        return calcularSueldoBasico() +  calcularBoniHijo();
    }

    //Metodo para calcular el descueto
    public double calcularDescuento(){
        double descuento;

        if(calcularSueldoBruto()  >= 5500000 ){
            descuento =  (calcularSueldoBruto() *  7.8 /100);
        
        }   else if(calcularSueldoBruto() < 5500000){
            descuento =  (calcularSueldoBruto() * 5.9/100);

        }   else{
            descuento = calcularSueldoBruto();
        }

        return descuento;
    }

    public double calcularSueldoNeto(){
        return calcularSueldoBruto() - calcularDescuento();

    }

    // metodo para mostrar
    public void mostrar(){
        System.out.println("Empleado su sueldo basico es -> " + calcularSueldoBasico() + "$");
        System.out.println("Empleado su sueldo bruto es -> " +  calcularSueldoBruto()+ "$");
        System.out.println("Empleado su descuento es -> " + calcularDescuento()+ "$");
        System.out.println("Empleado su sueldo neto es -> " + calcularSueldoNeto()+ "$");
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }


    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    
    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }


    public int getNumeroHijos() {
        return numeroHijos;
    }


    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
    
}
