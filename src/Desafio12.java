import java.util.Arrays;
import java.util.List;

public class Desafio12 {
  
  private List<Integer> numeros;

  public Desafio12(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Long calcularProduto() {
    return this.numeros.stream()
      .mapToLong(Integer::longValue)
      .reduce(1, (n1, n2) -> n1 * n2);
  }

  public static void main(String[] args) {
    Desafio12 lista = new Desafio12(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.calcularProduto());
  }
}
