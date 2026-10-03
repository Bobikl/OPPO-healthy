package com.oplus.nearx.track.internal.storage.data;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.oplus.aiunit.vision.k6k;
import com.oplus.aiunit.vision.u6k;
import com.oplus.nearx.track.internal.storage.BaseStorageProvider;

/* JADX INFO: loaded from: classes8.dex */
public class EventContentProvider extends BaseStorageProvider {
    private static final String TAG = "EventContentProvider";
    private static final UriMatcher uriMatcher = new UriMatcher(-1);
    private u6k mProviderHelper;

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        try {
            uriMatcher.match(uri);
        } catch (Exception e2) {
            k6k.e().c(TAG, e2.toString(), null, new Object[0]);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (contentValues != null && contentValues.size() != 0) {
            try {
                return this.mProviderHelper.b(uriMatcher.match(uri), uri, contentValues);
            } catch (Exception e2) {
                k6k.e().c(TAG, e2.toString(), null, new Object[0]);
            }
        }
        return uri;
    }

    @Override // com.oplus.nearx.track.internal.storage.BaseStorageProvider, android.content.ContentProvider
    public boolean onCreate() {
        String packageName;
        super.onCreate();
        try {
            Context context = getContext();
            if (context == null) {
                return true;
            }
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (UnsupportedOperationException unused) {
                packageName = "com.oplus.track.demo.test";
            }
            u6k u6kVar = new u6k(context);
            this.mProviderHelper = u6kVar;
            u6kVar.a(uriMatcher, packageName + ".EventContentProvider");
            return true;
        } catch (Exception e2) {
            k6k.e().c(TAG, e2.toString(), null, new Object[0]);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return this.mProviderHelper.c(uriMatcher.match(uri), uri);
        } catch (Exception e2) {
            k6k.e().c(TAG, e2.toString(), null, new Object[0]);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
