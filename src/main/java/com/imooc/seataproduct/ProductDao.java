package com.imooc.seataproduct;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: bizy
 * @date: 2021/02/28 16:32
 */
public interface ProductDao extends JpaRepository<ProductEntity,Long> {


}
