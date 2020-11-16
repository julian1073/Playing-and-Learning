package com.example.login.Modelo;

public class NumeroIngles {

    private int image;
    private String title;
    private int imageDos;
    private int audioEsp;
    private int audioIng;

    public NumeroIngles(int image, String title, int imageDos, int audioEsp, int audioIng) {
        this.image = image;
        this.title = title;
        this.imageDos = imageDos;
        this.audioEsp = audioEsp;
        this.audioIng = audioIng;
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

    public int getImageDos() {
        return imageDos;
    }

    public void setImageDos(int imageDos) {
        this.imageDos = imageDos;
    }

    public int getAudioEsp() {
        return audioEsp;
    }

    public void setAudioEsp(int audioEsp) {
        this.audioEsp = audioEsp;
    }

    public int getAudioIng() {
        return audioIng;
    }

    public void setAudioIng(int audioIng) {
        this.audioIng = audioIng;
    }
}
