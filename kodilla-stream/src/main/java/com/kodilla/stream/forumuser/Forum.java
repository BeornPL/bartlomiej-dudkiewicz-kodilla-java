package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1,"User1",'M', LocalDate.of(1990,01,01),1000));
        forumUserList.add(new ForumUser(2,"User2",'M', LocalDate.of(2000,02,01),0));
        forumUserList.add(new ForumUser(3,"User3",'F', LocalDate.of(1990,01,01),0));
        forumUserList.add(new ForumUser(4,"User4",'M', LocalDate.of(1995,06,01),160));
        forumUserList.add(new ForumUser(5,"User5",'M', LocalDate.of(1999,02,17),200));
        forumUserList.add(new ForumUser(6,"User6",'M', LocalDate.of(1999,02,19),1));
        forumUserList.add(new ForumUser(7,"User7",'F', LocalDate.of(1995,06,01),1600));
    }

    public ArrayList<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
