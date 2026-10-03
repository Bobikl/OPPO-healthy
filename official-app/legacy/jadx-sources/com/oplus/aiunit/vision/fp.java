package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public class fp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fp f11447c = new fp();
    public LinkedList<Activity> a = null;
    public boolean b = false;

    public class a implements Application.ActivityLifecycleCallbacks {
        public int i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f11448j = false;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            fp.this.a.addFirst(activity);
            if (fp.this.a.size() > 100) {
                fp.this.a.removeLast();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            fp.this.a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i = this.i + 1;
            this.i = i;
            if (i != 1 || this.f11448j) {
                return;
            }
            fp.this.b = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            boolean zIsChangingConfigurations = activity.isChangingConfigurations();
            this.f11448j = zIsChangingConfigurations;
            int i = this.i - 1;
            this.i = i;
            if (i != 0 || zIsChangingConfigurations) {
                return;
            }
            fp.this.b = false;
        }
    }

    public static fp d() {
        return f11447c;
    }

    public void c() {
        LinkedList<Activity> linkedList = this.a;
        if (linkedList != null) {
            Iterator<Activity> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().finish();
            }
            this.a.clear();
        }
    }

    public void e(Application application) {
        this.a = new LinkedList<>();
        application.registerActivityLifecycleCallbacks(new a());
    }

    public boolean f() {
        return this.b;
    }
}
