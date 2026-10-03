package com.oplus.aiunit.vision;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes15.dex */
public class op {
    public static final String TAG = "ActivityUtils";
    public final Stack<Activity> a;

    public static class a {
        public static final op a = new op();
    }

    public static op n() {
        return a.a;
    }

    public void a(Activity activity) {
        if (activity == null || g(activity)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("addActivity ");
        sb.append(activity);
        this.a.push(activity);
    }

    public void b() {
        while (this.a.size() > 1) {
            this.a.pop().finish();
        }
    }

    public boolean c(Class<?> cls) {
        Iterator<Activity> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean d(String str) {
        Iterator<Activity> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().getSimpleName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(String str) {
        Iterator<Activity> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().getName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(String str) {
        if (this.a.empty()) {
            return false;
        }
        return this.a.peek().getClass().getSimpleName().equals(str);
    }

    public final boolean g(Activity activity) {
        return activity instanceof hli;
    }

    public void h(Class<?> cls) {
        Iterator<Activity> it = this.a.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next != null && next.getClass().equals(cls)) {
                it.remove();
                next.finish();
            }
        }
    }

    public void i(String str) {
        try {
            for (Activity activity : this.a) {
                if (activity.getClass().getSimpleName().equals(str)) {
                    activity.finish();
                }
            }
        } catch (Exception unused) {
        }
    }

    public void j() {
        while (!this.a.empty()) {
            Activity activityPop = this.a.pop();
            if (activityPop != null) {
                activityPop.finish();
            }
        }
    }

    public void k(Class<?> cls) {
        a7b.f(TAG, "finishAllActivityExpect:" + cls);
        Iterator<Activity> it = this.a.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next != null && !next.getClass().equals(cls)) {
                it.remove();
                next.finish();
            }
        }
    }

    public void l(Class<?> cls) {
        Activity activity;
        int size = this.a.size() - 1;
        while (true) {
            if (size >= 0) {
                activity = this.a.get(size);
                if (activity != null && activity.getClass().equals(cls) && !activity.isFinishing() && !activity.isDestroyed()) {
                    break;
                } else {
                    size--;
                }
            } else {
                activity = null;
                break;
            }
        }
        if (activity == null) {
            return;
        }
        Iterator<Activity> it = this.a.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next != null && next != activity && next.getClass().equals(cls)) {
                it.remove();
                next.finish();
            }
        }
    }

    public int m() {
        return this.a.size();
    }

    @Nullable
    public Activity o() {
        for (Activity activity : this.a) {
            if ((activity instanceof AppCompatActivity) && ((AppCompatActivity) activity).getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                return activity;
            }
        }
        return p();
    }

    @Nullable
    public Activity p() {
        if (this.a.empty()) {
            return null;
        }
        return this.a.peek();
    }

    @Deprecated
    public Stack<Activity> q() {
        return this.a;
    }

    @Nullable
    @Deprecated
    public Activity r(String str) {
        Activity activityPeek;
        if (this.a.empty() || (activityPeek = this.a.peek()) == null || !activityPeek.getClass().getSimpleName().equals(str)) {
            return null;
        }
        return activityPeek;
    }

    @Nullable
    public Activity s() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Activity activity = this.a.get(size);
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                return activity;
            }
        }
        return p();
    }

    public void t(Activity activity) {
        if (activity == null || g(activity)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("removeActivity ");
        sb.append(activity);
        this.a.remove(activity);
    }

    public op() {
        this.a = new Stack<>();
    }
}
