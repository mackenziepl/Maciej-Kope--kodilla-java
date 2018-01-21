package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {
        theForumUser.add(new ForumUser(1,"Olek",'M',1990,3,12,14));
        theForumUser.add(new ForumUser(2,"Kary",'M',1998,8,25,0));
        theForumUser.add(new ForumUser(3,"Mack",'M',1995,2,3,19));
        theForumUser.add(new ForumUser(4,"Aska",'F',1999,12,1,22));
        theForumUser.add(new ForumUser(5,"Olka",'F',1991,7,31,0));
        theForumUser.add(new ForumUser(6,"Inga",'F',1988,11,8,35));
        theForumUser.add(new ForumUser(7,"Stefan",'M',2000,8,11,0));
        theForumUser.add(new ForumUser(8,"Aga",'F',1982,10,15,47));
        theForumUser.add(new ForumUser(9,"Ilona",'F',1985,1,20,0));
        theForumUser.add(new ForumUser(10,"Waldek",'M',1986,5,5,16));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(theForumUser);
    }
}
