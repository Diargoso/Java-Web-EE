/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Ychet;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author STUDENT 1
 */
@Local
public interface YchetFacadeLocal {

    void create(Ychet ychet);

    void edit(Ychet ychet);

    void remove(Ychet ychet);

    Ychet find(Object id);

    List<Ychet> findAll();

    List<Ychet> findRange(int[] range);

    int count();
    
}
