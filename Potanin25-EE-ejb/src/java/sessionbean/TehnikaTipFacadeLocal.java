/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.TehnikaTip;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student
 */
@Local
public interface TehnikaTipFacadeLocal {

    void create(TehnikaTip tehnikaTip);

    void edit(TehnikaTip tehnikaTip);

    void remove(TehnikaTip tehnikaTip);

    TehnikaTip find(Object id);

    List<TehnikaTip> findAll();

    List<TehnikaTip> findRange(int[] range);

    int count();
    
}
