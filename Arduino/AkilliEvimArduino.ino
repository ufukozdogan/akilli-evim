// Kütüphane Yüklemesi
#include <LiquidCrystal.h>

// Buzzer pin'i
#define    BUZZER  42 

// Bluetooth Led Kontrol için denetim
String dinleme;

// Analog Sıcaklık Pin'i
int lm35pin = A8;

// Analog Işık Pin'i
int ldrpin = A15;

// Sıcaklık sensörünün led'i
int LED = 50;

// Bluetooth ile yakılan led. (klima)
int LED2 = 22;

// Standart LCD Ayarı
LiquidCrystal lcd(8, 9, 4, 5, 6, 7); // LCD Boundaries

////////////////////////////////////////////////////////////////////////////
void setup(){
  pinMode(BUZZER, OUTPUT);
  pinMode(LED, OUTPUT);
  noTone(BUZZER);
  pinMode(LED2, OUTPUT); 
  Serial.begin(9600);
  Serial1.begin(9600);
  lcd.begin(16, 2);
  lcd.setCursor(2,0);
  lcd.print("Oda Sicakligi ");
  
}
////////////////////////////////////////////////////////////////////////////
void loop()
{
  //Sıcaklık Fonksiyonu Başlangıç********
  float sicaklik; // Dönüşümler sonucunda ekrana yazılacak asıl sıcaklık değerimiz. 
  float analoggerilim; // Ölçülecek (ve sonradan sicaklik'a dönüşecek) analog volt değeri.
   
  analoggerilim= (5.0 * analogRead(lm35pin) * 100.0) / 1024.0;           
  sicaklik = (analoggerilim);  

  //Sıcaklık Fonksiyonu Son********
  
  //Bluetooth Dinleme Başlangıç********
  while (Serial1.available())
  { 
  delay(10); 
  char c = Serial1.read(); 
  dinleme += c; 
  }  
  if (dinleme.length() > 0)
  {
    //Serial.println(dinleme); 
       if(dinleme == "ac")
       {
         digitalWrite(LED2, HIGH);
         //Serial.println("Basarili");
        }  
   if(dinleme == "kapa")
    {
      digitalWrite(LED2, LOW);
    } 
  dinleme="";
  }
  //Bluetooth Dinleme Son********
  
  //Ses Sensörü Başlangıç********
  int deger;
  deger = analogRead(ldrpin);    //LDR pinini oku.

  //Ses Sensörü Son********
  
  //Buzzer Sensör Başlangıç********
  if (deger==500||sicaklik >= 50.0) { //Hava aydınlandığında uyandırma amaçlı
    digitalWrite(LED, HIGH);
    delay(10);
    //noTone(BUZZER);
    tone(BUZZER, 4978);
  }
  
  
  else {
    digitalWrite(LED, LOW);
    noTone(BUZZER);
  }
  //Buzzer Sensör Son********

  lcd.setCursor(5, 1);
  lcd.print(sicaklik);     // hesaplanan sıcaklığı yazdır. 
  lcd.setCursor(10,1);
  lcd.print("\337C");    // Derece simgesini yazıyor.
  delay(2000);

  Serial.print(sicaklik);
  Serial.print(".");
  Serial.print(deger);
  Serial.print("\n");
  Serial1.print(sicaklik);
  Serial1.print(".");
  Serial1.print(deger);
}
