import java.util.List;
import java.util.ArrayList;

public class Cours{
    private Prof professeur;
    private Horaire horaire;
    private Matiere matiere;
    private List<Groupe> lesGroupes;

    public Cours(Prof prof,Horaire horaire,Matiere matiere){
        this.lesGroupes = new ArrayList<>();
        this.horaire = horaire;
        this.professeur = prof;
        this.matiere = matiere;
    }

    public Prof getProf(){
        return this.professeur;
    }

    public Matiere getMatiere(){
        return this.matiere;
    }

    public Horaire getHoraire() {
        return horaire;
    }

    public List<Groupe> getLesGroupes() {
        return lesGroupes;
    }

    public void ajouter(Groupe groupe){
        this.lesGroupes.add(groupe);
    }
}