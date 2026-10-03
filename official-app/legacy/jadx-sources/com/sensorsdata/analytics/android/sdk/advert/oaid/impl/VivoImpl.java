package com.sensorsdata.analytics.android.sdk.advert.oaid.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.oplus.aiunit.vision.lkm;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID;
import com.sensorsdata.analytics.android.sdk.advert.oaid.OAIDRom;

/* JADX INFO: loaded from: classes10.dex */
class VivoImpl implements IRomOAID {
    private static final String TAG = "SA.VivoImpl";
    private final Context mContext;

    public VivoImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public String getRomOAID() {
        String str;
        Cursor cursor = null;
        string = null;
        string = null;
        String string = null;
        try {
            Cursor cursorQuery = this.mContext.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && ((string = cursorQuery.getString(cursorQuery.getColumnIndex("value"))) == null || string.length() == 0)) {
                        SALog.i(TAG, "OAID query failed");
                    }
                } catch (Throwable th) {
                    th = th;
                    String str2 = string;
                    cursor = cursorQuery;
                    str = str2;
                    try {
                        SALog.i(TAG, th);
                        return str;
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
            if (cursorQuery == null) {
                return string;
            }
            cursorQuery.close();
            return string;
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public boolean isSupported() {
        try {
            return OAIDRom.sysProperty(lkm.f13753c, "0").equals("1");
        } catch (Throwable th) {
            SALog.i(TAG, th);
            return false;
        }
    }
}
