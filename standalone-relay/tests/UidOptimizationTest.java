package com.example.opponotificationrelay;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

public final class UidOptimizationTest {
    private static int checks;
    private static void check(boolean value) {checks++;if(!value)throw new AssertionError("check "+checks);}
    public static void main(String[] args) {
        ArrayDeque<Runnable> tasks=new ArrayDeque<>();AtomicInteger queries=new AtomicInteger();
        CoalescedRecheck coalescer=new CoalescedRecheck(tasks::add,queries::incrementAndGet);
        for(int i=0;i<1000;i++)coalescer.signal();
        check(tasks.size()==1);check(coalescer.revision()==1000);check(coalescer.pending());
        tasks.remove().run();check(queries.get()==1);check(!coalescer.pending());check(tasks.isEmpty());
        final CoalescedRecheck[] during=new CoalescedRecheck[1];AtomicInteger calls=new AtomicInteger();
        during[0]=new CoalescedRecheck(tasks::add,()->{
            if(calls.incrementAndGet()==1) for(int i=0;i<1000;i++)during[0].signal();
        });
        during[0].signal();tasks.remove().run();check(tasks.size()==1);check(during[0].pending());
        tasks.remove().run();check(calls.get()==2);check(!during[0].pending());
        during[0].signal();check(tasks.size()==1);tasks.remove().run();check(calls.get()==3);
        ObserverStateGate gate=new ObserverStateGate();
        check(gate.publish(0,HandoverPolicy.Presence.OFFLINE,0));
        check(!gate.publish(0,HandoverPolicy.Presence.OFFLINE,0));
        check(gate.publish(1,HandoverPolicy.Presence.OFFLINE,0));
        check(gate.publish(2,HandoverPolicy.Presence.OFFLINE,0));
        check(gate.invalidate());check(!gate.invalidate());
        check(gate.publish(0,HandoverPolicy.Presence.OFFLINE,0));
        check(gate.publish(0,HandoverPolicy.Presence.ONLINE,0));
        check(!gate.publish(0,HandoverPolicy.Presence.ONLINE,0));
        check(gate.publish(0,HandoverPolicy.Presence.ONLINE,1));
        check(gate.publish(0,HandoverPolicy.Presence.ONLINE,0));
        check(ObserverStateGate.cutpoint(20,19)==19);check(ObserverStateGate.cutpoint(21,20)==20);
        check(ObserverStateGate.cutpoint(20,18)==-1);check(ObserverStateGate.cutpoint(0,-1)==-1);
        // AOSP threshold semantics: all real process states on one side, nonexistent on the other.
        int cut=ObserverStateGate.cutpoint(20,19);
        for(int state=0;state<20;state++)check(state<=cut);
        check(!(20<=cut));
        // A transient launch/exit must invalidate the old nine-second confirmation.
        HandoverPolicy policy=new HandoverPolicy();policy.open();policy.sample(HandoverPolicy.Presence.OFFLINE,0);
        long old=policy.revision();check(policy.confirmOffline(old,9000));
        policy.sample(HandoverPolicy.Presence.UNKNOWN,9100);policy.sample(HandoverPolicy.Presence.OFFLINE,9100);
        check(!policy.confirmOffline(old,9200));check(!policy.canOwn(9200));
        check(policy.confirmOffline(policy.revision(),18100));
        policy.sample(HandoverPolicy.Presence.ONLINE,18101);check(!policy.canOwn(18101));
        System.out.println("UID optimization checks passed: "+checks);
    }
}
