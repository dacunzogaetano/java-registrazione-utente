package jana.reg;

import java.util.Scanner;

public class Registrazione {
	
	/* Creare una classe Registrazione con metodo main in cui, tramite Scanner, vengono chieste le informazioni all’utente e si prova a creare un nuovo oggetto Utente.
	Gestire tramite try e catch eventuali errori in fase di creazione  */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		boolean ciclo = true; 
		
		do {
			try {
				System.out.println("Inserisci il tuo nome");
				String nome = scan.nextLine();
			
				System.out.println("Inserisci il tuo cognome");
				String cognome = scan.nextLine();
			
				System.out.println("Inserisci una email che contenga almeno un . ed una @");
				String email = scan.nextLine();
			
				System.out.println("Inserisci una password compresa tra 8 e 12 caratteri");
				String password = scan.nextLine();
			
				System.out.println("Inserisci la tua età, che deve essere di almeno 18 anni");
				int eta = Integer.parseInt(scan.nextLine());
			
				Utente prova = new Utente(nome, cognome, email, password, eta);
			
				System.out.println(prova.toString());
				ciclo = false;
			
			    }  
			catch (Exception e) {
				System.out.println("Impossibile creare l'utente");
				System.out.println(e.getMessage());
				}     
		  } while (ciclo);

		 scan.close();
	}

}
