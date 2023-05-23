package com.frbandro.codestore;

public class Model {
    String nithesh, dhoni , pandya;

    public Model() {
    }

    public Model(String nithesh, String dhoni, String pandya) {
        this.nithesh = nithesh;
        this.dhoni = dhoni;
        this.pandya = pandya;
    }

    public String getNithesh() {
        return nithesh;
    }

    public void setNithesh(String nithesh) {
        this.nithesh = nithesh;
    }

    public String getDhoni() {
        return dhoni;
    }

    public void setDhoni(String dhoni) {
        this.dhoni = dhoni;
    }

    public String getPandya() {
        return pandya;
    }

    public void setPandya(String pandya) {
        this.pandya = pandya;
    }
}
