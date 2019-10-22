package FactoryMethod;

import com.company.SuperHero;

public class goodFlyManFactory extends peopleabstract {
    @Override
    SuperHero createHero() {
        return  new goodFlyMan();
    }
}
