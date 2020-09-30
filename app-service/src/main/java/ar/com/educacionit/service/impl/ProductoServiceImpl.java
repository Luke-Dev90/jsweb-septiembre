package ar.com.educacionit.service.impl;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.exceptions.GenericDAOException;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.domain.clase5.exceptions.Connection;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;

public class ProductoServiceImpl implements ProductoService {

	private ProductoDAO productoDao;	
	
	public ProductoServiceImpl() {
		this.productoDao = new ProductoDAO();
	}
	
	
	@Override
	public Producto obtenerProductoById(Long id) throws ServiceException {
		Connection con = new Connection();
		 try {
			 con.open();
			return this.productoDao.get(id);
		} catch (GenericDAOException e) {
			throw new ServiceException("Error de servicio consultado producto",e);
		} finally {
			//siempre se ejecuta
			con.close();
		}
		
		
	}

}
