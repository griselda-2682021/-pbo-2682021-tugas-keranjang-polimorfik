public class BukuDigital extends Buku implements BisaDiunduh {
    private int ukuranMb;

    public BukuDigital(String judul, String penulis, int harga, int ukuranMb) {
        super(judul, penulis, harga);
        this.ukuranMb = ukuranMb;
    }

    @Override
    public int hargaAkhir() {
        // Diskon 20%
        return (int) (getHarga() - (getHarga() * 0.20));
    }

    @Override
    public String getLinkUnduh() {
        String formattedTitle = getJudul().toLowerCase().replace(" ", ".");
        return "https://toko.buku/ebook/" + formattedTitle;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Digital\t" + getJudul() + "\t" + getPenulis() + "\t" + formatRupiah(getHarga()) + "\t" + ukuranMb + " MB");
        System.out.println("Harga\t\t\t: " + formatRupiah(getHarga()));
        System.out.println("Keterangan\t: " + ukuranMb + " MB, diskon 20%");
        System.out.println("Harga akhir\t: " + formatRupiah(hargaAkhir()));
        System.out.println();
    }
}