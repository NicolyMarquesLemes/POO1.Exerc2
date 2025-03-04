
package exer5;

public class contaBancaria {
    public int numeroConta;
    public String nomeTitular;
    public double saldo;
  
    public contaBancaria(int numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
        
    }
    
    public void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    
    public void sacar(double valorSaque){
        if (saldo >= valorSaque){
          saldo -= valorSaque;
          
        }else{
            System.out.println("Erro!Não é possivel fazer o saque");
            
        }
        
    }
    
    public void exibir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Titular: " + nomeTitular);

    }
        public int getNumeroConta(){
            return numeroConta;  
         }
        
        public void setNumeroConta(int numeroConta){
          this.numeroConta = numeroConta;
      }
        
         public String getNomeTitular(){
            return nomeTitular;  
         }
         
          public void setNomeTitular(String nomeTitular){
          this.nomeTitular = nomeTitular;
          
          }
          
         public double getSaldo(){
            return saldo;  
         }
         
         public void setSaldo(double saldo){
          this.saldo = saldo;
      }
         
}


