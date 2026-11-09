public class Tokobuku {
    // Method static untuk menghitung total harga keranjang
    public static int hitungTotal(Buku[] keranjang) {
        int total = 0;
        for (Buku b : keranjang) {
            total += b.hargaAkhir();
        }
        return total;
    }

    public static void main(String[] args) {
        // Ketentuan: Uji error instansiasi Buku (dibuat komentar agar bisa di-compile)
        // Buku b = new Buku("X", "Y", 1); // Error karena Buku bersifat abstract

        // Membuat 4 objek buku sesuai data pada tabel soal
        Buku[] keranjang = {
                new BukuCetak("Pemrograman Java", "John Doe", 120000, 750),
                new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400),
                new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 13), // 12.5 atau 13 MB
                new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240)
        };

        System.out.println("=========== KERANJANG ============");
        for (Buku b : keranjang) {
            b.tampilkanInfo();
        }

        System.out.println("----------------------------------------");
        System.out.println("Total bayar\t: " + java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("id", "ID")).format(hitungTotal(keranjang)).replace("Rp", "Rp "));

        System.out.println("\n=========== LINK UNDUH ===========");
        for (Buku b : keranjang) {
            // Memeriksa apakah buku mengimplementasikan interface BisaDiunduh tanpa instanceof (atau menggunakan polimorfisme interface)
            if (b instanceof BisaDiunduh) {
                BisaDiunduh unduhan = (BisaDiunduh) b;
                System.out.println(unduhan.getLinkUnduh());
            }
        }
    }
}