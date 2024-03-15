public class Salle{
    private int num;
    private String batiment;
    private int capacite;
    private Horaire horaire;

    public Salle(int num,String batiment,int capacite,Horaire horaire){
        this.batiment = batiment;
        this.capacite = capacite;
        this.horaire = horaire;
        this.num = num;
    }

    public Horaire getHoraire(){
        return this.horaire;
    }

    public int getCapacite(){
        return this.capacite;
    }

    public String getBatiment() {
        return batiment;
    }

    public int getNum() {
        return num;
    }
}