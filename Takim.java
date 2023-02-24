public class Takim {

    private Oyuncu[] takim;

    public Takim(Oyuncu[] o){
        this.setTakim(o);
    }

    public Oyuncu[] getTakim() {
        return takim;
    }

    public void setTakim(Oyuncu[] takim) {
        this.takim = takim;
    }

    /*public void siralaVeBas(){



        for(int i=0;i< takim.length;i++){
            for(int j=0;j< takim.length-1;j++){

                if(takim[j].getCompare()!=takim[j+1].getCompare()){
                    if(takim[j].getCompare()>takim[j+1].getCompare()){
                        Oyuncu temp;
                        temp = takim[j];
                        takim[j] = takim[j+1];
                        takim[j+1] = temp;
                    }
                }
                else{
                    int num = takim[j].compareTo(takim[j+1]);
                    if(num==1){
                        Oyuncu temp;
                        temp = takim[j];
                        takim[j] = takim[j+1];
                        takim[j+1] = temp;
                    }
                }
            }
        }

        for(int i=0;i< takim.length;i++){
            System.out.println(takim[i].ozet());
        }
    }*/

    public void siralaVeBas(){
        for(int i=0;i<takim.length;i++){
            for(int j=0;j<takim.length-1;j++){
                if (takim[j].compareTo(takim[j + 1])==1) {
                    Oyuncu temp;
                    temp = takim[j];
                    takim[j] = takim[j+1];
                    takim[j+1] = temp;
                }
            }
        }
    }
}
