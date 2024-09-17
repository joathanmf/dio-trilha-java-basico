import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Banco banco = new Banco();
    banco.setNome("Banco do Brasil");

    Cliente cliente1 = new Cliente();
    Cliente cliente2 = new Cliente();

    cliente1.setNome("Joathan");
    cliente2.setNome("Paula");

    Conta ccCliente1 = new ContaCorrente(cliente1);
    Conta poupancaCliente1 = new ContaPoupanca(cliente1);

    Conta ccCliente2 = new ContaCorrente(cliente2);
    Conta poupancaCliente2 = new ContaPoupanca(cliente2);

    List<Conta> listaClientes = new ArrayList<>();
    listaClientes.add(ccCliente1);
    listaClientes.add(ccCliente2);
    listaClientes.add(poupancaCliente1);
    listaClientes.add(poupancaCliente2);

    banco.setContas(listaClientes);
    banco.listarClientes();

    ccCliente1.depositar(50);
    ccCliente1.transferir(20, poupancaCliente1);

    ccCliente2.depositar(100);
    ccCliente2.transferir(50, poupancaCliente2);

    ccCliente1.imprimirExtrato();
    poupancaCliente1.imprimirExtrato();

    System.out.print("\n");

    ccCliente2.imprimirExtrato();
    poupancaCliente2.imprimirExtrato();
  }
}
