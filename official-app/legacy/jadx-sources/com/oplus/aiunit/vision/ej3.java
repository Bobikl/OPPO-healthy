package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class ej3 {
    public static final String EXTRA_MODULE = "module";
    public static final String TAG = "CloudStatusHelper";

    public static int a(String str, String str2) {
        Context contextA = b78.a();
        if (contextA == null || TextUtils.isEmpty(str2)) {
            a7b.b(TAG, "query context null or key null");
            return 0;
        }
        Uri uri = Uri.parse("content://ocloudstatus/cloud_status");
        if (uri == null) {
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putString("module", str);
        bundle.putString("key", str2);
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contextA.getContentResolver().acquireUnstableContentProviderClient(uri);
            Bundle bundleCall = null;
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("get_cloud_status", null, bundle);
                } catch (Throwable th) {
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            int i = bundleCall != null ? bundleCall.getInt(str2) : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("query value : ");
            sb.append(i);
            return i;
        } catch (Exception e2) {
            a7b.b(TAG, "query error : " + e2.getMessage());
            return 0;
        }
    }

    public static long b(String str, String str2) {
        Bundle bundleCall;
        Context contextA = b78.a();
        if (contextA == null || TextUtils.isEmpty(str2)) {
            a7b.b(TAG, "query context null or key null");
            return 0L;
        }
        Uri uri = Uri.parse("content://ocloudstatus/cloud_status");
        if (uri == null) {
            return 0L;
        }
        Bundle bundle = new Bundle();
        bundle.putString("module", str);
        bundle.putString("key", str2);
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contextA.getContentResolver().acquireUnstableContentProviderClient(uri);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("get_cloud_status", "query_long_data", bundle);
                } catch (Throwable th) {
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                bundleCall = null;
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            long j2 = bundleCall != null ? bundleCall.getLong(str2) : 0L;
            StringBuilder sb = new StringBuilder();
            sb.append("query value : ");
            sb.append(j2);
            return j2;
        } catch (Exception e2) {
            a7b.b(TAG, "query error : " + e2.getMessage());
            return 0L;
        }
    }
}
