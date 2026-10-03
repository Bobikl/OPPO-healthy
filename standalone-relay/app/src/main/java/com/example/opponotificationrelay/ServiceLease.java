package com.example.opponotificationrelay;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/** One bounded service connection, released on every completion or failed acquisition. */
public final class ServiceLease<T> implements AutoCloseable {
    public interface Callback<T> {
        void connected(T value);
        void failed(String code);
    }
    public interface Connector<T> {
        boolean bind(Callback<T> callback) throws Exception;
        void unbind() throws Exception;
    }
    private final Connector<T> connector;
    private final CountDownLatch ready=new CountDownLatch(1);
    private T service;
    private String failure;
    private boolean attempted,closed;
    private ServiceLease(Connector<T> connector){this.connector=connector;}
    public static <T> ServiceLease<T> acquire(Connector<T> connector,long timeoutMs)throws Exception {
        if(timeoutMs<1 || timeoutMs>10000)throw new IllegalArgumentException("LEASE_TIMEOUT_RANGE");
        ServiceLease<T> lease=new ServiceLease<>(connector);
        try {
            lease.attempted=true;
            boolean accepted=connector.bind(new Callback<T>() {
                public void connected(T value){lease.connected(value);}
                public void failed(String code){lease.failed(code);}
            });
            if(!accepted)throw new IllegalStateException("LEASE_BIND_FAILED");
            if(!lease.ready.await(timeoutMs,TimeUnit.MILLISECONDS))throw new IllegalStateException("LEASE_BIND_TIMEOUT");
            lease.value();return lease;
        } catch(Exception failure) {
            try{lease.close();}catch(Exception cleanup){failure.addSuppressed(cleanup);}
            throw failure;
        }
    }
    private synchronized void connected(T value) {
        if(closed || failure!=null || service!=null)return;
        if(value==null)failure="LEASE_NULL_BINDING";else service=value;
        ready.countDown();
    }
    private synchronized void failed(String code) {
        if(closed)return;
        failure=code!=null&&code.matches("LEASE_[A-Z_]{1,48}")?code:"LEASE_BIND_FAILED";
        service=null;ready.countDown();
    }
    public synchronized T value() {
        if(closed)throw new IllegalStateException("LEASE_CLOSED");
        if(failure!=null)throw new IllegalStateException(failure);
        if(service==null)throw new IllegalStateException("LEASE_NOT_READY");
        return service;
    }
    @Override public void close()throws Exception {
        synchronized(this){if(closed)return;closed=true;service=null;ready.countDown();}
        if(attempted)connector.unbind();
    }
}
