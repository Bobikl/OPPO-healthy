package com.example.opponotificationrelay;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
public final class ServiceLeaseTest {
    static int checks;
    static void ok(boolean b){checks++;if(!b)throw new AssertionError("check "+checks);}
    static final class Fake implements ServiceLease.Connector<Object> {
        final Object first=new Object(),second=new Object();
        ServiceLease.Callback<Object> callback;int binds,unbinds,mode;boolean releaseFails;
        public boolean bind(ServiceLease.Callback<Object> c)throws Exception {
            binds++;callback=c;
            switch(mode) {
                case 1:return false;
                case 2:throw new SecurityException("blocked");
                case 3:c.connected(null);return true;
                case 4:c.failed("LEASE_BINDING_DIED");return true;
                case 5:return true;
                case 6:c.connected(first);c.failed("LEASE_DISCONNECTED");return true;
                case 7:c.connected(first);c.connected(second);return true;
                case 8:
                    Thread later=new Thread(()->{try{Thread.sleep(20);}catch(InterruptedException e){throw new AssertionError(e);}c.connected(first);});
                    later.setDaemon(true);later.start();return true;
                default:c.connected(first);return true;
            }
        }
        public void unbind()throws Exception{unbinds++;if(releaseFails)throw new Exception("release");}
    }
    static void failed(Fake fake,String expected)throws Exception {
        try{ServiceLease.acquire(fake,5);throw new AssertionError("unexpected acquisition");}
        catch(IllegalStateException e){ok(expected.equals(e.getMessage()));}
        ok(fake.binds==1);ok(fake.unbinds==1);
    }
    public static void main(String[] args)throws Exception {
        for(int mode:new int[]{0,7,8}) {
            Fake fake=new Fake();fake.mode=mode;
            ServiceLease<Object> lease=ServiceLease.acquire(fake,1000);
            ok(lease.value()==fake.first);ok(fake.unbinds==0);ok(fake.binds==1);
            lease.close();lease.close();ok(fake.unbinds==1);
            fake.callback.connected(fake.second);
            try{lease.value();throw new AssertionError();}catch(IllegalStateException e){ok(e.getMessage().equals("LEASE_CLOSED"));}
        }
        int[] modes={1,3,4,5,6};
        String[] codes={"LEASE_BIND_FAILED","LEASE_NULL_BINDING","LEASE_BINDING_DIED","LEASE_BIND_TIMEOUT","LEASE_DISCONNECTED"};
        for(int i=0;i<modes.length;i++) {Fake f=new Fake();f.mode=modes[i];failed(f,codes[i]);f.callback.connected(f.first);ok(f.unbinds==1);}
        Fake thrown=new Fake();thrown.mode=2;
        try{ServiceLease.acquire(thrown,10);throw new AssertionError();}
        catch(SecurityException e){ok(thrown.binds==1&&thrown.unbinds==1);}
        Fake disconnected=new Fake();ServiceLease<Object> lease=ServiceLease.acquire(disconnected,10);
        disconnected.callback.failed("LEASE_DISCONNECTED");
        try{lease.value();throw new AssertionError();}catch(IllegalStateException e){ok(e.getMessage().equals("LEASE_DISCONNECTED"));}
        disconnected.callback.connected(disconnected.second);
        try{lease.value();throw new AssertionError();}catch(IllegalStateException e){ok(e.getMessage().equals("LEASE_DISCONNECTED"));}
        lease.close();ok(disconnected.unbinds==1);ok(disconnected.binds==1);
        Fake interrupted=new Fake();interrupted.mode=5;Thread.currentThread().interrupt();
        try{ServiceLease.acquire(interrupted,100);throw new AssertionError();}
        catch(InterruptedException e){ok(interrupted.unbinds==1);}
        ok(!Thread.currentThread().isInterrupted());
        Fake cleanup=new Fake();cleanup.releaseFails=true;ServiceLease<Object> held=ServiceLease.acquire(cleanup,10);
        try{held.close();throw new AssertionError();}catch(Exception e){ok(e.getMessage().equals("release"));}
        held.close();ok(cleanup.unbinds==1);
        Fake both=new Fake();both.mode=1;both.releaseFails=true;
        try{ServiceLease.acquire(both,10);throw new AssertionError();}
        catch(IllegalStateException e){ok(e.getMessage().equals("LEASE_BIND_FAILED"));ok(e.getSuppressed().length==1);}
        ok(both.unbinds==1);
        for(long timeout:new long[]{0,10001}) {
            Fake invalid=new Fake();
            try{ServiceLease.acquire(invalid,timeout);throw new AssertionError();}
            catch(IllegalArgumentException e){ok(invalid.binds==0&&invalid.unbinds==0);}
        }
        System.out.println("ServiceLeaseTest: "+checks+" checks passed");
    }
}
