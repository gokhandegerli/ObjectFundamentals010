package com.godoro.OF18;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class TimeTest {

    public static void main(String[] args) {

        long time = System.currentTimeMillis(); //şuandaki zamanı ms cinsinden ver, epoch time.
        System.out.println("Zaman: "+time); // 1 ocak 1970den beri geçen zamanın bu zamana kadar ki ms değeri.

        //----------------------------
        Date date = new Date(); // hiçbir parametre vermezsek default bugün alır.
        System.out.println("Tarih: "+date);

        //----------------------------
        Date specificDate = new Date(122,11,15); //1987 için 87 yazacaktık, ama bunu
        //kullanmamak daha iyi, Date üzeri çizilmiş yani artık depricated(eskimiş) olmuş, ama hala çalışıyor :)
        //bunun yerine Calendar kullanılıyor artık.
        System.out.println("Özel tarih: "+specificDate);

        //----------------------------
        Locale locale = new Locale("tr","TR"); // bu da depricated olmuş sanırım ^^
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss", locale); //formatı biz veriyoruz.
        // MM olsaydı, 12 şeklinde çıktı verecekti. mm ise minutes demek.
        String stringDate = formatter.format(date);
        System.out.println("Formatlı: "+stringDate);

        //----------------------------
        Calendar calendar = Calendar.getInstance(); //sistemde ne varsa onu bulup getiriyor.
        calendar.set(Calendar.YEAR, 2023); //yılı değiştirmek için.
        calendar.set(1919,4,19); //tüm tarihi setlemek için.
        //System.out.println("Takvim: "+calendar); // böyle basmamamız gerekiyor.
        //System.out.println("Takvim Tarih: "+calendar.getTime()); //buradaki getTime() aslında getDate() demek.
        //System.out.println("Takvim Tarih Zaman: "+calendar.getTime().getTime()); // epoch veriyor.
        System.out.println("Takvim biçimli: " + formatter.format(calendar.getTime()));
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Takvim yılı: "+year);






    }
}
