package com.oplus.oms.split.full.splitinstall;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.oplus.aiunit.vision.w7i;
import com.oplus.navi.oms.OmsPluginInfo;
import com.oplus.navi.oms.OmsPluginLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes8.dex */
public class LoadComponentRemote {
    public static final String b = "LoadComponentRemote";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20018c = "reply_code";
    public static final int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f20019e = -1;
    public static final String f = "content://com.oplus.appplatform.navi";
    public final Context a;

    public static class QueryCallback extends OmsPluginLoader {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f20020c;
        private List<String> d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, OmsPluginInfo> f20021e = new HashMap();

        public QueryCallback(CountDownLatch countDownLatch, List<String> list) {
            this.f20020c = countDownLatch;
            this.d = list;
        }

        public void await() throws InterruptedException {
            this.f20020c.await();
        }

        public Map<String, OmsPluginInfo> getPluginMap() {
            return this.f20021e;
        }

        @Override // com.oplus.navi.oms.OmsPluginLoader, com.oplus.navi.oms.IOmsPluginLoader
        public void onQueryCompleted(Bundle bundle) {
            List<String> list;
            if (bundle == null || (list = this.d) == null || list.isEmpty()) {
                this.f20020c.countDown();
                return;
            }
            try {
                bundle.setClassLoader(OmsPluginInfo.class.getClassLoader());
                for (String str : this.d) {
                    OmsPluginInfo omsPluginInfo = (OmsPluginInfo) bundle.getParcelable(str);
                    if (omsPluginInfo != null) {
                        this.f20021e.put(str, omsPluginInfo);
                    }
                }
                this.f20020c.countDown();
            } catch (Throwable th) {
                this.f20020c.countDown();
                throw th;
            }
        }
    }

    public LoadComponentRemote(Context context) {
        this.a = context;
    }

    public final Bundle a(Uri uri, Bundle bundle) {
        try {
            Cursor cursorQuery = this.a.getContentResolver().query(uri, null, bundle, null);
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
            try {
                Bundle extras = cursorQuery.getExtras();
                cursorQuery.close();
                return extras;
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            w7i.c(b, "Failed to query Provider @ " + uri + ", message = " + e2.getMessage(), new Object[0]);
        }
    }

    public final QueryCallback b(List<String> list) {
        return new QueryCallback(new CountDownLatch(1), list);
    }

    public Map<String, OmsPluginInfo> c(List<String> list) {
        if (list == null || list.isEmpty()) {
            w7i.a(b, "queryMultiPlugin error", new Object[0]);
            return null;
        }
        try {
            QueryCallback queryCallbackB = b(list);
            Bundle bundle = new Bundle();
            bundle.putBoolean("fromOms", true);
            bundle.putStringArrayList("oms_plugin_action", new ArrayList<>(list));
            bundle.putBinder("oms_call_back", queryCallbackB.asBinder());
            Bundle bundleA = a(Uri.parse(f), bundle);
            if (bundleA != null && bundleA.getInt(f20018c, -1) == 0) {
                try {
                    queryCallbackB.await();
                } catch (InterruptedException e2) {
                    w7i.c(b, "Failed to await , message = " + e2.getMessage(), new Object[0]);
                }
            }
            return queryCallbackB.getPluginMap();
        } catch (NoSuchMethodError unused) {
            w7i.c(b, "No such method error happen", new Object[0]);
            return null;
        }
    }
}
