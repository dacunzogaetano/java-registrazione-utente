package jana.reg;

public class Utente {
	
	/* Creare una classe Utente con attributi nome, cognome, email, password ed età.
	Aggiungere un costruttore con parametri e metodi getter e setter.
	Implementare dei metodi di validazione in modo che:
	- email contenga un carattere @ e un .
	- password sia lunga tra 8 e 12 caratteri
	- età sia maggiore di 18 anni
	In caso i parametri non siano validi, impedire che vengano valorizzati gli attributi nei metodi e nel costruttore, sollevando opportune eccezioni. */
	
	//attributi
	
	String nome, cognome, email, password;
	int eta;
	
	//costruttori
	
	public Utente (String nome, String cognome, String email, String password, int eta) throws Exception {
		
		// aggiungere eccezione all' email
		if (!(email.contains("@"))) {
		      throw new Exception("email non contiene la chiocciola");
		    } else if (!(email.contains("."))) {
		    	throw new Exception("email non contiene un punto");
		    }
		// aggiungere eccezione alla password
		
		
		//aggiungere eccezione all'eta
		if (eta < 18) {
			throw new Exception("Non hai raggiunto i 18 anni, vai via");
		}
		
		
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
	}
	
	//getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	//metodo concatenare parametri utente
	
	public String toString() {
		return "Nome e Cognome: "+ nome + " " + cognome + "\n" + "Email, password ed eta: " + email + " " + password + " " + eta;
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
