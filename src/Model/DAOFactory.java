package Model;


public class DAOFactory {

	public static DAO<Seance> getSeanceDAO(){
		return new SeanceDAO();
	}
        
        public static DAO<EdT> getEdTDAO(){
		return new EdTDAO();
	}
        
        public static DAO<Etudiant> getEtudiantDAO(){
            return new EtudiantDAO();
        }
        
        public static DAO<Enseignant> getEnseignantDAO(){
            return new EnseignantDAO();
        }
        
        public static DAO<Utilisateur> getUtilisateurDAO(){
            return new UtilisateurDAO();
        }
        
        public static DAO<Cours> getCoursDAO(){
            return new CoursDAO();
        }
}