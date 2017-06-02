
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
    private final int count = 2;

    @Override
    public int getCount() {
        return count;
    }

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
    public Class<? extends Event> followingEventType() {
        return SprintReview.class;
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

}
