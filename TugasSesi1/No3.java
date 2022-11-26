// No.3
//=========================================================================================================================================
//      Oracle merilis versi baru java yaitu java SE 18. Dalam versi terbaru ini hadir dengan pengecualian penghapusan bebrapa fitur lama, 
// mempertahankan kompabilitas dengan versi platform java yang lebih lama, dan sebagian besar proyek java yang ditulis sebelumnya akan terus
// bekerja tanpa perubahan saat dijalankan denga versi baru. Dalam rilis baru ini menggunakan pengkodean default UTF-8. Java API yang 
// memproses data teks yang disandingkan karakter sekarang akan menggunakan UTF-8 secara default di semua platform. 
//      Perubahan lain yang menonjol adalah dia mendesain ulang implementasi API java.lang.reflect (Core Reflection), dirancang untuk memperoleh 
// informasi tentang metode, bidang dan konstruktor kelas, serta akses ke struktur internal kelas. API java.lang.reflect itu sendiri tidak 
// berubah, tetapi sekarang diimplementasikan menggunakan pengidentifikasian metode yang di sediakan oleh modul java.lang.invoke, alih-alih 
// menggunakan generator bytecore. Perubahan ini memungkinkan untuk menyatukan dan memfasilitasi pemeliharaan implementasi java.lang.reflect 
// dan java.lang.invoke. API baru memungkinkan mengontrol vektorisasi secara eksplisit untuk pemrosesan data paralel. Disisi lain, telah 
// diusulkan implementasi awal kedua dari Foreign Function and Memory API, yang dengannya aplikasi dapat berinteraksi dengan kode dan data 
// di luar waktu proses Java.
    //Perubahan lainnya yang menonjol :
//1.  JavaDoc mendukung tag “@potogan>> untuk meyematkan contoh kerja dan cuplikan kode ke dalam dokumentasi API.
//2.  Tidak di gunakan lagi dan akan di hapus dalam rilis mendatang, mekanisme penyelesaian, serta metode seperti Object.finalize(), Enum.finalize(), Runtime.runfinalization(), dan System.runfinalization().
//3.  Pengumpul sampah ZGC, Serial GC dan Parallel GC mereka mendukung deduplikasi string.
//4.  Rilis ini akan menerima pembaruan hingga 2029.