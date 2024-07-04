package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_comms")
public class Commission {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int queue;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;


    public int getQueue() {
        return queue;
    }
    public void setQueue(int queue) {
        this.queue = queue;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    } 

}
