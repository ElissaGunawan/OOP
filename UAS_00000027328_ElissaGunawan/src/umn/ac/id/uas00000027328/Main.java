package umn.ac.id.uas00000027328;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	static ArrayList<Aktor> aktors = new ArrayList<Aktor>();
	static ArrayList<Celebgram> celebgrams = new ArrayList<Celebgram>();
	static ArrayList<Baliho> balihos = new ArrayList<Baliho>();
	static ArrayList<Majalah> majalahs = new ArrayList<Majalah>();
	static ArrayList<Order> orders = new ArrayList<Order>();
	
	public static void seedDataAktors() {
		aktors.add(new Aktor("Chris Evans", 2000, 30, 170, 60, 100000, "Captain America Lovers"));
		aktors.add(new Aktor("Robert Downey Jr", 2000, 31, 171, 61, 120000, "Iroman Lovers"));
		aktors.add(new Aktor("Chris Hemsworth", 2000, 32, 172, 62, 140000, "Thor Lovers"));
	}
	public static void seedDataCelebgrams() {
		celebgrams.add(new Celebgram("Awkarin", 1000, 25, 165, 45, 100000, "Instagram", "Furnitur"));
		celebgrams.add(new Celebgram("Anya Geraldine", 1000, 26, 166, 46, 120000, "Twitter", "Makanan"));
		celebgrams.add(new Celebgram("Devina Aurel", 1000, 27, 167, 47, 140000, "Youtube", "Tanaman"));
	}
	public static void seedDataBalihos() {
		balihos.add(new Baliho("Baliho Jakarta Pusat", 3000000, 6, "Jakarta Pusat"));
		balihos.add(new Baliho("Baliho Jakarta Barat", 3000000, 8, "Jakarta Barat"));
		balihos.add(new Baliho("Baliho Jakarta Utara", 3000000, 9, "Jakarta Utara"));
	}
	public static void seedDataMajalahs() {
		majalahs.add(new Majalah("Home Decor", 50000, 15, "Halaman 2", "Furnitur"));
		majalahs.add(new Majalah("Sedap", 50000, 18, "Halaman 3", "Makanan"));
		majalahs.add(new Majalah("Otomotif", 50000, 21, "Halaman 4", "Tanaman"));
	}
	public static void mainMenu(){
		System.out.println("---------------------------------------");
		System.out.println("           Wemen Marketing Agent        ");
		System.out.println("---------------------------------------");
		System.out.println("1. Penambahan Media");
		System.out.println("2. Penyewaan Media");
		System.out.println("3. Check Employment / Rental");
		System.out.println("4. Credits");
		System.out.println("5. Exit");
		System.out.println("---------------------------------------");
	}
	public static void menu1() {
		System.out.println("---------------------------------------");
		System.out.println("           Wemen Marketing Agent        ");
		System.out.println("---------------------------------------");
		System.out.println("1. Celebgram");
		System.out.println("2. Majalah");
		System.out.println("---------------------------------------");
	}
	public static void menu2(){
		System.out.println("1. Furnitur");
		System.out.println("2. Makanan");
		System.out.println("3. Tanaman");
		System.out.println("4. Otomotif");
		System.out.println("5. Musik");
		System.out.println("---------------------------------------");
	}
	public static void menu3(){
		System.out.println("---------------------------------------");
		System.out.println("           Wemen Marketing Agent        ");
		System.out.println("---------------------------------------");
		System.out.println("1. Furnitur");
		System.out.println("2. Makanan");
		System.out.println("3. Tanaman");
		System.out.println("4. Otomotif");
		System.out.println("5. Musik");
		System.out.println("---------------------------------------");
	}
	public static void anyKey() {
		Scanner in = new Scanner(System.in);
		System.out.println("Press enter to continue");
		in.nextLine();
	}
	
	public static void main(String[] args) {
		seedDataAktors();
		seedDataCelebgrams();
		seedDataMajalahs();
		seedDataBalihos();
		
		int i;
		Scanner in = new Scanner(System.in);
		while(true) {
			mainMenu();
			System.out.println("Pilih Menu (1-5) : ");
			int pilih = in.nextInt();
			switch(pilih) {
			case 1:
				menu1();
				System.out.println("Pilih Media (1-2) : ");
				int pilih1 = in.nextInt();
				if(pilih1 == 1) {
					menu2();
					System.out.println("Pilih Kategori (1-5) : ");
					int pilih2 = in.nextInt();
					switch(pilih2) {
					case 1:
						System.out.println("Masukkan nama : ");
						String nama = in.next();
						System.out.println("Masukkan umur : ");
						int umur = in.nextInt();
						System.out.println("Masukkan tinggi badan : ");
						int tinggi = in.nextInt();
						System.out.println("Masukkan berat badan : ");
						int berat = in.nextInt();
						System.out.println("Masukkan jumlah followers : ");
						int followers = in.nextInt();
						System.out.println("Masukkan media sosial yang digunakan : ");
						String media = in.next();
						celebgrams.add(new Celebgram(nama, 1000, umur, tinggi, berat, followers, media, "Furnitur"));
						System.out.println("Media berhasil ditambahkan");
						break;
					case 2:
						System.out.println("Masukkan nama : ");
						String nama1 = in.next();
						System.out.println("Masukkan umur : ");
						int umur1 = in.nextInt();
						System.out.println("Masukkan tinggi badan : ");
						int tinggi1 = in.nextInt();
						System.out.println("Masukkan berat badan : ");
						int berat1 = in.nextInt();
						System.out.println("Masukkan jumlah followers : ");
						int followers1 = in.nextInt();
						System.out.println("Masukkan media sosial yang digunakan : ");
						String media1 = in.next();
						celebgrams.add(new Celebgram(nama1, 1000, umur1, tinggi1, berat1, followers1, media1, "Makanan"));
						System.out.println("Media berhasil ditambahkan");
						break;
					case 3:
						System.out.println("Masukkan nama : ");
						String nama2 = in.next();
						System.out.println("Masukkan umur : ");
						int umur2 = in.nextInt();
						System.out.println("Masukkan tinggi badan : ");
						int tinggi2 = in.nextInt();
						System.out.println("Masukkan berat badan : ");
						int berat2 = in.nextInt();
						System.out.println("Masukkan jumlah followers : ");
						int followers2 = in.nextInt();
						System.out.println("Masukkan media sosial yang digunakan : ");
						String media2 = in.next();
						celebgrams.add(new Celebgram(nama2, 1000, umur2, tinggi2, berat2, followers2, media2, "Tanaman"));
						System.out.println("Media berhasil ditambahkan");
						break;
					case 4:
						System.out.println("Masukkan nama : ");
						String nama3 = in.next();
						System.out.println("Masukkan umur : ");
						int umur3 = in.nextInt();
						System.out.println("Masukkan tinggi badan : ");
						int tinggi3 = in.nextInt();
						System.out.println("Masukkan berat badan : ");
						int berat3 = in.nextInt();
						System.out.println("Masukkan jumlah followers : ");
						int followers3 = in.nextInt();
						System.out.println("Masukkan media sosial yang digunakan : ");
						String media3 = in.next();
						celebgrams.add(new Celebgram(nama3, 1000, umur3, tinggi3, berat3, followers3, media3, "Otomotif"));
						System.out.println("Media berhasil ditambahkan");
						break;
					case 5:
						System.out.println("Masukkan nama : ");
						String nama4 = in.next();
						System.out.println("Masukkan umur : ");
						int umur4 = in.nextInt();
						System.out.println("Masukkan tinggi badan : ");
						int tinggi4 = in.nextInt();
						System.out.println("Masukkan berat badan : ");
						int berat4 = in.nextInt();
						System.out.println("Masukkan jumlah followers : ");
						int followers4 = in.nextInt();
						System.out.println("Masukkan media sosial yang digunakan : ");
						String media4 = in.next();
						celebgrams.add(new Celebgram(nama4, 1000, umur4, tinggi4, berat4, followers4, media4, "Musik"));
						System.out.println("Media berhasil ditambahkan");
						break;
					}
				}if(pilih1 == 2) {
					menu2();
					System.out.println("Pilih Kategori (1-5) : ");
					int pilih3 = in.nextInt();
					switch(pilih3) {
					case 1:
						System.out.println("Masukkan nama : ");
						String majalahNama = in.next();
						System.out.println("Masukkan luas : ");
						int majalahLuas = in.nextInt();
						System.out.println("Masukkan letak halaman promosi : ");
						String majalahLetak = in.next();
						majalahs.add(new Majalah(majalahNama, 50000, majalahLuas, majalahLetak, "Furnitur"));
						System.out.println("Media berhasil ditambahkan");
						break;
					case 2:
						System.out.println("Masukkan nama : ");
						String majalahNama1 = in.next();
						System.out.println("Masukkan luas : ");
						int majalahLuas1 = in.nextInt();
						System.out.println("Masukkan letak halaman promosi : ");
						String majalahLetak1 = in.next();
						majalahs.add(new Majalah(majalahNama1, 50000, majalahLuas1, majalahLetak1, "Makanan"));
						System.out.println("Media berhasil ditambahkan");
						break;
					case 3:
						System.out.println("Masukkan nama : ");
						String majalahNama2 = in.next();
						System.out.println("Masukkan luas : ");
						int majalahLuas2 = in.nextInt();
						System.out.println("Masukkan letak halaman promosi : ");
						String majalahLetak2 = in.next();
						majalahs.add(new Majalah(majalahNama2, 50000, majalahLuas2, majalahLetak2, "Tanaman"));
						System.out.println("Media berhasil ditambahkan");
						break;
					case 4:
						System.out.println("Masukkan nama : ");
						String majalahNama3 = in.next();
						System.out.println("Masukkan luas : ");
						int majalahLuas3 = in.nextInt();
						System.out.println("Masukkan letak halaman promosi : ");
						String majalahLetak3 = in.next();
						majalahs.add(new Majalah(majalahNama3, 50000, majalahLuas3, majalahLetak3, "Otomotif"));
						System.out.println("Media berhasil ditambahkan");
						break;
					case 5:
						System.out.println("Masukkan nama : ");
						String majalahNama4 = in.next();
						System.out.println("Masukkan luas : ");
						int majalahLuas4 = in.nextInt();
						System.out.println("Masukkan letak halaman promosi : ");
						String majalahLetak4 = in.next();
						majalahs.add(new Majalah(majalahNama4, 50000, majalahLuas4, majalahLetak4, "Musik"));
						System.out.println("Media berhasil ditambahkan");
						break;
					}
				}
				anyKey();
				break;
			case 2:
				menu3();
				i = 1;
				System.out.println("Pilih Kategori (Gunakan nama) : ");
				String pilih4 = in.next();
				System.out.println("Tanggal mulai(DDMMYYYY) : ");
				String tanggal = in.next();
				System.out.println("Banyak hari penyewaan : ");
				int banyak = in.nextInt();
				System.out.println("---------------------------------------");
				for(int j = 0; j<aktors.size(); j++){
					System.out.println("No : "+ i++);
					System.out.println("Media : Aktor");
					System.out.println("Nama    :"+aktors.get(j).getNama());
					System.out.println("Umur  :"+aktors.get(j).getUmur());
					System.out.println("Tinggi Badan :"+aktors.get(j).getTinggiBadan());
					System.out.println("Berat Badan :"+aktors.get(j).getBeratBadan());
					System.out.println("Jumlah Fans :"+aktors.get(j).getFans());
					System.out.println("Nama Fansclub :"+aktors.get(j).getFanClub());
					System.out.println("Harga :"+aktors.get(j).getPay());
					System.out.println("----------------------------");
				}
				System.out.println("Masukkan nomor media : ");
				int nomor = in.nextInt();
				if(nomor == 1) {
					System.out.println("Masukkan uang untuk pembayaran (uang pas) : ");
					int uang = in.nextInt();
					if(uang == aktors.get(0).getPay()) {
						orders.add(new Order(aktors.get(0).getNama(), aktors.get(0).getPay(), pilih4, tanggal, banyak));
						System.out.println("Pemesanan anda sukses");
					}else {
						System.out.println("Uang tidak mencukupi");
					}
				}if(nomor == 2) {
					System.out.println("Masukkan uang untuk pembayaran (uang pas) : ");
					int uang = in.nextInt();
					if(uang == aktors.get(1).getPay()) {
						orders.add(new Order(aktors.get(1).getNama(), aktors.get(1).getPay(), pilih4, tanggal, banyak));
						System.out.println("Pemesanan anda sukses");
					}else {
						System.out.println("Uang tidak mencukupi");
					}
				}if(nomor == 3) {
					System.out.println("Masukkan uang untuk pembayaran (uang pas) : ");
					int uang = in.nextInt();
					if(uang == aktors.get(2).getPay()) {
						orders.add(new Order(aktors.get(2).getNama(), aktors.get(2).getPay(), pilih4, tanggal, banyak));
						System.out.println("Pemesanan anda sukses");
					}else {
						System.out.println("Uang tidak mencukupi");
					}
				}
				anyKey();
				break;
			case 3:
				int k = 0;
				System.out.println("---------------------------------------");
				System.out.println("           Wemen Marketing Agent        ");
				System.out.println("---------------------------------------");
				for(k = 0; k<orders.size(); k++) {
					if (orders.get(k) != null) {
						System.out.println("No : "+ (k+1));
						System.out.println("Media : Aktor");
						System.out.println("Nama : "+orders.get(k).getMediaPromosi().getNama());
						System.out.println("Tanggal : "+orders.get(k).getTanggal());
						System.out.println("Durasi Kontrak : "+orders.get(k).getJangkaWaktu());
						System.out.println("Harga : "+orders.get(k).getMediaPromosi().getHarga());
						System.out.println("---------------------------------------");
					}
				}
				System.out.println("1. Batalkan Order");
				System.out.println("2. Kembali ke menu utama");
				System.out.println("---------------------------------------");
				System.out.println("Pilih menu (1-2) : ");
				int menu = in.nextInt();
				if(menu == 1) {
					System.out.println("Masukkan nomor yang ingin dibatalkan : ");
					int batal = in.nextInt();
					Date now = new Date();
					Date tanggalOrder = new Date();
					try {
						tanggalOrder = new SimpleDateFormat("ddMMyyyy").parse(orders.get(batal-1).getTanggal());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					if (now.after(tanggalOrder)) {
						System.out.println("Pesanan berhasil dibatalkan");
						orders.remove(batal-1);
					} else {
						System.out.println("Pesanan ini tidak bisa dibatalkan");
					}
					anyKey();
				}if(menu == 2) {
					anyKey();
				}
				break;
			case 4:
				System.out.println("---------------------------------------");
				System.out.println("           Wemen Marketing Agent        ");
				System.out.println("---------------------------------------");				
				System.out.println("Name : Elissa Gunawan");
				System.out.println("NIM : 00000027328");
				System.out.println("---------------------------------------");
				anyKey();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid input");
				anyKey();
				break;
			}
		}
	}

}
