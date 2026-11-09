public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
    }

    @Override
    public int hargaAkhir() {
        // Diskon 10%
        return (int) (getHarga() - (getHarga() * 0.10));
    }

    @Override
    public String getLinkUnduh() {
        String formattedTitle = getJudul().toLowerCase().replace(" ", ".");
        return "https://toko.buku/audio/" + formattedTitle;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Audio\t" + getJudul() + "\t" + getPenulis() + "\t" + formatRupiah(getHarga()) + "\t" + durasiMenit + " menit");
        System.out.println("Harga\t\t\t: " + formatRupiah(getHarga()));
        System.out.println("Keterangan\t: " + durasiMenit + " menit, diskon 10%");
        System.out.println("Harga akhir\t: " + formatRupiah(hargaAkhir()));
        System.out.println();
    }
}