package com.imooc.seataproduct;

import lombok.Data;

import javax.persistence.*;

/**
 * @author: bizy
 * @date: 2021/02/28 16:30
 */
@Data
@Entity
@Table(name = "t_product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private Integer count;
}
