public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    double getWeight() {
        return 0.02;
    }

    int getConstant() {
        return 105600;
    }

    int getAdjustment() {
        return 60000;
    }
}