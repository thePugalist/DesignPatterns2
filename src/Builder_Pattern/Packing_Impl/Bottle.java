package Builder_Pattern.Packing_Impl;

import Builder_Pattern.Interfaces.Packing;

/**
 * Created by Jordan on 5/31/2016.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
