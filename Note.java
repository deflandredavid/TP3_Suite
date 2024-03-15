public class Note{

    private int note;

    private Matiere matiere;

    public Note(int note, Matiere matiere){
        this.note = note;
        this.matiere = matiere;
    }

    public getNote(){
        return this.note;
    }

    public getMatiere(){
        return this.matiere;
    }
}