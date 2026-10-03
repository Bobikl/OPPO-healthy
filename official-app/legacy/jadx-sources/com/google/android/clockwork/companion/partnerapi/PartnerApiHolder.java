package com.google.android.clockwork.companion.partnerapi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.zq8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class PartnerApiHolder implements ServiceConnection {
    private static final String ACTION_PARTNER_API = "com.google.android.wearable.app.action.INVOKE_PARTNER_API";
    private static final int MAX_RETRY_TIMES = 5;
    private static final String PACKAGE_WEAR_OS = "com.google.android.wearable.app";
    private static final String TAG = "PartnerApiHolder";
    private static final PartnerApiHolder sPartnerApiHolder = new PartnerApiHolder();
    private PartnerApi mPartnerApi;
    private CountDownLatch mLock = null;
    private Set<PartApiDeadListener> mDeadListener = new HashSet();
    private IBinder.DeathRecipient mRecipient = new IBinder.DeathRecipient() { // from class: com.google.android.clockwork.companion.partnerapi.PartnerApiHolder.1
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            if (PartnerApiHolder.this.mPartnerApi != null) {
                PartnerApiHolder.this.mPartnerApi.asBinder().unlinkToDeath(this, 0);
                PartnerApiHolder.this.mPartnerApi = null;
                Iterator it = PartnerApiHolder.this.mDeadListener.iterator();
                while (it.hasNext()) {
                    ((PartApiDeadListener) it.next()).onDead();
                }
            }
        }
    };
    private final ExecutorService mExecutor = zq8.e("PartnerAH");

    private PartnerApiHolder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindPartnerApiSync(Context context) {
        Intent intent = new Intent();
        intent.setPackage(PACKAGE_WEAR_OS);
        intent.setAction(ACTION_PARTNER_API);
        Context applicationContext = context.getApplicationContext();
        this.mLock = new CountDownLatch(1);
        try {
            applicationContext.bindService(intent, this, 1);
        } catch (Exception e2) {
            MLog.e(TAG, "bindPartnerApiSync: bind exception " + e2);
        }
        try {
            this.mLock.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            MLog.e(TAG, "bindPartnerApiSync: await exception " + e3);
        }
    }

    private boolean checkHasWearOS(Context context) {
        try {
            context.getPackageManager().getPackageInfo(PACKAGE_WEAR_OS, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static PartnerApiHolder getInstance() {
        return sPartnerApiHolder;
    }

    public void addPartApiDeadListener(PartApiDeadListener partApiDeadListener) {
        this.mDeadListener.add(partApiDeadListener);
    }

    @Nullable
    public synchronized PartnerApi getPartnerApi(@NonNull final Context context) {
        if (!checkHasWearOS(context)) {
            return null;
        }
        PartnerApi partnerApi = this.mPartnerApi;
        if (partnerApi != null) {
            return partnerApi;
        }
        try {
            this.mExecutor.submit(new Callable<PartnerApi>() { // from class: com.google.android.clockwork.companion.partnerapi.PartnerApiHolder.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public PartnerApi call() {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    int i = 0;
                    while (PartnerApiHolder.this.mPartnerApi == null && i < 5) {
                        PartnerApiHolder.this.bindPartnerApiSync(context);
                        i++;
                        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                        StringBuilder sb = new StringBuilder();
                        sb.append("getPartnerApi: retryTime=");
                        sb.append(i);
                        sb.append(" delay=");
                        sb.append(jUptimeMillis2);
                        sb.append(" mPartnerApi=");
                        sb.append(PartnerApiHolder.this.mPartnerApi != null);
                        MLog.d(PartnerApiHolder.TAG, sb.toString());
                    }
                    return PartnerApiHolder.this.mPartnerApi;
                }
            }).get(2L, TimeUnit.SECONDS);
        } catch (Exception e2) {
            MLog.e(TAG, "getPartnerApi: get exception " + e2.toString());
        }
        return this.mPartnerApi;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MLog.d(TAG, "onServiceConnected: " + componentName);
        try {
            PartnerApi partnerApiAsInterface = PartnerApi.Stub.asInterface(iBinder);
            this.mPartnerApi = partnerApiAsInterface;
            partnerApiAsInterface.asBinder().linkToDeath(this.mRecipient, 0);
        } catch (RemoteException e2) {
            MLog.e(TAG, "onServiceConnected: linkToDeath exception " + e2.toString());
        }
        this.mLock.countDown();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        MLog.w(TAG, "onServiceDisconnected: " + componentName);
        PartnerApi partnerApi = this.mPartnerApi;
        if (partnerApi != null) {
            partnerApi.asBinder().unlinkToDeath(this.mRecipient, 0);
            this.mPartnerApi = null;
        }
        this.mLock.countDown();
    }

    public void removePartApiDeadListener(PartApiDeadListener partApiDeadListener) {
        this.mDeadListener.remove(partApiDeadListener);
    }

    public void setLoggable(boolean z) {
        MLog.setLoggable(z);
    }
}
