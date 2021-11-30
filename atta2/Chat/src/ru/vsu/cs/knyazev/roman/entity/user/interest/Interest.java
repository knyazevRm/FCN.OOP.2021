package ru.vsu.cs.knyazev.roman.entity.user.interest;

public class Interest {
    private String music;
    private String sport;
    private String anotherInterest;

    public Interest(String music, String sport, String anotherInterest) {
        this.music = music;
        this.sport = sport;
        this.anotherInterest = anotherInterest;
    }

    public String getMusic() {
        return music;
    }

    public String getSport() {
        return sport;
    }

    public String getAnotherInterest() {
        return anotherInterest;
    }
}
