package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.oplus.nearx.track.TrackApi;

/* JADX INFO: loaded from: classes8.dex */
public class u6k {
    public ContentResolver a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17321c = 0;

    public u6k(Context context) {
        try {
            this.b = context;
            this.a = context.getContentResolver();
        } catch (Exception e2) {
            k6k.e().c("TrackProviderHelper", e2.toString(), null, new Object[0]);
        }
    }

    public void a(UriMatcher uriMatcher, String str) {
        try {
            uriMatcher.addURI(str, "activity_started_count", 1);
            uriMatcher.addURI(str, y15.TABLE_RECORD_COUNT, 2);
            uriMatcher.addURI(str, y15.TABLE_RESET_RECORD_COUNT_WITH_TYPE, 3);
        } catch (Exception e2) {
            k6k.e().c("TrackProviderHelper", e2.toString(), null, new Object[0]);
        }
    }

    public Uri b(int i, Uri uri, ContentValues contentValues) {
        try {
            if (i == 1) {
                this.f17321c = contentValues.getAsInteger("activity_started_count").intValue();
            } else {
                if (i == 2) {
                    long jLongValue = contentValues.getAsLong("appId").longValue();
                    int iIntValue = contentValues.getAsInteger(y15.PARAMS_DATA_TYPE).intValue();
                    int iIntValue2 = contentValues.getAsInteger("uploadType").intValue();
                    int iIntValue3 = contentValues.getAsInteger(y15.PARAMS_INSERT_SIZE).intValue();
                    int iA = TrackApi.t(jLongValue).v().a().a(jLongValue, iIntValue, iIntValue2, iIntValue3);
                    k6k.e().a("TrackProviderHelper", "TABLE_RECORD_COUNT insertPersistent: appId = " + jLongValue + "\t dataType = " + iIntValue + "\t uploadType = " + iIntValue2 + "\t insertSize = " + iIntValue3 + "\t recordCount = " + iA, null, new Object[0]);
                    return uri.buildUpon().appendQueryParameter(y15.PARAMS_RECORD_COUNT, String.valueOf(iA)).build();
                }
                if (i == 3) {
                    long jLongValue2 = contentValues.getAsLong("appId").longValue();
                    int iIntValue4 = contentValues.getAsInteger(y15.PARAMS_DATA_TYPE).intValue();
                    int iIntValue5 = contentValues.getAsInteger("uploadType").intValue();
                    k6k.e().a("TrackProviderHelper", "TABLE_RESET_RECORD_COUNT_WITH_TYPE insertPersistent: appId = " + jLongValue2 + "\t dataType = " + iIntValue4 + "\t uploadType = " + iIntValue5, null, new Object[0]);
                    TrackApi.t(jLongValue2).v().a().b(jLongValue2, iIntValue4, iIntValue5);
                }
            }
        } catch (Exception e2) {
            k6k.e().c("TrackProviderHelper", e2.toString(), null, new Object[0]);
        }
        return uri;
    }

    public Cursor c(int i, Uri uri) {
        Integer numValueOf;
        String str;
        if (i != 1) {
            numValueOf = null;
            str = null;
        } else {
            try {
                numValueOf = Integer.valueOf(this.f17321c);
                str = "activity_started_count";
            } catch (Exception e2) {
                k6k.e().c("TrackProviderHelper", e2.toString(), null, new Object[0]);
                return null;
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{str});
        matrixCursor.addRow(new Object[]{numValueOf});
        return matrixCursor;
    }
}
