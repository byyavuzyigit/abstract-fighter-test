public class Savasci extends Oyuncu{

    private double savasBonusu = 1.3;



    public Savasci(String name,double saldiriGucu,double deneyimPuanı){
        this.setIsim(name);
        this.setSaldiriGucu(saldiriGucu);
        this.setDeneyimPuani(deneyimPuanı);
        this.setCompare(0);
    }

    public double getSavasBonusu() {
        return savasBonusu;
    }



    public void setSavasBonusu(double savasBonusu) {
        this.savasBonusu = savasBonusu;
    }



    public double getToplamHamleGucu(){
        double hamleGucu = super.getSaldiriGucu()*savasBonusu;
        return hamleGucu;
    }

    public void bilgi(){
        System.out.println("[SAVASCI]");
        System.out.println("Isim: " + this.getIsim());
        System.out.println("Saldiri Gucu: " + this.getSaldiriGucu());
        System.out.println("Toplam Hamle Gucu: " + this.getToplamHamleGucu());
        System.out.println("Deneyim Puani: " + this.getDeneyimPuani());
    }

    public String ozet(){
        String str = "[SAVASCI]  " + this.getIsim() + "  Toplam Hamle Gucu:  " + this.getToplamHamleGucu() + "  Deneyim Puani:  " + this.getDeneyimPuani();
        return str;
    }

    /*@Override
    public int compareTo(Object o) {
        Savasci s = (Savasci) o;
        if(this.getToplamHamleGucu()>s.getToplamHamleGucu())
            return 1;
        if(this.getToplamHamleGucu()<s.getToplamHamleGucu())
            return -1;
        if(this.getToplamHamleGucu()==s.getToplamHamleGucu())
            return 0;
        return 0;
    }*/
    public int compareTo(Object obj){

        Oyuncu o = (Oyuncu) obj;
        if(this.getCompare()==o.getCompare()){
            if(this.getCompare()==0){
                if(this.getToplamHamleGucu()>o.getToplamHamleGucu())
                    return 1;
                if(this.getToplamHamleGucu()<o.getToplamHamleGucu())
                    return -1;
                return 0;

            }
            else{
                if(this.getDeneyimPuani()>o.getDeneyimPuani())
                    return 1;
                if(this.getDeneyimPuani()<o.getDeneyimPuani())
                    return -1;
                return 0;
            }
        }
        else{
            if(this.getCompare()>o.getCompare())
                return 1;
            else
                return -1;
        }
    }
}
