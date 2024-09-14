public class Main {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    System.out.println("Reprodutor Musical");
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("Before I Forget - Slipknot");

    System.out.println("\nAparelho Telefônico");
    iphone.ligar("40028922");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    System.out.println("\nNavegador Internet");
    iphone.exibirPagina("www.dio.me");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
  }
}
