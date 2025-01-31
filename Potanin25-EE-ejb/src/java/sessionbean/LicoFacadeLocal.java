/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Lico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author STUDENT 1
 */
@Local
public interface LicoFacadeLocal {

    void create(Lico lico);

    void edit(Lico lico);

    void remove(Lico lico);

    Lico find(Object id);

    List<Lico> findAll();

    List<Lico> findRange(int[] range);

    int count();
    
}
