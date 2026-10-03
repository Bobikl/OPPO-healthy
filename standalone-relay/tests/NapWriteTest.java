package com.example.opponotificationrelay;
import java.util.*;

public final class NapWriteTest {
    static int checks;
    static void ok(boolean value){checks++;if(!value)throw new AssertionError("check "+checks);}
    static String rev(long n){return String.format(Locale.ROOT,"%064x",n);}
    static NapWritePolicy.State state(boolean on,int start,int duration,long v) {
        return new NapWritePolicy.State(new OfficialSettingsPreview.Nap(on,start,duration,rev(v)),rev(v));
    }
    static final class Fake implements NapWritePolicy.Port {
        NapWritePolicy.State current;long clock=1000,version=1,appliedAt;int calls,prepareCalls,failAt,timeoutAt,throwAt,accountAt;
        int field=-1;String desired;boolean pending,slowAck,prepareChanges;
        final List<Integer> order=new ArrayList<>();
        Fake(NapWritePolicy.State s){current=s;}
        public long now(){return clock;}
        public void pause(){clock+=250;}
        public void prepare(){prepareCalls++;if(prepareChanges)current=state(current.nap.enabled,current.nap.start,current.nap.duration,++version);}
        public NapWritePolicy.State read() {
            if(accountAt!=0 && calls>=accountAt)throw new IllegalStateException("ACCOUNT_CHANGED");
            if(pending && clock>=appliedAt) {
                boolean on=field==0?"1".equals(desired):current.nap.enabled;
                int start=field==1?Integer.parseInt(desired.substring(0,2))*60+Integer.parseInt(desired.substring(3)):current.nap.start;
                int duration=field==2?Integer.parseInt(desired):current.nap.duration;
                current=state(on,start,duration,++version);pending=false;
                ok(current.nap.sameDay());
            }
            return current;
        }
        public NapWritePolicy.Ack send(int index,String value) {
            calls++;order.add(index);field=index;desired=value;
            if(calls==throwAt)throw new IllegalStateException("TRANSPORT");
            pending=calls!=failAt && calls!=timeoutAt;
            appliedAt=clock+500;
            long ackAt=clock+(slowAck?1000:250);int status=calls==failAt?100002:0;
            return ()->clock>=ackAt?status:null;
        }
    }
    static NapWritePolicy.Result run(Fake f,NapWritePolicy.State target) {
        return NapWritePolicy.run(f,rev(1),target,f.clock+120000);
    }
    static SettingsImportPlan.Local local(boolean on,int start,int end,int cid) {
        return new SettingsImportPlan.Local(Collections.emptySet(),on,start,end,cid,15);
    }
    static final class Discovery implements NapWritePolicy.Discovery<Object> {
        long clock=1000;int calls,readyAfter,failAt;boolean backwards,interrupt;
        final Object binder=new Object();
        public long now(){return clock;}
        public Object peek() {
            calls++;if(calls==failAt)throw new SecurityException("DENIED");
            return calls>readyAfter?binder:null;
        }
        public void pause()throws Exception {
            if(interrupt)throw new InterruptedException();
            clock+=backwards?-250:250;
        }
    }
    static void discoveryTests()throws Exception {
        Discovery immediate=new Discovery();
        ok(NapWritePolicy.awaitPublished(immediate)==immediate.binder);ok(immediate.calls==1);
        Discovery delayed=new Discovery();delayed.readyAfter=8;
        ok(NapWritePolicy.awaitPublished(delayed)==delayed.binder);ok(delayed.calls==9);ok(delayed.clock==3000);
        Discovery never=new Discovery();never.readyAfter=100;
        try{NapWritePolicy.awaitPublished(never);throw new AssertionError();}
        catch(IllegalStateException e){ok(e.getMessage().equals("SERVICE_NOT_PUBLISHED"));}
        ok(never.calls==16);ok(never.clock==5000);
        Discovery denied=new Discovery();denied.failAt=1;
        try{NapWritePolicy.awaitPublished(denied);throw new AssertionError();}
        catch(SecurityException e){ok(denied.calls==1);}
        Discovery backwards=new Discovery();backwards.readyAfter=5;backwards.backwards=true;
        try{NapWritePolicy.awaitPublished(backwards);throw new AssertionError();}
        catch(IllegalStateException e){ok(backwards.calls==1);}
        Discovery interrupted=new Discovery();interrupted.readyAfter=5;interrupted.interrupt=true;
        try{NapWritePolicy.awaitPublished(interrupted);throw new AssertionError();}
        catch(InterruptedException e){ok(interrupted.calls==1);}
    }
    public static void main(String[] args)throws Exception {
        discoveryTests();
        for(int a=0;a<8;a++)for(int b=0;b<8;b++) {
            NapWritePolicy.State from=state((a&1)!=0,(a&2)!=0?750:740,(a&4)!=0?70:60,1);
            NapWritePolicy.State target=state((b&1)!=0,(b&2)!=0?750:740,(b&4)!=0?70:60,1);
            Fake f=new Fake(from);f.slowAck=(a&1)==0;
            NapWritePolicy.Result r=run(f,target);
            ok(r.status==(a==b?NapWritePolicy.Status.NO_CHANGE:NapWritePolicy.Status.APPLIED));
            ok(r.matching==7);ok(f.calls==Integer.bitCount((~NapWritePolicy.mask(from,target))&7));
            ok(r.attempted==r.confirmed);ok(new HashSet<>(f.order).size()==f.calls);
            if((a&1)!=(b&1))ok(f.order.get((b&1)==0?0:f.order.size()-1)==0);
        }
        Fake crossing=new Fake(state(true,700,600,1));
        ok(run(crossing,state(true,1300,60,1)).status==NapWritePolicy.Status.APPLIED);
        ok(crossing.order.equals(Arrays.asList(2,1)));
        Fake no=new Fake(state(true,750,60,1));ok(run(no,no.current).status==NapWritePolicy.Status.NO_CHANGE);ok(no.prepareCalls==0);
        Fake stale=new Fake(state(true,750,60,2));ok(run(stale,state(true,740,70,1)).status==NapWritePolicy.Status.REJECTED);ok(stale.calls==0);
        Fake before=new Fake(state(true,750,60,1));before.prepareChanges=true;
        ok(run(before,state(false,740,70,1)).status==NapWritePolicy.Status.REJECTED);ok(before.calls==0);
        for(int at=1;at<=3;at++) {
            Fake timeout=new Fake(state(false,750,60,1));timeout.timeoutAt=at;
            NapWritePolicy.Result r=run(timeout,state(true,740,70,1));
            ok(r.status==NapWritePolicy.Status.UNCERTAIN);ok(timeout.calls==at);ok(Integer.bitCount(r.confirmed)==at-1);ok(r.code.equals("TIMEOUT"));
            Fake fail=new Fake(state(false,750,60,1));fail.failAt=at;
            r=run(fail,state(true,740,70,1));ok(r.status==NapWritePolicy.Status.UNCERTAIN);ok(fail.calls==at);ok(r.code.equals("OFFICIAL_REJECTED"));
            Fake lost=new Fake(state(false,750,60,1));lost.throwAt=at;
            r=run(lost,state(true,740,70,1));ok(r.status==NapWritePolicy.Status.UNCERTAIN);ok(lost.calls==at);
            Fake account=new Fake(state(false,750,60,1));account.accountAt=at;
            r=run(account,state(true,740,70,1));ok(r.status==NapWritePolicy.Status.UNCERTAIN);ok(account.calls==at);ok(r.code.equals("ACCOUNT_CHANGED"));
        }
        Fake expires=new Fake(state(true,750,60,1));
        ok(NapWritePolicy.run(expires,rev(1),state(false,750,60,1),1000).status==NapWritePolicy.Status.REJECTED);ok(expires.calls==0);
        ok(NapWritePolicy.run(expires,rev(1),state(false,750,60,1),999999).status==NapWritePolicy.Status.REJECTED);
        NapWritePolicy.Plan plan=new NapWritePolicy.Plan(state(true,750,60,1).nap,local(true,740,810,200),1000);
        ok(plan.changes());ok(!plan.expired(121000));ok(plan.expired(121001));ok(plan.expired(999));
        ok(plan.localMatches(local(true,740,810,200)));ok(!plan.localMatches(local(true,740,810,1)));
        ok(!plan.localMatches(local(false,740,810,200)));ok(!plan.localMatches(local(true,741,810,200)));
        try {new NapWritePolicy.Plan(new OfficialSettingsPreview.Nap(true,750,60),local(true,740,810,200),1000);throw new AssertionError();}
        catch(IllegalArgumentException expected){ok(expected.getMessage().equals("SOURCE_UNREAD"));}
        try {new NapWritePolicy.Plan(state(true,750,60,1).nap,local(true,740,810,1),1000);throw new AssertionError();}
        catch(IllegalArgumentException expected){ok(expected.getMessage().equals("NAP_PROTOCOL"));}
        System.out.println("NapWriteTest: "+checks+" checks passed");
    }
}
