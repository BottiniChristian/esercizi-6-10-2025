package entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int numeroOrdine;
    private OrderStatus stato;
    private int numCoperti;
    private LocalDateTime oraAcquisizione;
    private Table tavolo;
    private List<Item> elementi; // Item è un’interfaccia comune a Pizza, Drink, Topping
    private BigDecimal prezzoCoperto;

    public Order(int numeroOrdine, OrderStatus stato, int numCoperti,
                 Table tavolo, List<Item> elementi, BigDecimal prezzoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.numCoperti = numCoperti;
        this.oraAcquisizione = LocalDateTime.now();
        this.tavolo = tavolo;
        this.elementi = elementi;
        this.prezzoCoperto = prezzoCoperto;
    }

    public BigDecimal getTotale() {
        BigDecimal totale = BigDecimal.ZERO;
        for (Item i : elementi) {
            totale = totale.add(i.getPrice());
        }
        totale = totale.add(prezzoCoperto.multiply(new BigDecimal(numCoperti)));
        return totale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordine #").append(numeroOrdine).append(" - ").append(stato)
                .append("\nTavolo: ").append(tavolo)
                .append("\nCoperti: ").append(numCoperti)
                .append("\nOra: ").append(oraAcquisizione)
                .append("\n\nElementi ordinati:\n");

        for (Item i : elementi) {
            sb.append(" - ").append(i.getName())
                    .append(" ..... €").append(i.getPrice()).append("\n");
        }

        sb.append("\nTotale: €").append(getTotale());
        return sb.toString();
    }
}
