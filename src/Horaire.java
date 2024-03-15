import java.util.List;
import java.util.ArrayList;

public class Horaire{
    private float heureDebut;
    private float heureFin;
    private List<Salle> lesSalles;
    private List<Cours> lesCours;

    public Horaire(float heureDebut, float heureFin){
        this.lesCours = new ArrayList<>();
        this.lesSalles = new ArrayList<>();
        this.heureDebut= heureDebut;
        this.heureFin = heureFin;
    }

    public float getHeureDebut(){
        return this.heureDebut;
    }

    public float getHeureFin(){
        return this.heureFin;
    }

    public List<Cours> getLesCours() {
        return this.lesCours;
    }

    public List<Salle> getLesSalles() {
        return lesSalles;
    }

    

}