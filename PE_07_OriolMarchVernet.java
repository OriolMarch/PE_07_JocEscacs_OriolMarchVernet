import java.util.Scanner;

public class PE_07_OriolMarchVernet {

    //Constants
    static final int SIZE = 8;
    static final char EMPTY = '.';

    // Estat del joc
    char[][] tauler = new char[SIZE][SIZE];
    int jugadorActual; // 0 = blanques, 1 = negres


    // Historial
    int numJugades;
    String[] historial = new String[150];

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
    PE_07_OriolMarchVernet p = new PE_07_OriolMarchVernet();
    p.principal();

    }

    // Tauler 8x8
    // Peces: rei, reina, torre, alfil, cavall, peó
    // jugador actual = blanques

    public void principal() {
       iniciarJoc();
       mostrarTauler();

         while (true) {
           
            // Demanar jugada al jugador actual
            // Validar jugada
            // Actualitzar tauler
            // Comprovar si hi ha escac i mat
            // Canviar jugador actual
            numJugades++;
         }
    }

    public void iniciarJoc() {
        iniciarTauler();
        colocarPecesInicials();
        jugadorActual = 0; // 0 = blanques, 1 = negres
        numJugades = 0;
    }

    public void iniciarTauler() {
       for (int f = 0; f < SIZE; f++) {
          for (int c = 0; c < SIZE; c++) {
             tauler[f][c] = EMPTY;
          }
       }
    }

    public void colocarPecesInicials() {
       // Negres fila 0 i 1.
       tauler[0][0] = 't'; tauler[0][1] = 'c'; tauler[0][2] = 'a'; tauler[0][3] = 'd';
       tauler[0][4] = 'r'; tauler[0][5] = 'a'; tauler[0][6] = 'c'; tauler[0][7] = 't';

       for(int c = 0; c < SIZE; c++){
        tauler[1][c] = 'p';
       }

       tauler[7][0] = 'T'; tauler[7][1] = 'C'; tauler[7][2] = 'A'; tauler[7][3] = 'D';
       tauler[7][4] = 'R'; tauler[7][5] = 'A'; tauler[7][6] = 'C'; tauler[7][7] = 'T';
       for(int c = 0; c < SIZE; c++){
        tauler[6][c] = 'P';
       }
    }

    public void mostrarTauler() {
       System.out.println();
        
    }

    public void mostrarAjuda(){
    System.out.println("---------- AJUDA/HELP ----------");
    System.out.println("mou e2 e4   -> mou una peça d'e2 a e4");
    System.out.println("ajuda       -> mostra aquesta ajuda");
    System.out.println("rendir-se   -> acaba la partida");
    System.out.println("Regles dels escacs -> Busca Google");
    System.out.println("---------------------------");
    }

}