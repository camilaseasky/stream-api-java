import java.util.Arrays;
import java.util.List;

public class Desafio2 {
  
  private List<Integer> numeros;

  public Desafio2(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Integer somarNumerosPares() {
    return this.numeros.stream().filter( n -> n % 2 == 0).reduce(0, Integer::sum);
  }

  public static void main(String[] args) {
    Desafio2 lista = new Desafio2(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.somarNumerosPares());
  }
}
