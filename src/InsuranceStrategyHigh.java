public class InsuranceStrategyHigh extends InsuranceStrategy {
    @Override
    double getWeight() {
        return 0.1;
    }

    @Override
    int getConstant() {
        return 76500;
    }

    @Override
    int getAdjustment() {
        return 30000;
    }
}
