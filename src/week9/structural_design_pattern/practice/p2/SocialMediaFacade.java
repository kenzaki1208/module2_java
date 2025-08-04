package week9.structural_design_pattern.practice.p2;

public class SocialMediaFacade {
    private Facebook facebook;
    private Twitter twitter;
    private LinkedIn linkedIn;

    public SocialMediaFacade() {}

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }

    public void share(String message) {
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.linkedIn.share();
    }
}
