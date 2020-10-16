import java.time.Year;

public class Promotion {
    private Year annee;
    private String form;
    private String etud;

    public Year getAnnee(){
    return annee;
    }

    public void setAnnee (Year annee){ 
        this.annee = annee; 
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }


    public String getEtud() {
        return etud;
    }

    public void setEtud(String etud) {
        this.etud = etud;
    }

    public Promotion(Year annee, String form, String etud) {
        this.annee = annee;
        this.form = form;
        this.etud = etud;
    }

}
