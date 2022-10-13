package abstract_factory;

public class ClasseHeroi {
    private Arma arma;
    private Armadura armadura;

    public ClasseHeroi(FabricaAbstrata fabrica) {
        this.arma = fabrica.createArma();
        this.armadura = fabrica.createArmadura();
    }

    public String emitirArma() {
        return this.arma.emitir();
    }

    public String emitirArmadura() {
        return this.armadura.emitir();
    }
}