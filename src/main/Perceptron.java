package main;

import java.util.List;

public class Perceptron {
    
    private final List<PerceptronInput> inputs;
    private final double bias;

    public Perceptron(List<PerceptronInput> inputs, double bias) {
        this.inputs = inputs;
        this.bias = bias;
    }
    
    public PerceptronValue computeOutput() {
        double weightedSum = inputs.stream()
                .map(input -> input.getInputValue().getValue() * input.getWeight())
                .mapToDouble(Double::doubleValue)
                .sum();
        
        return weightedSum + bias > 0 ?
                PerceptronValue.TRUE :
                PerceptronValue.FALSE;
    }
}
