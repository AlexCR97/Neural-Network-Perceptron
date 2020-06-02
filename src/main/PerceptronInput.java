package main;

public class PerceptronInput {
    
    private final PerceptronValue inputValue;
    private final double weight;

    public PerceptronInput(PerceptronValue inputValue, double weight) {
        this.inputValue = inputValue;
        this.weight = weight;
    }

    public PerceptronValue getInputValue() {
        return inputValue;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "PerceptronInput{" + "inputValue=" + inputValue + ", weight=" + weight + '}';
    }
}
