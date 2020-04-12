import koneksi.Database;
import model.Dosen;
import model.Mahasiswa;
import model.MataKuliah;
import model.Universitas;

public class Main{
	public static void main (String [] args){
		System.out.println("Ini Program Main");
		Database.hubungkan();
		Dosen.tampilanInfo();
		Mahasiswa.tampilanInfo();
		MataKuliah.tampilanInfo();
		Universitas.tampilanInfo();
	}
}
