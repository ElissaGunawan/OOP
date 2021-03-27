package umn.ac.id.uas00000027328;

public class Order {
	private MediaPromosi mediaPromosi;
	private String bidang;
	private String tanggal;
	private int jangkaWaktu;
	
	public Order() {}
	public Order(String nama, int harga, String bidang, String tanggal, int jangkaWaktu) {
		this.mediaPromosi = new MediaPromosi(nama,harga);
		this.bidang = bidang;
		this.tanggal = tanggal;
		this.jangkaWaktu = jangkaWaktu;
	}
	public MediaPromosi getMediaPromosi() {
		return mediaPromosi;
	}
	public String getBidang() {
		return bidang;
	}
	public String getTanggal() {
		return tanggal;
	}
	public int getJangkaWaktu() {
		return jangkaWaktu;
	}
}
