package com.jsr.SpringBootMySQL.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import  com.jsr.SpringBootMySQL.Entity.OrderEntity;
import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "Customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="customer_id")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber;

    @OneToMany(mappedBy ="customer", cascade =  CascadeType.ALL)
    private List<OrderEntity> orders;

}
