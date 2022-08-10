package com.solecki.apps.cucumberpoc;

import lombok.Data;

@Data
public class Belly {
    private int cukes;
    private boolean growled;

    public void eat(int cukes) {
        this.cukes = cukes;
        System.out.println("Belly has been feed " + cukes + " cukes");
    }

    public void wait(int hours) {
        System.out.println("Belly is waiting " + hours + " hours");
        System.out.println("Belly has growled");
        growled = true;
    }

}