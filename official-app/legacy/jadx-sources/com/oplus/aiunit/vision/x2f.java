package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes15.dex */
public class x2f {
    public static final String FIND_TRANSFER = "find_transfer";

    public static Bundle a(Context context, String str) {
        Bundle bundleC = c(context, Uri.parse("content://com.heytap.appplatform.dispatcher/find_transfer/" + str));
        return bundleC == null ? b(context, str) : bundleC;
    }

    public static Bundle b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("com.heytap.epona.Dispatcher.TRANSFER_KEY", str);
        return context.getContentResolver().call("com.heytap.appplatform.dispatcher", "com.heytap.epona.Dispatcher.FIND_TRANSFER", (String) null, bundle);
    }

    public static Bundle c(Context context, Uri uri) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null);
            try {
                if (cursorQuery != null) {
                    Bundle bundleG = j2f.g(cursorQuery);
                    cursorQuery.close();
                    return bundleG;
                }
                s7b.c("ProviderUtils", "Get cursor null.", new Object[0]);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            s7b.c("ProviderUtils", "Get cursor Exception : " + e2, new Object[0]);
            e2.printStackTrace();
            return null;
        }
    }
}
