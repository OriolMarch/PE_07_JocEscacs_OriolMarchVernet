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

         while (true) {
            mostrarTauler();
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
    }

    public void mostrarTauler() {
       
    }

}