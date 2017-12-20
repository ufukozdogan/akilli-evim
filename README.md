# akilli-evim

# Arduino ile Tasarlanmış Güvenli/Akıllı Ev Sistemi

### Kaynaklar ve Ekipman
* Uygulama; Arduino IDE, Netbeans ve MySQL kullanılarak tasarlanmıştır.
* Kullanılan Arduino sensörleri ise Sıcaklık(LM35), LDR, Bluetooth ve Buzzer şeklindedir.
* Gerekli işlemler için JFreeChart, RXTX kütüphaneleri kullanılmıştır.


### Yapabildikleri
* Arduino üzerine takılı ışık ve sıcaklık sensörlerinin değerlerini, gerçek zamanlı olarak ekranda gösterir ve aynı zamanda veritabanına kaydeder.
* Kaydedilen bu verilere bilgi merkezi aracılığıyla kolaylıkla ulaşabilir. Gün ne zaman aydınlandı, karardı veya tüm istatistikler gibi butonlar fonksiyonel olarak çalışmaktadır.
* Mobil uygulama sayesinde Bluetooth modülüne bağlanıp dinamik olarak anlık sensör verisini görülebilir, aynı zamanda da board'a bağlı LED yakıp, kapatılabilir.
* Arduino IDE's ile yazılmış kod tarafında ise gerekli sensör kodları bulunmaktadır. Bluetooth Serial1 ile düz çıktılar ise Serial ile kontrol edilmiştir. Aynı zamanda kullanıcıya belirli sıcaklık veya ışık değerinde uyarı verebilmek için sistemde bir adet de Buzzer bulunmaktadır.

###### Java Arayüzü Giriş Paneli
![Java Arayüzü Giriş Paneli](https://i.hizliresim.com/Qpq3dG.png)


###### Ana Yönetim Paneli
![Ana Yönetim Paneli](https://i.hizliresim.com/5GJlWq.png)


###### Işık Sensörü Bilgi Merkezi
![Işık Sensörü Bilgi Merkezi](https://i.hizliresim.com/8NBvpV.png)
