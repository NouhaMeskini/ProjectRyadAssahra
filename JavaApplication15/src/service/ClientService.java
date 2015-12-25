/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import dao.ClientDao;
import dao.ConnectDB;
import util.DaoEngigne;

/**
 *
 * @author HASNA
 */
public class ClientService {
    
    ClientDao clientDao= new ClientDao();
    
    public int save(Client t) throws Exception {
      
        return clientDao.save(t);
    }
    
}
