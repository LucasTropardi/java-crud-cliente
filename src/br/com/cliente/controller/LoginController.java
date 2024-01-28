
package br.com.cliente.controller;

import br.com.cliente.dao.LoginDao;
import br.com.cliente.model.Login;
import java.sql.SQLException;
import java.util.ArrayList;


public class LoginController {
    
    public ArrayList<Login> buscarLoginSenha() throws SQLException, ClassNotFoundException{
        return LoginDao.buscarLogin();
    }

}
