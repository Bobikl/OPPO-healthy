package com.example.opponotificationrelay;

import java.util.*;

/** 一次读取的快照；缺失记录保持未知，不推断为关闭，不负责保存或写回。 */
public final class OfficialSettingsPreview {
    public static final String SELF="com.example.opponotificationrelay";
    public static final int MAX_APPS=4000;
    public static final class Nap {
        public final boolean enabled; public final int start,duration;
        public final String revision;
        public Nap(boolean enabled,int start,int duration) { this(enabled,start,duration,null); }
        public Nap(boolean enabled,int start,int duration,String revision) {
            if(revision!=null && !revision.matches("[a-f0-9]{64}"))throw new IllegalArgumentException("NAP_REVISION");
            this.revision=revision;
            if(start<0 || start>=1440 || duration<1 || duration>=1440) throw new IllegalArgumentException("NAP_RANGE");
            this.enabled=enabled;this.start=start;this.duration=duration;
        }
        public int end(){return (start+duration)%1440;}
        public boolean sameDay(){return start+duration<1440;}
        public boolean matches(boolean on,int from,int to){return enabled==on && start==from && sameDay() && end()==to;}
    }
    public static final class Difference {
        public final String pkg; public final Boolean official; public final boolean local;
        Difference(String pkg,Boolean official,boolean local){this.pkg=pkg;this.official=official;this.local=local;}
    }
    public final Map<String,Boolean> apps;
    public final Nap nap;
    public final String appsError,napError;
    public final int skipped,selfRows;
    public final long capturedAt;
    public OfficialSettingsPreview(Map<String,Boolean> apps,String appsError,Nap nap,String napError,int skipped,int selfRows,long time) {
        if(skipped<0 || skipped>MAX_APPS || selfRows<0 || selfRows>1) throw new IllegalArgumentException("COUNTS");
        if((apps==null)==(appsError==null) || (nap==null)==(napError==null)) throw new IllegalArgumentException("STATE");
        if(apps!=null) {
            if(apps.size()>MAX_APPS) throw new IllegalArgumentException("APP_LIMIT");
            TreeMap<String,Boolean> copy=new TreeMap<>();
            for(Map.Entry<String,Boolean> e:apps.entrySet()) {
                if(!ordinary(e.getKey()) || e.getValue()==null || SELF.equals(e.getKey())) throw new IllegalArgumentException("APP_RECORD");
                copy.put(e.getKey(),e.getValue());
            }
            this.apps=Collections.unmodifiableMap(copy);
        } else this.apps=null;
        this.appsError=appsError;this.nap=nap;this.napError=napError;this.skipped=skipped;this.selfRows=selfRows;this.capturedAt=time;
    }
    public static boolean ordinary(String pkg) {
        return pkg!=null && pkg.length()<=255 && pkg.matches("[A-Za-z][A-Za-z0-9_]*(\\.[A-Za-z0-9_]+)+");
    }
    public List<Difference> differences(Set<String> local) {
        if(apps==null) return Collections.emptyList();
        TreeSet<String> union=new TreeSet<>(apps.keySet());
        for(String pkg:local) if(ordinary(pkg) && !SELF.equals(pkg)) union.add(pkg);
        List<Difference> result=new ArrayList<>();
        for(String pkg:union) {
            Boolean official=apps.get(pkg);boolean selected=local.contains(pkg);
            if(official==null || official!=selected) result.add(new Difference(pkg,official,selected));
        }
        return Collections.unmodifiableList(result);
    }
    public int enabledApps(){if(apps==null)return 0;int n=0;for(boolean on:apps.values())if(on)n++;return n;}
}
