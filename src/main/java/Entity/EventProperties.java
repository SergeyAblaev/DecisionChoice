package Entity;

import java.time.LocalDateTime;

public class EventProperties {
    private LocalDateTime dateTime;
    private String description;
    private EventPlace eventPlace;

    public EventProperties(EventPlace eventPlace) {
        this.eventPlace = eventPlace;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
