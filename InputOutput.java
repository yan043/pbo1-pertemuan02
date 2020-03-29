import java.util.Scanner;

public class InputOutput{
	public static void main (String [] args){
	Scanner scanner = new Scanner (System.in);
	String nama;
	int jumlahSks;
	double IPK;


	System.out.println("Masukkan nama anda: ");
	nama = scanner.nextLine();
	System.out.println("Hai, "+nama);


	System.out.println("Masukan jumlah SKS yang sudah ditempuh: ");
	jumlahSks = scanner.nextInt();

	System.out.println("Masukan IPK Sementara: ");
	IPK = scanner.nextDouble();

	double jumlah = IPK * jumlahSks;
	System.out.println("Total Nilai = "+jumlah);
	}
}