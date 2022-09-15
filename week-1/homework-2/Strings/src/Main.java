public class Main {
    public static void main(String[] args) {
        
        /*
        * .length()         => metodu ile string ifadenin uzunluğunu verir.
        * .charAt()         => metodu ile string ifadenin belirtilen elemanını verir.
        * .concat()         => metodu ile string ifadenin sonuna belirtilen ifade eklenir.
        * .startsWith()     => metodu ile string ifade belirtilen değer ile mi başlıyor ?
        * .endsWith()       => metodu ile string ifade belirtilen değer ile mi bitiyor ?
        * .getChars()       => metodu ile belirtilen aralığa başka bir karakter dizisi eklenir.
        * .indexOf()        => metodu ile string ifade belirtilen değerin index'ini verir.
        * .lastIndexOf()    => metodu ile string ifade belirtilen değerin sondan index'ini verir.
        * .replace()        => metodu ile string ifadedeki belirtilen değeri, belirtilen değer ile değiştirir.
        * .substring()      => metodu ile string ifadelerin beliri bir aralığına başka bir String ifadesine kopyalayabilir.
        * .split()          => metodu ile string ifadeleri belirli bir ifadeye göre parçalayabilir.
        * .toLowerCase()    => metodu ile string ifadelerin karakterlerini küçük harf'e çevirir.
        * .toUpperCase()    => metodu ile string ifadelerin karakterlerini büyük harf'e çevirir.
        * .trim()           => metodu ile string ifadelerin başındaki ve sonundaki boşlukları kaldırabiliriz.
        * */
        
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        
        System.out.println("Mesaj Eleman Sayısı: " + mesaj.length());
        System.out.println("5. Eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf('a'));
        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj.substring(2, 5));
        
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}