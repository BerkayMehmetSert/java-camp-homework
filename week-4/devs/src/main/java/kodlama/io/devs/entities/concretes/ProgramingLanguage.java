package kodlama.io.devs.entities.concretes;


public class ProgramingLanguage {
    private int id;
    private String languageName;

    public ProgramingLanguage() {
    }

    public ProgramingLanguage(int id, String languageName) {
        this.id = id;
        this.languageName = languageName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}
