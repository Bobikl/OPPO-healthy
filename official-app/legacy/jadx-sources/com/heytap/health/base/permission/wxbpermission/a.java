package com.heytap.health.base.permission.wxbpermission;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.qe0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes15.dex */
public final class a {

    @Nullable
    public b a;
    public final ComponentCallbacks b = new ComponentCallbacksC0291a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f3200c = new c();
    public WeakReference<AppCompatActivity> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference<Application> f3201e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3202j;

    /* JADX INFO: renamed from: com.heytap.health.base.permission.wxbpermission.a$a, reason: collision with other inner class name */
    public final class ComponentCallbacksC0291a implements ComponentCallbacks {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NonNull Configuration configuration) {
            int i = configuration.uiMode & 48;
            StringBuilder sb = new StringBuilder();
            sb.append("onConfigurationChanged, configNight=");
            sb.append(a.this.q(i));
            sb.append(", lastUiModeNight=");
            a aVar = a.this;
            sb.append(aVar.q(aVar.f));
            a7b.f("PermExplanationUiMode", sb.toString());
            b bVarM = a.this.m();
            if (bVarM == null) {
                a7b.f("PermExplanationUiMode", "onConfigurationChanged host=null, unregister observer");
                a.this.x();
                return;
            }
            if (bVarM.b()) {
                a7b.f("PermExplanationUiMode", "onConfigurationChanged release, hostActivityInvalid=true");
                a.this.s(false, "configChanged_hostInvalid");
                return;
            }
            AppCompatActivity appCompatActivityC = bVarM.c();
            if (appCompatActivityC != null) {
                i = appCompatActivityC.getResources().getConfiguration().uiMode & 48;
            }
            boolean zA = bVarM.a();
            a7b.f("PermExplanationUiMode", "onConfigurationChanged shouldKeep=" + zA);
            if (i == a.this.f) {
                return;
            }
            a.this.f = i;
            if (zA) {
                a.this.w(bVarM);
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        public ComponentCallbacksC0291a() {
        }
    }

    public interface b {
        boolean a();

        boolean b();

        @Nullable
        AppCompatActivity c();

        void d();

        void e(boolean z);
    }

    public final class c implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            b bVarM = a.this.m();
            if (bVarM != null && activity == bVarM.c()) {
                a.this.s(true, "activityDestroyed");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }

        public c() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NonNull b bVar) {
        this.a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(DialogInterface dialogInterface) {
        a7b.f("PermExplanationUiMode", "onDialogDismiss, suppressDismissCleanup=" + this.h + ", rebuildInProgress=" + this.f3202j);
        if (this.h || this.f3202j) {
            a7b.f("PermExplanationUiMode", "onDialogDismiss skipped release, suppress cleanup or rebuild in progress");
            return;
        }
        b bVarM = m();
        if (bVarM != null && bVarM.a()) {
            a7b.f("PermExplanationUiMode", "onDialogDismiss skipped release, shouldKeepExplanationDialog=true");
        } else {
            s(false, "dialogDismiss");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.i = false;
        b bVarM = m();
        if (bVarM == null) {
            a7b.f("PermExplanationUiMode", "scheduleUiModeRebuild callback skipped, host=null");
            return;
        }
        if (bVarM.b()) {
            a7b.f("PermExplanationUiMode", "scheduleUiModeRebuild callback skipped, hostActivityInvalid=true");
        } else if (!bVarM.a()) {
            a7b.f("PermExplanationUiMode", "scheduleUiModeRebuild callback skipped, shouldKeepExplanationDialog=false");
        } else {
            a7b.f("PermExplanationUiMode", "scheduleUiModeRebuild callback, notify onUiModeNightChanged");
            bVarM.d();
        }
    }

    public void i(@NonNull Dialog dialog) {
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.oplus.aiunit.vision.zfk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.i.o(dialogInterface);
            }
        });
    }

    public void j() {
        a7b.f("PermExplanationUiMode", "beginRebuild");
        this.f3202j = true;
        this.h = true;
    }

    public void k() {
        a7b.f("PermExplanationUiMode", "endRebuild");
        this.f3202j = false;
        this.h = false;
    }

    @NonNull
    public final String l(@Nullable Activity activity) {
        return activity != null ? activity.getClass().getSimpleName() : "null";
    }

    @Nullable
    public final b m() {
        return this.a;
    }

    public boolean n() {
        return this.g;
    }

    @NonNull
    public final String q(int i) {
        if (i == 0) {
            return "UNDEFINED(" + i + ")";
        }
        if (i == 16) {
            return "NO(" + i + ")";
        }
        if (i != 32) {
            return "UNKNOWN(" + i + ")";
        }
        return "YES(" + i + ")";
    }

    public boolean r(@NonNull AppCompatActivity appCompatActivity) {
        if (this.g) {
            a7b.f("PermExplanationUiMode", "register skipped, already registered, activity=" + l(appCompatActivity));
            return true;
        }
        if (!qe0.p(appCompatActivity)) {
            a7b.f("PermExplanationUiMode", "register skipped, activity does not handle uiMode config change");
            return false;
        }
        Application application = appCompatActivity.getApplication();
        this.d = new WeakReference<>(appCompatActivity);
        this.f3201e = new WeakReference<>(application);
        this.f = appCompatActivity.getResources().getConfiguration().uiMode & 48;
        appCompatActivity.registerComponentCallbacks(this.b);
        application.registerActivityLifecycleCallbacks(this.f3200c);
        this.g = true;
        a7b.f("PermExplanationUiMode", "register success, activity=" + l(appCompatActivity) + ", lastUiModeNight=" + q(this.f));
        return true;
    }

    public final void s(boolean z, @NonNull String str) {
        b bVarM = m();
        StringBuilder sb = new StringBuilder();
        sb.append("release start, reason=");
        sb.append(str);
        sb.append(", dismissDialog=");
        sb.append(z);
        sb.append(", hostNull=");
        sb.append(bVarM == null);
        a7b.f("PermExplanationUiMode", sb.toString());
        x();
        if (bVarM != null) {
            bVarM.e(z);
        }
    }

    @Nullable
    public final Application t() {
        WeakReference<Application> weakReference = this.f3201e;
        Application application = weakReference != null ? weakReference.get() : null;
        if (application != null) {
            return application;
        }
        b bVarM = m();
        AppCompatActivity appCompatActivityC = bVarM != null ? bVarM.c() : null;
        if (appCompatActivityC != null) {
            return appCompatActivityC.getApplication();
        }
        return null;
    }

    @Nullable
    public final AppCompatActivity u() {
        WeakReference<AppCompatActivity> weakReference = this.d;
        AppCompatActivity appCompatActivity = weakReference != null ? weakReference.get() : null;
        if (appCompatActivity != null) {
            return appCompatActivity;
        }
        b bVarM = m();
        if (bVarM != null) {
            return bVarM.c();
        }
        return null;
    }

    public void v(@NonNull Runnable runnable) {
        boolean z = this.h;
        a7b.f("PermExplanationUiMode", "runSuppressingDismissCleanup start, previousSuppress=" + z + ", rebuildInProgress=" + this.f3202j);
        this.h = true;
        try {
            runnable.run();
        } finally {
            if (this.f3202j) {
                a7b.f("PermExplanationUiMode", "runSuppressingDismissCleanup keep suppressed, rebuildInProgress=true");
            } else {
                this.h = z;
                a7b.f("PermExplanationUiMode", "runSuppressingDismissCleanup restore, suppressDismissCleanup=" + this.h);
            }
        }
    }

    public final void w(@NonNull b bVar) {
        if (this.i || this.f3202j) {
            a7b.f("PermExplanationUiMode", "scheduleUiModeRebuild skipped, rebuildScheduled=" + this.i + ", rebuildInProgress=" + this.f3202j);
            return;
        }
        if (!bVar.a()) {
            a7b.f("PermExplanationUiMode", "scheduleUiModeRebuild skipped, shouldKeepExplanationDialog=false");
            return;
        }
        AppCompatActivity appCompatActivityC = bVar.c();
        if (appCompatActivityC == null) {
            a7b.f("PermExplanationUiMode", "scheduleUiModeRebuild skipped, activity=null");
            return;
        }
        this.i = true;
        a7b.f("PermExplanationUiMode", "scheduleUiModeRebuild post, activity=" + l(appCompatActivityC));
        appCompatActivityC.getWindow().getDecorView().post(new Runnable() { // from class: com.oplus.aiunit.vision.agk
            @Override // java.lang.Runnable
            public final void run() {
                this.i.p();
            }
        });
    }

    public void x() {
        if (!this.g) {
            a7b.f("PermExplanationUiMode", "unregister skipped, not registered");
            return;
        }
        y();
        Application applicationT = t();
        if (applicationT != null) {
            applicationT.unregisterActivityLifecycleCallbacks(this.f3200c);
            a7b.f("PermExplanationUiMode", "unregister lifecycleCallbacks success");
        } else {
            a7b.f("PermExplanationUiMode", "unregister lifecycleCallbacks skipped, application=null");
        }
        WeakReference<AppCompatActivity> weakReference = this.d;
        if (weakReference != null) {
            weakReference.clear();
            this.d = null;
        }
        WeakReference<Application> weakReference2 = this.f3201e;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.f3201e = null;
        }
        this.a = null;
        this.g = false;
    }

    public final void y() {
        AppCompatActivity appCompatActivityU = u();
        if (appCompatActivityU != null) {
            appCompatActivityU.unregisterComponentCallbacks(this.b);
            return;
        }
        Application applicationT = t();
        if (applicationT != null) {
            applicationT.unregisterComponentCallbacks(this.b);
        }
    }
}
