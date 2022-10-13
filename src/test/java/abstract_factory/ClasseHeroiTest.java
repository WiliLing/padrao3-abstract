package abstract_factory;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClasseHeroiTest {

    @Test
    void deveEmitirArmaduraMago() {
        FabricaAbstrata fabrica = new FabricaAbstrataMago();
        ClasseHeroi classe = new ClasseHeroi(fabrica);
        assertEquals("""
                Cabeça: Pointed Hat
                Corpo: Robe
                Braços: Leather Gloves
                Pernas: Robe
                Acessório: Red Scarf
                """, classe.emitirArmadura());
    }

    @Test
    void deveEmitirArmaduraGuerreiro() {
        FabricaAbstrata fabrica = new FabricaAbstrataGuerreiro();
        ClasseHeroi classe = new ClasseHeroi(fabrica);
        assertEquals("""
                Cabeça: Chain Coif
                Corpo: Chain Armor
                Braços: Leather Gloves
                Pernas: Chain Leggings
                Acessório: Shield
                """, classe.emitirArmadura());
    }

    @Test
    void deveEmitirArmaMago() {
        FabricaAbstrata fabrica = new FabricaAbstrataMago();
        ClasseHeroi classe = new ClasseHeroi(fabrica);
        assertEquals("""
                Arma: Staff
                """, classe.emitirArma());
    }

    @Test
    void deveEmitirArmaGuerreiro() {
        FabricaAbstrata fabrica = new FabricaAbstrataGuerreiro();
        ClasseHeroi classe = new ClasseHeroi(fabrica);
        assertEquals("""
                Arma: Sword
                """, classe.emitirArma());
    }

}