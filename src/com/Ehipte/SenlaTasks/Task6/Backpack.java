package com.Ehipte.SenlaTasks.Task6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private int weightLimit;
    private int sumAmount;
   List<Thing> arrayThings;

    public Backpack(int weightLimit) {
        this.weightLimit = weightLimit;//
        this.arrayThings = new ArrayList<>();
        sumAmount = 0;
    }

    public List<Thing> getArrayThings() {
        return arrayThings;
    }

    public int getSumAmount() {
        return sumAmount;
    }


    public boolean putThings(Thing thing) {

        if (thing != null && thing.getWeight() > 0) {

            if (this.weightLimit >= thing.getWeight() + sumWeight()) {
                arrayThings.add(thing);
                sumAmount += thing.getPrice();

                return true;
            }
        }
        return false;
    }


    private int sumWeight() {
        int sum = 0;

        for (Thing i : arrayThings) {
            sum += i.getWeight();

        }
        return sum;
    }

    private int sumPrice() {
        int sum = 0;

        for (Thing i : arrayThings) {
            sum += i.getPrice();

        }
        return sum;
    }
}