package com.example.opponotificationrelay;

/** Unknown samples never imply exit; reconnects do not repeat a takeover notice. */
public final class HandoverNoticePolicy {
    private HandoverPolicy.Presence stable=HandoverPolicy.Presence.UNKNOWN;
    private boolean announced;
    public synchronized boolean presence(HandoverPolicy.Presence value) {
        if(value==HandoverPolicy.Presence.UNKNOWN || value==stable) return false;
        stable=value;
        if(value==HandoverPolicy.Presence.ONLINE) { announced=false; return true; }
        return false;
    }
    public synchronized boolean ready() {
        if(stable!=HandoverPolicy.Presence.OFFLINE || announced) return false;
        announced=true; return true;
    }
}
