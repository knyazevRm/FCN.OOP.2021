package ru.vsu.cs.knyazev.roman.entity.user.photo;

public class Photo {
    private String urlPhoto;
    private long like;

    public Photo(String urlPhoto, long like) {
        this.urlPhoto = urlPhoto;
        this.like = like;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public long getLike() {
        return like;
    }
}
