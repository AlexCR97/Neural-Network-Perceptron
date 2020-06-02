package main;

public enum PerceptronValue {
    
    FALSE(0),
    TRUE(1);
    
    private final double value;
    
    PerceptronValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf((int) value);
    }
}
