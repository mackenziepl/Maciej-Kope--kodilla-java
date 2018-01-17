package com.kodilla.testing.forum.statistics;

public class GetDatasOfStatistics {
    int users;
    int posts;
    int comments;
    double averagePostsOnUser;
    double averageCommentsOnUser;
    double averageCommentsOnPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        users = statistics.userNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        if(users!=0) {
            averagePostsOnUser = posts / users;
            averageCommentsOnUser = comments / users;
        }
        else {
            averagePostsOnUser = 0;
            averageCommentsOnUser = 0;
        }
        if(posts!=0)
            averageCommentsOnPosts = comments / posts;
        else
            averageCommentsOnPosts = 0;
    }

    public void ShowStatistics() {
        System.out.println(users);
        System.out.println(posts);
        System.out.println(comments);
        System.out.println(averagePostsOnUser);
        System.out.println(averageCommentsOnUser);
        System.out.println(averageCommentsOnPosts);
    }
}
