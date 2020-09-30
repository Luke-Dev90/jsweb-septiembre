package ar.com.educacionit.service;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exceptions.ServiceException;

public interface ProductoService {
	
	//metodos de servicio que servir para las diferentes aplicaciones
	
	public  Producto obtenerProductoById(Long id) throws ServiceException;
	
}
