/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.TehnikaTip;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Student
 */
@Stateless
public class TehnikaTipFacade extends AbstractFacade<TehnikaTip> {

    @PersistenceContext(unitName = "Potanin25-EE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TehnikaTipFacade() {
        super(TehnikaTip.class);
    }
    
}
