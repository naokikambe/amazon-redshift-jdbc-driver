/* Automatically generated by GNU msgfmt.  Do not modify!  */
package com.amazon.redshift.translation;
public class messages_tr extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[794];
    t[0] = "";
    t[1] = "Project-Id-Version: jdbc-tr\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2009-05-31 21:47+0200\nLast-Translator: Devrim GÜNDÜZ <devrim@gunduz.org>\nLanguage-Team: Turkish <pgsql-tr-genel@PostgreSQL.org>\nLanguage: tr\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nX-Generator: KBabel 1.3.1\nX-Poedit-Language: Turkish\nX-Poedit-Country: TURKEY\n";
    t[2] = "Not implemented: 2nd phase commit must be issued using an idle connection. commit xid={0}, currentXid={1}, state={2}, transactionState={3}";
    t[3] = "Desteklenmiyor: 2nd phase commit, atıl bir bağlantıdan başlatılmalıdır. commit xid={0}, currentXid={1}, state={2}, transactionState={3}";
    t[4] = "DataSource has been closed.";
    t[5] = "DataSource kapatıldı.";
    t[8] = "Invalid flags {0}";
    t[9] = "Geçersiz seçenekler {0}";
    t[18] = "Where: {0}";
    t[19] = "Where: {0}";
    t[24] = "Unknown XML Source class: {0}";
    t[25] = "Bilinmeyen XML Kaynak Sınıfı: {0}";
    t[26] = "The connection attempt failed.";
    t[27] = "Bağlantı denemesi başarısız oldu.";
    t[28] = "Currently positioned after the end of the ResultSet.  You cannot call deleteRow() here.";
    t[29] = "Şu an ResultSet sonucundan sonra konumlandı. deleteRow() burada çağırabilirsiniz.";
    t[32] = "Can''t use query methods that take a query string on a PreparedStatement.";
    t[33] = "PreparedStatement ile sorgu satırı alan sorgu yöntemleri kullanılamaz.";
    t[36] = "Multiple ResultSets were returned by the query.";
    t[37] = "Sorgu tarafından birden fazla ResultSet getirildi.";
    t[50] = "Too many update results were returned.";
    t[51] = "Çok fazla güncelleme sonucu döndürüldü.";
    t[58] = "Illegal UTF-8 sequence: initial byte is {0}: {1}";
    t[59] = "Geçersiz UTF-8 çoklu bayt karakteri: ilk bayt {0}: {1}";
    t[66] = "The column name {0} was not found in this ResultSet.";
    t[67] = "Bu ResultSet içinde {0} sütun adı bulunamadı.";
    t[70] = "Fastpath call {0} - No result was returned and we expected an integer.";
    t[71] = "Fastpath call {0} - Integer beklenirken hiçbir sonuç getirilmedi.";
    t[74] = "Protocol error.  Session setup failed.";
    t[75] = "Protokol hatası.  Oturum kurulumu başarısız oldu.";
    t[76] = "A CallableStatement was declared, but no call to registerOutParameter(1, <some type>) was made.";
    t[77] = "CallableStatement bildirildi ancak registerOutParameter(1, < bir tip>) tanıtımı yapılmadı.";
    t[78] = "ResultSets with concurrency CONCUR_READ_ONLY cannot be updated.";
    t[79] = "Eş zamanlama CONCUR_READ_ONLY olan ResultSet''ler değiştirilemez";
    t[90] = "LOB positioning offsets start at 1.";
    t[91] = "LOB bağlangıç adresi 1Den başlıyor";
    t[92] = "Internal Position: {0}";
    t[93] = "Internal Position: {0}";
    t[96] = "free() was called on this LOB previously";
    t[97] = "Bu LOB'da free() daha önce çağırıldı";
    t[100] = "Cannot change transaction read-only property in the middle of a transaction.";
    t[101] = "Transaction ortasında geçerli transactionun read-only özellği değiştirilemez.";
    t[102] = "The JVM claims not to support the {0} encoding.";
    t[103] = "JVM, {0} dil kodlamasını desteklememektedir.";
    t[108] = "{0} function doesn''t take any argument.";
    t[109] = "{0} fonksiyonu parametre almaz.";
    t[112] = "xid must not be null";
    t[113] = "xid null olamaz";
    t[114] = "Connection has been closed.";
    t[115] = "Bağlantı kapatıldı.";
    t[122] = "The server does not support SSL.";
    t[123] = "Sunucu SSL desteklemiyor.";
    t[124] = "Custom type maps are not supported.";
    t[125] = "Özel tip eşleştirmeleri desteklenmiyor.";
    t[140] = "Illegal UTF-8 sequence: byte {0} of {1} byte sequence is not 10xxxxxx: {2}";
    t[141] = "Geçersiz UTF-8 çoklu bayt karakteri: {0}/{1} baytı 10xxxxxx değildir: {2}";
    t[148] = "Hint: {0}";
    t[149] = "İpucu: {0}";
    t[152] = "Unable to find name datatype in the system catalogs.";
    t[153] = "Sistem kataloglarında name veri tipi bulunamıyor.";
    t[156] = "Unsupported Types value: {0}";
    t[157] = "Geçersiz Types değeri: {0}";
    t[158] = "Unknown type {0}.";
    t[159] = "Bilinmeyen tip {0}.";
    t[166] = "{0} function takes two and only two arguments.";
    t[167] = "{0} fonksiyonunu sadece iki parametre alabilir.";
    t[170] = "Finalizing a Connection that was never closed:";
    t[171] = "Kapatılmamış bağlantı sonlandırılıyor.";
    t[180] = "The maximum field size must be a value greater than or equal to 0.";
    t[181] = "En büyük alan boyutu sıfır ya da sıfırdan büyük bir değer olmalı.";
    t[186] = "Redshift LOBs can only index to: {0}";
    t[187] = "Redshift LOB göstergeleri sadece {0} referans edebilir";
    t[194] = "Method {0} is not yet implemented.";
    t[195] = "{0} yöntemi henüz kodlanmadı.";
    t[198] = "Error loading default settings from driverconfig.properties";
    t[199] = "driverconfig.properties dosyasından varsayılan ayarları yükleme hatası";
    t[200] = "Results cannot be retrieved from a CallableStatement before it is executed.";
    t[201] = "CallableStatement çalıştırılmadan sonuçlar ondan alınamaz.";
    t[202] = "Large Objects may not be used in auto-commit mode.";
    t[203] = "Auto-commit biçimde large object kullanılamaz.";
    t[208] = "Expected command status BEGIN, got {0}.";
    t[209] = "BEGIN komut durumunu beklenirken {0} alındı.";
    t[218] = "Invalid fetch direction constant: {0}.";
    t[219] = "Getirme yönü değişmezi geçersiz: {0}.";
    t[222] = "{0} function takes three and only three arguments.";
    t[223] = "{0} fonksiyonunu sadece üç parametre alabilir.";
    t[226] = "This SQLXML object has already been freed.";
    t[227] = "Bu SQLXML nesnesi zaten boşaltılmış.";
    t[228] = "Cannot update the ResultSet because it is either before the start or after the end of the results.";
    t[229] = "ResultSet, sonuçların ilk kaydından önce veya son kaydından sonra olduğu için güncelleme yapılamamaktadır.";
    t[230] = "The JVM claims not to support the encoding: {0}";
    t[231] = "JVM, {0} dil kodlamasını desteklememektedir.";
    t[232] = "Parameter of type {0} was registered, but call to get{1} (sqltype={2}) was made.";
    t[233] = "{0} tipinde parametre tanıtıldı, ancak {1} (sqltype={2}) tipinde geri getirmek için çağrı yapıldı.";
    t[234] = "Error rolling back prepared transaction. rollback xid={0}, preparedXid={1}, currentXid={2}";
    t[235] = "Hazırlanmış transaction rollback hatası. rollback xid={0}, preparedXid={1}, currentXid={2}";
    t[240] = "Cannot establish a savepoint in auto-commit mode.";
    t[241] = "Auto-commit biçimde savepoint oluşturulamıyor.";
    t[242] = "Cannot retrieve the id of a named savepoint.";
    t[243] = "Adlandırılmış savepointin id değerine erişilemiyor.";
    t[244] = "The column index is out of range: {0}, number of columns: {1}.";
    t[245] = "Sütun gçstergesi kapsam dışıdır: {0}, sütun sayısı: {1}.";
    t[250] = "Something unusual has occurred to cause the driver to fail. Please report this exception.";
    t[251] = "Sıradışı bir durum sürücünün hata vermesine sebep oldu. Lütfen bu durumu geliştiricilere bildirin.";
    t[260] = "Cannot cast an instance of {0} to type {1}";
    t[261] = "{0} tipi {1} tipine dönüştürülemiyor";
    t[264] = "Unknown Types value.";
    t[265] = "Geçersiz Types değeri.";
    t[266] = "Invalid stream length {0}.";
    t[267] = "Geçersiz akım uzunluğu {0}.";
    t[272] = "Cannot retrieve the name of an unnamed savepoint.";
    t[273] = "Adı verilmemiş savepointin id değerine erişilemiyor.";
    t[274] = "Unable to translate data into the desired encoding.";
    t[275] = "Veri, istenilen dil kodlamasına çevrilemiyor.";
    t[276] = "Expected an EOF from server, got: {0}";
    t[277] = "Sunucudan EOF beklendi; ama {0} alındı.";
    t[278] = "Bad value for type {0} : {1}";
    t[279] = "{0} veri tipi için geçersiz değer : {1}";
    t[280] = "The server requested password-based authentication, but no password was provided.";
    t[281] = "Sunucu şifre tabanlı yetkilendirme istedi; ancak bir şifre sağlanmadı.";
    t[286] = "Unable to create SAXResult for SQLXML.";
    t[287] = "SQLXML için SAXResult yaratılamadı.";
    t[292] = "Error during recover";
    t[293] = "Kurtarma sırasında hata";
    t[294] = "tried to call end without corresponding start call. state={0}, start xid={1}, currentXid={2}, preparedXid={3}";
    t[295] = "start çağırımı olmadan end çağırılmıştır. state={0}, start xid={1}, currentXid={2}, preparedXid={3}";
    t[296] = "Truncation of large objects is only implemented in 8.3 and later servers.";
    t[297] = "Large objectlerin temizlenmesi 8.3 ve sonraki sürümlerde kodlanmıştır.";
    t[298] = "This PooledConnection has already been closed.";
    t[299] = "Geçerli PooledConnection zaten önceden kapatıldı.";
    t[302] = "ClientInfo property not supported.";
    t[303] = "Clientinfo property'si desteklenememktedir.";
    t[306] = "Fetch size must be a value greater to or equal to 0.";
    t[307] = "Fetch boyutu sıfır veya daha büyük bir değer olmalıdır.";
    t[312] = "A connection could not be made using the requested protocol {0}.";
    t[313] = "İstenilen protokol ile bağlantı kurulamadı {0}";
    t[318] = "Unknown XML Result class: {0}";
    t[319] = "Bilinmeyen XML Sonuç sınıfı: {0}.";
    t[322] = "There are no rows in this ResultSet.";
    t[323] = "Bu ResultSet içinde kayıt bulunamadı.";
    t[324] = "Unexpected command status: {0}.";
    t[325] = "Beklenmeyen komut durumu: {0}.";
    t[330] = "Heuristic commit/rollback not supported. forget xid={0}";
    t[331] = "Heuristic commit/rollback desteklenmiyor. forget xid={0}";
    t[334] = "Not on the insert row.";
    t[335] = "Insert kaydı değil.";
    t[336] = "This SQLXML object has already been initialized, so you cannot manipulate it further.";
    t[337] = "Bu SQLXML nesnesi daha önceden ilklendirilmiştir; o yüzden daha fazla müdahale edilemez.";
    t[344] = "Server SQLState: {0}";
    t[345] = "Sunucu SQLState: {0}";
    t[348] = "The server''s standard_conforming_strings parameter was reported as {0}. The JDBC driver expected on or off.";
    t[349] = "İstemcinin client_standard_conforming_strings parametresi {0} olarak raporlandı. JDBC sürücüsü on ya da off olarak bekliyordu.";
    t[360] = "The driver currently does not support COPY operations.";
    t[361] = "Bu sunucu şu aşamada COPY işlemleri desteklememktedir.";
    t[364] = "The array index is out of range: {0}, number of elements: {1}.";
    t[365] = "Dizin göstergisi kapsam dışıdır: {0}, öğe sayısı: {1}.";
    t[374] = "suspend/resume not implemented";
    t[375] = "suspend/resume desteklenmiyor";
    t[378] = "Not implemented: one-phase commit must be issued using the same connection that was used to start it";
    t[379] = "Desteklenmiyor: one-phase commit, işlevinde başlatan ve bitiren bağlantı aynı olmalıdır";
    t[380] = "Error during one-phase commit. commit xid={0}";
    t[381] = "One-phase commit sırasında hata. commit xid={0}";
    t[398] = "Cannot call cancelRowUpdates() when on the insert row.";
    t[399] = "Insert edilmiş kaydın üzerindeyken cancelRowUpdates() çağırılamaz.";
    t[400] = "Cannot reference a savepoint after it has been released.";
    t[401] = "Bırakıldıktan sonra savepoint referans edilemez.";
    t[402] = "You must specify at least one column value to insert a row.";
    t[403] = "Bir satır eklemek için en az bir sütun değerini belirtmelisiniz.";
    t[404] = "Unable to determine a value for MaxIndexKeys due to missing system catalog data.";
    t[405] = "Sistem kataloğu olmadığından MaxIndexKeys değerini tespit edilememektedir.";
    t[410] = "commit called before end. commit xid={0}, state={1}";
    t[411] = "commit, sondan önce çağırıldı. commit xid={0}, state={1}";
    t[412] = "Illegal UTF-8 sequence: final value is out of range: {0}";
    t[413] = "Geçersiz UTF-8 çoklu bayt karakteri: son değer sıra dışıdır: {0}";
    t[414] = "{0} function takes two or three arguments.";
    t[415] = "{0} fonksiyonu yalnız iki veya üç argüman alabilir.";
    t[428] = "Unable to convert DOMResult SQLXML data to a string.";
    t[429] = "DOMResult SQLXML verisini diziye dönüştürülemedi.";
    t[434] = "Unable to decode xml data.";
    t[435] = "XML verisinin kodu çözülemedi.";
    t[440] = "Unexpected error writing large object to database.";
    t[441] = "Large object veritabanına yazılırken beklenmeyan hata.";
    t[442] = "Zero bytes may not occur in string parameters.";
    t[443] = "String parametrelerinde sıfır bayt olamaz.";
    t[444] = "A result was returned when none was expected.";
    t[445] = "Hiçbir sonuç kebklenimezken sonuç getirildi.";
    t[450] = "ResultSet is not updateable.  The query that generated this result set must select only one table, and must select all primary keys from that table. See the JDBC 2.1 API Specification, section 5.6 for more details.";
    t[451] = "ResultSet değiştirilemez. Bu sonucu üreten sorgu tek bir tablodan sorgulamalı ve tablonun tüm primary key alanları belirtmelidir. Daha fazla bilgi için bk. JDBC 2.1 API Specification, section 5.6.";
    t[454] = "Bind message length {0} too long.  This can be caused by very large or incorrect length specifications on InputStream parameters.";
    t[455] = "Bind mesaj uzunluğu ({0}) fazla uzun. Bu durum InputStream yalnış uzunluk belirtimlerden kaynaklanabilir.";
    t[460] = "Statement has been closed.";
    t[461] = "Komut kapatıldı.";
    t[462] = "No value specified for parameter {0}.";
    t[463] = "{0} parametresi için hiç bir değer belirtilmedi.";
    t[468] = "The array index is out of range: {0}";
    t[469] = "Dizi göstergesi kapsam dışıdır: {0}";
    t[474] = "Unable to bind parameter values for statement.";
    t[475] = "Komut için parametre değerlei bağlanamadı.";
    t[476] = "Can''t refresh the insert row.";
    t[477] = "Inser satırı yenilenemiyor.";
    t[480] = "No primary key found for table {0}.";
    t[481] = "{0} tablosunda primary key yok.";
    t[482] = "Cannot change transaction isolation level in the middle of a transaction.";
    t[483] = "Transaction ortasında geçerli transactionun transaction isolation level özellği değiştirilemez.";
    t[498] = "Provided InputStream failed.";
    t[499] = "Sağlanmış InputStream başarısız.";
    t[500] = "The parameter index is out of range: {0}, number of parameters: {1}.";
    t[501] = "Dizin göstergisi kapsam dışıdır: {0}, öğe sayısı: {1}.";
    t[502] = "The server''s DateStyle parameter was changed to {0}. The JDBC driver requires DateStyle to begin with ISO for correct operation.";
    t[503] = "Sunucunun DateStyle parametresi {0} olarak değiştirildi. JDBC sürücüsü doğru işlemesi için DateStyle tanımının ISO işle başlamasını gerekir.";
    t[508] = "Connection attempt timed out.";
    t[509] = "Bağlantı denemesi zaman aşımına uğradı.";
    t[512] = "Internal Query: {0}";
    t[513] = "Internal Query: {0}";
    t[514] = "Error preparing transaction. prepare xid={0}";
    t[515] = "Transaction hazırlama hatası. prepare xid={0}";
    t[518] = "The authentication type {0} is not supported. Check that you have configured the pg_hba.conf file to include the client''s IP address or subnet, and that it is using an authentication scheme supported by the driver.";
    t[519] = "{0} yetkinlendirme tipi desteklenmemektedir. pg_hba.conf dosyanızı istemcinin IP adresini ya da subnetini içerecek şekilde ayarlayıp ayarlamadığınızı ve sürücü tarafından desteklenen yetkilendirme yöntemlerinden birisini kullanıp kullanmadığını kontrol ediniz.";
    t[526] = "Interval {0} not yet implemented";
    t[527] = "{0} aralığı henüz kodlanmadı.";
    t[532] = "Conversion of interval failed";
    t[533] = "Interval dönüştürmesi başarısız.";
    t[540] = "Query timeout must be a value greater than or equals to 0.";
    t[541] = "Sorgu zaman aşımı değer sıfır veya sıfırdan büyük bir sayı olmalıdır.";
    t[542] = "Connection has been closed automatically because a new connection was opened for the same PooledConnection or the PooledConnection has been closed.";
    t[543] = "PooledConnection kapatıldığı için veya aynı PooledConnection için yeni bir bağlantı açıldığı için geçerli bağlantı otomatik kapatıldı.";
    t[544] = "ResultSet not positioned properly, perhaps you need to call next.";
    t[545] = "ResultSet doğru konumlanmamıştır, next işlemi çağırmanız gerekir.";
    t[546] = "Prepare called before end. prepare xid={0}, state={1}";
    t[547] = "Sondan önce prepare çağırılmış. prepare xid={0}, state={1}";
    t[548] = "Invalid UUID data.";
    t[549] = "Geçersiz UUID verisi.";
    t[550] = "This statement has been closed.";
    t[551] = "Bu komut kapatıldı.";
    t[552] = "Can''t infer the SQL type to use for an instance of {0}. Use setObject() with an explicit Types value to specify the type to use.";
    t[553] = "{0}''nin örneği ile kullanılacak SQL tip bulunamadı. Kullanılacak tip belirtmek için kesin Types değerleri ile setObject() kullanın.";
    t[554] = "Cannot call updateRow() when on the insert row.";
    t[555] = "Insert  kaydı üzerinde updateRow() çağırılamaz.";
    t[562] = "Detail: {0}";
    t[563] = "Ayrıntı: {0}";
    t[566] = "Cannot call deleteRow() when on the insert row.";
    t[567] = "Insert  kaydı üzerinde deleteRow() çağırılamaz.";
    t[568] = "Currently positioned before the start of the ResultSet.  You cannot call deleteRow() here.";
    t[569] = "Şu an ResultSet başlangcıından önce konumlandı. deleteRow() burada çağırabilirsiniz.";
    t[576] = "Illegal UTF-8 sequence: final value is a surrogate value: {0}";
    t[577] = "Geçersiz UTF-8 çoklu bayt karakteri: son değer yapay bir değerdir: {0}";
    t[578] = "Unknown Response Type {0}.";
    t[579] = "Bilinmeyen yanıt tipi {0}";
    t[582] = "Unsupported value for stringtype parameter: {0}";
    t[583] = "strinftype parametresi için destekleneyen değer: {0}";
    t[584] = "Conversion to type {0} failed: {1}.";
    t[585] = "{0} veri tipine dönüştürme hatası: {1}.";
    t[586] = "This SQLXML object has not been initialized, so you cannot retrieve data from it.";
    t[587] = "Bu SQLXML nesnesi ilklendirilmemiş; o yüzden ondan veri alamazsınız.";
    t[600] = "Unable to load the class {0} responsible for the datatype {1}";
    t[601] = "{1} veri tipinden sorumlu {0} sınıfı yüklenemedi";
    t[604] = "The fastpath function {0} is unknown.";
    t[605] = "{0} fastpath fonksiyonu bilinmemektedir.";
    t[608] = "Malformed function or procedure escape syntax at offset {0}.";
    t[609] = "{0} adresinde fonksiyon veya yordamda kaçış söz dizimi geçersiz.";
    t[612] = "Provided Reader failed.";
    t[613] = "Sağlanmış InputStream başarısız.";
    t[614] = "Maximum number of rows must be a value grater than or equal to 0.";
    t[615] = "En büyük getirilecek satır sayısı sıfırdan büyük olmalıdır.";
    t[616] = "Failed to create object for: {0}.";
    t[617] = "{0} için nesne oluşturma hatası.";
    t[620] = "Conversion of money failed.";
    t[621] = "Money dönüştürmesi başarısız.";
    t[622] = "Premature end of input stream, expected {0} bytes, but only read {1}.";
    t[623] = "Giriş akımında beklenmeyen dosya sonu, {0} bayt beklenirken sadece {1} bayt alındı.";
    t[626] = "An unexpected result was returned by a query.";
    t[627] = "Sorgu beklenmeyen bir sonuç döndürdü.";
    t[644] = "Invalid protocol state requested. Attempted transaction interleaving is not supported. xid={0}, currentXid={1}, state={2}, flags={3}";
    t[645] = "Transaction interleaving desteklenmiyor. xid={0}, currentXid={1}, state={2}, flags={3}";
    t[646] = "An error occurred while setting up the SSL connection.";
    t[647] = "SSL bağlantısı ayarlanırken bir hata oluştu.";
    t[654] = "Illegal UTF-8 sequence: {0} bytes used to encode a {1} byte value: {2}";
    t[655] = "Geçersiz UTF-8 çoklu bayt karakteri: {0} bayt, {1} bayt değeri kodlamak için kullanılmış: {2}";
    t[656] = "Not implemented: Prepare must be issued using the same connection that started the transaction. currentXid={0}, prepare xid={1}";
    t[657] = "Desteklenmiyor: Prepare, transaction başlatran bağlantı tarafından çağırmalıdır. currentXid={0}, prepare xid={1}";
    t[658] = "The SSLSocketFactory class provided {0} could not be instantiated.";
    t[659] = "SSLSocketFactory {0} ile örneklenmedi.";
    t[662] = "Failed to convert binary xml data to encoding: {0}.";
    t[663] = "xml verisinin şu dil kodlamasına çevirilmesi başarısız oldu: {0}";
    t[670] = "Position: {0}";
    t[671] = "Position: {0}";
    t[676] = "Location: File: {0}, Routine: {1}, Line: {2}";
    t[677] = "Yer: Dosya: {0}, Yordam: {1}, Satır: {2}";
    t[684] = "Cannot tell if path is open or closed: {0}.";
    t[685] = "Pathın açık mı kapalı olduğunu tespit edilemiyor: {0}.";
    t[690] = "Unable to create StAXResult for SQLXML";
    t[691] = "SQLXML için StAXResult yaratılamadı";
    t[700] = "Cannot convert an instance of {0} to type {1}";
    t[701] = "{0} instance, {1} tipine dönüştürülemiyor";
    t[710] = "{0} function takes four and only four argument.";
    t[711] = "{0} fonksiyonunu yalnız dört parametre alabilir.";
    t[718] = "Interrupted while attempting to connect.";
    t[719] = "Bağlanırken kesildi.";
    t[722] = "Your security policy has prevented the connection from being attempted.  You probably need to grant the connect java.net.SocketPermission to the database server host and port that you wish to connect to.";
    t[723] = "Güvenlik politikanız bağlantının kurulmasını engelledi. java.net.SocketPermission'a veritabanına ve de bağlanacağı porta bağlantı izni vermelisiniz.";
    t[734] = "No function outputs were registered.";
    t[735] = "Hiçbir fonksiyon çıktısı kaydedilmedi.";
    t[736] = "{0} function takes one and only one argument.";
    t[737] = "{0} fonksiyonunu yalnız tek bir parametre alabilir.";
    t[744] = "This ResultSet is closed.";
    t[745] = "ResultSet kapalıdır.";
    t[746] = "Invalid character data was found.  This is most likely caused by stored data containing characters that are invalid for the character set the database was created in.  The most common example of this is storing 8bit data in a SQL_ASCII database.";
    t[747] = "Geçersiz karakterler bulunmuştur. Bunun sebebi, verilerde veritabanın desteklediği dil kodlamadaki karakterlerin dışında bir karaktere rastlamasıdır. Bunun en yaygın örneği 8 bitlik veriyi SQL_ASCII veritabanında saklamasıdır.";
    t[752] = "Error disabling autocommit";
    t[753] = "autocommit'i devre dışı bırakma sırasında hata";
    t[754] = "Ran out of memory retrieving query results.";
    t[755] = "Sorgu sonuçları alınırken bellek yetersiz.";
    t[756] = "Returning autogenerated keys is not supported.";
    t[757] = "Otomatik üretilen değerlerin getirilmesi desteklenememktedir.";
    t[760] = "Operation requires a scrollable ResultSet, but this ResultSet is FORWARD_ONLY.";
    t[761] = "İşlem, kaydırılabilen ResultSet gerektirir, ancak bu ResultSet FORWARD_ONLYdir.";
    t[762] = "A CallableStatement function was executed and the out parameter {0} was of type {1} however type {2} was registered.";
    t[763] = "CallableStatement çalıştırıldı, ancak {2} tipi kaydedilmesine rağmen döndürme parametresi {0} ve tipi {1} idi.";
    t[764] = "Unable to find server array type for provided name {0}.";
    t[765] = "Belirtilen {0} adı için sunucu array tipi bulunamadı.";
    t[768] = "Unknown ResultSet holdability setting: {0}.";
    t[769] = "ResultSet tutabilme ayarı geçersiz: {0}.";
    t[772] = "Transaction isolation level {0} not supported.";
    t[773] = "Transaction isolation level {0} desteklenmiyor.";
    t[774] = "Zero bytes may not occur in identifiers.";
    t[775] = "Belirteçlerde sıfır bayt olamaz.";
    t[776] = "No results were returned by the query.";
    t[777] = "Sorgudan hiç bir sonuç dönmedi.";
    t[778] = "A CallableStatement was executed with nothing returned.";
    t[779] = "CallableStatement çalıştırma sonucunda veri getirilmedi.";
    t[780] = "wasNull cannot be call before fetching a result.";
    t[781] = "wasNull sonuç çekmeden önce çağırılamaz.";
    t[784] = "Returning autogenerated keys by column index is not supported.";
    t[785] = "Kolonların indexlenmesi ile otomatik olarak oluşturulan anahtarların döndürülmesi desteklenmiyor.";
    t[786] = "This statement does not declare an OUT parameter.  Use '{' ?= call ... '}' to declare one.";
    t[787] = "Bu komut OUT parametresi bildirmemektedir.  Bildirmek için '{' ?= call ... '}' kullanın.";
    t[788] = "Can''t use relative move methods while on the insert row.";
    t[789] = "Insert kaydı üzerinde relative move method kullanılamaz.";
    t[790] = "A CallableStatement was executed with an invalid number of parameters";
    t[791] = "CallableStatement geçersiz sayıda parametre ile çalıştırıldı.";
    t[792] = "Connection is busy with another transaction";
    t[793] = "Bağlantı, başka bir transaction tarafından meşgul ediliyor";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 397) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 395) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 794)
        idx -= 794;
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 794 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 794);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 794 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
