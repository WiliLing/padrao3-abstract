package abstract_factory;

public class ArmaduraMago implements Armadura{
    @Override
    public String emitir() {
        return """
                Cabeça: Pointed Hat
                Corpo: Robe
                Braços: Leather Gloves
                Pernas: Robe
                Acessório: Red Scarf
                """;
    }
}
