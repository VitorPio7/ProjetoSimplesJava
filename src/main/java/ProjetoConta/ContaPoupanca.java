/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoConta;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private double diaRendimento;

    public ContaPoupanca() {
    }

    
    
    public ContaPoupanca(double diaRendimento, String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public boolean sacar(double Valor) {
        return super.sacar(Valor); 
    }
    
    public boolean calcularNovoSaldo(double taxaDia){
         Calendar hoje = Calendar.getInstance();
         if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
             this.setSaldo(this.getSaldo()+(this.getSaldo()* taxaDia));
             return true;
         }
          return false;
        }
    

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    public String toString(){
       String s = "\nContaPoupança";
       s+= "\ndiaRendimento: "+diaRendimento;
       s+=super.toString();
       return s;
       
    }
    
    
}
