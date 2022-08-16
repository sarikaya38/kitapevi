package kitapEvi;

import java.util.*;

public class Odeme {
    List<Integer> sepetList = new ArrayList<>();
    Map<Integer, String> kitapListMap2 = kitapListMapOlustur();

   // Methodlar sepek=new Methodlar();
    Scanner scan=new Scanner(System.in);
    List<String> musteriBilgileri = new ArrayList<>();
    void odeme() {
        System.out.println("Odeme ekranına Hosgeldınız");
        musteriBilgiler();
    }

    void musteriBilgiler() {
        System.out.println("adınızı gırınız");
        String isim = scan.next();
        System.out.println("Soyadınızı gırınız :");
        String soyIsım = scan.next();
        musteriBilgileri.add(isim);
        musteriBilgileri.add(soyIsım);
        System.out.println(musteriBilgileri + " almak ıstedıgınz kıtaplar" + getKitap());
    }

    String getKitap() {
        String sepetdekiKitaplar = "";
        for (int i = 0; i < sepetList.size(); i++) {
            //     System.out.println(kitapSecim(kitapListMap2.get(sepetList.get(i))));
            sepetdekiKitaplar += kitapListMap2.get(sepetList.get(i));


        }
        return sepetdekiKitaplar;
    }
    public Map<Integer, String> kitapListMapOlustur() {
        Map<Integer, String> kitapListMap2 = new HashMap<>();
        kitapListMap2.put(1001, "Pinokya, Carlo Colladi, 2017, 10, 100, 5, 95");
        kitapListMap2.put(1002, "Digital Kale, Don Brown, 2001, 2, 50, 10, 40");
        kitapListMap2.put(1003, "Silinis, Hess Greatsen, 2008, 5, 75, 35, 40");
        kitapListMap2.put(1004, "3 un Cekilisi, Stephen King, 2010, 15, 74, 44, 30");
        kitapListMap2.put(1005, "Melekler ve Seytanlar, Don Brown, 2008, 15, 150, 10, 140");
        kitapListMap2.put(1008, "Harry Poter1, J.K.Rowling., 2001, 5, 10, 1, 9");
        kitapListMap2.put(1009, "Harry Poter2, J.K.Rowling., 2002, 5, 10, 1, 9");
        kitapListMap2.put(1010, "Harry Poter3, J.K.Rowling., 2003, 5, 10, 1, 9");
        kitapListMap2.put(1011, "Harry Poter4, J.K.Rowling., 2004, 5, 10, 1, 9");
        kitapListMap2.put(1012, "Harry Poter5, J.K.Rowling., 2006, 5, 10, 1, 9");
        kitapListMap2.put(1013, "Harry Poter6, J.K.Rowling., 2008, 5, 10, 1, 9");
        kitapListMap2.put(1006, "Origin, Don Brown, 2001, 5, 10, 7 ,3");
        kitapListMap2.put(1007, "Cehennem, Don Brown, 2008, 5, 10, 9 ,1");
        return kitapListMap2;
    }

}
