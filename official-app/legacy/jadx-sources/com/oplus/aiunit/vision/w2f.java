package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class w2f {
    public static final String FIND_TRANSFER = "find_transfer";

    public static Bundle a(Context context, String str) {
        Bundle bundleC = c(context, Uri.parse("content://com.oplus.appplatform.dispatcher/find_transfer/" + str));
        return bundleC == null ? b(context, str) : bundleC;
    }

    public static Bundle b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("com.oplus.epona.Dispatcher.TRANSFER_KEY", str);
        try {
            return context.getContentResolver().call("com.oplus.appplatform.dispatcher", "com.oplus.epona.Dispatcher.FIND_TRANSFER", (String) null, bundle);
        } catch (Exception unused) {
            l7b.d("Epona->ProviderUtils", "failed to call provider: com.oplus.appplatform.dispatcher", new Object[0]);
            return null;
        }
    }

    public static Bundle c(Context context, Uri uri) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null);
            try {
                if (cursorQuery != null) {
                    Bundle bundleG = h2f.g(cursorQuery);
                    cursorQuery.close();
                    return bundleG;
                }
                l7b.d("Epona->ProviderUtils", "Get cursor null.", new Object[0]);
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
            l7b.d("Epona->ProviderUtils", "Get cursor Exception : " + e2, new Object[0]);
            e2.printStackTrace();
            return null;
        }
    }
}
