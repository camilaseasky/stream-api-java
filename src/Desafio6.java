import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio6 {
  
  private List<Integer> numeros;

  public Desafio6(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public List<Integer> verificaMaiorDez() {
    return this.numeros.stream().filter( n -> n > 10).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    Desafio6 lista = new Desafio6(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3, 35, 24, 18));
    var maioresDez = lista.verificaMaiorDez();
    if(maioresDez.isEmpty()) {
      System.out.println("Não existem números maiores que 10 na lista.");
    } else {
      System.out.println("Números maiores que 10: " + maioresDez);
    }
  }
}
