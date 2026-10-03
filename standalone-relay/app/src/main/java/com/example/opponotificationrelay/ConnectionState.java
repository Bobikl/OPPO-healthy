package com.example.opponotificationrelay;

/** One synchronized owner for connection generations, status and terminal failures. */
public final class ConnectionState {
    public static final class Snapshot {
        public final long generation,revision;
        public final int state;
        public final String message;
        Snapshot(long g,long r,int s,String m) {generation=g;revision=r;state=s;message=m;}
    }
    private long generation,revision;
    private boolean running,blocked;
    private int state;
    private String message="未连接";
    public synchronized long begin() {
        if(running || blocked) return 0;
        running=true;return ++generation;
    }
    public synchronized Snapshot stop(int s,String m) {
        generation++;running=false;blocked=false;return update(s,m);
    }
    public synchronized boolean active(long token) {return running && generation==token;}
    public synchronized boolean running() {return running;}
    public synchronized long generation() {return generation;}
    public synchronized Snapshot snapshot() {return new Snapshot(generation,revision,state,message);}
    public synchronized boolean current(Snapshot s) {return s!=null && generation==s.generation && revision==s.revision;}
    public synchronized Snapshot status(long token,int s,String m) {
        return active(token)?update(s,m):null;
    }
    public synchronized Snapshot status(int s,String m) {return update(s,m);}
    public synchronized Snapshot fail(long token,int s,String m,boolean block) {
        if(!active(token)) return null;
        running=false;blocked=block;return update(s,m);
    }
    private Snapshot update(int s,String m) {
        state=s;message=m;return new Snapshot(generation,++revision,s,m);
    }
}
