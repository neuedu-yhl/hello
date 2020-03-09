package com.neusoft.neuedu.dao;

import java.util.List;

import com.neusoft.neuedu.entity.Product;

/**
 * 商品接口
 * @author Neuedu
 *
 */
public interface ProductDao {

	List<Product> queryAllPro();
	
	//添加商品
	int addOneProduct(Product product);
	
	//修改商品状态
	int updateProductStatus(Product product);
	
	
	// 删除商品
	int deleteProductById(Integer proId);
	
}