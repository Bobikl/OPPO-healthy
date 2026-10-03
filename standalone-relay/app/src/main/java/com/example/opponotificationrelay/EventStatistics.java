package com.example.opponotificationrelay;

/** Bounded, thread-safe diagnostic state. Persistence acknowledges a specific revision. */
public final class EventStatistics {
    public static final class Snapshot {
        public final int count;public final String preview;public final long revision;
        Snapshot(int n,String p,long r){count=n;preview=p;revision=r;}
    }
    private int count;
    private String preview;
    private long revision,saved;
    public EventStatistics(int count,String preview) {
        this.count=Math.max(0,count);
        this.preview=MessageBudget.text(preview,2048);
        if(preview!=null && !this.preview.equals(preview))revision=1;
    }
    public synchronized void record(RelayEvent event) {
        if(count<Integer.MAX_VALUE)count++;
        preview=MessageBudget.text((event.removed?"移除":"发布")+" | "+event.packageName+" | "
            +MessageBudget.text(event.title,512)+(event.content.isEmpty()?"":" | "+MessageBudget.text(event.content,1024)),2048);
        revision++;
    }
    public synchronized Snapshot snapshot() {return new Snapshot(count,preview,revision);}
    public synchronized Snapshot pending() {return revision==saved?null:snapshot();}
    public synchronized void saved(Snapshot value) {
        if(value!=null && value.revision<=revision)saved=Math.max(saved,value.revision);
    }
}
