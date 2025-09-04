package primitivos;

public class PrimitivosFloat {

    static float varFlotante;
    // inicializarla fuera del main nos muestra su valor por defecto
    // sin necesidad de inicializar en el main

    public static void main(String[] args) {
        
        float realFloat = 0.00000000015f; //  1.5e-10f
        //Lo que va a la izquierda del exponente se conoce como mantissa//la e corresponde a exponente//Valor correspondiente se conoce como valor de punto fijo

        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a " + Float.BYTES);
        System.out.println("float corresponde en bites a " + Float.SIZE);
        System.out.println("el maximo valor de float es: " + Float.MAX_VALUE);
        System.out.println("el mínimo valor de float es: " + Float.MIN_VALUE);
        
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a " + Double.BYTES);
        System.out.println("double corresponde en bites a " + Double.SIZE);
        System.out.println("el maximo valor de double es: " + Double.MAX_VALUE);
        System.out.println("el mínimo valor de double es: " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);

    }
}
