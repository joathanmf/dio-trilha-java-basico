import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Banco {
  private String nome;
  private List<Conta> contas;

  public void listarClientes() {
    System.out.println("=== Lista de Clientes do " + nome + " ===");
    for (Conta conta : contas) {
      System.out.println(conta.cliente);
    }
  }
}
