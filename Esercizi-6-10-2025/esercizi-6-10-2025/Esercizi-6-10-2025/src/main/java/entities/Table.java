package entities;

public class Table {
    private int numero;
    private int maxCoperti;
    private TableStatus stato;

    public Table(int numero, int maxCoperti, TableStatus stato) {
        this.numero = numero;
        this.maxCoperti = maxCoperti;
        this.stato = stato;
    }

    public int getNumero() { return numero; }
    public int getMaxCoperti() { return maxCoperti; }
    public TableStatus getStato() { return stato; }

    public void setStato(TableStatus stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Tavolo #" + numero + " (" + maxCoperti + " coperti max) - Stato: " + stato;
    }
}
