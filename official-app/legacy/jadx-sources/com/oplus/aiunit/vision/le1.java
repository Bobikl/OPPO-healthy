package com.oplus.aiunit.vision;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class le1 {
    public static volatile le1 b;
    public final Map<String, IBinder> a = new HashMap();

    public static le1 c() {
        if (b == null) {
            synchronized (le1.class) {
                if (b == null) {
                    b = new le1();
                }
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        this.a.remove(str);
        l7b.d("Epona->BinderCache", "unregister cached binder： " + str, new Object[0]);
    }

    public IBinder b(String str) {
        return this.a.get(str);
    }

    public void e(final String str, IBinder iBinder) {
        this.a.put(str, iBinder);
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.ke1
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    this.a.d(str);
                }
            }, 0);
        } catch (RemoteException e2) {
            l7b.i("Epona->BinderCache", e2.toString(), new Object[0]);
        }
    }
}
