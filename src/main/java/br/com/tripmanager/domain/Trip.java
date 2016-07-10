package br.com.tripmanager.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "trip")
public class Trip {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "destiny") @NotNull
    private String destiny;

    @Column(name = "day_in")
    private Date dayIn;

    @Column(name = "day_out")
    private Date dayOut;

    @Column(name = "price")
    private double price;

    @Column(name = "costumer_ammount")
    private int costumerAmmount;

    @Column(name = "total_profit")
    private long totalProfit;

    @OneToOne(optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "transport_id")
    @PrimaryKeyJoinColumn
    private Transport transport;

    @OneToOne(optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "inn_id")
    @PrimaryKeyJoinColumn
    private Inn inn;

    public Trip() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public Date getDayIn() {
        return dayIn;
    }

    public void setDayIn(Date dayIn) {
        this.dayIn = dayIn;
    }

    public Date getDayOut() {
        return dayOut;
    }

    public void setDayOut(Date dayOut) {
        this.dayOut = dayOut;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCostumerAmmount() {
        return costumerAmmount;
    }

    public void setCostumerAmmount(int costumerAmmount) {
        this.costumerAmmount = costumerAmmount;
    }

    public long getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(long totalProfit) {
        this.totalProfit = totalProfit;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Inn getInn() {
        return inn;
    }

    public void setInn(Inn inn) {
        this.inn = inn;
    }
}
