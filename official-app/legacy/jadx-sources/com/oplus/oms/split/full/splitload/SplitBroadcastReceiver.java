package com.oplus.oms.split.full.splitload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.oplus.aiunit.vision.ajd;
import com.oplus.aiunit.vision.e8i;
import com.oplus.aiunit.vision.f8i;
import com.oplus.aiunit.vision.g8i;
import com.oplus.aiunit.vision.t7i;
import com.oplus.aiunit.vision.u7i;
import com.oplus.aiunit.vision.w7i;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SplitBroadcastReceiver extends BroadcastReceiver {

    public static class a {
        public LoadListener a;
        public HashMap<String, Integer> b = new HashMap<>();

        /* JADX INFO: renamed from: com.oplus.oms.split.full.splitload.SplitBroadcastReceiver$a$a, reason: collision with other inner class name */
        public class C0975a implements ajd {
            public C0975a() {
            }

            @Override // com.oplus.aiunit.vision.ajd
            public void a(List<u7i> list) {
                if (list == null || list.isEmpty()) {
                    a.this.a();
                    return;
                }
                if (list.get(0).a() == -99) {
                    Iterator<String> it = a.this.b.keySet().iterator();
                    while (it.hasNext()) {
                        a.this.b.put(it.next(), -99);
                    }
                    a.this.a();
                    return;
                }
                for (u7i u7iVar : list) {
                    a.this.b.put(u7iVar.b(), Integer.valueOf(u7iVar.a()));
                }
                a.this.a();
            }
        }

        public a(String str, LoadListener loadListener) {
            this.a = loadListener;
        }

        public final void a() {
            try {
                this.a.loadStatus(this.b);
            } catch (RemoteException unused) {
                w7i.c("SplitBroadcastReceiver", "call back error", new Object[0]);
            }
        }

        public void b(List<Intent> list) {
            ArrayList arrayList = new ArrayList();
            for (Intent intent : list) {
                String stringExtra = intent.getStringExtra("split_name");
                if (t7i.E().h().contains(stringExtra)) {
                    w7i.e("SplitBroadcastReceiver", "loadIntent split already loaded, split: %s", stringExtra);
                    this.b.put(stringExtra, 1);
                } else {
                    this.b.put(stringExtra, 0);
                    arrayList.add(intent);
                }
            }
            if (arrayList.isEmpty()) {
                a();
            } else {
                t7i.E().l(arrayList, new C0975a());
            }
        }
    }

    public static void a(Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("split_name");
        if (t7i.F()) {
            f8i f8iVar = new f8i();
            f8iVar.c(System.currentTimeMillis());
            g8i.d(f8iVar);
            t7i.E().o(stringExtra);
            return;
        }
        w7i.a("SplitBroadcastReceiver", "unloadSplit failed", new Object[0]);
        f8i f8iVar2 = new f8i();
        f8iVar2.d(stringExtra);
        f8iVar2.f(-51);
        e8i.a("unload", f8iVar2);
    }

    public static void b(Intent intent, String str) {
        int intExtra = intent.getIntExtra("load_type", 0);
        w7i.a("SplitBroadcastReceiver", "processIntent - type = " + intExtra, new Object[0]);
        if (intExtra == 0) {
            c(intent, str);
        } else {
            if (intExtra != 1) {
                return;
            }
            a(intent);
        }
    }

    public static void c(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra("key_bundle_listener");
        if (bundleExtra == null) {
            w7i.i("SplitBroadcastReceiver", "processLoadIntent bundle is null, action: %s", str);
            return;
        }
        ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("intents");
        IBinder binder = bundleExtra.getBinder("key_listener");
        if (parcelableArrayList == null || binder == null) {
            w7i.i("SplitBroadcastReceiver", "processLoadIntent binder is null, action: %s", str);
            return;
        }
        LoadListener loadListenerAsInterface = LoadListener.Stub.asInterface(binder);
        if (TextUtils.isEmpty(str) || parcelableArrayList.isEmpty() || loadListenerAsInterface == null) {
            w7i.i("SplitBroadcastReceiver", "loadIntent parameter error", new Object[0]);
        } else {
            new a(str, loadListenerAsInterface).b(parcelableArrayList);
        }
    }

    public static void d(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("main_process".equals(action)) {
            b(intent, action);
        } else {
            context.sendBroadcast(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (context == null || intent == null) {
            w7i.i("SplitBroadcastReceiver", "onReceive error", new Object[0]);
        } else {
            b(intent, intent.getAction());
        }
    }
}
