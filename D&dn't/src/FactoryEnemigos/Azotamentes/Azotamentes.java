package FactoryEnemigos.Azotamentes;

import DecoratorAtaque.Ataque;

public abstract class Azotamentes {
    public abstract Ataque ataque1();
    public abstract Ataque ataque2();
    public abstract int defensa();
    public abstract String extra();
}
