package com.example.fripouilles_assistante_mobile;

public  class MyData {
    private String heureDebut;
    private String heureArrivee;
    private String repas;
    private String frais;

    public String getHeureDebut() {
        return heureDebut;
    }

    public String getHeureArrivee() {
        return heureArrivee;
    }

    public String getRepas() {
        return repas;
    }

    public String getFrais() {
        return frais;
    }

    public MyData(String heureDebut, String heureArrivee, String repas, String frais) {
        this.heureDebut = heureDebut;
        this.heureArrivee = heureArrivee;
        this.repas = repas;
        this.frais = frais;
    }
}
