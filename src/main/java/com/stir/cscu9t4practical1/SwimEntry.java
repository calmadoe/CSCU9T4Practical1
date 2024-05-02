package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {

    private String waterType;

    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String waterType) {
        super(n, d, m, y, h, min, s, dist);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    public String getWhere() {
        if (waterType.equals("pool")) {
            return "in a pool";
        } else {
            return "in " + waterType + " water";
        }
    }

    @Override
    public String getEntry() {
        return getName() + " swam " + getDistance() + " km in " + getHour() + ":" + getMin() + ":" + getSec() +
                " on " + getDay() + "/" + getMonth() + "/" + getYear() + " " + getWhere();
    }
}
