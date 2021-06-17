package it.gioelepannetto.tarifa;

public class Tarifa {
    public final int monthlyMb;
    public final int months;
    public final int[] usedMb;

    public Tarifa(int monthlyMb, int months, int[] usedMb) {
        this.monthlyMb = monthlyMb;
        this.months = months;
        this.usedMb = usedMb;
    }

    public int getTotalUsage() {
        int total = 0;

        for (int mb: usedMb) {
            total += mb;
        }

        return total;
    }

    public int getRemainingMb() {
        final int totalUsage = getTotalUsage();
        final int totalAvailable = monthlyMb * months;

        return (totalAvailable - totalUsage) + monthlyMb;
    }
}
