package abstract_factory;

public class ArmaGuerreiro implements Arma {
    @Override
    public String emitir() {
        return """
                Arma: Sword
                """;
    }
}
