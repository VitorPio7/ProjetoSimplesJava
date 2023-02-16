/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoConta;

import java.util.Scanner;

public class Limite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ContaBancaria contaBancaria = new  ContaBancaria();
        ContaPoupanca contaPoupanca  = new 
        ContaPoupanca(1.24, "Vitor", "045685-09", 4985.25);
        ContaEspecial contaEspecial = new 
        ContaEspecial(7285, "Vitor", "78569-09",8569.77);
        System.out.println("**------------------------------**");
        System.out.println("O que deseja fazer?");
        System.out.println("1-Criar conta\n2-Sacar um valor"
                + " das contas\n3-Depositar\n4-Rendimento Especial\n5-Mostrar Dados");
        
        int entrada= sc.nextInt();
        
        switch(entrada){
            case 1 :
                System.out.print("\nDigite seu nome: ");
                contaBancaria.setNomeCliente(sc.next());
                System.out.print("\nDigite sua data nascimento: ");
                String dataNasc = sc.next();
                System.out.print("\nDigite o seu CPF: ");
                String cpfUsuario = sc.next();
                
                System.out.print("\nConta criada com sucesso!!!");
                System.out.print("\nBem vindo ao banco "
                        +contaBancaria.getNomeCliente()+ "!!!");
                break;
        
            case 2 : 
                System.out.println("\n--------SAQUE--------");
                System.out.print("\n1)Poupanca\n2)Especial");
                int entrada2 = sc.nextInt();
                if(entrada2 == 1){
                    System.out.println("-------POUPANCA---------");
                    System.out.print("\nDigite o valor de saque:");
                    double ValorSaque = sc.nextDouble();
                    contaPoupanca.sacar(ValorSaque);
                    System.out.println(contaPoupanca.toString()); 
              
                }else{
                    System.out.println("-------ESPECIAL---------");
                    System.out.print("\nDigite o valor de saque:");
                    contaEspecial.sacar(sc.nextDouble());     
                    System.out.println(contaEspecial.toString());
                  }
                break;
            case 3:     
                System.out.println("------DEPOSITAR------");
                System.out.println("Digite 1 para poupança\nDigite 2 para especial");
                int entrada3 = sc.nextInt();
                if(entrada3 == 1){
                    System.out.println("-------POUPANCA---------");
                    System.out.print("\nDigite o valor de deposito:");
                    double ValorDeposito = sc.nextDouble();
                    contaPoupanca.depositar(ValorDeposito);
                    System.out.println(contaPoupanca.toString());
                }else{
                    System.out.println("-------ESPECIAL---------");
                    System.out.print("\nDigite o valor de deposito:");
                    contaEspecial.depositar(sc.nextDouble()); 
                    System.out.println(contaEspecial.toString());  
                
                  }
                break;
            case 4:
                System.out.println("-------RENDIMENTO-------"); 
                System.out.println(contaPoupanca.calcularNovoSaldo(1.24)); 
                System.out.println(contaPoupanca.toString());
                break;
            case 5:
                System.out.println("------INFORMACÕES--------");
                System.out.println("Qual conta você deseja obter informações: ");
                System.out.println("Digite (1) para poupança e (2) para especial");
                int info = sc.nextInt();
                if(info == 1){
                    System.out.println(contaPoupanca.toString());
                }else{
                    System.out.println(contaEspecial.toString());
                }
                break;
        }        
        
        }
           
    }
  

