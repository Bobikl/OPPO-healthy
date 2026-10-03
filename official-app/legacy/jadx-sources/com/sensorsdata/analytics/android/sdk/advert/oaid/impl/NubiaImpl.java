package com.sensorsdata.analytics.android.sdk.advert.oaid.impl;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID;

/* JADX INFO: loaded from: classes10.dex */
class NubiaImpl implements IRomOAID {
    private static final String TAG = "SA.NubiaImpl";
    private final Context mContext;

    public NubiaImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public String getRomOAID() {
        String string = null;
        if (!isSupported()) {
            SALog.i(TAG, "Only supports Android 10.0 and above for Nubia");
            return null;
        }
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.mContext.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            if (contentProviderClientAcquireContentProviderClient == null) {
                return null;
            }
            Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
            contentProviderClientAcquireContentProviderClient.close();
            if (bundleCall == null) {
                SALog.i(TAG, "OAID query failed: bundle is null");
                return null;
            }
            string = bundleCall.getInt("code", -1) == 0 ? bundleCall.getString("id") : null;
            SALog.i(TAG, "OAID query success: " + string);
            return string;
        } catch (Throwable th) {
            SALog.i(TAG, th);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public boolean isSupported() {
        return true;
    }
}
