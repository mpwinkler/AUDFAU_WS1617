// Implementierung des "Gaussschen Eliminationsverfahrens" zur Loesung eines
// eindeutigen linearen Gleichungssystems der Form Ax = b wobei die Matrix A
// als long[][] matrix und der Vektor b als long[] vektor uebergeben werden.
//
// Mittels dieser Klasse kann matrix durch iterierte Anwendung der Methoden
// pivotisiere und eliminiere zunaechst in eine Diagonalform gebracht werden,
// bei der die untere/linke Matrix-Haelfte 0 ist.
// Anschliessend ermittelt die Methode loese daraus den Loesungvektor x.
//
// https://de.wikipedia.org/wiki/Gau%C3%9Fsches_Eliminationsverfahren
//
public class GaussschesEliminationsverfahren {
	// ========================================================================
	// Sucht in der matrix ab Zeile position diejenige Zeile max mit dem
	// betragsgroessten Wert in der Spalte position und vertauscht die Zeile
	// max mit der Zeile bei position (sowohl in matrix als auch in vektor).
	// Wenn es mehrere gleichwertige Tauschkandidaten gibt, dann wird der mit
	// dem kleineren Index (in der matrix "weiter oben" stehender) gewaehlt.
	// Tipp: Verwenden Sie Math.abs(x) um den Betrag |x| zu erhalten.
	public static void pivotisiere(long[][] matrix, long[] vektor, int position) {
		// TODO
	}

	// ========================================================================
	// Verwendet die Zeile position als Basis zur Elimination (auf 0 setzen)
	// aller Koeffizienten der Spalte position ab Zeile (position + 1).
	// Alle Eintraege in matrix/vektor ab zeile bzw. spalte (position + 1)
	// muessen entsprechend GANZZAHLIG umgeformt werden.
	// ----- Beispiel mit position == 1: -----
	// matrix[1][1] ist das primaere Pivotelement pA zur Elimination
	// matrix[2][1] bis matrix[matrix.length-1][1] werden eliminiert, und
	// bilden dazu jeweils das sekundaere Pivotelement pB
	// matrix[z][s] (mit z > 1 und s >= 1) werden umgeformt, indem
	// das pA-fache der Zeile z vom pB-fachen der Zeile 1 subrahiert wird.
	public static void eliminiere(long[][] matrix, long[] vektor, int position) {
		// TODO
	}

	// ========================================================================
	// Ermittelt die Loesung des Gleichungssystems, das durch matrix
	// und vektor gegeben ist.
	// Dabei ist hier davon auszugehen, dass die matrix bereits in einer
	// Diagonalform vorliegt, bei der die untere/linke Matrix-Haelfte 0 ist
	// und in der Diagonalen keine 0 vorkommt (die Loesung als eindeutig ist)!
	public static double[] loese(long[][] matrix, long[] vektor) {
		// TODO
		return null;
	}
}