/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.SpisokKomplektyushix;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author STUDENT 1
 */
@Local
public interface SpisokKomplektyushixFacadeLocal {

    void create(SpisokKomplektyushix spisokKomplektyushix);

    void edit(SpisokKomplektyushix spisokKomplektyushix);

    void remove(SpisokKomplektyushix spisokKomplektyushix);

    SpisokKomplektyushix find(Object id);

    List<SpisokKomplektyushix> findAll();

    List<SpisokKomplektyushix> findRange(int[] range);

    int count();
    
}
