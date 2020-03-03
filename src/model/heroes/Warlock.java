package model.heroes;

import model.cards.Rarity;
import model.cards.minions.Minion;
import model.cards.spells.CurseOfWeakness;
import model.cards.spells.SiphonSoul;
import model.cards.spells.TwistingNether;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Warlock extends Hero {

    public Warlock() throws IOException {
        super("Gul’dan");
    }

    @Override
    public void buildDeck() throws IOException {
        ArrayList<Minion> allNeutralMinions = getAllNeutralMinions("neutral_minions.csv");
        ArrayList<Minion> neutralMinions = getNeutralMinions(allNeutralMinions, 13);
        getDeck().addAll(neutralMinions);
        getDeck().add(new CurseOfWeakness());
        getDeck().add(new CurseOfWeakness());
        getDeck().add(new SiphonSoul());
        getDeck().add(new SiphonSoul());
        getDeck().add(new TwistingNether());
        getDeck().add(new TwistingNether());
        Minion minion = new Minion("Wilfred Fizzlebang", 6, Rarity.LEGENDARY, 4,4 , false, false,
                false);
        getDeck().add(minion);
        Collections.shuffle(getDeck());
    }
}
