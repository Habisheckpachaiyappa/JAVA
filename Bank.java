public class Bank {
    public double getInterestRate() {
        return 0;
    }

    public static class SBI extends Bank {
        @Override
        public double getInterestRate() {
            return 8.4;
        }
    }

    public static class ICICI extends Bank {
        @Override
        public double getInterestRate() {
            return 7.3;
        }
    }

    public static class AXIS extends Bank {
        @Override
        public double getInterestRate() {
            return 9.7;
        }
    }
}