package ru.vsu.cs.knyazev.roman.entity.listUsers;

import ru.vsu.cs.knyazev.roman.entity.user.User;
import ru.vsu.cs.knyazev.roman.entity.user.contact.Contact;
import ru.vsu.cs.knyazev.roman.entity.user.interest.Interest;
import ru.vsu.cs.knyazev.roman.entity.user.photo.Photo;
import ru.vsu.cs.knyazev.roman.entity.user.profile.Profile;

import java.util.ArrayList;

public class CurrentListOfUsers {
    public final ArrayList<User> users = createUsersList();

    private ArrayList<User> createUsersList() {
        ArrayList<User> result = new ArrayList<User>();
        result.add(new User(new Profile("Peter", "Gibson", 10, 'm', "London"),
                new Contact("telegram/112", "id3451", "twit/id91213i"),
                new Interest("CMH", "", "cook"),
                new Photo[]{
                        new Photo("https://i.pinimg.com/736x/fd/bb/9a/fdbb9acb5178b030e8073f04ad6569f6.jpg", 10),
                        new Photo("https://klike.net/uploads/posts/2019-12/1575198860_2.jpg", 910)}));
        result.add(new User(new Profile("Elena", "Grant", 68, 'w', "Berlin"),
                new Contact("telegram/1132", "id378861", "twit/id1912413i"),
                new Interest("Pop Smoke", "Football", "run"),
                new Photo[]{
                        new Photo("https://www.ejin.ru/wp-content/uploads/2019/05/delfin-pljuetsja.jpg", 68),
                        new Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3MW6Y_NETPDvmdfUjxdCXpakPPmx0zRe6Dg&usqp=CAU", 134)}));
        result.add(new User(new Profile("Pol", "Davis", 35, 'm', "Texas"),
                new Contact("telegram/1232", "id148069", "twit/id3t8d"),
                new Interest("Billie Eilish", "Tennis", "watch films"),
                new Photo[]{
                        new Photo("https://www.shkaff.net/images/stories/z_43a5489b.jpg", 1954),
                        new Photo("https://likeyou.io/wp-content/uploads/2019/02/Snimok-ekrana-2019-02-15-v-16.03.56.png", 190)}));
        result.add(new User(new Profile("Big", "Smoke", 24, 'm', "Philadelphia"),
                new Contact("telegram/big123", "", "twit/979690"),
                new Interest("Billie Eilish", "Basketball", "smoking"),
                new Photo[]{
                        new Photo("https://static.wikia.nocookie.net/gtawiki/images/b/bd/BigSmoke-GTASA.jpg/revision/latest?cb=20190208154953", 313313),
                        new Photo("https://cdna.artstation.com/p/assets/images/images/028/709/270/large/wander-vinhal-beuty-01.jpg?1595277789", 62453)}));
        result.add(new User(new Profile("Twist", "Williams ", 27, 'm', "London"),
                new Contact("telegram/112", "id3451", "twit/id91213i"),
                new Interest("Depeche Mode", "Hockey", "walking with my dog"),
                new Photo[]{
                        new Photo("https://bipbap.ru/wp-content/uploads/2017/07/613x408_0_57f89af444833b655359075267fdac86-660x439_0xd42ee437_10096595891424417983.jpeg", 89),
                        new Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJx47pD99eChAlGWHxIUXalqNpa3rvIgU1qw&usqp=CAU", 54)}));
        result.add(new User(new Profile("Kate", "Collins ", 21, 'w', "Texas"),
                new Contact("telegram/89796", "", "twit/id52525jg`"),
                new Interest("Birdy", "MMA", "relax"),
                new Photo[]{
                        new Photo("https://cdn.humoraf.ru/wp-content/uploads/2017/08/pictures-drawn-by-people-00.jpg", 9),
                        new Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMavdiPWjBOOgLmb4LaMG5Epd-dqGQqxhVnh1ijq5RHmDYMNszuPDAinBhpGikhC9qNqw&usqp=CAU", 15)}));
        return result;
    }
}
