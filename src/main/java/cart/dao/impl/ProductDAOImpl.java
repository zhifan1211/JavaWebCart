package cart.dao.impl;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cart.dao.ProductDAO;
import cart.model.entity.Product;

public class ProductDAOImpl extends BaseDao implements ProductDAO {

	@Override
	public List<Product> findAllProducts() {
		List<Product> products = new ArrayList<Product>();
		
		String sql = "select product_id, product_name, price, gty, image_base64 from product";
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)){
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setPrice(rs.getInt("price"));
				product.setQty(rs.getInt("qty"));
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer productId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
