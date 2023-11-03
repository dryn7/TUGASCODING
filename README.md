 # TUGAS CODING

+ ## A. _Project Overview_
+ Bahasa pemrograman, atau sering diistilahkan juga dengan bahasa komputer atau bahasa pemrograman komputer, adalah instruksi standar untuk memerintah komputer. Bahasa pemrograman ini merupakan suatu himpunan dari aturan sintaks dan semantik yang dipakai untuk mendefinisikan program komputer. Bahasa pemrograman tentunya memiliki fungsi untuk membuat suatu pemrogrman yang meliputi berbagai hal yang mencakup pengembangan perangkat lunak, pembuatan aplikasi, pengaturan sistem, dan otomatisasi proses. dalam pembuatan pemrograman tentunya sangat perlu memahami tipe data tiap bahasa pemrograman, dibawah ini merupakan tugas mata kuliah coding yaitu membuat sebuah pemrograman dengan tipe data yang telah di pelajari yaitu bahasa pemrograman Java.

+ ## B. _TUGAS_
+ Tugas coding kali ini yaitu membuat beberapa program yaitu sebagai berikut:
+ 1.Program Perulangan sampai 100
+ 2.Program bebas dengan menggunakan tipe data if else dalam perulangan while
+ 3.Program menetukan zodiac
+ 4.program dengan menggunakan tipe data array

+ ## 1. _Program Perulangan Sampai 100_
+ program perulangan sampai 100 ini menampilkan output angka 1 sampai 9 dan dilanjutkan dengan nama diri hingga 100, pada pemrograman ini menggunakan tipe data for dan juga tipe data if else.
+ ### 1.1 _Penjelasan Program Perulangan Sampai 100_
+ package com.tugas.perulangan100; deklarasi paket (package) yang digunakan untuk mengelompokkan kelas-kelas dalam proyek Java, dalam hal ini, program ini berada dalam paket "com.tugas.perulangan100"

+ public class perulangan100 :  upaya untuk membuat sebuah kelas dalam bahasa pemrograman Java dengan nama "perulangan100."

+ public static void main(String[] args) : ini merupakan metode main yang akan dieksekusi saat program dimulai.

+ String name = "I Nyoman Dimas Kresna Adryan"; ini merupakan deklarasi dan inisialisasi variabel name dengan nilai string "I Nyoman Dimas Kresna Adryan." Ini berarti variabel name sekarang menyimpan string tersebut sebagai nilainya. Jadi, name adalah variabel yang menyimpan nama "I Nyoman Dimas Kresna Adryan."

+ for (int i = 0; i <= 100; i++) ; adalah konstruksi perulangan dalam bahasa pemrograman. Ini berarti bahwa Anda akan menjalankan suatu blok kode atau instruksi sebanyak 101 kali, dimulai dari i dengan nilai awal 0 dan akan terus berjalan selama i kurang dari atau sama dengan 100, dengan setiap iterasi i akan bertambah satu.

+ if (i >= 10) ;  sebuah pernyataan kondisional dalam bahasa pemrograman. Ini menguji apakah nilai variabel i lebih besar dari atau sama dengan 10. Jika kondisi ini benar (true), maka blok kode di dalam if akan dijalankan. Jika kondisi ini salah (false), maka blok kode di dalam if akan dilewati.

+ System.out.println(name); pada kondisi ini, jika true maka Kode "System.out.println(name);" dalam bahasa pemrograman Java digunakan untuk mencetak (menampilkan) nilai dari variabel name ke layar (konsol). Dalam konteks ini, kode tersebut akan mencetak (menampilkan) string "I Nyoman Dimas Kresna Adryan" (nilai yang tersimpan dalam variabel name) ke layar.

+ else{ ; dalam pernyataan kondisional ini untuk mengeksekusi kode jika kondisi yang terkandung dalam "if" sebelumnya adalah salah.

+ System.out.println(i); pada kondisi ini akan menampilkan (print) nilai variabel i ke layar pada saat program dieksekusi. Ini berguna untuk melihat nilai i atau hasil dari suatu perhitungan atau operasi dalam program.

+ Ketika program ini di run akan menghasilkan urutan angka dari 1 - 9 lalu di lanjutkan dengan nama diri sampai 100.

+ ## 2. _Program bebas dengan menggunakan tipe data if else dalam perulangan while_
+ Pada program if else dengan perulangan while kali ini saya membuat pemrograman menentukan angka ganjil dan genap sesuai dengan batas angka yang di inginkan dengan mengisi data batas bawah dan batas atas.
+ ### 2.1 _Penjelasan Program bebas dengan menggunakan tipe data if else dalam perulangan while_
+ package com.tugas.ifelsewhile; : deklarasi paket (package) yang digunakan untuk mengelompokkan kelas-kelas dalam proyek Java, dalam hal ini, program ini berada dalam paket "com.tugas.ifelsewhile".

+ import java.util.Scanner; : digunakan untuk mengimpor kelas Scanner dari pustaka Java java.util, yang memungkinkan untuk membaca masukan dari pengguna dalam program yang dibuat.
  
+ public class ifelsewhile { : upaya untuk membuat sebuah kelas dalam bahasa pemrograman Java dengan nama "ifelsewhile".

+ public static void main(String[] args) { : ini merupakan metode main yang akan dieksekusi saat program dimulai.

+ Scanner input = new Scanner(System.in); : digunakan untuk membuat objek Scanner yang akan digunakan untuk mengambil masukan dari pengguna melalui konsol, digunakan untuk membuat objek Scanner yang akan digunakan untuk mengambil masukan dari pengguna melalui konsol

+ System.out.println("batas bawah ="); : perintah untuk mencetak (menampilkan) teks "batas bawah =" ke layar atau konsol.
  
+ int batasbawah = input.nextInt(); : digunakan untuk membaca input integer dari pengguna dan menyimpannya dalam variabel batasbawah.

+ System.out.println("batas atas  ="); perintah untuk mencetak (menampilkan) teks "batas atas =" ke layar atau konsol.
  
+ int batasatas = input.nextInt(); digunakan untuk membaca input integer dari pengguna dan menyimpannya dalam variabel batasatas.

+ int angka = batasbawah; : enginisialisasi variabel angka dengan nilai dari variabel batasbawah. Dengan ini, nilai yang telah dibaca dan disimpan di dalam batasbawah sekarang disalin ke dalam variabel angka. 

+ while (angka<=batasatas) { : berarti bahwa selama nilai variabel angka kurang dari atau sama dengan nilai batasatas, blok kode yang berada di dalam pernyataan while akan terus dieksekusi secara berulang. Ketika kondisi tersebut tidak lagi benar (false), perulangan akan berhenti, dan eksekusi program akan melanjutkan di luar pernyataan while.

+ if (angka % 2 == 0){ : digunakan untuk memeriksa apakah nilai variabel angka adalah bilangan genap dengan menggunakan operator modulus (%).

+ System.out.println( "angka "+ angka + " adalah bilangan genap"); } : jika kondisi sebelumnya "if (angka % 2 == 0)" benar, maka pesan "angka [nilai angka] adalah bilangan genap" akan ditampilkan di layar, menggantikan [nilai angka] dengan nilai variabel angka yang sesungguhnya.

+ else{ : dalam pernyataan kondisional ini untuk mengeksekusi kode jika kondisi yang terkandung dalam "if" sebelumnya adalah salah.

+ System.out.println("angka "+ angka + " adalah bilangan ganjil" ); } : jika kondisi sebelumnya "if (angka % 2 == 0)" salah, maka pesan "angka [nilai angka] adalah bilangan ganjil" akan ditampilkan di layar, menggantikan [nilai angka] dengan nilai variabel angka yang sesungguhnya.
                
angka++; : meningkatkan nilai variabel angka sebesar satu. Digunakan dalam perulangan untuk menggerakkan iterasi ke nilai selanjutnya.

+ Ketika program ini di run, program akan menghasilkan output pengisian data angka batas bawah dan batas atas, ketika sudah di isi maka data akan di proses dan menghasilkan urutan data dari batasan bawah hingga batasan atas dengan keterangan angka tersebut genap atau pun ganjil.

+ ## _Program Menetukan Zodiac_
+ Program menentukan zodiac ini merupakan program untuk mengetahui apa zodiac yang dimiliki oleh pengakses program, dengan menggunakan tipe data if else dan else if pengakses akan mengisi nama, tanggal, dan bulan kelahiran untuk menemukan apa zodiac yang dimilikinya.
  
+ ### _Penjelasan Progam Menentukan Zodiac_
+ package com.tugas.zodiak; :  deklarasi paket (package) yang digunakan untuk mengelompokkan kelas-kelas dalam proyek Java, dalam hal ini, program ini berada dalam paket "com.tugas.zodiak".

+ import java.util.Scanner; : digunakan untuk mengimpor kelas Scanner dari pustaka Java java.util, yang memungkinkan untuk membaca masukan dari pengguna dalam program yang dibuat.

+ public class zodiak { :  upaya untuk membuat sebuah kelas dalam bahasa pemrograman Java dengan nama "zodiak".
  
+ public static void main(String[] args) { : ini merupakan metode main yang akan dieksekusi saat program dimulai.

+  System.out.println("nama ="); : pernyataan yang mencetak (menampilkan) pesan "nama =" ke layar atau konsol. Pesan ini digunakan untuk memberikan petunjuk kepada pengguna bahwa mereka diharapkan untuk memberikan masukan yang berkaitan dengan "nama" setelah pesan ini muncul.

+ String nama = input.next(); : untuk membaca masukan dari pengguna dan menyimpannya dalam variabel nama sebagai string.

+ System.out.println("tanggal lahir"); :  pernyataan yang mencetak (menampilkan) pesan "tanggal lahir" ke layar atau konsol. Pesan ini digunakan untuk memberikan petunjuk kepada pengguna bahwa mereka diharapkan untuk memberikan masukan yang berkaitan dengan "tanggal" setelah pesan ini muncul.

+ int tanggal = input.nextInt(); digunakan untuk membaca masukan dari pengguna berupa angka bulat (integer) dan menyimpannya dalam variabel tanggal.
  
+ System.out.println("bulan lahir"); : pernyataan yang mencetak (menampilkan) pesan "bulan lahir" ke layar atau konsol. Pesan ini digunakan untuk memberikan petunjuk kepada pengguna bahwa mereka diharapkan untuk memberikan masukan yang berkaitan dengan "bulan" setelah pesan ini muncul.

+ int bulan = input.nextInt(); : digunakan untuk membaca masukan dari pengguna berupa angka bulat (integer) dan menyimpannya dalam variabel tanggal.

+ if (bulan == 3 & tanggal >= 21) { : memeriksa apakah nilai bulan adalah Maret (3) dan nilai tanggal adalah 21 atau lebih besar. Jika kedua kondisi ini benar (true), maka blok kode dalam pernyataan "if" akan dijalankan.
+ System.out.println("Zodiak kamu adalah = Aries"); : pernyataan yang mencetak (menampilkan) pesan "Zodiak kamu adalah = Aries" ke layar atau konsol. Pesan ini tampaknya digunakan untuk memberikan informasi kepada pengguna bahwa zodiak mereka adalah "Aries" berdasarkan kondisi atau perhitungan yang ada dalam program.

+ else if (bulan == 4 & tanggal <= 19) { : memeriksa apakah nilai bulan adalah April (4) dan nilai tanggal adalah 19 atau kurang. Jika kedua kondisi ini benar (true), maka blok kode dalam pernyataan "else if" akan dijalankan.

+ System.out.println("Zodiak kamu adalah = Aries"); : mencetak (menampilkan) pesan "Zodiak kamu adalah = Aries" ke layar atau konsol. Pesan ini digunakan untuk memberitahu pengguna bahwa zodiak mereka adalah "Aries" berdasarkan kondisi yang diuji dalam pernyataan "if" atau "else if" sebelumnya.

+ Ulang tipe data else if tersebut hingga 12 zodiak terpenuhi dengan batas tanggal bulan yang benar setiap zodiac nya

+ Setelah selesai membuat program, ketika di run output akan meminta data nama, tanggal, dan bulan lahir, setelah di isi data dengan benar maka zodiac mu akan muncul.

+ ## _Program Tipe Data Array_
+ Pada pembuatan program menggunakan tipe data array kali ini saya membuat program yang menghasilkan hasil klasemen 5 besar Premiere League 2022/2023 dengan menggunakan String dan perulangan for.

+ ### _Penjelasan Program Tipe Data Array_
+ package com.tugas.dataArray; :  deklarasi paket (package) yang digunakan untuk mengelompokkan kelas-kelas dalam proyek Java, dalam hal ini, program ini berada dalam paket " com.tugas.dataArray".

+ public class dataArray { :  upaya untuk membuat sebuah kelas dalam bahasa pemrograman Java dengan nama "dataArray".

+ public static void main(String[] args) { : ini merupakan metode main yang akan dieksekusi saat program dimulai.

+ System.out.println("KELASEMEN PREMIERE LEAGUE 2022/2023"); : pernyataan yang mencetak (menampilkan) teks "KELASEMEN PREMIERE LEAGUE 2022/2023" ke layar atau konsol. Ini adalah pesan yang digunakan untuk menampilkan informasi tentang klasemen atau posisi dalam kompetisi sepak bola Premier League untuk musim 2022/2023.

+ String[] timbola = {"Manchester City", "Arsenal", "Mancheter United", "Newcastle", "Liverpool" }; :  deklarasi dan inisialisasi sebuah array yang berisi daftar nama tim sepak bola.

+ int a = 0; : pernyataan yang mendeklarasikan dan menginisialisasi variabel a dengan nilai 0. Dengan ini, variabel a sekarang memiliki nilai awal 0. Variabel a adalah tipe data integer (bilangan bulat) yang dapat digunakan dalam program untuk menyimpan nilai numerik.

+. a++; : meningkatkan nilai variabel angka sebesar satu. Digunakan dalam perulangan untuk menggerakkan iterasi ke nilai selanjutnya.

+ for (int i = 0; i < timbola.length; i++) { : digunakan untuk mengulangi operasi sejumlah elemen dalam array "timbola". Dalam setiap iterasi, variabel "i" akan meningkat satu demi satu untuk mengakses elemen-elemen dalam array tersebut.

+ System.out.println(a + "." +timbola[i]); : mencetak nomor/indeks (variabel a), tanda titik, dan nama tim sepak bola (dari array timbola) dalam format yang sesuai. Misalnya, "1. Manchester City", "2. Arsenal", dan seterusnya, tergantung pada nilai variabel a dan isi array timbola.

+ Setelah pembuatan program selesai, ketika di run output akan menghasilkan judul "Klasemen Premiere League 2022/2023" dengan urutan team yang sudah di data dan di urutkan dari urutan 1 hingga 5.

+ ## _Daftar Pustaka_
+  [1] [Muhardian A. 2016. _BELAJAR JAVA : MENGGUNAKAN ARRAY UNTUK MENYIMPAN BANYAK HAL_. Retrieved November 1, 2023. https://www.petanikode.com/java-array/.]
+  [2] [Yustika G. 2023. _12 RASI BINTANG ZODIAK, ELEMEN, DAN KARAKTERISTIK NYA_. Retrieved November 1, 2023. https://www.orami.co.id/magazine/rasi-bintang-zodiak?page=all.]
+   [3] [Muhardian A. 2016. _BELAJAR JAVA : MEMAHAMI 3 BENTUK PERCABANGAN DALAM JAVA_. Retrieved November 1, 2023. https://www.petanikode.com/java-percabangan/.]
+   [4] [Muhadian A. 2016. _BELAJAR JAVA: MEMAHAMI 2 JENIS PERULANGAN DALAM JAVA_. Retrieved November 1, 2023. https://www.petanikode.com/java-perulangan/]
        
  
