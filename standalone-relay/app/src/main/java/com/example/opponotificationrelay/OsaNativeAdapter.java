package com.example.opponotificationrelay;

import android.os.Looper;
import com.heytap.health.osahssdkself.OsahsSDKNative;
import com.heytap.health.osahssdkself.bean.OsaSummaryBean;
import com.heytap.health.osahssdkself.bean.SnoreInfoBean;
import java.io.IOException;

/** One native audio session per process. Native state is global, not per Java object. */
public final class OsaNativeAdapter implements AutoCloseable {
    public static final int SAMPLE_RATE = 8000;
    // Official recorder reads 2048 PCM bytes and converts them to 1024 little-endian shorts.
    public static final int FRAME_SAMPLES = 1024;
    private static final Object LOCK = new Object();
    private static OsaNativeAdapter owner;
    private final Thread thread;
    private final boolean unprocessed;
    private boolean open;
    private long samples;

    private OsaNativeAdapter(boolean unprocessed) { this.thread=Thread.currentThread(); this.unprocessed=unprocessed; }
    public static OsaNativeAdapter begin(boolean unprocessed) throws IOException {
        if (Looper.myLooper()==Looper.getMainLooper()) throw new IOException("OSA_MAIN_THREAD");
        synchronized(LOCK) {
            if(owner!=null) throw new IOException("OSA_SESSION_BUSY");
            OsaNativeAdapter value=new OsaNativeAdapter(unprocessed);
            try {
                if(OsahsSDKNative.init()!=0) throw new IOException("OSA_INIT_FAILED");
                value.open=true;owner=value;return value;
            } catch(LinkageError e) { throw new IOException("OSA_NATIVE_UNAVAILABLE",e); }
        }
    }
    private void requireOpen() throws IOException {
        if(Thread.currentThread()!=thread) throw new IOException("OSA_WRONG_THREAD");
        if(!open || owner!=this) throw new IOException("OSA_SESSION_CLOSED");
    }
    public SnoreInfoBean process(short[] frame) throws IOException {
        synchronized(LOCK) {
            requireOpen();
            if(frame==null || frame.length!=FRAME_SAMPLES) throw new IOException("OSA_FRAME_SIZE");
            SnoreInfoBean result=unprocessed?OsahsSDKNative.snoreMonitorUnprocess(frame):OsahsSDKNative.snoreMonitor(frame);
            if(result==null) throw new IOException("OSA_FRAME_FAILED");
            samples+=frame.length;return result;
        }
    }
    public long samples() { synchronized(LOCK) { return samples; } }
    public OsaSummaryBean finish() throws IOException {
        synchronized(LOCK) {
            requireOpen();
            try {
                OsaSummaryBean result=OsahsSDKNative.summary();
                if(result==null) throw new IOException("OSA_SUMMARY_FAILED");
                return result;
            } finally { close(); }
        }
    }
    @Override public void close() throws IOException {
        synchronized(LOCK) {
            if(!open)return;
            requireOpen();
            try {
                if(OsahsSDKNative.deinit()!=0) throw new IOException("OSA_DEINIT_FAILED");
            } finally { open=false;owner=null; }
        }
    }
}
