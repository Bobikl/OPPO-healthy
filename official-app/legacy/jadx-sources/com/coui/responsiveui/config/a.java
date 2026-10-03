package com.coui.responsiveui.config;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import androidx.annotation.UiThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.oplus.aiunit.vision.ffk;
import com.support.responsiveui.R$integer;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static a f2196j;
    public static HashMap<Integer, a> k = new LinkedHashMap();
    public int g;
    public Context h;
    public int a = -1;
    public MutableLiveData<UIConfig> b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MutableLiveData<UIConfig.Status> f2197c = new MutableLiveData<>();
    public MutableLiveData<Integer> d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MutableLiveData<ffk> f2198e = new MutableLiveData<>();
    public MutableLiveData<Integer> f = new MutableLiveData<>();
    public UIConfig.WindowType i = UIConfig.WindowType.SMALL;

    public a(Context context) {
        m(context);
    }

    @UiThread
    public static a f(Context context) {
        if (f2196j == null) {
            f2196j = new a(context);
        }
        int iHashCode = context.hashCode();
        if (iHashCode != f2196j.a) {
            Log.d("ResponsiveUIConfig", "getDefault context hash change from " + f2196j.a + " to " + iHashCode);
            f2196j.m(context);
        }
        return f2196j;
    }

    public final int a(int i) {
        int integer = this.h.getResources().getInteger(R$integer.inner_responsive_ui_column_4);
        int integer2 = this.h.getResources().getInteger(R$integer.inner_responsive_ui_column_8);
        int integer3 = this.h.getResources().getInteger(R$integer.inner_responsive_ui_column_12);
        int i2 = integer / 2;
        if (i < integer2 - i2) {
            return integer;
        }
        return (i >= integer2 && i >= integer3 - i2) ? integer3 : integer2;
    }

    public final void b(Resources resources) {
        this.g = resources.getInteger(R$integer.inner_responsive_ui_column_4);
    }

    public final void c(Resources resources) {
        Integer value = this.f.getValue();
        int integer = resources.getInteger(R$integer.responsive_ui_column_count);
        float fC = this.f2198e.getValue().c() / e();
        if (fC > 1.0f) {
            fC = 1.0f;
        }
        int iA = a((int) (integer * fC));
        if (value == null || value.intValue() != iA) {
            this.f.setValue(Integer.valueOf(iA));
        }
    }

    public final UIConfig.Status d(int i, ffk ffkVar) {
        UIConfig.Status status = UIConfig.Status.UNKNOWN;
        int iC = ffkVar.c();
        int iA = ffkVar.a();
        if (iC < 600) {
            this.i = UIConfig.WindowType.SMALL;
        } else if (iC < 840) {
            this.i = UIConfig.WindowType.MEDIUM;
        } else {
            this.i = UIConfig.WindowType.LARGE;
        }
        if (i == 1) {
            return iC >= 600 ? UIConfig.Status.UNFOLD : UIConfig.Status.FOLD;
        }
        if (i == 2) {
            return iA >= 500 ? UIConfig.Status.UNFOLD : UIConfig.Status.FOLD;
        }
        Log.d("ResponsiveUIConfig", "undefined orientation Status unknown !!! ");
        return status;
    }

    public final int e() {
        return this.h.getResources().getConfiguration().screenWidthDp;
    }

    public int g() {
        return this.f.getValue().intValue() - i();
    }

    public int h() {
        return this.f2198e.getValue().c() - j();
    }

    public int i() {
        return a((int) (this.f.getValue().intValue() * (j() / this.f2198e.getValue().c())));
    }

    public int j() {
        if (this.f2198e.getValue().c() >= 840) {
            return this.h.getResources().getInteger(R$integer.inner_responsive_ui_extend_hierarchy_parent_width_360);
        }
        return this.f2198e.getValue().c() >= 600 ? this.h.getResources().getInteger(R$integer.inner_responsive_ui_extend_hierarchy_parent_width_300) : this.f2198e.getValue().c();
    }

    public UIConfig.WindowType k() {
        return this.b.getValue().d();
    }

    public LiveData<UIConfig> l() {
        return this.b;
    }

    public final void m(Context context) {
        this.a = context.hashCode();
        Context applicationContext = context.getApplicationContext();
        this.h = applicationContext;
        b(applicationContext.getResources());
        n(context.getResources().getConfiguration());
        c(context.getResources());
        Log.d("ResponsiveUIConfig", "init uiConfig " + this.b.getValue() + ", columns count " + this.f.getValue());
        Log.d("ResponsiveUIConfig", "init addContent [" + j() + ":" + h() + "] - [" + i() + ":" + g() + "]");
    }

    public final boolean n(Configuration configuration) {
        int i = configuration.orientation;
        ffk ffkVar = new ffk(configuration.screenWidthDp, configuration.screenHeightDp, configuration.smallestScreenWidthDp);
        UIConfig uIConfig = new UIConfig(d(i, ffkVar), ffkVar, i, this.i);
        UIConfig value = this.b.getValue();
        boolean z = false;
        if (uIConfig.equals(value)) {
            return false;
        }
        if (value == null || uIConfig.c() != value.c()) {
            this.f2197c.setValue(uIConfig.c());
        }
        if (value == null || uIConfig.a() != value.a()) {
            this.d.setValue(Integer.valueOf(uIConfig.a()));
            z = true;
        }
        if (value == null || !uIConfig.b().equals(value.b())) {
            int iC = uIConfig.b().c();
            int iE = e();
            if (Math.abs(iC - iE) < 50) {
                this.f2198e.setValue(uIConfig.b());
            } else {
                Log.d("ResponsiveUIConfig", "update ScreenSize few case newWidth " + iC + " appWidth " + iE);
                ffk value2 = this.f2198e.getValue();
                if (value2 != null) {
                    iC = z ? value2.a() : value2.c();
                }
                ffk ffkVar2 = new ffk(iC, uIConfig.b().a(), uIConfig.b().b());
                this.f2198e.setValue(ffkVar2);
                uIConfig.f(d(this.d.getValue().intValue(), ffkVar2));
                uIConfig.g(this.i);
            }
            uIConfig.e(this.f2198e.getValue());
        }
        this.b.setValue(uIConfig);
        return true;
    }
}
