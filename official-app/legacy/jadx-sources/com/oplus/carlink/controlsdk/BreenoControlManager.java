package com.oplus.carlink.controlsdk;

import OO0.b;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.d1d;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class BreenoControlManager {
    private static final String TAG = "BreenoControlManager";
    private static volatile BreenoControlManager sInstance;
    private static Object sLock = new Object();
    private Context mContext;
    private volatile boolean mInitialized = false;
    private OO0.a mControlImpl = new OO0.a();

    public static BreenoControlManager getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new BreenoControlManager();
                }
            }
        }
        return sInstance;
    }

    @Nullable
    public Context getContext() {
        return this.mContext;
    }

    public void init(@NonNull Context context) {
        if (context == null) {
            d1d.c(TAG, "Context is null when initialize the sdk.");
        } else {
            this.mInitialized = true;
            this.mContext = context.getApplicationContext();
        }
    }

    @Nullable
    public String onControl(String str) {
        if (TextUtils.isEmpty(str)) {
            d1d.c(TAG, "Command is empty when execute control command.");
            return null;
        }
        if (this.mContext != null) {
            return this.mControlImpl.c(str);
        }
        d1d.e(TAG, "Sdk is not initialized when control command.");
        return null;
    }

    public void quit() {
        if (this.mInitialized) {
            this.mInitialized = false;
            OO0.a aVar = this.mControlImpl;
            aVar.a.a("breeno_control", "quit", null);
            b bVar = aVar.a;
            bVar.getClass();
            Context context = CarControlManager.getInstance().getContext();
            if (context != null) {
                context.unbindService(bVar.f);
            }
            aVar.a = null;
            this.mContext = null;
            synchronized (sLock) {
                sInstance = null;
            }
        }
    }

    public void showNotification(String str) {
        if (this.mContext == null) {
            d1d.e(TAG, "Sdk is not initialized when control command.");
            return;
        }
        OO0.a aVar = this.mControlImpl;
        if (aVar != null) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_result_json", str);
            b bVar = aVar.a;
            if (bVar != null) {
                bVar.a("breeno_control", "show_notification", bundle);
            }
        }
    }
}
