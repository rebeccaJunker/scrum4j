
package de.hsbochum.fbg.kswe.scrum.events;

import de.hsbochum.fbg.kswe.scrum.artifacts.ProductBacklog;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class SprintRetrospective implements Event {
    
    private final int place = 4;
    
    public SprintRetrospective(){
        }

    @Override
    public Class<? extends Event> followingEventType() {
        return SprintPlanning.class;
    }

    @Override
    public int getPlace(){
        return place;
    }
    
    @Override
    public void init(Event previos, ProductBacklog productBacklog) throws InitializationException {
    }

}
