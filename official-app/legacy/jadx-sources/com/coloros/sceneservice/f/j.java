package com.coloros.sceneservice.f;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.coloros.sceneservice.dataprovider.bean.UserProfileInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class j extends a {
    public static final String TAG = "UserProfileManager";
    public static volatile j sInstance;

    public j(Context context) {
        super(context);
    }

    public static j getInstance(Context context) {
        if (sInstance == null) {
            synchronized (j.class) {
                if (sInstance == null) {
                    sInstance = new j(context);
                }
            }
        }
        return sInstance;
    }

    private UserProfileInfo query(String str) {
        return (UserProfileInfo) a("tag=?", new String[]{str}, null);
    }

    public boolean b(Context context, ContentObserver contentObserver) {
        try {
            context.getContentResolver().unregisterContentObserver(contentObserver);
            return true;
        } catch (Throwable th) {
            com.coloros.sceneservice.m.f.e(TAG, "unRegisterFinalUserProfileObserver: throwable " + th);
            return false;
        }
    }

    public UserProfileInfo d() {
        ArrayList arrayListA = a(com.coloros.sceneservice.e.e.Jb, null, null, null, null);
        if (com.coloros.sceneservice.m.e.a(arrayListA)) {
            return null;
        }
        return (UserProfileInfo) arrayListA.get(0);
    }

    public UserProfileInfo e() {
        return query("1");
    }

    public UserProfileInfo g() {
        return query("4");
    }

    @Override // com.coloros.sceneservice.f.a
    public Uri getUri() {
        return com.coloros.sceneservice.e.e.URL;
    }

    public UserProfileInfo h() {
        return query("0");
    }

    public boolean registerFinalUserProfileObserver(Context context, ContentObserver contentObserver, boolean z) {
        try {
            context.getContentResolver().registerContentObserver(com.coloros.sceneservice.e.e.Jb, z, contentObserver);
            return true;
        } catch (Throwable th) {
            com.coloros.sceneservice.m.f.e(TAG, "registerFinalUserProfileObserver: throwable " + th);
            return false;
        }
    }

    @Override // com.coloros.sceneservice.f.a
    public UserProfileInfo a(Cursor cursor) {
        UserProfileInfo userProfileInfo = new UserProfileInfo();
        userProfileInfo.mId = com.coloros.sceneservice.m.c.c(cursor, "_id");
        userProfileInfo.mTravelMode = com.coloros.sceneservice.m.c.c(cursor, com.coloros.sceneservice.e.e.tb);
        userProfileInfo.mDefaultMapApp = com.coloros.sceneservice.m.c.c(cursor, com.coloros.sceneservice.e.e.ub);
        userProfileInfo.mHomeLatitude = com.coloros.sceneservice.m.c.a(cursor, com.coloros.sceneservice.e.e.ib).doubleValue();
        userProfileInfo.mHomeLongitude = com.coloros.sceneservice.m.c.a(cursor, com.coloros.sceneservice.e.e.hb).doubleValue();
        userProfileInfo.mCompanyLatitude = com.coloros.sceneservice.m.c.a(cursor, com.coloros.sceneservice.e.e.lb).doubleValue();
        userProfileInfo.mCompanyLongitude = com.coloros.sceneservice.m.c.a(cursor, com.coloros.sceneservice.e.e.kb).doubleValue();
        userProfileInfo.mTag = com.coloros.sceneservice.m.c.e(cursor, "tag");
        userProfileInfo.mHomeLatLonType = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.jb);
        userProfileInfo.mCompanyLatLonType = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.mb);
        userProfileInfo.mHomeWifiName = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.nb);
        userProfileInfo.mHomeWifiBssid = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.ob);
        userProfileInfo.mCompanyWifiName = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.pb);
        userProfileInfo.mCompanyWifiBssid = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.qb);
        userProfileInfo.mHomeAddress = com.coloros.sceneservice.m.c.e(cursor, "home_address");
        userProfileInfo.mCompanyAddress = com.coloros.sceneservice.m.c.e(cursor, "company_address");
        userProfileInfo.mLeaveHomeHour = com.coloros.sceneservice.m.g.parseInt(com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.xb), -1);
        userProfileInfo.mLeaveHomeMin = com.coloros.sceneservice.m.g.parseInt(com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.yb), -1);
        userProfileInfo.mLeaveCompanyHour = com.coloros.sceneservice.m.g.parseInt(com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.Bb), -1);
        userProfileInfo.mLeaveCompanyMin = com.coloros.sceneservice.m.c.c(cursor, com.coloros.sceneservice.e.e.Cb);
        userProfileInfo.mArriveHomeHour = com.coloros.sceneservice.m.g.parseInt(com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.vb), -1);
        userProfileInfo.mArriveHomeMin = com.coloros.sceneservice.m.g.parseInt(com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.wb), -1);
        userProfileInfo.mArriveCompanyHour = com.coloros.sceneservice.m.g.parseInt(com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.zb), -1);
        userProfileInfo.mArriveCompanyMin = com.coloros.sceneservice.m.g.parseInt(com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.Ab), -1);
        userProfileInfo.mStartSleepTime = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.Db);
        userProfileInfo.mEndSleepTime = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.Eb);
        userProfileInfo.mResidentLatitude = com.coloros.sceneservice.m.g.parseDouble(com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.Gb));
        userProfileInfo.mResidentLongitude = com.coloros.sceneservice.m.g.parseDouble(com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.Fb));
        userProfileInfo.mUserProfileModify = com.coloros.sceneservice.m.c.c(cursor, com.coloros.sceneservice.e.e.Hb);
        userProfileInfo.mDiffTag = com.coloros.sceneservice.m.c.e(cursor, com.coloros.sceneservice.e.e.Ib);
        return userProfileInfo;
    }

    @Override // com.coloros.sceneservice.f.a
    public ContentValues a(UserProfileInfo userProfileInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.coloros.sceneservice.e.e.tb, Integer.valueOf(userProfileInfo.mTravelMode));
        contentValues.put(com.coloros.sceneservice.e.e.ub, Integer.valueOf(userProfileInfo.mDefaultMapApp));
        contentValues.put(com.coloros.sceneservice.e.e.xb, "" + userProfileInfo.mLeaveHomeHour);
        contentValues.put(com.coloros.sceneservice.e.e.yb, "" + userProfileInfo.mLeaveHomeMin);
        contentValues.put(com.coloros.sceneservice.e.e.Bb, "" + userProfileInfo.mLeaveCompanyHour);
        contentValues.put(com.coloros.sceneservice.e.e.Cb, "" + userProfileInfo.mLeaveCompanyMin);
        contentValues.put(com.coloros.sceneservice.e.e.ib, Double.valueOf(userProfileInfo.mHomeLatitude));
        contentValues.put(com.coloros.sceneservice.e.e.hb, Double.valueOf(userProfileInfo.mHomeLongitude));
        contentValues.put(com.coloros.sceneservice.e.e.lb, Double.valueOf(userProfileInfo.mCompanyLatitude));
        contentValues.put(com.coloros.sceneservice.e.e.kb, Double.valueOf(userProfileInfo.mCompanyLongitude));
        contentValues.put("tag", userProfileInfo.mTag);
        contentValues.put(com.coloros.sceneservice.e.e.jb, userProfileInfo.mHomeLatLonType);
        contentValues.put(com.coloros.sceneservice.e.e.mb, userProfileInfo.mCompanyLatLonType);
        contentValues.put(com.coloros.sceneservice.e.e.nb, userProfileInfo.mHomeWifiName);
        contentValues.put(com.coloros.sceneservice.e.e.ob, userProfileInfo.mHomeWifiBssid);
        contentValues.put(com.coloros.sceneservice.e.e.pb, userProfileInfo.mCompanyWifiName);
        contentValues.put(com.coloros.sceneservice.e.e.qb, userProfileInfo.mCompanyWifiBssid);
        contentValues.put("home_address", userProfileInfo.mHomeAddress);
        contentValues.put("company_address", userProfileInfo.mCompanyAddress);
        contentValues.put(com.coloros.sceneservice.e.e.vb, "" + userProfileInfo.mArriveHomeHour);
        contentValues.put(com.coloros.sceneservice.e.e.wb, "" + userProfileInfo.mArriveHomeMin);
        contentValues.put(com.coloros.sceneservice.e.e.zb, "" + userProfileInfo.mArriveCompanyHour);
        contentValues.put(com.coloros.sceneservice.e.e.Ab, "" + userProfileInfo.mArriveCompanyMin);
        contentValues.put(com.coloros.sceneservice.e.e.Db, userProfileInfo.mStartSleepTime);
        contentValues.put(com.coloros.sceneservice.e.e.Eb, userProfileInfo.mEndSleepTime);
        contentValues.put(com.coloros.sceneservice.e.e.Gb, "" + userProfileInfo.mResidentLatitude);
        contentValues.put(com.coloros.sceneservice.e.e.Fb, "" + userProfileInfo.mResidentLongitude);
        contentValues.put(com.coloros.sceneservice.e.e.Hb, Integer.valueOf(userProfileInfo.mUserProfileModify));
        contentValues.put(com.coloros.sceneservice.e.e.Ib, userProfileInfo.mDiffTag);
        return contentValues;
    }
}
