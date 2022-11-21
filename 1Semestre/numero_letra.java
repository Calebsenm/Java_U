import java.util.Scanner;

class numero_letra {

    private int numero1;


    public static void main(String[] args) {
        numero_letra numero = new numero_letra();
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa un numero - ");
        numero.setnnumero(in.nextInt());
        numero.mostrarR();
    }


    public numero_letra() {
        numero1 = 0;
    }

    public void setnnumero(int n) {
        numero1 = n;
    }

    public int getnumero() {
        return numero1;
    }

    public String obtenerNumero() {

        String numero = "numero fuera de categoria";
        if (getnumero() == 0) {
            numero = "cero";
        }
        if (getnumero() == 1) {
            numero = "uno";
        }
        if (getnumero() == 2) {
            numero = "dos";
        }
        if (getnumero() == 3) {
            numero = "tres";
        }
        if (getnumero() == 4) {
            numero = "cuatro";
        }
        if (getnumero() == 5) {
            numero = "cinco";
        }
        if (getnumero() == 6) {
            numero = "seis";
        }
        if (getnumero() == 7) {
            numero = "siete";
        }
        if (getnumero() == 8) {
            numero = "ocho";
        }
        if (getnumero() == 9) {
            numero = "nueve";
        }
        if (getnumero() == 10) {
            numero = "diez";
        }
        if (getnumero() == 11) {
            numero = "diez y uno";
        }
        if (getnumero() == 12) {
            numero = "diez y dos ";
        }
        if (getnumero() == 13) {
            numero = "diez y tres";
        }
        if (getnumero() == 14) {
            numero = "diez y cuatro";
        }
        if (getnumero() == 15) {
            numero = "diez y cinco";
        }
        if (getnumero() == 16) {
            numero = "diez y seis";
        }
        if (getnumero() == 17) {
            numero = "diez y siete";
        }
        if (getnumero() == 18) {
            numero = "diez y ocho";
        }
        if (getnumero() == 19) {
            numero = "diez y nueve";
        }
        if (getnumero() == 20) {
            numero = "veinte";
        }
        if (getnumero() == 21) {
            numero = "veinte y uno";
        }
        if (getnumero() == 22) {
            numero = "veinte y dos";
        }
        if (getnumero() == 23) {
            numero = "veinte y tres";
        }
        if (getnumero() == 24) {
            numero = "veinte y cuatro";
        }
        if (getnumero() == 25) {
            numero = "veinte y cinco";
        }
        if (getnumero() == 26) {
            numero = "veinte y seis";
        }
        if (getnumero() == 27) {
            numero = "veinte y siete";
        }
        if (getnumero() == 28) {
            numero = "veinte y ocho";
        }
        if (getnumero() == 29) {
            numero = "veinte y nueve";
        }
        if (getnumero() == 30) {
            numero = "treinta";
        }
        if (getnumero() == 31) {
            numero = "treinta y uno";
        }
        if (getnumero() == 32) {
            numero = "treinta y dos";
        }
        if (getnumero() == 33) {
            numero = "treinta y tres";
        }
        if (getnumero() == 34) {
            numero = "treinta y cuatro";
        }
        if (getnumero() == 35) {
            numero = "treinta y cinco";
        }
        if (getnumero() == 36) {
            numero = "treinta y seis";
        }
        if (getnumero() == 37) {
            numero = "treinta y siete";
        }
        if (getnumero() == 38) {
            numero = "treinta y ocho";
        }
        if (getnumero() == 39) {
            numero = "treinta y nueve";
        }
        if (getnumero() == 40) {
            numero = "cuarenta";
        }
        if (getnumero() == 41) {
            numero = "cuarenta y uno";
        }
        if (getnumero() == 42) {
            numero = "cuarenta y dos";
        }
        if (getnumero() == 43) {
            numero = "cuarenta y tres";
        }
        if (getnumero() == 44) {
            numero = "cuarenta y cuatro";
        }
        if (getnumero() == 45) {
            numero = "cuarenta y cinco";
        }
        if (getnumero() == 46) {
            numero = "cuarenta y seis";
        }
        if (getnumero() == 47) {
            numero = "cuarenta y siete";
        }
        if (getnumero() == 48) {
            numero = "cuarenta y ocho";
        }
        if (getnumero() == 49) {
            numero = "cuarenta y nueve";
        }
        if (getnumero() == 50) {
            numero = "cincuenta";
        }
        if (getnumero() == 51) {
            numero = "cincuenta y uno";
        }
        if (getnumero() == 52) {
            numero = "cincuenta y dos";
        }
        if (getnumero() == 53) {
            numero = "incuenta y tres";
        }
        if (getnumero() == 54) {
            numero = "cincuenta y cuatro";
        }
        if (getnumero() == 55) {
            numero = "cinuenta y cinco";
        }
        if (getnumero() == 56) {
            numero = "cincuenta y seis";
        }
        if (getnumero() == 57) {
            numero = "cincuenta y siete";
        }
        if (getnumero() == 58) {
            numero = "cincuenta y ocho";
        }
        if (getnumero() == 59) {
            numero = "cincuenta y nueve";
        }
        if (getnumero() == 60) {
            numero = "sesenta";
        }
        if (getnumero() == 61) {
            numero = "sesenta y uno";
        }
        if (getnumero() == 62) {
            numero = "sesenta y dos";
        }
        if (getnumero() == 63) {
            numero = "sesenta y tres";
        }
        if (getnumero() == 64) {
            numero = "sesenta y cuatro";
        }
        if (getnumero() == 65) {
            numero = "sesenta y cinco";
        }
        if (getnumero() == 66) {
            numero = "sesenta y seis";
        }
        if (getnumero() == 67) {
            numero = "sesenta y siete";
        }
        if (getnumero() == 68) {
            numero = "sesenta y ocho";
        }
        if (getnumero() == 69) {
            numero = "sesenta y nueve";
        }
        if (getnumero() == 70) {
            numero = "setenta";
        }
        if (getnumero() == 71) {
            numero = "setenta y uno";
        }
        if (getnumero() == 72) {
            numero = "setenta y dos";
        }
        if (getnumero() == 73) {
            numero = "setenta y tres";
        }
        if (getnumero() == 74) {
            numero = "setenta y cuatro";
        }
        if (getnumero() == 75) {
            numero = "setenta y cinco";
        }
        if (getnumero() == 76) {
            numero = "setenta y seis ";
        }
        if (getnumero() == 77) {
            numero = "setenta y siete";
        }
        if (getnumero() == 78) {
            numero = "setenta y ocho";
        }
        if (getnumero() == 79) {
            numero = "setenta y nueve";
        }
        if (getnumero() == 80) {
            numero = "ochenta";
        }
        if (getnumero() == 81) {
            numero = "ochenta y uno";
        }
        if (getnumero() == 82) {
            numero = "ochenta y dos ";
        }
        if (getnumero() == 83) {
            numero = "ochenta y tres";
        }
        if (getnumero() == 84) {
            numero = "ochenta y cuatro";
        }
        if (getnumero() == 85) {
            numero = "ochenta y cinco";
        }
        if (getnumero() == 86) {
            numero = "ochenta y seis";
        }
        if (getnumero() == 87) {
            numero = "ochenta y siete";
        }
        if (getnumero() == 88) {
            numero = "ochenta y ocho";
        }
        if (getnumero() == 89) {
            numero = "ochenta y nuve";
        }
        if (getnumero() == 90) {
            numero = "noventa";
        }
        if (getnumero() == 91) {
            numero = "noventa y uno";
        }
        if (getnumero() == 92) {
            numero = "noventa y dos";
        }
        if (getnumero() == 93) {
            numero = "noventa y tres";
        }
        if (getnumero() == 94) {
            numero = "noventa y cuatro";
        }
        if (getnumero() == 95) {
            numero = "noventa y cinco";
        }
        if (getnumero() == 96) {
            numero = "noventa y seis";
        }
        if (getnumero() == 97) {
            numero = "noventa y siete";
        }
        if (getnumero() == 98) {
            numero = "noventa y ocho";
        }
        if (getnumero() == 99) {
            numero = "noventa y nueve";
        }
        return (numero);
    }

    public void mostrarR() {
        System.out.println("Tu numero es  " + obtenerNumero() );
    }
}