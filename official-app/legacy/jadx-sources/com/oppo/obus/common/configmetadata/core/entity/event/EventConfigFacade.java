package com.oppo.obus.common.configmetadata.core.entity.event;

import com.oppo.obus.common.configmetadata.core.concept.entity.ConfigFacade;
import com.oppo.obus.common.protobuf.ProtobufSerializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class EventConfigFacade implements ConfigFacade, ProtobufSerializable {
    private static final long serialVersionUID = -663239702757539406L;
    private List<MinAppEventConfig> event;

    public EventConfigFacade() {
    }

    public EventConfigFacade(List<MinAppEventConfig> list) {
        this.event = list;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof EventConfigFacade;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventConfigFacade)) {
            return false;
        }
        EventConfigFacade eventConfigFacade = (EventConfigFacade) obj;
        if (!eventConfigFacade.canEqual(this)) {
            return false;
        }
        List<MinAppEventConfig> event = getEvent();
        List<MinAppEventConfig> event2 = eventConfigFacade.getEvent();
        return event != null ? event.equals(event2) : event2 == null;
    }

    public List<MinAppEventConfig> getEvent() {
        return this.event;
    }

    public int hashCode() {
        List<MinAppEventConfig> event = getEvent();
        return 59 + (event == null ? 43 : event.hashCode());
    }

    public EventConfigFacade setEvent(List<MinAppEventConfig> list) {
        this.event = list;
        return this;
    }

    public String toString() {
        return "EventConfigFacade(event=" + getEvent() + ")";
    }
}
