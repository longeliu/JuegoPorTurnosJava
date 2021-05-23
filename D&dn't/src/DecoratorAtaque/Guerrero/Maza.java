package DecoratorAtaque.Guerrero;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Maza extends DecoratorAtack {

    public Maza(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return 3;
    }

    @Override
    public String getNombre() {
        return "Ataque con Maza";
    }
}
