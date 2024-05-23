import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaOrdenada {
  
  private List<Integer> numeros;

  public ListaOrdenada(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public void ordenarLista() {
    this.numeros = this.numeros.stream().sorted().collect(Collectors.toList());
  }

  public static void main(String[] args) {
    ListaOrdenada lista = new ListaOrdenada(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));
    lista.ordenarLista();
    System.out.println(lista.getNumeros());
  }
}
