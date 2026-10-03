package com.oplus.aiunit.vision;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class mu5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile mu5 f14226c;
    public Map<String, IBinder> a = new ConcurrentHashMap();
    public Map<String, List<String>> b = new ConcurrentHashMap();

    public static mu5 c() {
        if (f14226c == null) {
            synchronized (mu5.class) {
                if (f14226c == null) {
                    f14226c = new mu5();
                }
            }
        }
        return f14226c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        this.a.remove(str);
    }

    public IBinder b(String str) {
        return this.a.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public boolean e(final String str, IBinder iBinder, String str2) {
        boolean z = true;
        try {
            try {
                iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.ku5
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.a.d(str);
                    }
                }, 0);
                if (this.a.containsKey(str)) {
                    z = false;
                } else {
                    this.a.put(str, iBinder);
                    g(str, str2);
                }
            } catch (RemoteException e2) {
                s7b.f("Dispatcher", e2.toString(), new Object[0]);
                if (this.a.containsKey(str)) {
                    z = false;
                }
            }
            s7b.b("Dispatcher", "registerRemoteTransfer: registerSuccess:" + z, new Object[0]);
            return z;
        } catch (Throwable th) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, iBinder);
                g(str, str2);
            }
            throw th;
        }
    }

    public String f() {
        return this.b.toString();
    }

    public final void g(String str, String str2) {
        List<String> arrayList = this.b.get(str2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.b.put(str2, arrayList);
        }
        arrayList.add(str);
    }
}
