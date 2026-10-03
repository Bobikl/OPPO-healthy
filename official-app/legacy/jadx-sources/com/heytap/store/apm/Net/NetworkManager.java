package com.heytap.store.apm.Net;

import android.os.Handler;
import android.os.Looper;
import com.heytap.store.apm.Net.data.NetworkRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class NetworkManager {
    private static final int MAX_SIZE = 100;
    private int mGetCount;
    private int mPostCount;
    private long mStartTime;
    private int mTotalCount;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private AtomicBoolean mIsActive = new AtomicBoolean(false);
    private List<NetworkRecord> mRecords = Collections.synchronizedList(new ArrayList());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static class b {
        public static NetworkManager a = new NetworkManager();
    }

    public static NetworkManager get() {
        return b.a;
    }

    public static boolean isActive() {
        return get().mIsActive.get();
    }

    public void addRecord(String str, NetworkRecord networkRecord) {
        if (this.mRecords.size() > 100) {
            this.mRecords.remove(0);
        }
        if (networkRecord.isPostRecord()) {
            this.mPostCount++;
        } else if (networkRecord.isGetRecord()) {
            this.mGetCount++;
        }
        this.mTotalCount++;
        this.mRecords.add(networkRecord);
        updateRecord(networkRecord, true);
    }

    public int getGetCount() {
        return this.mGetCount;
    }

    public int getPostCount() {
        return this.mPostCount;
    }

    public NetworkRecord getRecord(String str) {
        for (NetworkRecord networkRecord : this.mRecords) {
            if (networkRecord.getRequestId() != null && networkRecord.getRequestId().equals(str)) {
                return networkRecord;
            }
        }
        return null;
    }

    public List<NetworkRecord> getRecords() {
        return this.mRecords;
    }

    public long getRunningTime() {
        long j2 = this.mStartTime;
        return j2 == 0 ? j2 : System.currentTimeMillis() - this.mStartTime;
    }

    public int getTotalCount() {
        return this.mTotalCount;
    }

    public long getTotalRequestSize() {
        Iterator<NetworkRecord> it = this.mRecords.iterator();
        long requestLength = 0;
        while (it.hasNext()) {
            requestLength += it.next().getRequestLength();
        }
        return requestLength;
    }

    public long getTotalResponseSize() {
        Iterator<NetworkRecord> it = this.mRecords.iterator();
        long responseLength = 0;
        while (it.hasNext()) {
            responseLength += it.next().getResponseLength();
        }
        return responseLength;
    }

    public long getTotalSize() {
        long requestLength = 0;
        for (NetworkRecord networkRecord : this.mRecords) {
            requestLength = requestLength + networkRecord.getRequestLength() + networkRecord.getResponseLength();
        }
        return requestLength;
    }

    public void startMonitor() {
        if (this.mIsActive.get()) {
            return;
        }
        this.mIsActive.set(true);
        this.mStartTime = System.currentTimeMillis();
    }

    public void stopMonitor() {
        if (this.mIsActive.get()) {
            this.mIsActive.set(false);
            this.mStartTime = 0L;
        }
    }

    public void updateRecord(NetworkRecord networkRecord, boolean z) {
        this.mHandler.post(new a());
    }
}
