package com.example.opponotificationrelay;
import java.io.*;
import java.util.*;
/** Reassembly is scoped to a service lifetime and bounded across all active services. */
final class OafFragments {
    private static final int PER_MESSAGE=20480,TOTAL=81920,SERVICES=8;
    private static final long TTL=20_000_000_000L;
    private static final class Partial {final long generation,started;final ByteArrayOutputStream data=new ByteArrayOutputStream();Partial(long generation,long now){this.generation=generation;started=now;}}
    private final Map<Integer,Partial> pending=new HashMap<>();
    synchronized byte[] accept(int sid,long generation,int flag,byte[] data,long now)throws IOException {
        pending.entrySet().removeIf(e->now-e.getValue().started>=TTL||now<e.getValue().started);
        Partial old=pending.get(sid);if(old!=null&&old.generation!=generation){pending.remove(sid);old=null;}
        if(flag==0){pending.remove(sid);if(data.length>PER_MESSAGE)throw new IOException("OAF_FRAGMENT_LIMIT");return data;}
        if(flag==1){pending.remove(sid);if(pending.size()>=SERVICES)throw new IOException("OAF_FRAGMENT_LIMIT");old=new Partial(generation,now);pending.put(sid,old);}
        if(old==null)return null;int total=data.length;for(Partial part:pending.values())total+=part.data.size();
        if(old.data.size()+data.length>PER_MESSAGE||total>TOTAL){pending.remove(sid);throw new IOException("OAF_FRAGMENT_LIMIT");}
        old.data.write(data);if(flag!=3)return null;pending.remove(sid);return old.data.toByteArray();
    }
}
