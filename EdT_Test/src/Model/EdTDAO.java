/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



/**
 *
 * @author cleme
 */
public class EdTDAO extends DAO<EdT> {
    
  public EdTDAO(){
    super();
  }
  
  @Override
  public boolean create(EdT obj) {
    return false;
  }

  @Override
  public boolean delete(EdT obj) {
    return false;
  }
   
  @Override
  public boolean update(EdT obj) {
    return false;
  }
  
  @Override
  public EdT find(int semaine) {  
    EdT edt_semaine = new EdT(semaine);            

    return edt_semaine;
  }
}
