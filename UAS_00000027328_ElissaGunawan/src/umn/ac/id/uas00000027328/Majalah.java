package umn.ac.id.uas00000027328;

public class Majalah extends MediaPromosi{
	private int luas;
	private String letak, bidang;
	
	public Majalah() {}
	public Majalah(String nama, int harga, int luas, String letak, String bidang) {
		super(nama, harga);
		this.luas = luas;
		this.letak = letak;
		this.bidang = bidang;
	}
	public int getLuas() {
		return luas;
	}
	public String getLetak() {
		return letak;
	}
	public String getBidang() {
		return bidang;
	}
	public int getPay() {
		return getHarga() * luas;
	}
}
