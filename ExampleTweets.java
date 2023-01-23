class User{
    String username;
    String display_name;
    int followers;
    User(String username, String display_name, int followers){
        this.username = username;
        this.display_name = display_name;
        this.followers = followers;
    }
    String toText(){
        return this.display_name + " " + this.username;
    }
}

class Tweet{
    String text;
    User tweeter;
    int likes;
    String id;
    Tweet(String text, User tweeter, int likes, String id){
        this.text = text;
        this.tweeter = tweeter;
        this.likes = likes;
        this.id = id;
    }
    boolean longerThan(Tweet other){
        return this.text.length() > other.text.length();
    }
    boolean moreLikes(Tweet other){
        return this.likes > other.likes;
    }
    String toText(){
        return this.tweeter.display_name + " " + this.tweeter.username + " : " + this.text + " : " + this.likes + " Likes";
    }
    String toLink(){
        return "https://twitter.com/" + this.tweeter.username + "/status/" + this.id;
    }
}

class ExampleTweets{
    User elon = new User("@elonmusk", "Elon Musk", 126900000);
    Tweet elonTweet1 = new Tweet("Twitter is arguably already the least wrong source of truth on the Internet, but we obviously still have a long way to go. Enabling @CommunityNotes to operate at very large scale and providing maximum transparency about how Twitter works are fundamental to building trust.", elon, 164900, "1616179085507702785"); //https://twitter.com/elonmusk/status/1616179085507702785?cxt=HHwWgsDR0ZeU6e0sAAAA
    //There are many elements to the tweet that are not represented in our classes. A few examples are profile picture, retweet count, quote retweet count, replies, and view count. 
    Tweet elonTweet2 = new Tweet("Major Twitter improvement we just released is that you can now bookmark tweets from tweet details page. Importantly, bookmarks are *private*, unlike likes. No one other than you can see your bookmarks.", elon, 128700, "1616533691156819968"); //https://twitter.com/elonmusk/status/1616533691156819968?cxt=HHwWgMDTzfm0iu8sAAAA
    //There are many elements to the tweet that are not represented in our classes. A few examples are profile picture, retweet count, quote retweet count, replies, and view count. 
    User nfl = new User("@NFL", "NFL", 32400000);
    Tweet nflTweet = new Tweet("5-1 in his postseason career 🔥 @JoeyB", nfl, 11500, "1617298568066510849"); //https://twitter.com/NFL/status/1617298568066510849
    //In addition to the aforementioned components, the tweet content has a reference to another twitter account which was not implemented in our class. The tweet also contains an image.
    User reggie = new User("@MillsReggie", "reggie mills", 494100);
    Tweet reggieTweet = new Tweet("In the mood to disappear for a while.", reggie, 1359, "1617311127612043264"); //https://twitter.com/MillsReggie/status/1617311127612043264?cxt=HHwWgMDRydr56_EsAAAA
    //See above comments for tweet components not implemented in the class.
    String test1 = this.elon.toText();
    boolean test2 = this.elonTweet1.longerThan(elonTweet2);
    boolean test3 = this.elonTweet2.moreLikes(reggieTweet);
    String test4 = this.nflTweet.toText();
    String test5 = this.reggieTweet.toLink();
    String test6 = this.elonTweet2.toText();
    boolean test7 = this.nflTweet.longerThan(reggieTweet);
    boolean test8 = this.reggieTweet.moreLikes(nflTweet);
    String test9 = this.reggieTweet.toText();
    String test10 = this.nflTweet.toLink();
}