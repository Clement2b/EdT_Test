package model;


public class DAOFactory {

	public static DAO<Seance> getSeanceDAO(){
		return new SeanceDAO();
	}
        
        public static DAO<EdT> getEdTDAO(){
		return new EdTDAO();
	}
}