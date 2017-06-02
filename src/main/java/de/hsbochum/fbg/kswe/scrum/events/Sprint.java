
package de.hsbochum.fbg.kswe.scrum.events;

import de.hsbochum.fbg.kswe.scrum.artifacts.ProductBacklog;
import de.hsbochum.fbg.kswe.scrum.artifacts.SprintBacklog;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Sprint implements Event {

    private final SprintBacklog backlog;
    private final int numberOfDays;
    private final int place = 2;

    public Sprint(int numberOfDays) {
        this.numberOfDays = numberOfDays;
        this.backlog = new SprintBacklog();
        
        
    }

    @Override
    public void init(Event previous, ProductBacklog productBacklog) throws InitializationException {
        ((SprintPlanning) previous).getItems().stream().forEach(i -> this.backlog.addItem(i));
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
    @Override
    public int getPlace(){
        return place;
    }

    @Override
    public Class<? extends Event> followingEventType() {
        
        return SprintRetrospective.class;
        
    }

}
