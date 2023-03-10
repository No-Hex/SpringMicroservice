package com.NoHex.productmicroservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Product")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String productName;

    @Column
    private String productDescription;

    @Column
    private Long unitPrice;

}
