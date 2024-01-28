
package br.com.cliente.controller;

import br.com.cliente.dao.ClienteDao;
import br.com.cliente.dao.Dao;
import br.com.cliente.model.Cliente;
import java.sql.SQLException;


public class ClienteController extends Dao<Cliente> {

    @Override
    public boolean cadastrar(Cliente cliente) throws SQLException {
      
        boolean resultado = false;
        
        ClienteDao clienteDao = new ClienteDao();
        if(clienteDao.cadastrar(cliente)){
            resultado = true;
        }
        
        return resultado;
    }

    @Override
    public boolean atualizar(Cliente cliente) throws SQLException {
        boolean resultado = false;
        
        ClienteDao clienteDao = new ClienteDao();
        if(clienteDao.atualizar(cliente)){
            resultado = true;
        }
        
        return resultado;
    }

    @Override
    public boolean excluir(Cliente cliente) throws SQLException {
        boolean resultado = false;
        
        ClienteDao clienteDao = new ClienteDao();
        if(clienteDao.excluir(cliente)){
            resultado = true;
        }
        
        return resultado;
    }

    @Override
    public Integer getCodigo(Cliente cliente) throws SQLException {
       
        ClienteDao clienteDao = new ClienteDao();
        
        return clienteDao.getCodigo(cliente);
    }

}
