/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Domain.Transactions;
import Util.HU;
import java.util.List;

/**
 *
 * @author Rugwiro
 */
public class TransactionsDao extends GenericDao<Transactions>{
   public List<Transactions>view(String q) {
        return HU.getSessionFactory().openSession().createQuery(q).list();
    } 
}
