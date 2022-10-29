# Kodlama.io.Devs

**Req 1** : Sistemde programlama dilleri tutulmalıdır.

- Programlama dillerini(C#,Java,Python) ekleyebilecek, silebilecek, güncelleyebilecek, listeleyebilecek, id ile
  getirebilecek kodları yazınız. Bunu tamamen in memory yapınız.
  
- İsimler tekrar edemez.

- Programlama dili boş geçilemez. (Validation kullanmadan, kod yazarak algoritmik çözünüz)

## Başlangıç

#### Ön Koşullar

- Java 17
- JDK 19
- Maven

#### Kurulum

- Projeyi klonlayın.
- Bağımlılıkları yükleyin. `mvn install`
- Projeyi çalıştırın. `mvn spring-boot:run`

#### Kullanım

- API adresi: http://localhost:8080/
- Swagger adresi: http://localhost:8080/swagger-ui.html

#### Endpointler

- `/api/v1/programingLanguages` : GET - Tüm programlama dillerini getirir.
- `/api/v1/programingLanguages/{id}` : GET - Programlama dili id'sine göre getirir.
- `/api/v1/programingLanguages` : POST - Programlama dili ekler.
- `/api/v1/programingLanguages/{id}` : PUT - Programlama dili günceller.
- `/api/v1/programingLanguages/{id}` : DELETE - Programlama dili siler.