package ar.com.educacionit.dao;

import ar.com.educacionit.dao.exceptions.DuplicatedException;
import ar.com.educacionit.dao.exceptions.GenericDAOException;
import ar.com.educacionit.dao.exceptions.NonExistException;
import ar.com.educacionit.domain.Producto;


// ctrl + shitf + o

public class ProductoDAO {
	
	static int contadorNuevosProducto = 0;
	
	public static Producto createProducto() throws DuplicatedException{
		
		//para acceder a la db;
		Producto producto = new Producto("IRON MAN",1500f,"0001");
		
		//insert into producto...
		
		producto.setId(1L);
		
		contadorNuevosProducto++;
		
		if(contadorNuevosProducto %2  ==0) {
		throw new DuplicatedException("El producto con codigo: " +  producto.getCodigo());
		
		}
		
		return producto;
	}

public static Producto createProducto(Producto producto) throws DuplicatedException , GenericDAOException{
		
		
		producto.setId(1L);
		
		contadorNuevosProducto++;
		
		if(contadorNuevosProducto %2  ==0) {
		throw new DuplicatedException("El producto con codigo: " +  producto.getCodigo() + " ya existe");
		
		}
		if(producto.getCodigo().equals("0002")) {
			throw new GenericDAOException("Error inesperado al intentar grabar el producto con codigo: " + producto.getCodigo());
		}
		
		return producto;
	}
	public static void deteleProducto(Long id) throws NonExistException {
		
		//delete from tabla where....
		
		if(id < 1000) {
			throw new NonExistException("el id " + id + " no existe");
		}else {
			
			System.out.println("el producto fue eliminado");
		}
		
	}

	public Producto get(Long id) throws GenericDAOException {
		
		Producto producto = new Producto(id,"IRON MAN",1500f,"0001");
		//select * from producto.
		if(id < 10) {
			throw new GenericDAOException("Error inesperado,obteniendo el producto id=" + id);
		}
		return producto;
	}
}
