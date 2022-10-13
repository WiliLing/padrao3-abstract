package abstract_factory;

public class ArmaduraGuerreiro implements Armadura {
    @Override
    public String emitir() {
        return """
                Cabeça: Chain Coif
                Corpo: Chain Armor
                Braços: Leather Gloves
                Pernas: Chain Leggings
                Acessório: Shield
                """;
    }
}
