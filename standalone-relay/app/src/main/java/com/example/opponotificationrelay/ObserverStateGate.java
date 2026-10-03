package com.example.opponotificationrelay;

/** Executed only on the observer event thread. Confirmations are never deduplicated. */
public final class ObserverStateGate {
    private HandoverPolicy.Presence sent;
    private int binders=-1;
    private boolean invalidated;
    public boolean invalidate() {
        if(invalidated) return false;
        invalidated=true;return true;
    }
    public boolean publish(long request,HandoverPolicy.Presence state,int count) {
        boolean changed=request!=0 || invalidated || state!=sent || count!=binders;
        if(changed) {sent=state;binders=count;invalidated=false;}
        return changed;
    }
    public static int cutpoint(int nonexistent,int cachedEmpty) {
        return nonexistent>0 && cachedEmpty==nonexistent-1 ? cachedEmpty : -1;
    }
}
