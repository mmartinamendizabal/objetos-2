package ar.edu.unlp.info.oo2.ejercicio22_SubteWay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SubteWayTest {

    private SubteWay subteWay = new SubteWay(null);

    @Test
    public void testSandwichClasico() {
        SandwichMaker clasico = new Clasico();
        subteWay.cambiarMaker(clasico);
        subteWay.hacerSandwich();
        Sandwich sandwich = clasico.getSandwich();
        assertEquals(500, sandwich.getPrecio());
    }

    @Test
    public void testSandwichVegetariano() {
        SandwichMaker vegetariano = new Vegetariano();
        subteWay.cambiarMaker(vegetariano);
        subteWay.hacerSandwich();
        Sandwich sandwich = vegetariano.getSandwich();
        assertEquals(420, sandwich.getPrecio());
    }

    @Test
    public void testSandwichVegano() {
        SandwichMaker vegano = new Vegano();
        subteWay.cambiarMaker(vegano);
        subteWay.hacerSandwich();
        Sandwich sandwich = vegano.getSandwich();
        assertEquals(620, sandwich.getPrecio());
    }

    @Test
    public void testSandwichSinTACC() {
        SandwichMaker sinTACC = new SinTACC();
        subteWay.cambiarMaker(sinTACC);
        subteWay.hacerSandwich();
        Sandwich sandwich = sinTACC.getSandwich();
        assertEquals(618, sandwich.getPrecio());
    }
}
