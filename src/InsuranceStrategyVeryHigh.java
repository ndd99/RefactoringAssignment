public class InsuranceStrategyVeryHigh extends InsuranceStrategy {
    @Override
    double getWeight() {
        return 0.02;
    }

    @Override
    int getConstant() {
        return 105600;
    }

    @Override
    int getAdjustment() {
        return 60000;
    }
}