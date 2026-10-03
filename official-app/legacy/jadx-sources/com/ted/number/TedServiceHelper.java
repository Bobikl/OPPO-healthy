package com.ted.number;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.ted.number.entrys.RecognitionNumber;
import com.ted.number.entrys.RequestData;
import com.ted.number.service.INumberService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class TedServiceHelper {
    public static final int BIND_TIMEOUT = 3000;
    public static final int DATA_TYPE_PHONE = 3;
    public static final int QUERY_TIMEOUT = 5000;
    private static final String SERVICE_ACTION = "com.ted.number.service";
    private static final String SERVICE_PACKAGE = "com.ted.number";
    private static final String TAG = "TedServiceHelper";
    private static volatile TedServiceHelper sInstance;
    private volatile INumberService iNumberService;
    private CountDownLatch latch;
    private final ServiceConnection mServiceConn = new ServiceConnection() { // from class: com.ted.number.TedServiceHelper.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a7b.f(TedServiceHelper.TAG, "onServiceConnected...");
            TedServiceHelper.this.iNumberService = INumberService.Stub.asInterface(iBinder);
            TedServiceHelper.this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a7b.f(TedServiceHelper.TAG, "onServiceDisconnected...");
            TedServiceHelper.this.iNumberService = null;
            TedServiceHelper.this.latch.countDown();
        }
    };

    private TedServiceHelper() {
    }

    private void bindService() {
        try {
            a7b.f(TAG, "start bind service ...");
            Intent intent = new Intent(SERVICE_ACTION);
            intent.setPackage(SERVICE_PACKAGE);
            b78.a().getApplicationContext().bindService(intent, this.mServiceConn, 1);
        } catch (Exception e2) {
            a7b.b(TAG, "bindService, exception = " + e2);
        }
    }

    public static synchronized TedServiceHelper getInstance() {
        if (sInstance == null) {
            synchronized (TedServiceHelper.class) {
                if (sInstance == null) {
                    sInstance = new TedServiceHelper();
                }
            }
        }
        return sInstance;
    }

    private void unbindService() {
        try {
            a7b.f(TAG, "start unbind service ...");
            b78.a().getApplicationContext().unbindService(this.mServiceConn);
            this.iNumberService = null;
        } catch (Exception e2) {
            a7b.b(TAG, "unbindService, exception = " + e2);
        }
    }

    public RecognitionNumber queryNumberInfo(String str, int i) {
        RecognitionNumber recognitionNumberQueryNumberInfo;
        this.latch = new CountDownLatch(1);
        bindService();
        try {
            a7b.f(TAG, "[queryNumberInfo] --> latchResult=" + this.latch.await(3000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e2) {
            a7b.b(TAG, "[queryNumberInfo] --> " + e2.getMessage());
        }
        RecognitionNumber recognitionNumberQueryNumberInfo2 = null;
        if (this.iNumberService == null) {
            a7b.b(TAG, "[queryNumberInfo] --> iNumberService==null");
            return null;
        }
        try {
            try {
                recognitionNumberQueryNumberInfo = this.iNumberService.queryNumberInfo(new RequestData.Builder().setNumber(str).setDataType(3).setOperationType(i).setTimeout(5000L).setRecordTime(System.currentTimeMillis()).setNetAccessable(true).build());
                unbindService();
            } catch (Throwable th) {
                unbindService();
                throw th;
            }
        } catch (Exception e3) {
            a7b.b(TAG, "[queryNumberInfo] --> " + e3.getMessage());
            try {
                recognitionNumberQueryNumberInfo2 = this.iNumberService.queryNumberInfo(new RequestData.Builder().setNumber(str).setDataType(3).setOperationType(i).setTimeout(5000L).setNetAccessable(true).build());
            } catch (Exception e4) {
                a7b.b(TAG, "[queryNumberInfo] --> " + e4.getMessage());
            }
            unbindService();
            recognitionNumberQueryNumberInfo = recognitionNumberQueryNumberInfo2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[queryNumberInfo] --> ");
        sb.append(recognitionNumberQueryNumberInfo);
        return recognitionNumberQueryNumberInfo;
    }
}
