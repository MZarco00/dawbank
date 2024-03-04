/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dawbank;

/**
 *
 * @author mario
 */
public class CuentaBancaria {
    
    private String iban;
    private String titular;
    private double saldo;
    private int movimientos;
    
    public CuentaBancaria(String iban, String titular, double saldo, int movimientos){
    this.iban = iban;
    this.titular = titular;
    this.saldo = saldo;
    this.movimientos = movimientos;
    
    }
    
    //getter y setter

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }
    
}
