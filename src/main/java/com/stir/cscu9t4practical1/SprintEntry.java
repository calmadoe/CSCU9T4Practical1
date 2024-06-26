package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {

    private int repetitions;
    private int recovery;

    public SprintEntry(String n, int d, int m, int y, int h, int min, int s, int distance, int repetitions, int recovery) {
        super(n, d, m, y, h, min, s, distance);
        this.repetitions = repetitions;
        this.recovery = recovery;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public int getRecovery() {
        return recovery;
    }

    @Override
    public String getEntry() {
        return getName() + " sprinted " + repetitions + "x" + getDistance() + "m in " + getHour() + ":" + getMin() + ":" + getSec() +
               " with " + recovery + " minutes recovery on " + getDay() + "/" + getMonth() + "/" + getYear();
    }
}
