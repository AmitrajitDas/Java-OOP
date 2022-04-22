package com.ad.playground;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setFirstNumber(22);
        double x = calc.getFirstNumber();
        System.out.println(x);
        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}
