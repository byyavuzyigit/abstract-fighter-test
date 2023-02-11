public class Buyucu extends Oyuncu{

    private double buyuBonusu = 1.5;

    public Buyucu(String name,double saldiriGucu,double deneyimPuanı){
        this.setIsim(name);
        this.setSaldiriGucu(saldiriGucu);
        this.setDeneyimPuani(deneyimPuanı);
        this.setCompare(1);
    }

    public double getBuyuBonusu() {
        return buyuBonusu;
    }

    public void setBuyuBonusu(double buyuBonusu) {
        this.buyuBonusu = buyuBonusu;
    }



    public double getToplamHamleGucu(){
        double hamleGucu = super.getSaldiriGucu()*buyuBonusu;
        return hamleGucu;
    }

    public void bilgi(){
        System.out.println("[BUYUCU]");
        System.out.println("Isim: " + this.getIsim());
        System.out.println("Saldiri Gucu: " + this.getSaldiriGucu());
        System.out.println("Toplam Hamle Gucu: " + this.getToplamHamleGucu());
        System.out.println("Deneyim Puani: " + this.getDeneyimPuani());
    }

    public String ozet(){
        String str = "[BUYUCU]  " + this.getIsim() + "  Toplam Hamle Gucu:  " + this.getToplamHamleGucu() + "  Deneyim Puani:  " + this.getDeneyimPuani();
        return str;
    }



    @Override
    public int compareTo(Object o) {
        Buyucu b = (Buyucu) o;
        if(this.getDeneyimPuani()>b.getDeneyimPuani())
            return 1;
        if(this.getDeneyimPuani()<b.getDeneyimPuani())
            return -1;

        return 0;
    }
}
