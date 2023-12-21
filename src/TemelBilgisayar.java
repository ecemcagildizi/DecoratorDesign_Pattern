public class TemelBilgisayar implements Bilgisayar {
//Temel bileşen sınıfı


    @Override
    public double fiyat() {
        return 25000.00; //bilgisayarın fiyatı
    }

    @Override
    public String aciklama() {
        return "Temel Bilgisayara ";
    }
}
