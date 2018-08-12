package Entity;

public class Vote {
    private User user;
    private EventPlace eventPlace;
    private EventProperties eventProperties;
    private int voteLevel;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public EventPlace getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(EventPlace eventPlace) {
        this.eventPlace = eventPlace;
    }

    public EventProperties getEventProperties() {
        return eventProperties;
    }

    public void setEventProperties(EventProperties eventProperties) {
        this.eventProperties = eventProperties;
    }

    public int getVoteLevel() {
        return voteLevel;
    }

    public void setVoteLevel(int voteLevel) {
        this.voteLevel = voteLevel;
    }
}
