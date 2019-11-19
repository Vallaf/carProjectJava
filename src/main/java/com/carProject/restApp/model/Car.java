package com.carProject.restApp.model;

public class Car {

    private String marque;
    private String modele;

    public Car() {
    }

    public Car(String marque, String modele) {
            this.marque = marque;
            this.modele = modele;
        }

        public String getMarque () {
            return marque;
        }

        public void setMarque (String marque){
            this.marque = marque;
        }

        public String getModele () {
            return modele;
        }

        public void setModele (String modele){
            this.modele = modele;
        }

    }
