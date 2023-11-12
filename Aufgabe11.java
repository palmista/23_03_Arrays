/*
 * Schreibe wieder sinnvollen Testcode zu jeder Aufgabe. Du wirst dabei häufig System.out.println(Arrays.toString()) verwenden.
 * Wenn ein Array verändert werden soll, dann ist in der Regel gemeint, dass die Methode das veränderte Array als 
 * return-Wert zurückgibt.
 * Aufgaben mit einem + sind grundlegend und müssen von allen gelöst werden.
 * 
 * +a) Bonnie Brain hat die Einträge in der Piraten-Buchhaltung umgekehrt chronologisch statt chronologisch sortiert. 
 * Schreibe eine Methode invert(), die die Reihenfolge der Elemente in einem int-Array input umdreht.
 * 
 * +b) Schreibe ein Programm find(String s, String[] words), das einen String s in einem String-Array words sucht und 
 * den Index des ersten Fundes zurückgibt. Bei Nichtfund soll -1 zurückgegeben werden. Bitte von Hand programmieren 
 * und nicht auf die Java-Library zurückgreifen ;-)
 * 
 * c) Schreibe ein Programm sort(), das die Werte in einem double-Array aufsteigend sortiert. Eine ineffiziente, 
 * aber einfache Möglichkeit ist, benachbarte Elemente zu betrachten und jeweils zu vertauschen, wenn sie falsch 
 * zu einander stehen.
 *    Zusatzaufgabe: Implementiere ein effizientes Sortierverfahren (oder mehrere).
 * 
 * d) Berge zeichnen: Für die nächste Schatzsuche müssen Bonnie Brain und die Crew über Berge und Hügel gehen. Sie
 * bekommt vorher die Höhenmeter mitgeteilt und möchte sich vorher einen Eindruck vom Profil machen.
 *     Schreibe eine Methode printMountain(), die ein int-Array mit (nichtnegativen) Höhenmetern in eine 
 *     ASCII-Darstellung wie folgt umsetzt:
 * Das Array {0,1,1,2,2,3,3,3,4,5,4,3,2,2,1,0} soll dargestellt werden als eine der folgenden Darstellungen 
 * (links Einstiegsvariante, rechts fortgeschrittene Variante). Die Zahlen links müssen nicht zwingend dargestellt werden.
 * 5          *                  ^
 * 4         * *                / \
 * 3      ***   *            --/   \
 * 2    **       **        -/       -\
 * 1  **           *     -/           \
 * 0 *              *   /              \
 * 
 * +e) Ein magisches Quadrat ist ein Zahlenquadrat, in dem die Summe jeder Zeile, jeder Spalte und der beiden Diagonalen 
 * jeweils den gleichen Wert ergibt. Schreibe ein Methode isMagicSquare, die quadratisches Array von ganzen Zahlen als 
 * Argument entgegennimmt und zurückgibt, ob das Array ein magisches Quadrat ist.
 * { { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        } ist ein magisches Quadrat
 * 
 * f) Mini-Sudoku auf gültige Lösung prüfen: Da Überfälle ziemlich anstrengend sind, braucht Captain CiaoCiao einen 
 * Ausgleich und beschäftigt sich mit Sudoku. Das Sudoku-Gitter lässt sich in neun 3x3-Blöcke zerlegen. In jedem 
 * dieser Blöcke muss jede Zahl von 1 bis 9 genau einmal vorkommen.
 *    Schreibe ein Programm isValidMiniSudoku, das ein zweidimensionales Array mit neun Elementen daraufhin testet, 
 * ob alle Zahlen von 1 bis 9 vorkommen.
 *    Beispiel:     int[][] array = {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                    }
      ist eine gültige Sudoku-Belegung, int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 8 } } nicht.
      Das Programm soll true oder false zurückgeben und im Falle von false auf der Konsole ausgeben, was der Fehler 
      ist (im zweiten Beispiel etwa "missing: 9").
 * 
 * g) Conways Game of Life: Das Spiel basiert auf der folgenden Idee: Die Spielwelt besteht aus einer Matrix von Zellen, 
 * die entweder leben oder tot sind. Jede Zelle hat 8 Nachbarn, Randzellen haben die Zellen des gegenüberliegenden Randes 
 * als Nachbarn. Aus der momentanen Zellenpopulation kann man die Population in der nächsten Generation durch folgende 
 * Regeln berechnen:
 *    - Hat eine tote Zelle genau 3 lebende Nachbarn, erwacht sie zum Leben.
 *    - Hat eine lebende Zelle 2 oder 3 lebende Nachbarn, bleibt sie am Leben.
 *    - Alle anderen Zellen sterben.
 * Aufgabe:
 *    - Programmiere die Aufgabe in einer separaten Klasse GameOfLife.
 *    - Schreibe eine Methode createRandom(), das zwei Zahlen n und m entgegennimmt und eine zufällig gefüllte 
 *      boolean-Matrix der Dimension m*n zurückgibt.
 *    - Schreibe eine Methode getNextGeneration(), das eine zweidimensionale boolean-Matrix cells entgegennimmt und aus 
 *      der übergebenen Matrix die Matrix der nächsten Generation berechnet und zurückgibt.
 *    - Schreibe eine Methode printCells(), das eine zweidimensionale boolean-Matrix cells entgegennimmt und auf der 
 *      Konsole darstellt. Dabei sollen lebende Zellen mit @ dargestellt werden und tote entweder mit Leerschlag oder 
 *      mit einem Punkt.
 *    - Die main-Methode soll Zahlen m, n und numberOfGenerations definieren (wähle selbst sinnvolle Werte), eine 
 *      m*n-Generation erzeuge und sie auf der Konsole ausgeben. Danach soll sie numberOfGenerations Generationen 
 *      berechnen und ebenfalls ausgeben. Zwischen den Generationen kann mit TimeUnit.SECONDS.sleep(1); eine Pause 
 *      gemacht werden.
 */

public class Aufgabe11 {

}