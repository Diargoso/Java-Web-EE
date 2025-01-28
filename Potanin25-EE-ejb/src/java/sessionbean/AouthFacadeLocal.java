/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Aouth;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author STUDENT 1
 */
@Local
public interface AouthFacadeLocal {

    void create(Aouth aouth);

    void edit(Aouth aouth);

    void remove(Aouth aouth);

    Aouth find(Object id);

    List<Aouth> findAll();

    List<Aouth> findRange(int[] range);

    int count();
    
}
