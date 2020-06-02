package main;

import java.util.Arrays;

public class Main {
    
    public static void irALaFeria(PerceptronValue clima, PerceptronValue compania, PerceptronValue transporte) {
        Perceptron p = new Perceptron(Arrays.asList(
                new PerceptronInput(clima, 6),
                new PerceptronInput(clima, 2),
                new PerceptronInput(clima, 2)
        ), 0);
        
        System.out.println("El clima es bueno? " + clima.name());
        System.out.println("Mi pareja me quiere acompañar? " + compania.name());
        System.out.println("El transporte publico queda cercas? " + transporte.name());
        System.out.println("Entonces, debo ir a la feria? " + p.computeOutput().name());
        System.out.println("");
    }
    
    public static void bitwiseXor(PerceptronValue x1, PerceptronValue x2) {
        Perceptron p1 = new Perceptron(Arrays.asList(
                new PerceptronInput(x1, -2),
                new PerceptronInput(x2, -2)
        ), 3);
        
        Perceptron p2 = new Perceptron(Arrays.asList(
                new PerceptronInput(x1, -2),
                new PerceptronInput(p1.computeOutput(), -2)
        ), 3);
        
        Perceptron p3 = new Perceptron(Arrays.asList(
                new PerceptronInput(p1.computeOutput(), -2),
                new PerceptronInput(x2, -2)
        ), 3);
        
        Perceptron p4 = new Perceptron(Arrays.asList(
                new PerceptronInput(p1.computeOutput(), -2),
                new PerceptronInput(p1.computeOutput(), -2)
        ), 3);
        
        Perceptron p5 = new Perceptron(Arrays.asList(
                new PerceptronInput(p2.computeOutput(), -2),
                new PerceptronInput(p3.computeOutput(), -2)
        ), 3);
        
        PerceptronValue x3 = p5.computeOutput();
        PerceptronValue carry = p4.computeOutput();
        
        System.out.println(String.format("%s + %s = %s", x1, x2, x3));
        System.out.println("Carry = " + carry);
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        // Ejemplo 1
        irALaFeria(PerceptronValue.TRUE, PerceptronValue.FALSE, PerceptronValue.FALSE);
        irALaFeria(PerceptronValue.FALSE, PerceptronValue.TRUE, PerceptronValue.TRUE);
        irALaFeria(PerceptronValue.TRUE, PerceptronValue.TRUE, PerceptronValue.TRUE);
        irALaFeria(PerceptronValue.FALSE, PerceptronValue.FALSE, PerceptronValue.FALSE);
        
        // Ejemplo 2
        bitwiseXor(PerceptronValue.FALSE, PerceptronValue.FALSE);
        bitwiseXor(PerceptronValue.TRUE, PerceptronValue.FALSE);
        bitwiseXor(PerceptronValue.TRUE, PerceptronValue.TRUE);
        bitwiseXor(PerceptronValue.FALSE, PerceptronValue.TRUE);
    }
}
