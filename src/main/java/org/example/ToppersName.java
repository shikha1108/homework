package org.example;

import java.util.ArrayList;
import java.util.List;

public class ToppersName {
    public static void main(String[] args) {
        List<Topper> toppers = new ArrayList<>();
        Topper pankaj = new Topper();
        pankaj.name = "Pankaj";
        pankaj.numbers = 99;
        toppers.add(pankaj);

        Topper shikha = new Topper();
        shikha.name = "Shikha";
        shikha.numbers = 79;
        toppers.add(pankaj);

        Topper angel = new Topper();
        angel.name = "Angel";
        angel.numbers = 100;
        toppers.add(angel);

        Topper mili = new Topper();
        mili.name = "Mili";
        mili.numbers = 120;
        toppers.add(mili);

        Topper toppernew = Toppername(toppers);
        System.out.println(toppernew.name);


    }

    private static Topper Toppername(List<Topper> topper) {
        Topper toppernew = topper.get(0);
        for (Topper topper1 : topper) {
            if (topper1.numbers > toppernew.numbers) {
                topper = topper;
            }

        }
        return toppernew;
    }
}