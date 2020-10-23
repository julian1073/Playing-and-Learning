package com.example.login.Modelo;

public class Numero {

    private int image;
    private String title;
    private String desc;
    private int imageDos;

    public Numero(int image, String title, String desc, int imageDos) {
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.imageDos = imageDos;
    }

    public int getImageDos() {
        return imageDos;
    }

    public void setImageDos(int imageDos) {
        this.imageDos = imageDos;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
