/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runtimebinding;

/**
 *
 * @author Admin
 */
class Payment {
    void pay(double amount) {
        System.out.println("Processing generic payment of $" + amount);
    }
}

    // Subclass 1: CreditCardPayment
    class CreditCardPayment extends Payment {
        @Override
        void pay(double amount) {
            System.out.println("Processing credit card payment of $" + amount);
        }
    }

    // Subclass 2: PayPalPayment
    class PayPalPayment extends Payment {
        @Override
        void pay(double amount) {
            System.out.println("Processing PayPal payment of $" + amount);
        }
    }

public class RunTimeBinding {
    
    

    public static void main(String[] args) {
        
        // Reference of type Payment, object of type CreditCardPayment
        Payment payment1 = new CreditCardPayment();
        payment1.pay(100.00);  // Dynamic binding: resolves at runtime

        // Reference of type Payment, object of type PayPalPayment
        Payment payment2 = new PayPalPayment();
        payment2.pay(200.50);  // Dynamic binding: resolves at runtime
        
    }
}
