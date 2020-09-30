package ar.com.educacionit.web;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.exceptions.DuplicatedException;
import ar.com.educacionit.dao.exceptions.GenericDAOException;
import ar.com.educacionit.dao.exceptions.NonExistException;
import ar.com.educacionit.domain.Producto;

public class ABMProductoMain {
	public static void main(String[]args) {
		String codigo = "0002";
		Float precio = 1500f;
		String titulo = "IRON MAIN3";
		
		
		try {
			
			Producto producto = new Producto(1001L,titulo,precio,codigo);

			
			ProductoDAO.createProducto(producto);
			
			ProductoDAO.deteleProducto(producto.getId());
			
			producto = new Producto(1001L,titulo,precio,"0002");
			
			ProductoDAO.createProducto(producto);
			
		} catch (DuplicatedException  | GenericDAOException e) {
			e.printStackTrace();
		}catch(NonExistException e1) {
			e1.printStackTrace();
		}
		
	}
}
