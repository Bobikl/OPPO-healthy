package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class ax7 {
    public static final int STATE_BACKGROUND = 0;
    public static final int STATE_FOREGROUND = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f9514e = b78.a().getCacheDir() + File.separator + "health_pagesState9899";
    public static final String f;
    public int a;
    public final List<b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<Application.ActivityLifecycleCallbacks> f9515c;
    public boolean d;

    public class a implements cp {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            op.n().a(activity);
            Iterator it = ax7.this.f9515c.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityCreated(activity, bundle);
            }
        }

        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            ax7.this.d = false;
            op.n().t(activity);
            Iterator it = ax7.this.f9515c.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityDestroyed(activity);
            }
        }

        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Iterator it = ax7.this.f9515c.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityPaused(activity);
            }
        }

        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Iterator it = ax7.this.f9515c.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityResumed(activity);
            }
        }

        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Iterator it = ax7.this.f9515c.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivitySaveInstanceState(activity, bundle);
            }
        }

        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (ax7.this.a == 0) {
                ax7.this.d = true;
                a7b.f("ForeGroundUtil", "mCumulativeSteps------onActivityStarted---- isGoBackFore = true");
                ax7.this.h(1);
            } else {
                ax7.this.d = false;
            }
            ax7.this.a++;
            a7b.f("ForeGroundUtil", "mCumulativeSteps------onActivityStarted---- = " + ax7.this.a);
            Iterator it = ax7.this.f9515c.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityStarted(activity);
            }
        }

        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ax7.this.d = false;
            ax7.this.a--;
            if (ax7.this.a <= 0) {
                ax7.this.h(0);
            }
            a7b.f("ForeGroundUtil", "mCumulativeSteps------onActivityStopped---- = " + ax7.this.a);
            Iterator it = ax7.this.f9515c.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityStopped(activity);
            }
        }
    }

    public interface b {
        void c(int i);
    }

    public static class c {
        public static final ax7 a = new ax7();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("SP_KEY_FOREGROUND");
        sb.append(gxe.c());
        f = sb.toString();
    }

    public static ax7 j() {
        return c.a;
    }

    public void f(b bVar) {
        if (this.b.contains(bVar)) {
            return;
        }
        this.b.add(bVar);
    }

    public final void g() {
        File file = new File(f9514e);
        if (file.exists()) {
            if (file.isFile()) {
                boolean zDelete = file.delete();
                StringBuilder sb = new StringBuilder();
                sb.append("cleanForeGroundSp isFile delete ");
                sb.append(zDelete);
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    boolean zDelete2 = file2.delete();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("cleanForeGroundSp delete ");
                    sb2.append(zDelete2);
                }
            }
        }
    }

    public final void h(int i) {
        StringBuilder sb = new StringBuilder();
        String str = f9514e;
        sb.append(str);
        sb.append(File.separator);
        sb.append(f);
        String string = sb.toString();
        if (i == 1) {
            File file = new File(str);
            if (!file.exists()) {
                a7b.f("ForeGroundUtil", "dispatchState mkdirs " + file.mkdirs());
            }
            File file2 = new File(string);
            if (!file2.exists()) {
                try {
                    a7b.f("ForeGroundUtil", "dispatchState createNewFile " + file2.createNewFile() + ", fileName " + string);
                } catch (IOException e2) {
                    a7b.f("ForeGroundUtil", "dispatchState " + e2.getMessage());
                }
            }
        } else if (i == 0) {
            File file3 = new File(string);
            if (file3.exists()) {
                a7b.f("ForeGroundUtil", "dispatchState delete " + file3.delete());
            }
        }
        Iterator<b> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().c(i);
        }
    }

    public void i(Application application) {
        application.registerActivityLifecycleCallbacks(new a());
    }

    public boolean k() {
        return this.a > 0;
    }

    public boolean l() {
        File[] fileArrListFiles;
        File file = new File(f9514e);
        return file.exists() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0;
    }

    public boolean m() {
        return this.d;
    }

    public void n(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f9515c.add(activityLifecycleCallbacks);
    }

    public void o(b bVar) {
        this.b.remove(bVar);
    }

    public ax7() {
        this.a = 0;
        this.b = new CopyOnWriteArrayList();
        this.f9515c = new ArrayList<>();
        this.d = false;
        if (gxe.f(b78.a())) {
            g();
        } else {
            if (gxe.g(b78.a())) {
                return;
            }
            g();
        }
    }
}
