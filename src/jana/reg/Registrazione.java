package jana.reg;

import java.util.Scanner;

public class Registrazione {
	
	/* Creare una classe Registrazione con metodo main in cui, tramite Scanner, vengono chieste le informazioni all’utente e si prova a creare un nuovo oggetto Utente.
	Gestire tramite try e catch eventuali errori in fase di creazione in modo che il programma non si interrompa bruscamente ma chieda all’utente di inserire dei dati corretti. */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Inserisci il tuo nome");
			String nome = scan.nextLine();
			
			System.out.println("Inserisci il tuo cognome");
			String cognome = scan.nextLine();
			
			System.out.println("Inserisci la tua email");
			String email = scan.nextLine();
			
			System.out.println("Inserisci la tua password");
			String password = scan.nextLine();
			
			System.out.println("Inserisci la tua età");
			int eta = Integer.parseInt(scan.nextLine());
			
			Utente prova = new Utente(nome, cognome, email, password, eta);
			
			System.out.println(prova.toString());
			
		} catch (Exception e) {
			System.out.println("Impossibile creare l'utente");
		      System.out.println(e.getMessage());
			
		      
		}

		 scan.close();
	}

}
