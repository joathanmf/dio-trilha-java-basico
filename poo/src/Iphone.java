public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
  @Override
  public void ligar(String numero) {
    System.out.println("LIGANDO PARA O NÚMERO " + numero);
  }

  @Override
  public void atender() {
    System.out.println("ATENDENDO O CELULAR");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("INICIANDO CORREIO DE VOZ");
  }

  @Override
  public void exibirPagina(String url) {
    System.out.println("EXIBINDO PÁGINA NO NAVEGADOR: " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("ADICIONANDO NOVA ABA AO NAVEGADOR");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("ATUALIZANDO PÁGINA");
  }

  @Override
  public void tocar() {
    System.out.println("TOCANDO MÚSICA");
  }

  @Override
  public void pausar() {
    System.out.println("PAUSANDO MÚSICA");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("SELECIONANDO MÚSICA NOVA PARA REPRODUZIR: " + musica);
  }
}
