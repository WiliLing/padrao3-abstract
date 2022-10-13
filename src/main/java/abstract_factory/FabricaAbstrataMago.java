package abstract_factory;

public class FabricaAbstrataMago implements FabricaAbstrata {

    @Override
    public Arma createArma() {
        return new ArmaMago();
    }

    @Override
    public Armadura createArmadura() {
        return new ArmaduraMago();
    }
}
