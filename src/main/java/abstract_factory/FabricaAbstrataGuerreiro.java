package abstract_factory;

public class FabricaAbstrataGuerreiro implements FabricaAbstrata {

    @Override
    public Arma createArma() {
        return new ArmaGuerreiro();
    }

    @Override
    public Armadura createArmadura() {
        return new ArmaduraGuerreiro();
    }
}
