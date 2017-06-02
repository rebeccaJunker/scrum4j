package de.hsbochum.fbg.kswe.scrum.events;

import de.hsbochum.fbg.kswe.scrum.artifacts.ProductBacklog;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class SprintRetrospective implements Event {

    private final int count = 4;

    public int getCount() {
        return count;
    }

    @Override
    public Class<? extends Event> followingEventType() {
        return SprintPlanning.class;
    }

    @Override
    public void init(Event previos, ProductBacklog productBacklog) throws InitializationException {
    }

}
