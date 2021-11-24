package ru.vsu.cs.knyazev.roman.entity.user;

import ru.vsu.cs.knyazev.roman.entity.user.contact.Contact;
import ru.vsu.cs.knyazev.roman.entity.user.interest.Interest;
import ru.vsu.cs.knyazev.roman.entity.user.photo.Photo;
import ru.vsu.cs.knyazev.roman.entity.user.profile.Profile;

public class User extends Human {
    public User(Profile profile, Contact contact, Interest interests, Photo[] photos) {
        super(profile, contact, interests, photos);
    }
}
