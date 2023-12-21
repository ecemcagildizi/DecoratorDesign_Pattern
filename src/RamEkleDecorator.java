public class RamEkleDecorator extends BilgisayarDecorator{

    private int miktar;
    public RamEkleDecorator(Bilgisayar bilgisayar, int miktar){
        super(bilgisayar);
        this.miktar = miktar;
    }

    @Override
    public double fiyat(){
        return super.fiyat()+(this.miktar*312.5);
    }

    //Yukarıdaki kısımda ilk başta miktar değişkeni aldım ve birim miktar başına düşen fiyatla çarparak ana fiyata ekledim.

    @Override
    public String aciklama(){
        return super.aciklama()+this.miktar+" GB RAM eklendi... ";
    }
}
