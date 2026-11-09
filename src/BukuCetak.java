public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    public int getOngkir() {
        // Rumus pembulatan ke atas per 500 gram
        int kelipatan500 = (beratGram + 499) / 500;
        return kelipatan500 * 5000;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() + getOngkir();
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Cetak\t" + getJudul() + "\t" + getPenulis() + "\t" + formatRupiah(getHarga()) + "\t" + beratGram + " gram");
        System.out.println("Harga\t\t\t: " + formatRupiah(getHarga()));
        System.out.println("Keterangan\t: " + beratGram + " gram, ongkir " + formatRupiah(getOngkir()));
        System.out.println("Harga akhir\t: " + formatRupiah(hargaAkhir()));
        System.out.println();
    }
}