package degişkenler;

public class switch_blok {

	public static void main(String[] args) {
		char grade ='A';
		switch (grade) {
		case 'A': {
			System.out.println("Mükemmel : geçtiniz");
			break;
		}case 'B': {
			System.out.println("Çok güzel : geçtiniz");
			break;
		}case 'C': {
			System.out.println("İyi : geçtiniz");
			break;
		}case 'D': {
			System.out.println("Fena degil : geçtiniz");
			break;
		}case 'F': {
			System.out.println("Malesef kaldınız");
			break;
		}
		default:
			System.out.println("Geçersiz not girdinizz");
		}

	}

}
