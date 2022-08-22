package kitapEvi;

import java.nio.charset.CoderMalfunctionError;
import java.util.*;

public class Methodlar extends Odeme {

    static int sifre = 12;

    Methodlar() {
        menu();
    }

    Map<Integer, String> kitapListMAp = BilgiDegistirme.kitapListMAp;

    void menu() {
        System.out.println("==================\n======Welcome=====\n==Java BookStore==\n==================");
        System.out.println("1. Kitap arama ");
        System.out.println("2. Kitap Listesi");
        System.out.println("3. Odeme");
        System.out.println("4. Yetkili Giris");
        System.out.println("5. Cikis");
        menuSecim();
    }

    int y = 1;
    String isimSecim;
    int kalanStok;
    int satilanKitap;
    int gelenStok;
    int kitap;

    Scanner scan = new Scanner(System.in);


    public void satinAlma() {
        System.out.println("Lutfen secim yapiniz");
        System.out.println("1. Sepete ekleme");
        System.out.println("2. Sepete Eklemeden Alisverise devam etmek");
        System.out.println("3. Ödeme Ekranı");
        System.out.println("4. Ust Menuye Donme");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                sepetList.add(kitap);
                System.out.println("Sepetinizde ki kitaplar : " + sepetList);
                System.out.println("Sepete yeni kitap eklemek icin Y ye basiniz odeme sayafasina gitmek icin Q ya basiniz");
                String sepetCikis = scan.next().toUpperCase();
                if (sepetCikis.equals("Y")) {
                    kitapSecim(isimSecim);


                } else if (sepetCikis.equals("Q")) {
                    odeme();
                }

                break;
            case 2:
                kitapSecim(isimSecim);
                break;
            case 3:
                odeme();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.println("Lutfen tekrar secim yapiniz");
                // satinAlma();
                break;
        }
    }

    public void menuSecim() {
        int menuSecim = scan.nextInt();
        switch (menuSecim) {
            case 1:
                kitapSecim(isimSecim);
                break;
            case 2:
                kitapList();
                break;
            case 3:
                odeme();
                break;
            case 4:
                yetkiliGiris();
                break;
            case 5:
                break;
            default:
                System.out.println("Yanlis bir giris yaptiniz tekrar deneyiniz");
                // new Methodlar();
                break;
        }
    }

    public void kitapList() {
        Set<Map.Entry<Integer, String>> entrySeti = kitapListMAp.entrySet();
        String entryValue;
        String[] entryArr;
        List<Integer> kitapList = new ArrayList<>();
        for (Map.Entry<Integer, String> each : entrySeti) {
            entryValue = each.getValue();
            entryArr = entryValue.split(", ");
            System.out.println(each.getKey() + entryArr[0] + " " + entryArr[1] + " " + entryArr[2] + " " + entryArr[3]);
        }
        kitapSecim(isimSecim);
    }

    public void kitapSecim(String isimSecim) {
        System.out.println("aramak istediginiz id, isim yazar,basim yili veya baski girinz:");
        isimSecim = scan.next();
        Set<Map.Entry<Integer, String>> entrySeti = kitapListMAp.entrySet();
        String entryValue;
        String[] entryArr;
        List<Integer> kitapList = new ArrayList<>();
        int secim = 0;
        y = 1;
        for (Map.Entry<Integer, String> each : entrySeti) {
            entryValue = each.getValue();
            entryArr = entryValue.split(", ");
            for (int i = 0; i < entryArr.length; i++) {
                if (entryArr[i].contains(isimSecim)) {
                    System.out.println(y + ". " + entryArr[0] + " " + entryArr[1] + " " + entryArr[2] + " " + entryArr[3]);
                    kitapList.add(each.getKey());
                    y++;
                }
            }
        }

// if in icine try catch yazilacak string ifade icin

        if ((y > 2)) {
            System.out.println("Lutfen almak istediginiz kitabi giriniz");
            secim = scan.nextInt();
            System.out.println("almak istediginiz kitap" + kitapList.get(secim - 1));
            this.kitap = kitapList.get(secim - 1);
        }


        this.isimSecim = isimSecim;// gereksiz olabilir kontol et*/


        try {
            if (kitapListMAp.containsKey(Integer.parseInt(isimSecim))) {
                kitap = (Integer.parseInt(isimSecim));
                System.out.println(kitapListMAp.get(kitap));// kitabin ilk 4 bilgisi gelmesi ayarlanacakgi
                System.out.println(kitap);
                satinAlma();
            } /*try {

                   //if (!kitapListMap2.containsKey(Integer.parseInt(isimSecim))) {


                   //    System.out.println("Aradiginiz kitap bulunamamistir.\n Bir ust menuye yonlendiriliyorsunuz...");
                   //    menu();
                 /  }
               }catch (Exception e){
1

               }
*/


        } catch (Exception e) {
            //System.out.println("Aradiginiz kitap bulunamamistir.\n Bir ust menuye yonlendiriliyorsunuz...catch");
            // menu();
        }
        satinAlma();

    }


    public void yetkiliGiris() {
        System.out.println("lutfen parolayi giriniz:");
        int girilenSifre = scan.nextInt();
        if (girilenSifre == sifre) {
            BilgiDegistirme yetkili = new BilgiDegistirme();
        }
    }



}

