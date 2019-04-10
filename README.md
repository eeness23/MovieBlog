English will be write as soon as
# Movie Blog

Film Koleksiyon Sitesi - Spring Boot

* Film ekleme,düzenleme, silme işlemleri yapabilirsiniz
* Sitede rollere göre özellikler vardır.
<br>Admin Rolü : Tüm filmleri ve koleksiyonlar üzerinde düzenlemeler yapabilmektedir.
<br>User Rolü : Sadece kendi koleksiyonlarını editleyebilmektedir.
* Sitede iki tane sayfa vardır.Bir tanesi adminler icin diğeri her rolü icin.
* Ana sayfada daha güzel bir görüntü icin sayfalama ( Pagination ) işlemleri AJAX ile yapılmıstır.
* Sitedeki temalar "w3layouts" ve "Colorlib" dan alınıp üzerinde geliştirmeler ve daha dinamik hale getirmek icin Javascript kodları yazılmıştır.

### Gereksinimler

* Mysql
* Lombok Plugin ( Entity işlerini kolayca yapmamıza yarıyan bir kütüphane) 
<br> !!! MUTLAKA IDE'nize lombok plugini kurulu olmalıdır. Sitesinden kululumunu öğrenebilirsiniz.
* [Lombok](https://projectlombok.org/)

### Yükleme

Veritabanı olarak Mysql kullanıldığı icin öncelikle "movieblog" adında bir veritabanı oluşturmanız gereklidir. Kullanıcı adı ve şifresi movie ayarlanmıştır.Aşağıdaki kodları yazarak, veritabanı icin gerekli olan düzeni yapmış olursunuz.
```
mysql -u root -p
Enter password:

mysql> CREATE DATABASE IF NOT EXISTS movieblog CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci;
mysql> CREATE USER 'movie'@'localhost' IDENTIFIED BY 'movie';
mysql> Grant all on movieblog.* to 'movie'@'localhost';
mysql> flush privileges;

```
Daha sonra "Dump20190410.sql" movieblog'un icine import ediyoruz.Böylelikle veritabanımızı artık kullanabiliriz.
Eğer kendi kullanıcınızı kullanmak isterseniz, MUTLAKA "application.properties" icerisinden username,password değiştiriniz.
```
spring.datasource.url= jdbc url giriniz default ( jdbc:mysql://127.0.0.1:3306/movieblog?allowPublicKeyRetrieval=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC )
spring.datasource.username= veritabanı kullanıcı adı default ( movie )
spring.datasource.password=  veritabanı şifre adı default ( movie )
```
Eğer port cakışması algılanırsa yine "application.properties" dosyasının icinden aşağıdaki kodu, kendinize uygun doldurunuz.
```
server.port= xxxx default( 8080)
```

## Endpoints

Sitede bulucağınız gibi aşağıda bazılarını yazdım.

```

/login : Giriş Sayfası
/register : Kayıt Sayfası

/admin : Admin sayfası
/admin/movie : Admin icin film sayfası.
/admin/role : Admin icin kullanıcı rolleri sayfası.
/admin/user : Admin icin kullanıcı sayfası.
/admin/category  : Admin icin film kategori sayfası.
...

/ : Anasayfa
/collections : Tüm kolleksiyonlar
/user/4/collections : Sadece 4 no'lu kullanıcının kolleksiyonları

/collection/new : Koleksiyon oluşturma.
...
```
## Sitenin Calışma Mantığı 
Öncelikle 2 farklı role kullanıcı vardır.

```
          Admin            |            User
eposta : admin@gmail.com   |   eposta : enes@gmail.com
şifre  : admin             |   şifre  : enes
```
<br>Öncelikle gecici oluşturduğum veritabanında, kullanıcıların koleksiyonu vardır.Bundan dolayı Home sayfasını actığımızda, direk koleksiyonlara film eklemek icin buton gelmektedir.
<br> Yeni bir kullanıcı oluşturduğunuzda ise MUTLAKA bir koleksiyon oluşturmalısınız yoksa ekleme butonu aktif olmayacaktır.

USER
<br> User modunda otomatik Home sayfasına yönledirilecektir.Burada koleksiyonunuz daha önceden var ise ekleme butonları görünecektir. Yoksa koleksiyon oluşturmalısınız.
<br> Koleksiyon oluştuduktan sonra, kendinize ait tüm koleksiyonları düzenleyip, silebilirsiniz.
<br>
<br>
ADMIN
<br>Admin modunda sisteme girdiğinizde otomatik admin sayfasına yönlendirileceksiniz.Burada istediğiniz herşeyi yapabilirsiniz.Tüm koleksiyonları SADECE bu site tarafında düzenleyip silebilirsiniz, Home tarafında yine sadece kendi oluşturduklarınızı düzenleyip, silebilirsiniz.
<br>Film ekleme düzenleme işlemini sadace admin yapmaktadır.

<br>
KULLANICI GİRİŞİ YAPMADAN
<br> Herhangi bir kullanıcıya girmeden siteye girerseniz.Sadece koleksiyonları, filmleri görebilirsiniz.Koleksiyon oluşturmak icin mutlaka üye veya giriş yapmanız gerekmektedir.

## Yapılan Aşamalar

İlk öncelikle admin sitesi yapıldı. Daha sonra ana site yapıldı. Ön tema hazır kullanığım icin ( zaman sorunundan dolayı) üzerinde bazı değişikler gercekleştirdim.
<br>Öncelikle pagination işlemi yaptım. Daha sonra sayfalara tıklanınca sayfayı reflesh yaptığı icin AJAX kullanmaya karar verdim.
<br>Ajax teknolojisini 2 yerde kullandım. Birincisi anasayfada pagination işleminde. <br> İkincisi ise herhangi bir filme tıkladığınızda sayfanın sağında , filmlerin hangi koleksiyonlarda yer aldığını gösteren bir alan icin.

![alt text](https://lh3.googleusercontent.com/y4HWqwehAVYSKFJtN9YSbWmaz1C3xl55bEfKE9R9OqA-QK1simBspgBGsd20yLVmke7wSZ51ltqJrc-_iI-m4b537RPqnDLVmn_uJ05s0898cwDA4v8U3D85RTGNe4OY_yUxWs4A6EWBtnzxOhfqvkJ_EpsfDiWDsVKTaR_OgkXw2uo4YXEWSno_rOgvr1zdzGSK2KhB3xjkoM9MVvlBD9jVzUwctj-f0iAm1-7k2D37WpM5fa9z5qXtGnaYSHUOBhuztHzwlJRztLBYtfCS91oXKQiG7L7_oDLXkqKepPKBtgJQH8SWIn16O5mWHU5XG4P1IEBWK_MDO0I8tnHUwR9I6icYY96QS100yQXAO18YHtWAcspDuGHbHKZQjdmCQBgDjJ84BjBBL6vl-jm1hDKqPV1pwG6TIjZVA2Nz2mVPSayyEa472PR3cK-Cks6Q8VINJ9da2UARoKm4qqgTR2uypYs5snl_NxzHPRQ2ks12zsfF6L57-nJix1UFN8j6FhfqKX8T9bqNQjb3bFAVSKXuk_VCEtVhT04yzGkbMJ3saWREjJbqlcFu2IhVxv3ucfKv6q8jRH8ZKOcFyeNJG6J9aK_C7rJ_uctAzEu09ZUl0XzoqfIWJfwBoTJ5RyayZViAIGuRAMq_WXGY6PcY3AP_qJT6os_5w9_YXVpwlYi0kRiffhz-9Q3zmuUhdhYht4LT0Q1JnmZoUw5Igl7100g=w1006-h355-no)

* Kullanıcı girişi yapıldıktan sonra eğer kullanıcının koleksiyonu var ise filmlerin altına bir ekleme butonu gelmektedir.

![alt text](https://lh3.googleusercontent.com/mXyBrzuWJFf6kgF4T24LWE0wpQ_FOI9Z_MpU3zJJACOZkBLJH9x12B30p5MS8UhRCPDLRW8XnfiWaxQsIfpBvly9EpdqGALl9FpWY8u2lSMjvvvgep8NylsIiYgomRzXxg9YkHrSzu-CzmrHxec5eUgD-gy1rrqTBTfG8a9A78MVYBoKh1OZ1Y5KePkkwl_QZc1x-2C38uPrwjlIZtBsyQS3TrA6gPYLEfyRO5UtXIE213CNJAMVpeIaI_maieCnSDHUPOs2f_akCjhOASljhhUuYxRNf64jpRI7bnxN1OgSJaCIgYCkQvWFXtHMN_9CNv2GTV4cADcMW9ZesQ58K31X2O1zDzAwV-lfGiu9W539KSE1eIsEw59H3-tm8D7-7VbQ-2Q3wFw34LMu1vbrTN87-VqV2Zpc8GuXwZQgPY5KYxeQs9d0ylYC5ESwFziW8bi6OC4Bp5snRI5yxZvkdqWcUu0rldpqWh66e8MiUIetsE99A9JvzFPIoXtc04sfZK_0WAlb4OmNiG_vMVj2uw6rkqxNpb_r9hLcP5NKI7fR2uwMVbi7QHRR7imWHW28hGjIxFfhlIhrhH2oEH0Mn7RMAUA3mXlK3t1iJNPaiQj8MiDdkYwTumbE1o8kEy7Qk-EUKFEOnm4B9ZD7HQIveRo-A39YMSz7vgNsShfmA-aWG3xa8z70BDf60A_t4ChVcGbZ2g6ZUhMgKK4BylzJzxI=w362-h332-no)
* Koleksiyonlara girdiğinizde kendi kolleksiyonlarınızın üzerinde yine düzenleme ve silme ikonları gelmektedir.
* User adındaki hesaba girilmiştir.

![alt text](https://lh3.googleusercontent.com/bPNrgwUFvs6erLENB9ORY3u4CIcTTdXtsUYOI6EJ50Yhp_nyfi7AzX4nmO7yANWAQMiuElRVXTPBiF71-ejmFyE2U_0uf-YvqPG_y96NaSW6X6RpCNMyyRSG5wfnhVfERXDWrUUPHmuQoHChTqa3CfeWAydrw95DVYEUxrrR3_-PQkSE-_3YRGz6Lm5fI-NG7kkuGgccQIRKh5v_8oj3dZ61zouO5cOxHhbHwoD17Ng-DH_gHrL95kIsRRKKjoLYL0XhIM88fzCaOO0GHmRCwUfv8FmQZkt0zcbZYOEnD0AkQW0haK2XF1whmXDqrY13-4D1DHKqgaHv3Jp3ugR4ympG_gT8nxbThVU0xa5n9JqW0SK-0wlx5-fBGQJ0esdeAP4c1udwaqYJJtyMZ9JQGIZgO0_k_L7j2MDhQzVtYOFWjO0N3H4cRzngi0vVslKEcm1DCxRTD8wOU2JE46L4b3Evd8nx2eoBbc6SzmCfiDvnjvu8szPmo2-rw6VfmlLfo8keF1UWyasjxJcdZdFoybdtngIGsNVf7--CkEGcPQ5FEWhXam1vnSfrKnS_kUUOi4sw7veqjMua4odOmn87teeE96_bqtPChLkFQDnRs-hAOhc4LwbIx29f-YJJF5WxxAnei3BaZdn1zkRnmH9b-Fs0wiPsZOAG9Ere-MZ-qR0BLbAE9RZuQ7J5E0c7t6QtrKutTe1igQd_6KMw3jG--p8=w368-h356-no)

Daha sonra güvenlik kısımlarını ve uyarılar, validation ve sıralama işlemleri( Ada göre, Yapım Yılına göre) yapılmıştır.

## Built With

* [Spring](https://spring.io/) - Java Framework
* [Spring Rest](https://spring.io/projects/spring-restdocs) - Rest Web Servisi
* [Spring Security](https://spring.io/projects/spring-security) - Güvenlik ve Kullanıcı Rolleri icin kullanılmıştır
* [Spring Data](https://spring.io/projects/spring-data) - JPA ve Veritabanları işlemleri icin kullanılmıştır
* [Thymeleaf](https://www.thymeleaf.org/) - Java template engine ( Java uygulamarında kullanılan bir tür önyüz yaratıcısı)
* [Lombok](https://projectlombok.org/) - Entity'deki kod kalabalığını önlemek icin kullanıldı.( get set vb. yazmak zorunda değilsiniz)
* [Maven](https://maven.apache.org/) - Dependency Management (Kütüphaneleri kolayca alabilmek icin kullanılan bir teknoloji)
* [Mysql](https://www.mysql.com/) - Veritabanı
* [Bootstrap](https://getbootstrap.com/) - Html/css daha güzel bir görüntü icin kullanıldı.
* [JQUERY](http://api.jquery.com/jquery.ajax/) - Jquery ajax icin


## Yazarlar

* **ENES DEMİBAŞ** - [eeness23](https://github.com/eeness23)
<br> İletişim - Contact  : enesdemirbas95@gmail.com

* [Colorlib](https://colorlib.com/) - Admin Template
* [W3layouts](https://w3layouts.com/) - Homebase Template



