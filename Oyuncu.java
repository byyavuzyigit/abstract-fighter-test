public abstract class Oyuncu implements Comparable {

    private double saldiriGucu;
    private String isim;
    private double deneyimPuani;
    private int compare;
    abstract void bilgi();
    abstract String ozet();
    abstract double getToplamHamleGucu();

    public String getIsim() {
        return isim;
    }

    public double getDeneyimPuani() {
        return deneyimPuani;
    }

    public double getSaldiriGucu() {
        return saldiriGucu;
    }
    public int getCompare() {
        return compare;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setDeneyimPuani(double deneyimPuani) {
        this.deneyimPuani = deneyimPuani;
    }

    public void setSaldiriGucu(double saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    public void setCompare(int compare) {
        this.compare = compare;
    }

}
