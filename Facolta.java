package nomeMio.studentiEsercizio;

import java.util.ArrayList;
import java.util.Scanner;

public class Facolta {
	
	ArrayList<Studente> facolta;
	
	public Facolta() {
		
		facolta = new ArrayList<Studente>(); 
		
	}
	
	public void addStudente(Studente s1) {
		facolta.add(s1);
	}
	
	public void removeStudente(String matricola) {
		int i;
		for(i=0; i<facolta.size(); i++) {
			if(facolta.get(i).getMatricola().equals(matricola)) {
				facolta.remove(i);
			}
		}
	}
	
	public Studente cercaN(String nome, String cognome) {
		Studente s1 = new Studente("", "", "");
		int i=0;
		for(Studente stud: facolta) {
			if(stud.getNome().equals(nome) && stud.getCognome().equals(cognome)) {
				s1=facolta.get(i);
				System.out.println("Trovato");
			} 
			i++;
		}
		return s1;
	}
	
	public void cambiaMatricola(String nome, String cognome) {
		int i;
		String matricola;
		Scanner p = new Scanner(System.in);
		System.out.println("Studente trovato\nInserisci la nuova matricola: ");
		matricola=p.nextLine();
		p.close();
		for(i=0; i<facolta.size(); i++) {
			if(facolta.get(i).getNome().equals(nome) && facolta.get(i).getCognome().equals(cognome)) {
				facolta.get(i).setMatricola(matricola);
			}
		}
		
	}
	
	public void stampa() {
		for(Studente stud: facolta) {
			System.out.println(stud);
		}
	}
	
	public void addEsame(String nome, String cognome, String esame) {
        Studente s1 = cercaN(nome, cognome);
        if (!s1.equals(null)) {
            s1.aggiungiEsame(esame);
        } else {
            System.out.println("Studente non trovato.");
        }
    }
	


}
