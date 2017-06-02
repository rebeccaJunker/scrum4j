
package de.hsbochum.fbg.kswe.scrum.events;

import de.hsbochum.fbg.kswe.scrum.artifacts.ProductBacklog;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class SprintReview implements Event {
    
    private final int place = 3;
    
    public SprintReview(){
        }

    @Override
    public Class<? extends Event> followingEventType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public int getPlace(){
        return place;
    }
    
    @Override
    public void init(Event previos, ProductBacklog productBacklog) throws InitializationException {
    }

}
