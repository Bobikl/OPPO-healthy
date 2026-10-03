package com.sensorsdata.analytics.android.sdk.advert.oaid.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID;

/* JADX INFO: loaded from: classes10.dex */
class MeizuImpl implements IRomOAID {
    private static final String TAG = "SA.MeizuImpl";
    private final Context mContext;

    public MeizuImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public String getRomOAID() {
        String string = null;
        try {
            Cursor cursorQuery = this.mContext.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                return null;
            }
            string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
            SALog.i(TAG, "OAID query success: " + string);
            cursorQuery.close();
            return string;
        } catch (Throwable th) {
            SALog.i(TAG, th);
            return string;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public boolean isSupported() {
        return true;
    }
}
