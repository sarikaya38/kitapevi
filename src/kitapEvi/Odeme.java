package kitapEvi;

import java.util.*;

public class Odeme {
    List<Integer> sepetList = new ArrayList<>();
    int odenecekTutar = 0;
    Map<Integer, String> kitapListMAp = BilgiDegistirme.kitapListMAp;


    Scanner scan = new Scanner(System.in);
    List<String> musteriBilgileri = new ArrayList<>();

    void odeme() {
        System.out.println("Odeme ekranına Hosgeldınız");
        musteriBilgiler();
        kitapFiyatAl();
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
            sepetdekiKitaplar += kitapListMAp.get(sepetList.get(i));
        }
        return sepetdekiKitaplar;
    }

    public int kitapFiyatAl() {
        int fiyat = 0;
        Set<Map.Entry<Integer, String>> entrySeti = kitapListMAp.entrySet();
        String entryValue;
        System.out.println("sepet list" + sepetList);
        for (int i = 0; i < sepetList.size(); i++) {


            entryValue = kitapListMAp.get(sepetList.get(i));
            String[] entryArr;
            System.out.println(entryValue);
            entryArr = entryValue.split(", ");

            System.out.println("Entyra aad" + Arrays.toString(entryArr));
            fiyat += Integer.parseInt(entryArr[7]);
        }
        System.out.println(fiyat);
        return fiyat;


    }
}
