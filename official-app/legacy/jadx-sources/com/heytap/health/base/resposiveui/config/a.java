package com.heytap.health.base.resposiveui.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.annotation.UiThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.slc;
import com.support.responsiveui.R$integer;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class a {
    public static final boolean m = a7b.i("RUIC", 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f3204n = false;
    public static HashMap<Integer, a> o = new LinkedHashMap();
    public int h;
    public Context i;
    public int a = -1;
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MutableLiveData<NearUIConfig> f3205c = new MutableLiveData<>();
    public MutableLiveData<NearUIConfig.Status> d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MutableLiveData<Integer> f3206e = new MutableLiveData<>();
    public MutableLiveData<slc> f = new MutableLiveData<>();
    public MutableLiveData<Integer> g = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3207j = -1.0f;
    public float k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public NearUIConfig.WindowType f3208l = NearUIConfig.WindowType.SMALL;

    /* JADX INFO: renamed from: com.heytap.health.base.resposiveui.config.a$a, reason: collision with other inner class name */
    public static class C0292a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostDestroyed(Activity activity) {
            int iHashCode = activity.hashCode();
            if (a.o.containsKey(Integer.valueOf(iHashCode))) {
                a.o.remove(Integer.valueOf(iHashCode));
                a.u("RUIC", "newInstance remove the kept instance " + iHashCode + ", size " + a.o.size());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public a(Context context) {
        r(context, "<init>");
    }

    @UiThread
    public static a m(Context context) {
        if (!f3204n && (context.getApplicationContext() instanceof Application)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0292a());
            f3204n = true;
        }
        int iHashCode = context.hashCode();
        if (o.containsKey(Integer.valueOf(iHashCode))) {
            u("RUIC", "newInstance return the kept instance " + iHashCode);
            return o.get(Integer.valueOf(iHashCode));
        }
        a aVar = new a(context);
        o.put(Integer.valueOf(iHashCode), aVar);
        u("RUIC", "newInstance return the new instance " + iHashCode + ", size " + o.size());
        return aVar;
    }

    public static void u(String str, String str2) {
        if (m) {
            a7b.f(str, str2);
        }
    }

    public final int c(int i) {
        int integer = this.i.getResources().getInteger(R$integer.inner_responsive_ui_column_4);
        int integer2 = this.i.getResources().getInteger(R$integer.inner_responsive_ui_column_8);
        int integer3 = this.i.getResources().getInteger(R$integer.inner_responsive_ui_column_12);
        int i2 = integer / 2;
        if (i < integer2 - i2) {
            return integer;
        }
        return (i >= integer2 && i >= integer3 - i2) ? integer3 : integer2;
    }

    public final void d(Resources resources) {
        this.h = resources.getInteger(R$integer.inner_responsive_ui_column_4);
    }

    public final void e(Resources resources) {
        Integer value = this.g.getValue();
        int integer = resources.getInteger(R$integer.responsive_ui_column_count);
        float fC = this.f.getValue().c() / h();
        if (fC > 1.0f) {
            fC = 1.0f;
        }
        int iC = c((int) (integer * fC));
        if (value == null || value.intValue() != iC) {
            this.g.setValue(Integer.valueOf(iC));
        }
    }

    public final void f(Configuration configuration) {
        this.f3207j = configuration.densityDpi / 160.0f;
    }

    public final NearUIConfig.Status g(int i, slc slcVar) {
        t("RUIC", "calculateStatus() called with: orientation = [" + i + "], screenSize = [" + slcVar + "]");
        NearUIConfig.Status status = NearUIConfig.Status.UNKNOWN;
        int iC = slcVar.c();
        int iA = slcVar.a();
        if (iC < 600) {
            this.f3208l = NearUIConfig.WindowType.SMALL;
        } else if (iC < 840) {
            this.f3208l = NearUIConfig.WindowType.MEDIUM;
        } else {
            this.f3208l = NearUIConfig.WindowType.LARGE;
        }
        if (i == 1) {
            return iC >= 600 ? NearUIConfig.Status.UNFOLD : NearUIConfig.Status.FOLD;
        }
        if (i == 2) {
            return iA >= 500 ? NearUIConfig.Status.UNFOLD : NearUIConfig.Status.FOLD;
        }
        t("RUIC", "undefined orientation Status unknown !!! ");
        return status;
    }

    public final int h() {
        return this.i.getResources().getConfiguration().screenWidthDp;
    }

    public int i() {
        return this.g.getValue().intValue() - k();
    }

    public int j() {
        return this.f.getValue().c() - l();
    }

    public int k() {
        return c((int) (this.g.getValue().intValue() * (l() / this.f.getValue().c())));
    }

    public int l() {
        if (this.f.getValue().c() >= 840) {
            return this.i.getResources().getInteger(R$integer.inner_responsive_ui_extend_hierarchy_parent_width_360);
        }
        return this.f.getValue().c() >= 600 ? this.i.getResources().getInteger(R$integer.inner_responsive_ui_extend_hierarchy_parent_width_300) : this.f.getValue().c();
    }

    public LiveData<Integer> n() {
        return this.g;
    }

    public LiveData<NearUIConfig> o() {
        return this.f3205c;
    }

    public LiveData<Integer> p() {
        return this.f3206e;
    }

    public LiveData<NearUIConfig.Status> q() {
        return this.d;
    }

    public final void r(Context context, String str) {
        this.a = context.hashCode();
        this.b = context.getClass().getSimpleName();
        t("RUIC", "init() called with: activityContext = [" + context + "], from = [" + str + "]");
        this.i = context.getApplicationContext();
        f(context.getResources().getConfiguration());
        d(this.i.getResources());
        w(context.getResources().getConfiguration());
        e(context.getResources());
        t("RUIC", "init uiConfig " + this.f3205c.getValue() + ", columns count " + this.g.getValue());
        t("RUIC", "init addContent [" + l() + ":" + j() + "] - [" + k() + ":" + i() + "]");
    }

    public final boolean s(NearUIConfig nearUIConfig, NearUIConfig nearUIConfig2) {
        if (nearUIConfig == null || nearUIConfig2 == null) {
            return true;
        }
        slc slcVarB = nearUIConfig.b();
        slc slcVarB2 = nearUIConfig2.b();
        if (slcVarB == null || slcVarB2 == null) {
            return true;
        }
        return slcVarB.c() == slcVarB2.c() && slcVarB.a() != slcVarB2.a();
    }

    public final void t(String str, String str2) {
        if (m) {
            a7b.f(str + "_" + this.a, this.b + "_" + str2);
        }
    }

    public void v(Configuration configuration) {
        t("RUIC", "onActivityConfigChanged() called with: newConfig = [" + configuration + "]");
        if (w(configuration)) {
            e(this.i.getResources());
            t("RUIC", "onActivityConfigChanged uiConfig " + this.f3205c.getValue() + ", columns count " + this.g.getValue());
            t("RUIC", "onActivityConfigChanged addContent [" + l() + ":" + j() + "] - [" + k() + ":" + i() + "]");
        }
    }

    public final boolean w(Configuration configuration) {
        t("RUIC", "processConfig() called with: config = [" + configuration + "]");
        int i = configuration.orientation;
        slc slcVar = new slc(configuration.screenWidthDp, configuration.screenHeightDp, configuration.smallestScreenWidthDp);
        NearUIConfig nearUIConfig = new NearUIConfig(g(i, slcVar), slcVar, i, this.f3208l);
        NearUIConfig value = this.f3205c.getValue();
        t("RUIC", "processConfig() called with: oldUIConfig = [" + value + "]");
        t("RUIC", "processConfig() called with: newUIConfig = [" + nearUIConfig + "]");
        boolean z = false;
        if (nearUIConfig.equals(value)) {
            t("RUIC", "processConfig() called with: newUIConfig.equals(oldUIConfig)  return!!!");
            return false;
        }
        if (value != null) {
            t("RUIC", "processConfig() called with: oldUIConfig.getStatus() = [" + value.c() + "]");
        }
        t("RUIC", "processConfig() called with: newUIConfig.getStatus() = [" + nearUIConfig.c() + "]");
        if (value == null || nearUIConfig.c() != value.c() || s(value, nearUIConfig)) {
            this.d.setValue(nearUIConfig.c());
        }
        if (value == null || nearUIConfig.a() != value.a()) {
            this.f3206e.setValue(Integer.valueOf(nearUIConfig.a()));
            z = true;
        }
        if (value == null || !nearUIConfig.b().equals(value.b())) {
            int iC = nearUIConfig.b().c();
            int iH = h();
            if (Math.abs(iC - iH) < 50) {
                this.f.setValue(nearUIConfig.b());
            } else {
                t("RUIC", "update ScreenSize few case newWidth " + iC + " appWidth " + iH);
                slc value2 = this.f.getValue();
                if (value2 != null) {
                    iC = z ? value2.a() : value2.c();
                }
                slc slcVar2 = new slc(iC, nearUIConfig.b().a(), nearUIConfig.b().b());
                this.f.setValue(slcVar2);
                nearUIConfig.e(g(this.f3206e.getValue().intValue(), slcVar2));
                nearUIConfig.f(this.f3208l);
            }
            nearUIConfig.d(this.f.getValue());
        }
        this.f3205c.setValue(nearUIConfig);
        return true;
    }
}
