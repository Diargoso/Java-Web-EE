/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.TypeGadjet;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author STUDENT 1
 */
@Local
public interface TypeGadjetFacadeLocal {

    void create(TypeGadjet typeGadjet);

    void edit(TypeGadjet typeGadjet);

    void remove(TypeGadjet typeGadjet);

    TypeGadjet find(Object id);

    List<TypeGadjet> findAll();

    List<TypeGadjet> findRange(int[] range);

    int count();
    
}
