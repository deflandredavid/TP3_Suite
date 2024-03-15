import java.util.List;
import java.util.ArrayList;

public class Matiere{
    private String nom;
    private int identifiant;
    private List<Note> notes;

    public Matiere(String nom, int identifiant){
        this.nom = nom;
        this.identifiant = identifiant;
        this.notes = new ArrayList<>();
    }

    public String getNom(){
        return this.nom;
    }

    public int getIdentifiant(){
        return this.identifiant;
    }

    public List getNotes(){
        return this.notes;
    }


    public void ajouteNote(Note note){
        this.notes.add(note);
    }


}