package nomeMio.studentiEsercizio;

import java.util.ArrayList;

public class Studente {
	
	private String matricola;
	private String nome;
	private String cognome;
	private ArrayList<String> esami;
	 
	
	public Studente(String matricola, String nome, String cognome) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.esami = new ArrayList<>();
	}

	

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

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
	
	public ArrayList<String> getEsami() {
        return esami;
    }

    public void setEsami(ArrayList<String> esami) {
        esami.add("");
    	this.esami = esami;
    }

    public void aggiungiEsame(String esame) {
        this.esami.add(esame);
    }

	@Override
	public String toString() {
		if(esami.size()!=0) {
			return "Studente: matricola= " + matricola + ", nome= " + nome + ", cognome= " + cognome +
					", esami= "+esami +";";
		} else {
			return "Studente: matricola= " + matricola + ", nome= " + nome + ", cognome= " + cognome +
					";";
		}
		
	}
	
	
	
	

}
