package FactoryMethod;

import com.company.SuperHero;

public abstract class peopleabstract {
    public SuperHero orderHero()
    {
        SuperHero Hero;
        Hero = createHero();

        return Hero;
    }

    abstract SuperHero createHero();

}
