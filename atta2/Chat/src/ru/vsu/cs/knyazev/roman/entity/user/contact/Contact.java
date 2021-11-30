package ru.vsu.cs.knyazev.roman.entity.user.contact;

public class Contact {
    private String telegram;
    private String vk;
    private String twitter;

    public Contact(String telegram, String vk, String twitter) {
        this.telegram = telegram;
        this.vk = vk;
        this.twitter = twitter;
    }

    public String getTelegram() {
        return telegram;
    }

    public String getVk() {
        return vk;
    }

    public String getTwitter() {
        return twitter;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "telegram='" + telegram + '\'' +
                ", vk='" + vk + '\'' +
                ", twitter='" + twitter + '\'' +
                '}';
    }
}
