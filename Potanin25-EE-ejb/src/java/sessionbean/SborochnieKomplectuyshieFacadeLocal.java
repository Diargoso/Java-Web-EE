/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.SborochnieKomplectuyshie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author STUDENT 1
 */
@Local
public interface SborochnieKomplectuyshieFacadeLocal {

    void create(SborochnieKomplectuyshie sborochnieKomplectuyshie);

    void edit(SborochnieKomplectuyshie sborochnieKomplectuyshie);

    void remove(SborochnieKomplectuyshie sborochnieKomplectuyshie);

    SborochnieKomplectuyshie find(Object id);

    List<SborochnieKomplectuyshie> findAll();

    List<SborochnieKomplectuyshie> findRange(int[] range);

    int count();
    
}
