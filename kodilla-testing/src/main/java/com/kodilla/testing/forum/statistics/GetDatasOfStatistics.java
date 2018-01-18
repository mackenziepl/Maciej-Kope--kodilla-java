package com.kodilla.testing.forum.statistics;
public class GetDatasOfStatistics {
    double users;
    double posts;
    double comments;
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
        System.out.println("Quantity users: " + users);
        System.out.println("Quantity posts: " + posts);
        System.out.println("Quantity comments: " + comments);
        System.out.println("Average Posts On User : " + averagePostsOnUser);
        System.out.println("Average Comments On User : " + averageCommentsOnUser);
        System.out.println("Average Comments On Posts : " + averageCommentsOnPosts);
    }
}
