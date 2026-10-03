package com.heytap.accessory;

import android.content.Context;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.ResourceParserException;
import com.heytap.accessory.utils.ServiceXmlReader;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes14.dex */
public class RegistrationTask {
    private static final String TAG = "RegistrationTask";
    private Context mContext;
    private FutureTask<Void> mFutureTask;
    private boolean mIsRunning;
    private TaskRunner mRegistrationTask;

    public class TaskRunner implements Callable<Void> {
        private TaskRunner() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            BaseAdapter defaultAdapter = BaseAdapter.getDefaultAdapter(RegistrationTask.this.mContext);
            defaultAdapter.bindToFramework();
            try {
                byte[][] xml = ServiceXmlReader.getInstance(RegistrationTask.this.mContext).readXml(RegistrationTask.this.mContext.getPackageName());
                SdkLog.i(RegistrationTask.TAG, "xmlArray.length=" + xml.length);
                int i = 0;
                boolean z = false;
                while (i < xml.length) {
                    try {
                        try {
                            defaultAdapter.registerServices(xml[i]);
                            SdkLog.i(RegistrationTask.TAG, "Services Registered successfully!");
                            z = i == xml.length - 1;
                            if (z) {
                                RegistrationTask.this.mIsRunning = false;
                            }
                            i++;
                        } catch (GeneralException e2) {
                            SdkLog.e(RegistrationTask.TAG, "Registration failed!", e2);
                            throw e2;
                        }
                    } catch (Throwable th) {
                        if (z) {
                            RegistrationTask.this.mIsRunning = false;
                        }
                        throw th;
                    }
                }
                return null;
            } catch (ResourceParserException e3) {
                SdkLog.e(RegistrationTask.TAG, e3);
                throw new Exception(e3);
            }
        }
    }

    public RegistrationTask(Context context) {
        if (context != null) {
            this.mContext = context;
            return;
        }
        throw new IllegalArgumentException("Invalid context:" + ((Object) null));
    }

    public synchronized Future<Void> prepare() {
        FutureTask<Void> futureTask;
        if (this.mRegistrationTask != null || this.mFutureTask != null) {
            throw new IllegalStateException("RegistrationTask instance cannot be reused");
        }
        this.mRegistrationTask = new TaskRunner();
        futureTask = new FutureTask<>(this.mRegistrationTask);
        this.mFutureTask = futureTask;
        return futureTask;
    }

    public synchronized void start() {
        if (this.mRegistrationTask == null || this.mFutureTask == null) {
            throw new IllegalStateException("Prepare not called");
        }
        if (this.mIsRunning) {
            SdkLog.e(TAG, "Registration task has already started");
            throw new IllegalStateException("Registration task is already running!");
        }
        new Thread(this.mFutureTask, "RegistrationThread").start();
        this.mIsRunning = true;
    }
}
