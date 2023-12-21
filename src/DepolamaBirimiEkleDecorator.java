public class DepolamaBirimiEkleDecorator extends BilgisayarDecorator{

    private int miktar;



    public DepolamaBirimiEkleDecorator(Bilgisayar bilgisayar,int miktar){
        super(bilgisayar);
        this.miktar = miktar;
    }
    
    @Override
    public double fiyat(){
        return super.fiyat()+(this.miktar*2499.5);
    }

    //Yukarıdaki kısımda ilk başta miktar değişkeni aldım ve birim miktar başına düşen fiyatla çarparak ana fiyata ekledim.

    @Override
    public String aciklama(){
        return super.aciklama()+this.miktar+" TB SSD Disk Eklendi... ";
    }
}
