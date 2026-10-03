package com.oplus.oms.split.full.splitload;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.oplus.aiunit.vision.e8i;
import com.oplus.aiunit.vision.f8i;
import com.oplus.aiunit.vision.npm;
import com.oplus.aiunit.vision.r7i;
import com.oplus.aiunit.vision.u7i;
import com.oplus.aiunit.vision.w7i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final String f = "SplitLoadHandler";
    public final Handler a = new Handler(Looper.getMainLooper());
    public final r7i b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f20031c;
    public final List<Intent> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.oplus.oms.split.full.splitload.a f20032e;

    public interface a {
        void a(List<u7i> list);
    }

    public b(e eVar, r7i r7iVar, List<Intent> list) {
        this.f20031c = eVar;
        this.b = r7iVar;
        this.d = list;
        this.f20032e = new com.oplus.oms.split.full.splitload.a(r7iVar.a());
    }

    public final void a(a aVar) {
        String str;
        String str2;
        f8i f8iVar;
        String str3;
        boolean z;
        System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList(0);
        ArrayList arrayList2 = new ArrayList(this.d.size());
        ArrayList arrayList3 = new ArrayList();
        String str4 = this.b.d;
        Iterator<Intent> it = this.d.iterator();
        while (it.hasNext()) {
            Intent next = it.next();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String stringExtra = next.getStringExtra("split_name");
            String strValueOf = String.valueOf(next.getIntExtra("split_version", -1));
            f8i f8iVar2 = new f8i(stringExtra, strValueOf);
            f8iVar2.e(str4);
            f8iVar2.b("pload");
            f8iVar2.f(1);
            arrayList2.add(f8iVar2);
            if (c(stringExtra)) {
                str = str4;
                w7i.a(f, "Split " + stringExtra + " has been loaded!", new Object[0]);
                f8iVar2.g(System.currentTimeMillis() - jCurrentTimeMillis);
                f8iVar2.f(2);
                arrayList.add(new u7i(stringExtra, strValueOf, 1));
            } else {
                str = str4;
                String stringExtra2 = next.getStringExtra("apk");
                if (TextUtils.isEmpty(stringExtra2)) {
                    f8iVar2.g(System.currentTimeMillis() - jCurrentTimeMillis);
                    f8iVar2.f(-100);
                    w7i.i(f, "Failed to read split " + stringExtra + " apk path", new Object[0]);
                    arrayList.add(new u7i(stringExtra, strValueOf, -100, new Exception("split apk path " + stringExtra + " is missing!")));
                } else {
                    String stringExtra3 = next.getStringExtra("native-lib-dir");
                    Iterator<Intent> it2 = it;
                    ArrayList<String> stringArrayListExtra = next.getStringArrayListExtra("added-dex");
                    w7i.a(f, "split name: " + stringExtra + ", origin native path: " + stringExtra3 + ",splitVersion:" + strValueOf, new Object[0]);
                    ClassLoader classLoaderI = this.b.i();
                    if (next.getBooleanExtra("independent_split", false)) {
                        classLoaderI = this.b.g();
                        w7i.a(f, "split name: " + stringExtra + " is independence APK", new Object[0]);
                    }
                    ClassLoader classLoader = classLoaderI;
                    try {
                        f8iVar = f8iVar2;
                        try {
                            ClassLoader classLoaderB = this.f20031c.b(classLoader, stringExtra, stringArrayListExtra, null, stringExtra3 == null ? null : new File(stringExtra3), next.getStringArrayListExtra("split_dependencies"));
                            try {
                                Application applicationC = this.f20032e.c(classLoaderB, stringExtra);
                                try {
                                    b(stringExtra, stringExtra2, applicationC, classLoaderB);
                                    hashSet.add(new npm(applicationC, stringExtra, strValueOf, stringExtra2));
                                    arrayList3.add(stringExtra);
                                    f8iVar.g(System.currentTimeMillis() - jCurrentTimeMillis);
                                    str4 = str;
                                    it = it2;
                                } catch (SplitLoadException e2) {
                                    f8iVar.g(System.currentTimeMillis() - jCurrentTimeMillis);
                                    f8iVar.f(e2.a());
                                    z = false;
                                    w7i.i(f, "activateSplit error", new Object[0]);
                                    arrayList.add(new u7i(stringExtra, strValueOf, e2.a(), e2.getCause()));
                                    this.f20031c.a(classLoaderB);
                                    str4 = str;
                                    it = it2;
                                }
                            } catch (SplitLoadException e3) {
                                z = false;
                                f8iVar.g(System.currentTimeMillis() - jCurrentTimeMillis);
                                f8iVar.f(e3.a());
                                w7i.b(f, "Failed to create " + stringExtra + " application ", e3);
                                arrayList.add(new u7i(stringExtra, strValueOf, e3.a(), e3.getCause()));
                                this.f20031c.a(classLoaderB);
                            }
                        } catch (SplitLoadException e4) {
                            e = e4;
                            str3 = strValueOf;
                            str2 = f;
                            z = false;
                            f8iVar.g(System.currentTimeMillis() - jCurrentTimeMillis);
                            f8iVar.f(e.a());
                            w7i.b(str2, "Failed to load split " + stringExtra + " code!", e);
                            arrayList.add(new u7i(stringExtra, str3, e.a(), e.getCause()));
                            str4 = str;
                            it = it2;
                        }
                    } catch (SplitLoadException e5) {
                        e = e5;
                        str2 = f;
                        f8iVar = f8iVar2;
                        str3 = strValueOf;
                    }
                }
            }
            str4 = str;
        }
        this.b.b(hashSet);
        if (!arrayList2.isEmpty()) {
            e8i.b("load", arrayList2);
        }
        if (aVar != null) {
            aVar.a(arrayList);
        }
    }

    public final void b(String str, String str2, Application application, ClassLoader classLoader) throws SplitLoadException {
        try {
            this.f20031c.a(str2);
        } catch (SplitLoadException e2) {
            w7i.b(f, "Failed to load " + str2 + " resources", e2);
        }
        try {
            this.f20032e.a(application);
            try {
                this.f20032e.b(classLoader, str);
                try {
                    this.f20032e.d(application);
                } catch (SplitLoadException e3) {
                    w7i.b(f, "Failed to invoke onCreate for " + str + " application", e3);
                    throw e3;
                }
            } catch (SplitLoadException e4) {
                w7i.b(f, "Failed to create " + str + " content-provider ", e4);
                throw e4;
            }
        } catch (SplitLoadException e5) {
            w7i.b(f, "Failed to attach " + str + " application", e5);
            throw e5;
        }
    }

    public final boolean c(String str) {
        Iterator<npm> it = this.b.d().iterator();
        while (it.hasNext()) {
            if (it.next().b.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
