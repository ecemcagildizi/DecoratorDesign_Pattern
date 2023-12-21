public class Main {
    public static void main(String[] args) {
        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("Fiyat: "+temelBilgisayar.fiyat()+" TL");
        System.out.println("Açıklama: "+temelBilgisayar.aciklama());
        /*
        //RAM eklenmiş
        Bilgisayar ramBilgisayar = new RamEkleDecorator(new TemelBilgisayar(),16);
        System.out.println("Fiyat: "+ramBilgisayar.fiyat()+" TL");
        System.out.println("Açıklama: "+ramBilgisayar.aciklama());


        //Depolama Birimi ve Ram Ekleme
        Bilgisayar depolamaRamliBilgisayar = new DepolamaBirimiEkleDecorator(new RamEkleDecorator(new TemelBilgisayar()));
        System.out.println("Fiyat: "+depolamaRamliBilgisayar.fiyat()+" TL");
        System.out.println("Açıklama: "+depolamaRamliBilgisayar.aciklama());

        //Sadece Depolama
        Bilgisayar depolamaBilgisayar = new DepolamaBirimiEkleDecorator(new TemelBilgisayar());
        System.out.println("Fiyat: "+depolamaBilgisayar.fiyat()+" TL");
        System.out.println("Açıklama: "+depolamaBilgisayar.aciklama());
        */

        // İstenilen RAM miktarına göre fiyat ve açıklama oluşturma.
        Bilgisayar ramBilgisayar = new RamEkleDecorator(new TemelBilgisayar(),16);
        System.out.println("Fiyat: "+ramBilgisayar.fiyat()+" TL");
        System.out.println("Açıklama: "+ramBilgisayar.aciklama());

        // İstenilen TB miktarına göre fiyat ve açıklama oluşturma.
        Bilgisayar depolamaBilgisayar = new DepolamaBirimiEkleDecorator(new TemelBilgisayar(),3);
        System.out.println("Fiyat: "+depolamaBilgisayar.fiyat()+" TL");
        System.out.println("Açıklama: "+depolamaBilgisayar.aciklama());

    }
}