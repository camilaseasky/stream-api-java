import java.util.Arrays;
import java.util.List;

public class Desafio8 {
  
  private List<Integer> numeros;

  public Desafio8(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Integer somar() {
    return this.numeros.stream().reduce(0, Integer::sum);
  }

  public static void main(String[] args) {
    Desafio8 lista = new Desafio8(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.somar());
  }

}
