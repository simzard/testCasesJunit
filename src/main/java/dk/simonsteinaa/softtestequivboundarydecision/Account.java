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
public class Account {
    double balance;
    
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    public double getInterest() {
        return 0;
    }
}
