package model;

public class CompagnieAerienne
{
    private int id;
    private String code;
    private String pays;

    public CompagnieAerienne(String code, String pays) {
        this.code = code;
        this.pays = pays;
    }

    public int getId() {
        return id;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
