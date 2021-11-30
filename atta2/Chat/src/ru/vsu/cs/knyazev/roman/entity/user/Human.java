package ru.vsu.cs.knyazev.roman.entity.user;

import ru.vsu.cs.knyazev.roman.entity.user.contact.Contact;
import ru.vsu.cs.knyazev.roman.entity.user.interest.Interest;
import ru.vsu.cs.knyazev.roman.entity.user.photo.Photo;
import ru.vsu.cs.knyazev.roman.entity.user.profile.Profile;

import java.util.ArrayList;

public abstract class Human {
    private Contact contact;
    private Interest interests;
    private Photo[] photos;
    private Profile profile;

    public Human(Profile profile, Contact contact, Interest interests, Photo[] photos) {
        this.contact = contact;
        this.interests = interests;
        this.photos = photos;
        this.profile = profile;
    }

    public Contact getContact() {
        return contact;
    }

    public Interest getInterests() {
        return interests;
    }


    public Profile getProfile() {
        return profile;
    }

    public Photo[] getPhotos() {
        return photos;
    }
}
