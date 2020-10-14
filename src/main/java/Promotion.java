
public class Promotion {
    private String annee;
    private String form;
    private String etud;

    public String getAnnee(){
    return annee;
    }

    public void setAnnee (String annee){ 
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

    public Promotion(String annee, String form, String etud) {
        this.annee = annee;
        this.form = form;
        this.etud = etud;
    }

}
