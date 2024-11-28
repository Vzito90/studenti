package nomeMio.studentiEsercizio;

import java.util.Scanner;

public class provaStud {
	
	public static void main(String [] args) {
		Studente s1 = new Studente("0123", "giovanni", "rossi");
		Studente s2 = new Studente("1234", "mario", "bianchi");
		Studente s3 = new Studente("2345", "luigi", "verdi");
		
		Facolta f1 = new Facolta();
		
		f1.addStudente(s1);
		f1.addStudente(s2);
		f1.addStudente(s3);
		
		Scanner p= new Scanner(System.in);
		int scelta;
		String nome;
		String cognome;
		String matricola;
		String esame;
		
		do {
			System.out.println("1 per inserire, 2 rimuovi, 3 cambia matricola, 4 add esame, 5 stampa, 0 esci ");
			scelta=p.nextInt();
			
			
			if(scelta==1) {
				System.out.println("Inserisci matricola nome cognome");
				matricola=p.next();
				nome = p.next();
				cognome = p.next();
				f1.addStudente(new Studente(matricola, nome, cognome));
			} else if(scelta == 2) {
				System.out.println("Inserisci matricola da eliminare");
				matricola=p.next();
				f1.removeStudente(matricola);
			} else if(scelta == 3) {
				System.out.println("Inserisci nome cognome");
				nome = p.next();
				cognome = p.next();
				f1.cambiaMatricola(nome, cognome);
			} else if(scelta==4) {
				System.out.println("Inserisci nome cognome esame");
				nome = p.next();
				cognome = p.next();
				esame=p.next();
				f1.addEsame(nome, cognome, esame);
			} else if(scelta==5) {
				f1.stampa();
			}
			
		} while(scelta!=0);
		
		p.close();
	}

}
