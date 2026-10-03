package com.example.opponotificationrelay;

import java.util.*;

/** 三项云端设置的有界顺序提交；不重试、不把部分成功伪装成事务回滚。 */
public final class NapWritePolicy {
    public static final long REVIEW_MS=120000, RUN_MS=18000;
    public static final class State {
        public final OfficialSettingsPreview.Nap nap; public final String revision;
        public State(OfficialSettingsPreview.Nap nap,String revision) {
            if(nap==null || revision==null || !revision.matches("[a-f0-9]{64}"))throw new IllegalArgumentException("SOURCE_UNREAD");
            this.nap=nap;this.revision=revision;
        }
        public String value(int field) {
            switch(field) {
                case 0:return nap.enabled?"1":"0";
                case 1:return String.format(Locale.ROOT,"%02d:%02d",nap.start/60,nap.start%60);
                case 2:return Integer.toString(nap.duration);
                default:throw new IllegalArgumentException("FIELD");
            }
        }
    }
    public static final class Plan {
        public final State source,target;
        public final SettingsImportPlan.Local local;
        public final long reviewedAt;
        public Plan(OfficialSettingsPreview.Nap source,SettingsImportPlan.Local local,long now) {
            if(source==null || source.revision==null)throw new IllegalArgumentException("SOURCE_UNREAD");
            if(!source.sameDay() || local.start<0 || local.end>=1440 || local.end<=local.start)throw new IllegalArgumentException("NAP_RANGE");
            if(local.enabled && local.cid!=200)throw new IllegalArgumentException("NAP_PROTOCOL");
            this.source=new State(source,source.revision);
            this.target=new State(new OfficialSettingsPreview.Nap(local.enabled,local.start,local.end-local.start),source.revision);
            this.local=local;reviewedAt=now;
        }
        public boolean localMatches(SettingsImportPlan.Local other) {
            return local.enabled==other.enabled && local.start==other.start && local.end==other.end &&
                local.cid==other.cid && ((local.present^other.present)&14)==0;
        }
        public boolean expired(long now){return now<reviewedAt || now-reviewedAt>REVIEW_MS;}
        public boolean changes(){return mask(source,target)!=7;}
    }
    public static final long SERVICE_WAIT_MS=4000;
    public interface Discovery<T> {
        T peek() throws Exception;
        long now();
        void pause() throws Exception;
    }
    /** Only wait for an unpublished service; never retry a dispatched save or an exception. */
    public static <T> T awaitPublished(Discovery<T> source) throws Exception {
        long begin=source.now();
        while(true) {
            long now=source.now();
            if(now<begin || now-begin>=SERVICE_WAIT_MS)throw new IllegalStateException("SERVICE_NOT_PUBLISHED");
            T service=source.peek();
            if(service!=null)return service;
            source.pause();
        }
    }
    public interface Ack { Integer status(); }
    public interface Port {
        State read() throws Exception; // also rechecks account identity
        default void prepare() throws Exception { }
        Ack send(int field,String value) throws Exception;
        long now();
        void pause() throws Exception;
    }
    public enum Status { APPLIED, NO_CHANGE, REJECTED, UNCERTAIN }
    public static final class Result {
        public final Status status;public final String code;
        public final int attempted,confirmed,matching;
        public Result(Status status,String code,int attempted,int confirmed,int matching) {
            this.status=status;this.code=code;this.attempted=attempted;this.confirmed=confirmed;this.matching=matching;
        }
    }
    public static int mask(State a,State b) {
        int mask=0;for(int i=0;i<3;i++)if(a.value(i).equals(b.value(i)))mask|=1<<i;return mask;
    }
    static int[] order(State from,State to) {
        boolean startFirst=to.nap.start+from.nap.duration<1440;
        int a=startFirst?1:2,b=startFirst?2:1;
        return to.nap.enabled?new int[]{a,b,0}:new int[]{0,a,b};
    }
    public static Result run(Port port,String expectedRevision,State target,long expires) {
        State last=null;int attempted=0,confirmed=0,matching=-1;
        long begin=port.now(),deadline=Math.min(expires,begin+RUN_MS);
        try {
            if(expires<=begin || expires-begin>REVIEW_MS)throw new IllegalStateException("EXPIRED");
            last=port.read();matching=mask(last,target);
            if(!last.revision.equals(expectedRevision))throw new IllegalStateException("SOURCE_CHANGED");
            if(!last.nap.sameDay() || !target.nap.sameDay())throw new IllegalStateException("NAP_RANGE");
            if(matching==7)return new Result(Status.NO_CHANGE,"NO_CHANGE",0,0,7);
            port.prepare();
            for(int field:order(last,target)) {
                if(last.value(field).equals(target.value(field)))continue;
                checkTime(port,begin,deadline);
                State before=port.read();matching=mask(before,target);
                if(!before.revision.equals(last.revision))throw new IllegalStateException("SOURCE_CHANGED");
                checkTime(port,begin,deadline);
                attempted|=1<<field; // A transport exception after here is an unknown remote outcome.
                Ack ack=port.send(field,target.value(field));
                while(true) {
                    checkTime(port,begin,deadline);
                    State current=port.read();matching=mask(current,target);
                    for(int other=0;other<3;other++)
                        if(other!=field && !current.value(other).equals(before.value(other)))throw new IllegalStateException("SOURCE_CHANGED");
                    Integer status=ack.status();
                    if(status!=null && status!=0)throw new IllegalStateException("OFFICIAL_REJECTED");
                    if(current.value(field).equals(target.value(field)) && status!=null) {
                        confirmed|=1<<field;last=current;break;
                    }
                    if(!current.value(field).equals(before.value(field)) && !current.value(field).equals(target.value(field)))throw new IllegalStateException("SOURCE_CHANGED");
                    port.pause();
                }
            }
            checkTime(port,begin,deadline);
            State after=port.read();matching=mask(after,target);
            if(matching!=7 || !after.revision.equals(last.revision))throw new IllegalStateException("SOURCE_CHANGED");
            return new Result(Status.APPLIED,"READBACK_MATCHED",attempted,confirmed,matching);
        } catch(Exception failure) {
            String code=failure.getMessage();
            if(code==null || !code.matches("[A-Z_]{1,64}"))code="VERIFY_FAILED";
            return new Result(attempted==0?Status.REJECTED:Status.UNCERTAIN,code,attempted,confirmed,matching);
        }
    }
    private static void checkTime(Port port,long begin,long deadline) {
        long now=port.now();if(now<begin || now>=deadline)throw new IllegalStateException("TIMEOUT");
    }
}
