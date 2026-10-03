package com.sensorsdata.analytics.android.sdk.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;

/* JADX INFO: loaded from: classes10.dex */
public class SensorsDataContentProvider extends ContentProvider {
    private static final UriMatcher uriMatcher = new UriMatcher(-1);
    private SAProviderHelper mProviderHelper;

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        try {
            return this.mProviderHelper.bulkInsert(uri, contentValuesArr);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        try {
            int iMatch = uriMatcher.match(uri);
            if (1 == iMatch) {
                return this.mProviderHelper.deleteEvents(str, strArr);
            }
            if (iMatch == 15) {
                return this.mProviderHelper.removeSP(uri.getQueryParameter("remove_key"));
            }
            return 0;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (contentValues != null && contentValues.size() != 0) {
            try {
                int iMatch = uriMatcher.match(uri);
                if (iMatch == 1) {
                    return this.mProviderHelper.insertEvent(uri, contentValues);
                }
                if (iMatch == 8) {
                    return this.mProviderHelper.insertChannelPersistent(uri, contentValues);
                }
                this.mProviderHelper.insertPersistent(iMatch, uri, contentValues);
                return uri;
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        String packageName;
        try {
            Context context = getContext();
            if (context == null) {
                return true;
            }
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (UnsupportedOperationException unused) {
                packageName = "com.sensorsdata.analytics.android.sdk.test";
            }
            SAProviderHelper sAProviderHelper = SAProviderHelper.getInstance(context);
            this.mProviderHelper = sAProviderHelper;
            sAProviderHelper.appendUri(uriMatcher, packageName + ".SensorsDataContentProvider");
            return true;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQueryByTable;
        try {
            int iMatch = uriMatcher.match(uri);
            if (iMatch == 1) {
                cursorQueryByTable = this.mProviderHelper.queryByTable(DbParams.TABLE_EVENTS, strArr, str, strArr2, str2);
            } else {
                cursorQueryByTable = iMatch == 8 ? this.mProviderHelper.queryByTable(DbParams.TABLE_CHANNEL_PERSISTENT, strArr, str, strArr2, str2) : this.mProviderHelper.queryPersistent(iMatch, uri);
            }
            return cursorQueryByTable;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
