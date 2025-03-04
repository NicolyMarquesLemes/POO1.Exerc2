
package exer4;

public class Retangulo {
    public double altura, largura, area;
    
    public Retangulo(double altura, double largura){
         this.altura = altura;
          this.largura = largura;
}
    public void exibir(){
          System.out.println("Altura: " + altura);
          System.out.println("Largura: " + largura);
          System.out.println("Area: " + area);
      }
    
    public void calcular(){
        area = altura * largura;  
    }
    
    public double getAltura(){
          return altura; 
      }
    
    public void setAltura(double altura){
          this.altura = altura;
      }
    
    public double getLargura(){
          return largura; 
      }
    
    public void setLargura(double largura){
          this.largura = largura;
      }
    
}
