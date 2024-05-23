import java.util.Arrays;
import java.util.List;

public class Desafio11 {
  

  private List<Integer> numeros;

  public Desafio11(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Integer somar() {
    return this.numeros.stream().map( n -> Math.pow(n, 2)).map( n -> n.intValue()).reduce(0, Integer::sum );
  }

  public static void main(String[] args) {
    Desafio11 lista = new Desafio11(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.somar());
  }
}
