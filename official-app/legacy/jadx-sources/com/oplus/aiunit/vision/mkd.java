package com.oplus.aiunit.vision;

import android.app.Activity;
import com.heytap.health.watchpair.manager.OobeHelper;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes19.dex */
public class mkd {
    public Stack<Activity> a;

    public static class a {
        public static final mkd a = new mkd();
    }

    public static mkd c() {
        return a.a;
    }

    public synchronized void a(Activity activity) {
        if (activity == null) {
            return;
        }
        a7b.f("OobeActivityLifecycleManager", "add new act " + activity.getClass().getSimpleName());
        this.a.push(activity);
    }

    public synchronized void b() {
        OobeHelper.INSTANCE.e();
        a7b.f("OobeActivityLifecycleManager", "clear");
        for (int i = 0; i < this.a.size(); i++) {
            Activity activity = this.a.get(i);
            if (activity != null) {
                activity.finish();
            }
        }
        this.a.clear();
    }

    public synchronized void d(Activity activity) {
        a7b.f("OobeActivityLifecycleManager", "remove act " + activity.getClass().getSimpleName());
        Iterator<Activity> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(activity.getClass())) {
                it.remove();
            }
        }
    }

    public mkd() {
        this.a = new Stack<>();
    }
}
