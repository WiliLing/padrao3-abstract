package abstract_factory;

public class ArmaMago implements Arma{
    @Override
    public String emitir() {
        return """
                Arma: Staff
                """;
    }
}
