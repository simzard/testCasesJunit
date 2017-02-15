/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.simonsteinaa.softtestequivboundarydecision;

/**
 *
 * @author simon
 */
public class Customer {
    
    boolean newCustomer,
            loyalityCard,
            coupon;
    
    public Customer(boolean newCustomer, boolean loyalityCard, boolean coupon) {
        this.newCustomer = newCustomer;
        this.loyalityCard = loyalityCard;
        this.coupon = coupon;
    }
    
    public double getResult() {
        if (this.newCustomer && this.loyalityCard && this.coupon) {
            return -1;
        } else if (this.newCustomer && this.loyalityCard && !this.coupon) {
            return -1;
        } else if (this.newCustomer && !this.loyalityCard && this.coupon) {
            return 20;
        } else if (this.newCustomer && !this.loyalityCard && !this.coupon) {
            return 15;
        } else if (!this.newCustomer && this.loyalityCard && this.coupon) {
            return 30;
        } else if (!this.newCustomer && this.loyalityCard && !this.coupon) {
            return 10;
        } else if (!this.newCustomer && !this.loyalityCard && this.coupon) {
            return 20;
        } else {
            return 0;
        }
    }
    
}
