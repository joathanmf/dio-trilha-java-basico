package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {
  private final String nomeBootcamp;
  private final String nomeDev;
  private final LocalDate dataConclusao;

  public Certificado(String nomeBootcamp, String nomeDev) {
    this.nomeBootcamp = nomeBootcamp;
    this.nomeDev = nomeDev;
    this.dataConclusao = LocalDate.now();
  }

  @Override
  public String toString() {
    return "Certificado{" +
        "nomeBootcamp='" + nomeBootcamp + '\'' +
        ", nomeDev='" + nomeDev + '\'' +
        ", dataConclusao=" + dataConclusao +
        '}';
  }
}
