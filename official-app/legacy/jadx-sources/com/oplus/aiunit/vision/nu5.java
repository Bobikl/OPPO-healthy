package com.oplus.aiunit.vision;

import android.os.IBinder;
import android.os.RemoteException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class nu5 implements u66 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile nu5 f14649c;
    public final Map<String, IBinder> a = new ConcurrentHashMap();
    public final Map<String, List<String>> b = new ConcurrentHashMap();

    public static nu5 d() {
        if (f14649c == null) {
            synchronized (nu5.class) {
                if (f14649c == null) {
                    f14649c = new nu5();
                }
            }
        }
        return f14649c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str, String str2) {
        j(str, str2);
        l7b.d("Epona->Dispatcher", "unregister cached binder: " + str, new Object[0]);
    }

    @Override // com.oplus.aiunit.vision.u66
    public void a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("--- dump package register components info ---");
        for (Map.Entry<String, List<String>> entry : this.b.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                printWriter.println(key);
                g(printWriter, entry.getValue());
            }
        }
        printWriter.println("------------------- end ---------------------");
    }

    public IBinder c(String str) {
        return this.a.get(str);
    }

    public final boolean e(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public final void g(PrintWriter printWriter, List<String> list) {
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (e(str)) {
                printWriter.println("    -> " + str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public boolean h(final String str, IBinder iBinder, final String str2) {
        boolean z = true;
        try {
            try {
                iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.ju5
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.a.f(str, str2);
                    }
                }, 0);
                if (this.a.containsKey(str)) {
                    z = false;
                } else {
                    this.a.put(str, iBinder);
                    l(str, str2);
                }
            } catch (RemoteException e2) {
                l7b.i("Epona->Dispatcher", e2.toString(), new Object[0]);
                if (this.a.containsKey(str)) {
                    z = false;
                }
            }
            l7b.c("Epona->Dispatcher", "register RemoteTransfer Success: " + z, new Object[0]);
            return z;
        } catch (Throwable th) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, iBinder);
                l(str, str2);
            }
            throw th;
        }
    }

    public final void i(String str, String str2) {
        List<String> list = this.b.get(str2);
        if (list != null) {
            list.remove(str);
        }
    }

    public final void j(String str, String str2) {
        this.a.remove(str);
        this.b.remove(str2);
    }

    public boolean k(String str, String str2) {
        boolean z;
        if (this.a.containsKey(str)) {
            this.a.remove(str);
            i(str, str2);
            z = true;
        } else {
            z = false;
        }
        l7b.c("Epona->Dispatcher", "packageName:" + str2 + "unRegister RemoteTransfer component:" + str + "unRegister Success:" + z, new Object[0]);
        return z;
    }

    @Override // com.oplus.aiunit.vision.u66
    public String key() {
        return "oplus_epona";
    }

    public final void l(String str, String str2) {
        List<String> arrayList = this.b.get(str2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.b.put(str2, arrayList);
        }
        arrayList.add(str);
    }
}
