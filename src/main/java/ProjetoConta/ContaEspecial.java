
package ProjetoConta;


public class ContaEspecial extends ContaBancaria{

    private double limite;
    
    

    public ContaEspecial() {
    }

    public ContaEspecial(double limite, String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }
    

    @Override
    public boolean sacar(double Valor) {
        return super.sacar(Valor); 
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String toString() {
        String s ="\nContaEspecial";
        s+="\nLimite: "+limite;
        s+="; "+super.toString();
        return s; 
    }
    
     public boolean sacar2(double valor){
        double saldoComLimite = this.getSaldo() + limite;
        if((saldoComLimite-valor)>=0){
           this.setSaldo(this.getSaldo()-valor);
           return true;
        }
        return false;
    }

    
   
    
    
}
