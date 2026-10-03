package com.example.opponotificationrelay;

/** Short initial retries, then bounded long backoff while the watch stays unreachable. */
public final class ReconnectPolicy {
    private static final long[] DELAYS={3000,6000,12000,24000,60000,120000,300000};
    private int failures;
    public long failed(long connectedMillis) {
        if(connectedMillis>=60000) failures=0;
        long delay=DELAYS[failures];
        failures=Math.min(failures+1,DELAYS.length-1);
        return delay;
    }
    public void reset() {failures=0;}
}
