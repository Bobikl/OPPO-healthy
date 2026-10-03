package com.coloros.sceneservice.f;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.coloros.sceneservice.dataprovider.bean.PhoneStatusInfo;

/* JADX INFO: loaded from: classes13.dex */
public class b extends a {
    public static final String TAG = "PhoneStatusManager";
    public static volatile b sInstance;

    public b(Context context) {
        super(context);
    }

    public static b getInstance(Context context) {
        if (sInstance == null) {
            synchronized (b.class) {
                if (sInstance == null) {
                    sInstance = new b(context);
                }
            }
        }
        return sInstance;
    }

    @Override // com.coloros.sceneservice.f.a
    public Uri getUri() {
        return com.coloros.sceneservice.e.a.URL;
    }

    public PhoneStatusInfo query() {
        return (PhoneStatusInfo) a((String) null, (String[]) null, (String) null);
    }

    @Override // com.coloros.sceneservice.f.a
    public PhoneStatusInfo a(Cursor cursor) {
        PhoneStatusInfo phoneStatusInfo = new PhoneStatusInfo();
        phoneStatusInfo.mOppoToken = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.ta);
        phoneStatusInfo.mCurrentLatitude = com.coloros.sceneservice.m.c.a(cursor, com.coloros.sceneservice.e.a.ua).doubleValue();
        phoneStatusInfo.mCurrentLongitude = com.coloros.sceneservice.m.c.a(cursor, com.coloros.sceneservice.e.a.va).doubleValue();
        phoneStatusInfo.mConnectedWifiName = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.wa);
        phoneStatusInfo.mConnectedWifiBssid = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.xa);
        phoneStatusInfo.mAroundWifiBssid_1 = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.Da);
        phoneStatusInfo.mAroundWifiName_1 = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.ya);
        phoneStatusInfo.mAroundWifiBssid_2 = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.Ea);
        phoneStatusInfo.mAroundWifiName_2 = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.za);
        phoneStatusInfo.mAroundWifiBssid_3 = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.Fa);
        phoneStatusInfo.mAroundWifiName_3 = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.Aa);
        phoneStatusInfo.mAroundWifiBssid_4 = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.Ga);
        phoneStatusInfo.mAroundWifiName_4 = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.Ba);
        phoneStatusInfo.mAroundWifiBssid_5 = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.Ha);
        phoneStatusInfo.mAroundWifiName_5 = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.Ca);
        phoneStatusInfo.mLastSuccessfulUpdateLocationTime = com.coloros.sceneservice.m.c.d(cursor, com.coloros.sceneservice.e.a.Ia).longValue();
        phoneStatusInfo.mCurrentLocationInfo = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.Ja);
        phoneStatusInfo.mLastLocationInfo = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.a.Ka);
        return phoneStatusInfo;
    }

    @Override // com.coloros.sceneservice.f.a
    public ContentValues a(PhoneStatusInfo phoneStatusInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", (Integer) 1);
        contentValues.put(com.coloros.sceneservice.e.a.ta, phoneStatusInfo.mOppoToken);
        contentValues.put(com.coloros.sceneservice.e.a.ua, Double.valueOf(phoneStatusInfo.mCurrentLatitude));
        contentValues.put(com.coloros.sceneservice.e.a.va, Double.valueOf(phoneStatusInfo.mCurrentLongitude));
        contentValues.put(com.coloros.sceneservice.e.a.xa, phoneStatusInfo.mConnectedWifiBssid);
        contentValues.put(com.coloros.sceneservice.e.a.wa, phoneStatusInfo.mConnectedWifiName);
        contentValues.put(com.coloros.sceneservice.e.a.Da, phoneStatusInfo.mAroundWifiBssid_1);
        contentValues.put(com.coloros.sceneservice.e.a.ya, phoneStatusInfo.mAroundWifiName_1);
        contentValues.put(com.coloros.sceneservice.e.a.Ea, phoneStatusInfo.mAroundWifiBssid_2);
        contentValues.put(com.coloros.sceneservice.e.a.za, phoneStatusInfo.mAroundWifiName_2);
        contentValues.put(com.coloros.sceneservice.e.a.Fa, phoneStatusInfo.mAroundWifiBssid_3);
        contentValues.put(com.coloros.sceneservice.e.a.Aa, phoneStatusInfo.mAroundWifiName_3);
        contentValues.put(com.coloros.sceneservice.e.a.Ga, phoneStatusInfo.mAroundWifiBssid_4);
        contentValues.put(com.coloros.sceneservice.e.a.Ba, phoneStatusInfo.mAroundWifiName_4);
        contentValues.put(com.coloros.sceneservice.e.a.Ha, phoneStatusInfo.mAroundWifiBssid_5);
        contentValues.put(com.coloros.sceneservice.e.a.Ca, phoneStatusInfo.mAroundWifiName_5);
        contentValues.put(com.coloros.sceneservice.e.a.Ia, Long.valueOf(phoneStatusInfo.mLastSuccessfulUpdateLocationTime));
        contentValues.put(com.coloros.sceneservice.e.a.Ja, phoneStatusInfo.mCurrentLocationInfo);
        contentValues.put(com.coloros.sceneservice.e.a.Ka, phoneStatusInfo.mLastLocationInfo);
        return contentValues;
    }

    public boolean a(Context context, ContentObserver contentObserver, boolean z) {
        try {
            context.getContentResolver().registerContentObserver(getUri(), z, contentObserver);
            return true;
        } catch (Throwable th) {
            com.coloros.sceneservice.m.f.e(TAG, "registerContentObserver: throwable " + th);
            return false;
        }
    }

    public boolean a(Context context, ContentObserver contentObserver) {
        try {
            context.getContentResolver().unregisterContentObserver(contentObserver);
            return true;
        } catch (Throwable th) {
            com.coloros.sceneservice.m.f.e(TAG, "unRegisterContentObserver: throwable " + th);
            return false;
        }
    }
}
