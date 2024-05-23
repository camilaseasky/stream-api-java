import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio16 {
  
  private List<Integer> numeros;

  public Desafio16(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public void agrupaParesImpares() {
    List<Integer> numerosPares =  this.numeros.stream().filter(n -> n % 2 == 0).distinct().sorted().collect(Collectors.toList());
    System.out.println("Números pares: " + numerosPares);
    List<Integer> numerosImpares =  this.numeros.stream().filter(n -> n % 2 != 0).distinct().sorted().collect(Collectors.toList());
    System.out.println("Números ímpares: " + numerosImpares);
  }

  public static void main(String[] args) {
    Desafio16 lista = new Desafio16(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    lista.agrupaParesImpares();
  }
}
