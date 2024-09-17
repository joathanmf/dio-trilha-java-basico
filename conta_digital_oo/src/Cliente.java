import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {
  private String nome;

  @Override
  public String toString() {
    return "Cliente: " + nome;
  }
}
