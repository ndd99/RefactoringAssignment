public abstract class InsuranceStrategy {
    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    abstract double getWeight();

    abstract int getConstant();

    abstract int getAdjustment();
}
