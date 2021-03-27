package umn.ac.id.uas00000027328;

public class Baliho extends MediaPromosi{
	private int luas;
	private String letak;
	
	public Baliho() {}
	public Baliho(String nama, int harga, int luas, String letak) {
		super(nama, harga);
		this.luas = luas;
		this.letak = letak;
	}
	public int getLuas() {
		return luas;
	}
	public String getLetak() {
		return letak;
	}
	public int getPay() {
		return getHarga() * luas;
	}
}
