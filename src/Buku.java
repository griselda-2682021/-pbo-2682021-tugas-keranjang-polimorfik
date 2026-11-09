public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    // Method untuk mengambil harga dasar (pengganti akses langsung field harga)
    public int getHarga() {
        return harga;
    }

    // Method abstract sesuai ketentuan
    public abstract int hargaAkhir();
    public abstract void tampilkanInfo();

    protected String formatRupiah(int nominal) {
        java.text.NumberFormat formatRupiah = java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("id", "ID"));
        return formatRupiah.format(nominal).replace("Rp", "Rp ");
    }
}