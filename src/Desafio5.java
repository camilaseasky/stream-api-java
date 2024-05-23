import java.util.Arrays;
import java.util.List;

public class Desafio5 {
  
  private List<Integer> numeros;

  public Desafio5(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Double mediaMaioresCinco() {
    return this.numeros.stream().filter( n -> n > 5).mapToInt(Integer::intValue).average().getAsDouble();
  }

  public static void main(String[] args) {
    Desafio5 lista = new Desafio5(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.mediaMaioresCinco());
  }
}
