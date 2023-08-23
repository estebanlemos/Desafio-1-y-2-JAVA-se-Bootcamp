
package esteban.calculadora;


public class Calculadora {
    
    public int sumar(int a, int b) {
        int suma = a + b;
        return suma;    
    }
    
    public int restar(int a, int b) {
        int resta = a - b;
        return resta;
    }
    
    public int multiplicar(int a, int b) {
        int multiplicacion = a * b;
        return multiplicacion;
    }
    
    public double dividir(int a, int b) {
        double división = (double) a / (double) b;
        return división;
    }
    public static void main(String[] args) {
        
        Calculadora calculadora1 = new Calculadora();
        
        double resultado = 0;
        int valor1 = 0;
        int valor2 = 0;
        
        
        try { 
            valor1 = Integer.parseInt(args[0]);
            valor2 = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Los valores ingresados no son correctos");
            return;
        }
            
        
        if (args.length != 3) {
            System.out.println("Ingrese los argumentos en el formato correcto");
            return;
        }
        
        
        if (args[2].equals("SUM") ) {
            resultado = calculadora1.sumar(valor1, valor2);
            
            
        } else if (args[2].equals("RES")) {
            resultado = calculadora1.restar(valor1, valor2);
            
            
        } else if (args[2].equals("MUL")) {
            resultado = calculadora1.multiplicar(valor1, valor2);
            
            
        } else if (args[2].equals("DIV")) {
            resultado = calculadora1.dividir(valor1, valor2);
            
            
        } else {
        System.out.println("Ingrese una función disponible");
    }
        System.out.println(resultado);
    }
}
