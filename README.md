# Kütüphane Sistemi REST API

Bu proje, kütüphane sistemini yönetmek için bir RESTful API sağlar. CRUD operasyonları aracılığıyla kitaplar, yazarlar, kategoriler, yayınevleri ve ödünç alma işlemleri üzerinde işlemler gerçekleştirilebilir.

## Proje Yapısı

Proje, Spring Boot ve PostgreSQL veritabanı kullanılarak geliştirilmiştir. Katmanlı mimari kullanılmıştır ve aşağıdaki katmanları içerir:

- **Entity Katmanı**: Veritabanı tabloları için entity sınıflarını içerir.
- **Repository Katmanı**: Veritabanı işlemlerini gerçekleştiren JPA repository sınıflarını içerir.
- **Service Katmanı**: İş mantığı işlemlerinin gerçekleştirildiği servis sınıflarını içerir.
- **Controller Katmanı**: HTTP isteklerini işleyen controller sınıflarını içerir.

## Bağımlılıklar

Proje, Spring Initializr üzerinden oluşturulmuş ve gerekli bağımlılıklar eklenmiştir. Lombok kullanılmıştır.

## CRUD Operasyonları

Proje, aşağıdaki CRUD operasyonlarını destekler:

- Kitap Ekleme, Listeleme, Güncelleme ve Silme
- Yazar Ekleme, Listeleme, Güncelleme ve Silme
- Kategori Ekleme, Listeleme, Güncelleme ve Silme
- Yayınevi Ekleme, Listeleme, Güncelleme ve Silme
- Kitap Ödünç Alma ve Teslim Etme

## İş Mantığı Özellikleri

Proje, aşağıdaki iş mantığı özelliklerini sağlar:

- Kategori silme işlemi, o kategoriye ait kitapların olup olmadığını kontrol eder.
- Kitap ödünç alma işlemi, ödünç verilecek kitabın stok durumunu kontrol eder.

## Validator Kullanımı

Proje, HTTP isteklerini doğrulamak için Validator kullanmaktadır.

## IoC ve DI Kullanımı

Proje, IoC (Inversion of Control) ve DI (Dependency Injection) prensiplerinden yararlanmaktadır. Constructor injection kullanılmıştır.

## Uygulama Başlatma

Uygulamayı başlatmak için aşağıdaki adımları izleyin:

1. Proje dosyalarını bilgisayarınıza kopyalayın.
2. PostgreSQL veritabanınızı hazırlayın ve bağlantı bilgilerini `application.properties` dosyasına ekleyin.
3. Projeyi bir IDE'de açın.
4. Projeyi çalıştırın.

## [YAML Dosyası](LibraryController_openapi.yaml)