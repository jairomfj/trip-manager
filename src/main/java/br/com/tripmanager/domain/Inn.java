package br.com.tripmanager.domain;

import javax.persistence.*;

@Entity
@Table(name = "transport")
public class Inn {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "address")
    private String address;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "individual_price")
    private double individualPrice;

    @OneToOne(optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    @PrimaryKeyJoinColumn
    private Company company;

    public Inn() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getIndividualPrice() {
        return individualPrice;
    }

    public void setIndividualPrice(double individualPrice) {
        this.individualPrice = individualPrice;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
