package ex26;

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(int balance, double apr, int payment){
        return (int) Math.ceil(-(1.0/30) * Math.log(1 + ((double) balance)/payment * (1 - Math.pow(1 + apr/365, 30))) / Math.log(1 + apr/365));
    }
}
