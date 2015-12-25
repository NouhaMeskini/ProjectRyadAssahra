/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Produit;
import dao.ConnectDB;
import dao.ProduitDao;
import util.DaoEngigne;

/**
 *
 * @author HASNA
 */
public class ProduitService {
    ProduitDao produitDao= new ProduitDao();
    
     public int save(Produit t) throws Exception {
         return produitDao.save(t);
       
    }
    
}
