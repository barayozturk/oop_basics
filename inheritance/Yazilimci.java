package inheritance;

public class Yazilimci extends Calisan{
    

    private String diller;

    public Yazilimci(String ad, String soyad, int id, String diller) {
        
        super(ad, soyad, id);  
        this.diller = diller; 
    }
    public void formatAT(String isletim_sistemi){
        System.out.println(getAd() + " " + isletim_sistemi + " yukleniyor...");
    }
    @Override
    public void bilgileriGoster() {        
        super.bilgileriGoster();
        System.out.println("Yazilimcinin Bildigi Diller : " + diller);
    }
    
}
