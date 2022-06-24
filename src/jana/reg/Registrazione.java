package jana.reg;

public class Registrazione {
	
	/* Creare una classe Registrazione con metodo main in cui, tramite Scanner, vengono chieste le informazioni all’utente e si prova a creare un nuovo oggetto Utente.
	Gestire tramite try e catch eventuali errori in fase di creazione in modo che il programma non si interrompa bruscamente ma chieda all’utente di inserire dei dati corretti. */

	public static void main(String[] args) {
		
		try {
			Utente Prova = new Utente("Gaetano", "Dacunzo", "gaet.ano@yahoo", "java", 30);
			
			System.out.println(Prova.toString());
			
		} catch (Exception e) {
			System.out.println("Impossibile creare l'utente");
		      System.out.println(e.getMessage());
			
		      
		}

		
	}

}
