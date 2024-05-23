import java.util.Arrays;
import java.util.List;

public class Desafio7 {
  
  private List<Integer> numeros;

  public Desafio7(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Integer segundoMaiorNumero() {
    Integer primeiroMaior =  this.numeros.stream().mapToInt(Integer::intValue).max().getAsInt();
    return this.numeros.stream().filter(n -> n != primeiroMaior).mapToInt(Integer::intValue).max().getAsInt();
  }

  public static void main(String[] args) {
    Desafio7 lista = new Desafio7(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3, 35, 24, 18));
    System.out.println(lista.segundoMaiorNumero());
    
  }
}
