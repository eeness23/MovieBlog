-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: movieblog
-- ------------------------------------------------------
-- Server version	8.0.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cast`
--

DROP TABLE IF EXISTS `cast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cast` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=144 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cast`
--

LOCK TABLES `cast` WRITE;
/*!40000 ALTER TABLE `cast` DISABLE KEYS */;
INSERT INTO `cast` VALUES (1,'Sigourney Weaver'),(2,'John Hurt'),(3,'Ian Holm'),(4,'Tom Skerritt'),(5,'Audrey Tautou'),(6,'Dominique Pinon'),(7,'Jamel Debbouze'),(8,'Yolande Moreau'),(9,'Mathieu Kassovitz'),(10,'Robert Downey Jr.'),(11,'Chris Hemsworth'),(12,'Mark Ruffalo'),(13,'Scarlett Johansson'),(14,'Chris Evans'),(15,'Omar Sy'),(16,'Audrey Fleurot'),(17,'François Cluzet'),(18,'Anne Le Ny'),(19,'Alba Gaia Bellugi'),(20,'Jack Nicholson'),(21,'Tony Burton'),(22,'Shelley Duvall'),(23,'Danny Lloyd'),(24,'Scatman Crothers'),(27,'Bob Gunton'),(28,'James Whitmore'),(29,'Clancy Brown'),(30,'Tom Hanks'),(31,'Robin Wright'),(32,'Gary Sinise'),(33,'Sally Field'),(34,'Mykelti Williamson'),(35,'Chris Pratt'),(36,'Zoe Saldana'),(37,'Benicio Del Toro'),(38,'Karen Gillan'),(39,'Lee Pace'),(40,'Lina Leandersson'),(41,'Kare Hedebrant'),(42,'Malin Cederblad'),(43,'Per Ragnar'),(44,'Russell Crowe'),(45,'Djimon Hounsou'),(46,'Joaquin Phoenix'),(47,'Connie Nielsen'),(48,'Roberto Benigni'),(49,'Giorgio Cantarini'),(50,'Nicoletta Braschi'),(51,'Giustino Durano'),(52,'Horst Buchholz'),(53,'Kemal Sunal'),(54,'Adile Naşit'),(55,'Münir Özkul'),(56,'Tarık Akan'),(57,'Halit Akçatepe'),(58,'Samuel L. Jackson'),(59,'Sam Neill'),(60,'Jeff Goldblum'),(61,'Laura Dern'),(62,'Ariana Richards'),(63,'Leonardo DiCaprio'),(64,'Marion Cotillard'),(65,'Joseph Gordon-Levitt'),(66,'Ellen Page'),(67,'Michael Caine'),(68,'Uma Thurman'),(69,'Lucy Liu'),(70,'Michael Madsen'),(71,'David Carradine'),(72,'Daryl Hannah'),(73,'Morgan Freeman'),(74,'Christian Bale'),(75,'Gary Oldman'),(76,'Heath Ledger'),(78,'Charlize Theron'),(79,'Tom Hardy'),(80,'Nicholas Hoult'),(81,'Rosie Huntington-Whiteley'),(82,'Nathan Jones'),(84,'Hugo Weaving'),(85,'Laurence Fishburne'),(86,'Carrie-Anne Moss'),(87,'Joe Pantoliano'),(88,'Keanu Reeves'),(89,'Willem Dafoe'),(90,'Bridget Moynahan'),(91,'Adrianne Palicki'),(92,'Ian McShane'),(93,'Hugh Jackman'),(94,'Patrick Stewart'),(95,'Boyd Holbrook'),(96,'Dafne Keen'),(97,'Nicolas Cage'),(98,'Liev Schreiber'),(99,'Hailee Steinfeld'),(100,'Mahershala Ali'),(102,'Jeff Garlin'),(103,'Kathy Najimy'),(104,'Ben Burtt'),(106,'Michael Clarke Duncan'),(107,'Sam Rockwell'),(109,'David Morse'),(110,'Vera Farmiga'),(111,'Lili Taylor'),(113,'Mackenzie Foy'),(114,'Joey King'),(115,'Ryan Gosling'),(116,'Rachel McAdams'),(117,'James Garner'),(118,'Gena Rowlands'),(119,'James Marsden'),(121,'Domhnall Gleeson'),(122,'Bill Nighy'),(123,'Lydia Wilson'),(124,'Lindsay Duncan'),(125,'Rose Byrne'),(126,'Patrick Wilson'),(127,'Leigh Whannell'),(128,'Ty Simpkins'),(129,'Barbara Hershey'),(130,'Bradley Cooper'),(131,'Zach Galifianakis'),(132,'Justin Bartha'),(133,'Heather Graham'),(134,'Ed Helms'),(135,'Adam Sandler'),(136,'Drew Barrymore'),(137,'Rob Schneider'),(138,'Sean Astin'),(139,'Dan Aykroyd'),(140,'Kate Beckinsale'),(141,'Christopher Walken'),(142,'Katie Cassidy'),(143,'Jonah Hill');
/*!40000 ALTER TABLE `cast` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Aksiyon'),(2,'Macera'),(3,'Komedi'),(4,'Korku'),(5,'Bilim Kurgu'),(6,'Dram'),(7,'Animasyon'),(8,'Romantik');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collection`
--

DROP TABLE IF EXISTS `collection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `collection` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collection`
--

LOCK TABLES `collection` WRITE;
/*!40000 ALTER TABLE `collection` DISABLE KEYS */;
INSERT INTO `collection` VALUES (15,'My Top 10 movies'),(14,'I will watch'),(16,'Perfect');
/*!40000 ALTER TABLE `collection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collection_movies`
--

DROP TABLE IF EXISTS `collection_movies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `collection_movies` (
  `collection_id` bigint(20) NOT NULL,
  `movie_id` bigint(20) NOT NULL,
  PRIMARY KEY (`collection_id`,`movie_id`),
  KEY `FK7pfxyje25h01doml3pmcfku1l` (`movie_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collection_movies`
--

LOCK TABLES `collection_movies` WRITE;
/*!40000 ALTER TABLE `collection_movies` DISABLE KEYS */;
INSERT INTO `collection_movies` VALUES (14,1),(14,3),(14,5),(14,6),(14,14),(14,16),(14,23),(14,28),(15,3),(15,5),(15,12),(15,13),(15,14),(15,16),(15,17),(15,19),(15,22),(15,23),(16,3),(16,6),(16,8),(16,10),(16,14),(16,15),(16,19),(16,20),(16,24),(16,25),(16,27),(16,28);
/*!40000 ALTER TABLE `collection_movies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collection_user`
--

DROP TABLE IF EXISTS `collection_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `collection_user` (
  `collection_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`collection_id`,`user_id`),
  KEY `FKtngsq2ehxylbdynr64ubfsqwp` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collection_user`
--

LOCK TABLES `collection_user` WRITE;
/*!40000 ALTER TABLE `collection_user` DISABLE KEYS */;
INSERT INTO `collection_user` VALUES (14,4),(15,5),(16,5);
/*!40000 ALTER TABLE `collection_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `image`
--

DROP TABLE IF EXISTS `image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `image` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `file_extension` varchar(255) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `modified_file_name` varchar(255) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `movie_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtq2hs9xscd7jdp3r2mldk1yj9` (`movie_id`)
) ENGINE=MyISAM AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image`
--

LOCK TABLES `image` WRITE;
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
INSERT INTO `image` VALUES (6,'jpg','cinnet_1553811344096.jpg','cinnet.jpg',5),(7,'jpg','esaretn bedeli_1553811355420.jpg','esaretn bedeli.jpg',6),(8,'jpg','forrest_1553811368330.jpg','forrest.jpg',7),(9,'jpg','galaksi_1553811401302.jpg','galaksi.jpg',8),(10,'jpg','gir kanıma_1553811414868.jpg','gir kanıma.jpg',9),(11,'jpg','gladyator_1553811429337.jpg','gladyator.jpg',10),(12,'jpg','hababam_1553811441822.jpg','hababam.jpg',12),(13,'jpg','inception_1553811460562.jpg','inception.jpg',14),(15,'jpg','50 ilk öğcük_1553811496691.jpg','50 ilk öğcük.jpg',28),(16,'jpg','jurasic park_1553811511858.jpg','jurasic park.jpg',13),(17,'jpg','logan_1553811523197.jpg','logan.jpg',19),(18,'jpg','kill bill_1553811535784.jpg','kill bill.jpg',15),(19,'jpg','life is beantiful_1553811554347.jpg','life is beantiful.jpg',11),(21,'jpg','mad max_1553811589843.jpg','mad max.jpg',17),(22,'jpg','matrix_1553811604153.jpg','matrix.jpg',18),(23,'jpg','woli_1553811618267.jpg','woli.jpg',21),(24,'jpg','örümcek adam_1553811638031.jpg','örümcek adam.jpg',20),(25,'jpg','clik me_1553811650131.jpg','clik me.jpg',27),(26,'jpg','yeşil yol_1553811666880.jpg','yeşil yol.jpg',22),(27,'jpg','korku seansı_1553811689148.jpg','korku seansı.jpg',23),(28,'jpg','nootbook_1553811706621.jpg','nootbook.jpg',26),(29,'jpg','ruhlar bölgesi_1553811720203.jpg','ruhlar bölgesi.jpg',24),(30,'jpg','zamanda aşk_1553811734556.jpg','zamanda aşk.jpg',25),(31,'jpg','alien_1553813040833.jpg','alien.jpg',1),(32,'jpg','amelia_1553813105208.jpg','amelia.jpg',2),(33,'jpg','batman_1553813119120.jpg','batman.jpg',16),(34,'jpg','averance_1553813142252.jpg','averance.jpg',3),(35,'jpg','can dostum_1553813188558.jpg','can dostum.jpg',4),(45,'jpg','felekten bir gece_1554506489590.jpg','felekten bir gece.jpg',29);
/*!40000 ALTER TABLE `image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `language`
--

DROP TABLE IF EXISTS `language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `language` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language`
--

LOCK TABLES `language` WRITE;
/*!40000 ALTER TABLE `language` DISABLE KEYS */;
INSERT INTO `language` VALUES (1,'İngilizce'),(2,'Türkçe'),(3,'Fransızca'),(4,'İtalyanca');
/*!40000 ALTER TABLE `language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `movie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `publish_year` datetime DEFAULT NULL,
  `language_id` bigint(20) DEFAULT NULL,
  `image_name` varchar(255) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgf3ks9eyumfd7qfbige6onbl7` (`language_id`)
) ENGINE=MyISAM AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'Görevini tamamlayarak Dünya\'ya dönmeye hazırlanan kargo gemisi Nostromo\'nun beş erkek, iki kadın ve bir kediden oluşan mürettebatı özel kabinlerinde uykudadır. Bilgisayarların çevredeki bir gezegende yabancı bir yaşam türü tespit etmeleri üzerine uyandırılırlar. Yasalar, akıllı olabilecek her canlının araştırılmasını emretmektedir. Dallas (Tom Skerritt), Lambert (Veronica Cartwright) ve Kane\'den (John Hurt) oluşan ekip, gezegene gittiğinde terk edilmiş bir uzay gemisiyle karşılaşır. Buldukları yumurta benzeri organizmaları incelerken, bir tanesi kırılır ve yengeç benzeri bir yaratık Kane\'in yüzüne yapışır. Ekip gemiye döndüğünde Ripley (Sigourney Weaver), Kane\'i içeri almakta tereddüt eder. Karantina kuralları çok açıktır. Fakat mürettebat, arkadaşlarını kurtarmak için bu sorumluluğu alır.','Allien','1978-12-31 20:00:00',1,'alien_1553813040833.jpg'),(2,'Paris\'te garsonluk yaparak, kendine özgü bir dünyada yaşayan saf, çekingen ve masum bir kızdır Amelie. Annesinin beklenmedik ölümü, babasının soğuk tavırları ve yaşadığı travmalar sonucu, sevimli ve boş şeylerle uğraşarak kendisine eğlence yaratmaya çalışsa da aslında hayatı sıkıcı bulduğu için kendisini son derece yalnız hissetmektedir. Bu kısır döngü Amelie’nin evde bulduğu bir kutuyu ve onun aracılığıyla sahibini keşfetmesiyle birlikte bir anda bıçak gibi kesiliverir... Amelie aşık olmuştur.','Amelie','2001-11-22 22:00:00',3,'amelia_1553813105208.jpg'),(3,'Filmde tüm Avengers kahramanları Thanos\'a karşı güçlerini birleştiriyor. Dünyaya gelen ve 6 Sonsuzluk Taşı\'nın sahibi olmak isteyen Thanos\'a karşı verilen savaşın sonucu, dünyanın kaderini de belirleyecektir.','Avengers: Sonsuzluk Savaşı','2018-04-26 21:00:00',1,'averance_1553813142252.jpg'),(4,'Geçirdiği kazadan sonra felç olan zengin aristokrat Philippe, cezaevinden çıkmış Driss’i bakıcısı olarak işe alır. Herkes Driss’in bu iş için uygun olmayacağını düşünürken, Philippe O’na inanır ve bir şans verir. Dünya dursa yan yana gelmeyecek olan bu iki karşıt dünya görüşünün çarpışmasının ve zamanla çılgın bir dostluğa dönüşmesinin, insanı derinden etkileyen hikâyesi.','Can Dostum','2012-03-10 22:00:00',3,'can dostum_1553813188558.jpg'),(5,'Jack Torrance (Jack Nicholson) Colorado dağlarındaki Overlook Otelinde kış bakıcısı olmayı kabul eder.Otel kışın kapalı olduğundan Jack ve ailesi uzun bir süre boyunca mekanda yanlız kalacaklardır.Medyum yetenekleri olan Torrance\'ların küçük oğlu Danny (Danny Lloyd), otelde bazı kötü ruhların olduğunu hissetmeye başlar.Jack, yıllar önce karısı ve iki kızını öldüren otelin eski kış bakıcısı Bay Grady Philip Stone\'nin hayaletiyle tanıştığında işler iyice değişmeye başlar.Danny, babasının bu ruhlar tarafından kontrol edildiğini ve babasının giderek çıldırdığını görmektedir.','Cinnet','1980-05-22 20:00:00',1,'cinnet_1553811344096.jpg'),(6,'Korkunç ve başarılı bir bankacı olan Andy Dufresne, karısını ve onun sevgilisini öldürmek suçundan ömür boyu hapse mahkum edilir ve Shawshank hapishanesine gönderilir. Burada başta Red olmak üzere yeni arkadaşlar edinir. Hapishane yaşamını uyum sağlamaya çalışırken diğer yandan da bilgisi ve kültürüyle etrafındaki insanları etkilemeyi başaracaktır.','Esaretin Bedeli','1995-03-09 22:00:00',1,'esaretn bedeli_1553811355420.jpg'),(7,'Forrest Gump, zeka seviyesi 75 olan bir erkeğin hayatını ele alıyor. Zeka seviyesi nedeni ile devlet okullarına girmekte bile zorlanan Forrest Gump  zamanla akla mantığa uymayan başarılara imza atıyor. Her ne kadar zeka seviyesi düşük olsa da fiziksel olarak son derece sağlam olan Forrest Gump, zamanla gelişen olaylar zincirinde bizi hayal edemeyeceğimiz bir dünyaya götürüyor.','Forrest Gump','1994-07-05 21:00:00',1,'forrest_1553811368330.jpg'),(8,'Marvel\'ın aksiyon dolu, destansı uzay macerası \"Galaksinin Koruyucuları\", Marvel sinema evrenini, maceracı Peter Quill\'in, tüm evreni tehdit eden ihtiraslara sahip bir kötü adam olan Ronan\'ın gıpta ettiği esrarengiz bir küreyi çalıp, amansız bir insan avının hedefi olduğu kainata doğru genişletiyor. Quill, inatçı Ronan\'dan kurtulabilmek için birbirleriyle hiç benzeşmeyen dört uyumsuz kişiden oluşan bir ekiple zorlu bir ortaklığa soyunuyor: Silah taşıyan Rakun Rocket, ağaca benzer bir insansı olan Groot, ölümcül ve gizemli Gamora ve intikam ateşiyle yanıp tutuşan Yokedici Drax. Ama Quill kürenin gerçek gücünü kainata karşı taşıdığı tehlikeyi fark ettiğinde, bir tarafta galaksinin kader dengesi dururken, diğer tarafta, son ve çaresiz bir karşılaşma için ayaktakımı düşmanlarını toplamak üzere, elinden geleni yapması gerekiyor.','Galaksinin Koruyucuları','2014-07-31 21:00:00',1,'galaksi_1553811401302.jpg'),(9,'Stockholm\'de 1982 yılında geçen hikaye iki çocuk arasındaki sıradışı ilişkiyi anlatıyor. Alt sınıfın yaşadığı devasa binaların arasında bulunan karlar içinde bir parkta vakit geçiren Oskar, soğuktan etkilenmeyen, beyaz yüzlü ve gizemli Eli ile tanışır. İki çocuk yakınlaşırken, fonda aynı mahallede çeşitli cinayetlerin işlendiğini görürüz. Uzun süredir vampir olan Eli\'nin kan ihtiyacı babası tarafından giderilmektedir. Fakat zamanla Eli\'nin durumu iki çocuğun da başını belaya sokar... 2008\'in en iyi filmleri arasında kabul edilen Let the Right One In, korkunç vampir filmleri ile sanat sinemasının çarpıcı bir karışımı. Görüntüleri, atmosferi ve bıçak sırtı romantik hikayesiyle unutulmaz bir çalışma.','Gir Kanıma','2010-01-07 22:00:00',1,'gir kanıma_1553811414868.jpg'),(10,'Roma İmparatorluğu\'na en parlak dönemi yaşatan General Maximus, girdiği bir meydan savaşından daha zaferle çıkar, artık tek hayali bir an önce evine dönerek karısı ve ailesine kavuşmaktır. Fakat, zamanın Roma İmparatoru Marcus Aurelius ,Maximus\'a önemli bir görev verir ve iktidara sahip çıkmasını ister. Bunun üzerine imparatorun oğlu olan Commodus, iktidarın elinden alınacağını anlayınca general ve ailesini öldürme emri verir. Maximus ölümden zor kurtulur ve gladyatörler arenasına sürgün edilir. Yıllar sonra Roma\'ya geri dönen güçlü gladyatör Maximus\'un tek amacı Commodus\'u öldürerek karısı ve oğlunun katledilmesinin intikamını almaktır.','Gladyatör','2000-05-18 21:00:00',1,'gladyator_1553811429337.jpg'),(11,'1930\'ların İtalya\'sında Guido adındaki tasasız, kaygısız bir Yahudi kitapçı yakın bir şehirdeki güzel kadına kur yapıp onunla evlenerek bir peri masalı başlatır. Guido ve karısının bir oğulları olur ve İtalya\'yı Alman güçleri istila edene kadar birlikte mutluluk içinde yaşarlar. Ailesini bir arada tutabilmek ve oğlunun Yahudi toplama kamplarının dehşetinden elinden geldiğince uzak tutmak çabası ile Guida bu yıkımı bir oyun gibi gösterir. Bu oyunun kazanma ödülü ise bir tanktır...','Hayat Güzeldir','1999-02-25 22:00:00',4,'life is beantiful_1553811554347.jpg'),(12,'Özel Çamlıca Lisesi`ne yeni atanan müdür muavini Mahmut Hoca (nam-ı diğer Kel Mahmut) kopya çeken, okuldan kaçıp maçlara giden, hocalarla sürekli kafa bulan öğrencilerle dolu Hababam Sınıfı`nı ilginç ceza yöntemleriyle disiplin altına almaya çalışır. Fakat aynı zamanda öğrenci haylazlığı dışında ciddi olaylar da yaşanmaktadır.','Hababam Sınıfı','1975-03-31 21:00:00',2,'hababam_1553811441822.jpg'),(13,'Michael Chrichton\'ın aynı adlı,çok satan romanından dahi yönetmen Steven Spielberg tarafından sinemaya uyarlanan,bütün zamanların en başarılı yapıtlarından birisi olarak tüm Dünya\'da izlenme rekorları kıran olağanüstü bir film. 20. yılına özel olarak 2013\'te 3 boyutlu olarak tekrar gösterime girmiştir.\r\nMağaralarda yapılan kazı çalışmaları sonucunda dinazorların yaşadığı tarih öncesi çağa ait bazı sivrisinek fosilleri bulunur.Milyarder John Hammond öncülüğündeki bilimadamları,son derece ilginç ve karmaşık testler deneyerek bu sivrisinek fosillerindeki kan örneklerini almayı başarırlar.Dinazorların DNA zinciri bir Afrika kurbasıyla birleştirilerek 65 milyon yıl önce yaşamış bu korkunç yaratıklar yeniden yaratılır.Hammond hükümetten kiraladığı bir adada klonladıkları bu vahşi hayvanlar için elektrikli tellerle çevrili bir hayvanat bahçesi kurmuştur.İhtiyar Hammond,bir hafta sonunda Doktor Allen gibi bazı işinde uzman bilimadamlarını Jurassic Park adını verdiği bu hayvanat bahçesini test ettirmek için adaya getirir. Ancak embiryolarını ele geçirmek isteyen biri, güvenlik sistemini devre dışı bırakınca serbest kalan dinazorlar adada dehşet saçmaya başlar...\r\n','Jurassic Park','2013-08-08 21:00:00',1,'jurasic park_1553811511858.jpg'),(14,'Dom Cobb (Leonardo DiCaprio) çok yetenekli bir hırsızdır. Uzmanlık alanı, zihnin en savunmasız olduğu rüya görme anında, bilinçaltının derinliklerindeki değerli sırları çekip çıkarmak ve onları çalmaktır. Cobb’un bu ender mahareti, onu kurumsal casusluğun tehlikeli yeni dünyasında aranan bir oyuncu yapmıştır. Ancak, aynı zamanda bu durum onu uluslararası bir kaçak yapmış ve sevdiği herşeye malolmuştur. Cobb’a içinde bulunduğu durumdan kurtulmasını sağlayacak bir fırsat sunulur. Ona hayatını geri verebilecek son bir iş; tabi eğer imkansız başlangıçı tamamlayabilirse... Mükemmel soygun yerine, Cobb ve takımındaki profesyoneller bu sefer tam tersini yapmak zorundadır; görevleri bir fikri çalmak değil onu yerleştirmektir. Eğer başarırlarsa, mükemmel suç bu olacaktır. Ama ne dikkatle yapılan planlamalar, ne de uzmanlıkları, onları, her hareketlerini önceden tahmin ettiği anlaşılan tehlikeli düşmanlarına karşı hazırlıklı kılabilir. Bu, gelişini sadece Cobb’un görebildiği bir düşmandır','Başlangıç','2010-07-29 21:00:00',1,'inception_1553811460562.jpg'),(15,'The Bride takma adıyla bilinen kiralık katil, düğünü sırasında saldırıya uğrar. Kilisedeki herkes öldürülür. O da karnındaki bebeğini düşürür ama hayatta kalmayı başarır. 5 yıl boyunca komada kalan Gelin, bir mucize eseri hayata geri döner. Artık tek amacı vardır: Ona pusu kuran eski patronu Bill ve adamlarını teker teker öldürmek. Bill\'i en son öldürecektir. Gelin intikamını almak için yola koyulur.','Kill Bill Vol. 1 ','2004-01-01 22:00:00',1,'kill bill_1553811535784.jpg'),(16,'The Dark Knight\'da, Batman suça karşı savaşını daha da ileriye götürüyor: Teğmen Jim Gordon ve Bölge Savcısı Harvey Dent’in yardımlarıyla, Batman, şehir sokaklarını sarmış olan suç örgütlerinden geriye kalanları temizlemeye girişir. Bu ortaklığın etkili olduğu açıktır, ama ekip kısa süre sonra kendilerini, Joker olarak bilinen ve Gotham şehri sakinlerini daha önce de dehşete boğmuş olan suç dehasının yarattığı karmaşanın ortasında bulurlar.','Kara Şövalye','2008-07-24 21:00:00',1,'batman_1553813119120.jpg'),(17,'Mad Max serisi, 3. filmden tam 30 yıl sonra tekrar sinemalara dönüyor. Tam bir görsel şölen sunan filmde Mel Gibson\'la özdeşleşmiş Max Rockatansky karakterini Tom Hardy canlandırıyor.','Mad Max: Fury Road','2015-05-14 21:00:00',1,'mad max_1553811589843.jpg'),(18,'Bir bilgisayar programcısı olan Thomas Anderson aynı zamanda Neo nickname\'li çok usta bir \"hacker\" dır. Ancak siyah takım elbiseli ve gözlüklü adamların yakın takibindedir. Bu takibin nedenini ise karşılaşacağı Morpheus\'dan öğrenecektir. Neo, birden kendini Morpheus\'un anlattıklarına güvenmek zorunda kaldığı büyük bir komplonun içinde bulacaktır. İçinde yaşadığımızı sandığımız bu dünya tamamiyle aldatıcıdır. Tüm insanlık aslında uzaydan gelen yaratıkların köleleridir. Neo, Trinity ve Morpheus\'un da yardımıyla kendilerini bu düzeni yıkmaya adayan bir grubun içine katılır.','Matrix','1999-09-02 21:00:00',1,'matrix_1553811604153.jpg'),(19,'Yakın bir gelecekte geçen filmde Logan (Hugh Jackman) artık yaşlanmış ve yorulmuş, süper yetenekleri erozyona uğramaya başlamıştır. Alzheimer\'ın etkisiyle iyice unutkanlaşan Profesör X, yani Charles Xavier\'i Meksika sınırına yakın bir yerde saklamaktadır. Logan tüm dünyadan kaçmaya çalışsa da bir gün onları bulan Laura Kinney (Dafne Keen) adlı küçük bir kız bu huzuru bozacaktır, nitekim kendisi gibi mutant olan kızı, peşindeki karanlık güçlerden koruması gerekecektir.\r\nLogan filmi, orijinal Wolverine serisinin devamı, yani 2013\'te gösterime giren The Wolverine filmiyle başlayan serinin 2. filmi, toplamda Wolverine üzerine çekilen 3. film olacak (X-Men Origins: Wolverine ve The Wolverine\'in ardından). Bu film aynı zamanda Hugh Jackman\'ın Wolverine\'i canlandırdığı son film olma özellğine sahip.\r\n','Logan','2017-03-02 21:00:00',1,'logan_1553811523197.jpg'),(20,'Spider-Man\'le ilgili en özgün ve en ilginç hikayelerden biri olan filmde çoklu evrenler konu edilir ve farklı boyutlardan pek çok Spider-Man, Miles Morales\'in Brooklyn\'i koruduğu evrende buluşur. Miles Morales, The Ultimate Spider-Man olarak tanınmaktadır. Polis memuru bir baba ve işkolik bir annenin oğlu olan Miles, lise öğrencisidir ve okuluna uyum sağlamakta zorlanmaktadır. Radyoaktif bir örümcek tarafından ısırılmasıyla özel yeteneklere sahip olan bir süper kahramana dönüşür. Fakat henüz gerçek bir süper kahraman olamamıştır. Açılan bir kapı sonucu çoklu evrende farklı boyutlardan gelen Peter Parker ve diğer \"alternatif\" Spider-Man\'ler Miles\'ın evrenine düşer. Peter Parker, Spider-Gwen, Spider-Man Noir, Spider-Ham gibi diğer evrenlerin Spider-Man\'leri Miles\'ın gelişip gerçek bir süper kahraman olmasına yardım eder. Fakat bu Spider-Man\'lerin kendi evrenlerıne mümkün olduğunca çabuk geri dönmeleri gerekmektedir.','Örümcek-Adam Evinde','2018-12-13 21:00:00',1,'örümcek adam_1553811638031.jpg'),(21,'Dünya gezegenini terk eden insanlar tarafından unutulduktan sonra, uzun yıllar boyunca yapayalnız yaşayan ve bu süre içinde programlandığı işle (çöp tasnifiyle) uğraşan robot WALL-E, günün birinde EVE adlı çok güzel bir arama robotuyla karşılaşır ve hayatı aniden yepyeni bir anlam kazanır.\r\nWALL-E’nin elinde gezegenin geleceğinin anahtarının olduğunu keşfeden EVE, artık başka bir gezegende yaşayan ve dünyaya güvenlik içinde geri dönüş haberini heyecanla beklemekte olan insanlara bu bilgiyi rapor etmek için müthiş bir uzay yolculuğuna çıkar. Ancak WALL-E’ de boş durmamış, çok beğendiği EVE’in peşine takılarak onunla birlikte galaksiye açılmıştır. Beyazperdedeki gelmiş geçmiş en heyecan verici ve en yaratıcı komedi macerası böylece başlar. Geleceğin daha önce hiç hayal edilmemiş vizyonlarını içeren bu filmde  WALL-E’ye, aralarında bir hamamböceği ile bozuk robotlardan oluşan kahraman ruhlu bir topluluğun da yer aldığı birbirinden ilginç karakterler eşlik eder.\r\n','Vol-İ','2008-09-25 21:00:00',1,'woli_1553811618267.jpg'),(22,'Bir hapishanede gardiyanlık yapan Paul Edgecomb\'un görevi, hücrelerinden alınan idam mahkumlarını, elektrikli sandalyenin bulunduğu ölüm odasına kadar olan bir millik yeşil yoldan götürmektir. Edgecomb yıllar boyunca bu yoldan sayısız idam mahkumu nakleder. Ama hiçbirisi onu John Coffey kadar etkilemez. Oldukça iri yarı biri olan Coffey, iki küçük kızı öldürmek suçundan idama mahkum olmuştur. Ürkütücü görünümünün aksine oldukça duygulu ve karmaşık bir iç dünyası olan Coffey, bazı doğa üstü güçlere sahiptir. Edgecomb onunla yakınlaştıkça artık hiç beklenmedik yerlerde mucizelerin olabileceğine inanmaya başlayacaktır.\r\nEsaretin Bedeli filmini de yönetmiş olan Frank Darabont, bu filminde de benzer bir atmosferi seyirciye başarıyla aktarıyor. Oscar Ödüllü Tom Hanks\'in yanında, Michael Clarke Duncan ve James Cromwell gibi oyuncular başrolde yer alıyor.\r\n','Yeşil Yol','1999-09-02 21:00:00',1,'yeşil yol_1553811666880.jpg'),(23,'Gerçek bir hikayeden uyarlanan “Korku Seansı / The Conjuring”, paranormal olayları araştıran Ed ve Lorraine Warren’ın nasıl dünyaca meşhur olduklarının korkutucu hikayesini anlatıyor; olaylar Ed ve Lorraine’in, karanlık bir varlık tarafından hayatları alt üst edilen bir ailenin çiflik evine çağırılmalarıyla başlıyor. Şeytani bir varlıkla yüzleşmeye zorlandıklarında, Warrenlar, kendilerini hayatlarının en korkunç vakasının içinde buluyorlar.“Korku Seansı / The Conjuring”in başrollerinde Academi Ödülü adayı Vera Farmiga, Patrick Wilson, Ron Livingston ve Lili Taylor yer alıyor. Filmin yönetmeni ise James Wan. ','Korku Seansı','2013-08-02 21:00:00',1,'korku seansı_1553811689148.jpg'),(24,'Josh (Patrick Wilson) ve Renai (Rose Byrne) üç çocuklarıyla beraber eski bir eve taşınmış ve mutlu bir aile yaşamı sürdürmektedirler. Kaza sonucu küçük çocukları komaya girene kadar.. Ancak bundan sonra olaylar başlar.. John ve Renai oğullarını açıklanamayan esrarengiz ve doğaüstü olaylardan, \'öteki\'nden kurtarmak zorundadır..doğa üstü ve esrarengiz, paranormal olayların yaşandığı filmde \"Paranormal Activity\" nin yönetmeni olarak hatırlayacağmız Oren Peli ve filmin yapımcıları Jason Blum ile Steven Schneider\'in  \"Insidious\'\'un yapımcıları olması. Bu üçlü ayrıca 22 Ekim\'de gösterime girecek ve Saw 3D ile kapışma yaşayacak Paranormal Activiy 2\'nin de yapımcılıklarını yapıyor','Ruhlar Bölgesi','2011-06-23 21:00:00',1,'ruhlar bölgesi_1553811720203.jpg'),(25,'Genç yaştaki Tim Lake, ailesiyle birlikte sıra dışı bir yeteneğe sahiptir:Tim hayatının farklı yönlerini değiştirmek için bu özelliğini kullanmaya başlar. Mary adında bir kıza aşık olur çalışmak için Londra\'ya taşınır. Tim gizli yeteneği ilişkilerine de yeni bir \'boyut\' getirir ama genç adam yakın zamanda her sorunu bu şekilde çözemeyeceğini fark edecektir.','Zamanda Aşk ','2013-10-03 21:00:00',1,'zamanda aşk_1553811734556.jpg'),(26,'Sararmış bir not defterinden anlatılan ve yıllar önceden kopup gelen bir aşk hikayesi. 40\'lı yıllarda ABD, Kuzey Karolayna\'daki sahil kasabası Seabrook\'a genç bir kız gelir. Ailesiyle geçireceği sakin bir yazı hayal eden Allie bir karnavalda tanıştığı Noah\'la yakınlaşır. Noah kızı gördüğü anda hayatını birleştirmesi gereken insan olduğunu anlar.Genç kız zengin bir ailen geldiği ve delikanlı da değirmende çalışan bir işçi olduğu halde geleceği hiç düşünmeden rüya gibi bir yaz geçirirler ve iyice aşık olurlar. II. Dünya Savaşı\'nın kızıştığı bir dönemde hayat, aşıkları ayırıverir. Sevdiği kızı aklından hiç çıkarmamış olan Noah savaştan döner. Oysa Allie gönüllü olarak çalıştığı bir askeri hastanede tanıştığı Lon ile evlenmek üzeredir.','Not Defteri','2003-12-31 22:00:00',1,'nootbook_1553811706621.jpg'),(27,'Michael Newman (Adam Sandler) güzel Donnayla (Kate Beckinsale) evlidir ve çiftin iki harika çocuğu vardır. Ama genç adam onları görmeye pek fırsat bulamaz çünkü şirkete paha biçilmez katkısının, nankör patronu (David Hasselhoff) tarafından bir gün fark edileceğini ve böylece ortaklığa terfi edeceğini umarak uzun saatlerini iş yerinde geçirmektedir. Michael bütün bir geceyi ayakta geçirdiği için o kadar yorgundur ki hangi kumandanın televizyonu açtığını bir türlü bulamaz ve sinir olur. Bunun üzerine, evdeki bütün elektronik araç gereci kontrol edebilecek mükemmel bir uzaktan kumanda bulmaya karar verir. Egsantrik tezgahtar Morty (Christopher Walken) ona kesinlikle hayatını değiştirecek, deneysel, türünün tek örneği bir kumanda verir.','Süper Kumanda','2006-09-21 21:00:00',1,'clik me_1553811650131.jpg'),(28,'50 İlk Öpücük\'ün ana karakterleri seviş-bırak zihniyetinde bir Kazanova olan Henry ile her gece hafızasının silinmesine yol açan ender bir nörolojik rahatsızlığa sahip sanat öğretmeni Lucy.\r\nSoğuk deniz canlıları veterineri olan Henry Roth bütün geleceğini planlamıştır.Hawai\'deki Deniz Yaşamı Parkı deniz hayvanlarına bakmadığı zamanlarda, tatil aşkı arayışındaki turistlerin kalbini çalmakla meşguldür. Henry için uzun süreli bir ilişki söz konusu değildir, zira böyle bir şey, 10 yıldır planladığı Alaska\'ya tekneyle gidip morsların sualtı yaşamını inceleme hayallerini sekteye uğratır.\r\nHenry, rüyalarını gerçekleştirmeye çok yaklaşmıştır ki, teknesi Sea Serpent (deniz Yılanı) bir talihsizlik yaşar ve Henry kendini Hukilau Café\'de bulur. Buradaki müdavimler onu güvenmeyen bakışlarla süzerken, Henry\'nin bakışlarıysa müşterilerden güzel Lucy Whitmore\'a takılır.\r\nHenry, tek başına kahvaltı eden Lucy\'ye görür görmez çarpılır. Genç kızın gözlemeleri metodik bir biçimde kesip mükemmel çadırlar haline getirişi ilgisini çeker ve Henry, ertesi gün tekrar Hukilau\'ya gider. Lucy yine yalnız oturmuştur ve bu kez gözlemelerini mükemmel kulübeler haline getirmektedir. Gözleme kabininin kapısı bir türlü kapanmayınca, Henry bu fırsattan yararlanır ve Lucy\'nin yanına gidip, kürdandan bir kapı menteşesi yapar.\r\nİki genç gözlemelerden ve deniz memelilerinden bahsederken, Henry, Lucy\'ye gitgide daha büyük bir ilgi duymaya başlar. Oralı kızlarla çıkma konusundaki kuralını hiçe sayarak, Lucy\'yi ertesi gün beraber kahvaltı etmeye davet eder. Ama bir sonraki gün Café\'ye gidip, bir önceki günkü sohbetlerden söz edince, Lucy onun bir tür sapık olduğunu düşünür ve etraftan yardım ister. Henry\'nin kim olduğu hakkında hiçbir fikri yoktur. Henry anlar ki eğer Lucy\'nini sevgisini kazanmak istiyorsa, hayatı boyunca her gün tekrar sıfırdan başlamak zorundadır.','50 İlk Öpücük','2004-04-29 21:00:00',1,'50 ilk öğcük_1553811496691.jpg'),(29,'Filmde arkadaşlarının düğününden iki gün önce bekarlığa veda partisi vermek için Las Vegas\'a giden dört arkadaş,sarhoş oldukları parti gecesinin sabahında odalarında bir kaplan, tavuklar ve dolapta ağlayan altı aylık bir bebek ile uyanırlar. Ayrıca damat ortada yoktur. Bir gece öncesine dair hiçbirşey hatırlamayan üç arkadaş ip uclarını takip ederek işlerin nerede kontrolden çıktığını bulmak zorundadırlar. En önemlisi de damadı bularak zamanında Los Angeles\'a düğününe yetiştirmeleri gerekmektedir.','Felekten Bir Gece','2009-07-09 21:00:00',1,'felekten bir gece_1554506489590.jpg');
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_cast`
--

DROP TABLE IF EXISTS `movie_cast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `movie_cast` (
  `movie_id` bigint(20) NOT NULL,
  `cast_id` bigint(20) NOT NULL,
  PRIMARY KEY (`movie_id`,`cast_id`),
  KEY `FKmubobrx5vtcog69c067vb5mbe` (`cast_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_cast`
--

LOCK TABLES `movie_cast` WRITE;
/*!40000 ALTER TABLE `movie_cast` DISABLE KEYS */;
INSERT INTO `movie_cast` VALUES (1,1),(1,2),(1,3),(1,4),(2,5),(2,6),(2,7),(2,8),(2,9),(3,10),(3,11),(3,12),(3,13),(3,14),(4,15),(4,16),(4,17),(4,18),(4,19),(5,20),(5,21),(5,22),(5,23),(6,27),(6,28),(6,29),(6,73),(7,30),(7,31),(7,32),(7,33),(7,34),(8,35),(8,36),(8,37),(8,38),(8,39),(9,40),(9,41),(9,42),(9,43),(10,44),(10,45),(10,46),(10,47),(11,48),(11,49),(11,50),(11,51),(11,52),(12,53),(12,54),(12,55),(12,56),(12,57),(13,58),(13,59),(13,60),(13,61),(13,62),(14,63),(14,64),(14,65),(14,66),(14,67),(15,68),(15,69),(15,70),(15,71),(15,72),(16,67),(16,73),(16,74),(16,75),(16,76),(17,78),(17,79),(17,80),(17,81),(17,82),(18,84),(18,85),(18,86),(18,87),(18,88),(19,93),(19,94),(19,95),(19,96),(20,97),(20,98),(20,99),(20,100),(21,1),(21,102),(21,103),(21,104),(22,30),(22,32),(22,106),(22,107),(22,109),(23,110),(23,111),(23,113),(23,114),(23,126),(24,125),(24,126),(24,127),(24,128),(24,129),(25,116),(25,121),(25,122),(25,123),(25,124),(26,115),(26,116),(26,117),(26,118),(26,119),(27,135),(27,140),(27,141),(27,142),(27,143),(28,135),(28,136),(28,137),(28,138),(28,139),(29,130),(29,131),(29,132),(29,133),(29,134);
/*!40000 ALTER TABLE `movie_cast` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_category`
--

DROP TABLE IF EXISTS `movie_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `movie_category` (
  `movie_id` bigint(20) NOT NULL,
  `category_id` bigint(20) NOT NULL,
  PRIMARY KEY (`movie_id`,`category_id`),
  KEY `FKhkem46gi7yq1019e1j8hlvp9y` (`category_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_category`
--

LOCK TABLES `movie_category` WRITE;
/*!40000 ALTER TABLE `movie_category` DISABLE KEYS */;
INSERT INTO `movie_category` VALUES (1,4),(1,5),(2,3),(2,8),(3,1),(3,2),(3,5),(4,3),(4,6),(5,4),(5,6),(6,6),(7,6),(7,8),(8,1),(8,2),(8,5),(9,6),(9,8),(10,2),(10,6),(11,3),(11,8),(12,3),(13,1),(13,2),(13,5),(14,1),(14,2),(14,5),(15,1),(15,2),(16,1),(16,2),(17,1),(17,2),(18,1),(18,5),(19,1),(19,2),(19,5),(19,6),(20,1),(20,2),(20,7),(21,2),(21,7),(22,6),(23,4),(24,4),(25,8),(26,8),(27,2),(27,3),(28,3),(28,8),(29,2),(29,3);
/*!40000 ALTER TABLE `movie_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_USER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setting`
--

DROP TABLE IF EXISTS `setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `setting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setting`
--

LOCK TABLES `setting` WRITE;
/*!40000 ALTER TABLE `setting` DISABLE KEYS */;
/*!40000 ALTER TABLE `setting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `password` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (5,'user@gmail.com','user','{bcrypt}$2a$10$4qtbvA9.upI1cY7cfTQZheS3d.Cwukn2oYM5xS6VZzuWGcfArJ.9W'),(4,'admin@gmail.com','admin','{bcrypt}$2a$10$rErToukEoX1eUyzSxivgnOqqBXTUbSwvJEQHn9S9gwfysOiTgxcpe');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user_role` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (4,1),(4,2),(5,2);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'movieblog'
--

--
-- Dumping routines for database 'movieblog'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-10  4:15:46
