
package exer1;

public class Carro {
    
public String marca, modelo;
    public int ano;
    public double preco;
    
    public Carro(String marca, String modelo, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
    
     public void exibir(){
         System.out.println("Marca: " + marca);
         System.out.println("Modelo: " + modelo);
         System.out.println("Preço: " + preco);
             System.out.println("Ano: " + ano);
         }
      
      public String getMarca(){
          return marca; 
      }

      public void setMarca(String marca){
          this.marca = marca;
      }

      public String getModelo(){
           return modelo;
        }
          
       public void setModelo(String modelo){
           this.modelo = modelo;
}
           public int getAno(){
          return ano; 
      }

     public void setAno(int ano){
          this.ano = ano;
      }


}
