package main;

import frame.FoodBase;
import frame.FoodStart;

public class FoodMain {
    public static void main(String[] args) {
       FoodBase.getInstance(new FoodStart());
    }
}
