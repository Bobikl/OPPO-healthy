package com.heytap.health.settings.me.settings2.viewmodel;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.health.settings.R$string;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ekk;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.y0k;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/settings/me/settings2/viewmodel/AppUpdateChecker;", "", "Landroid/app/Activity;", "activity", "", "b", "c", MapSchema.FIELD_NAME_ENTRY, "", "silence", "f", "", "a", "Ljava/lang/String;", "TAG", "Landroid/content/Context;", "Landroid/content/Context;", "appContext", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "d", "()Landroidx/lifecycle/MutableLiveData;", "appVersionStatus", "Landroid/content/BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "mUpgradeReceiver", "<init>", "()V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AppUpdateChecker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "AppUpdateChecker";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context appContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<String> appVersionStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final BroadcastReceiver mUpgradeReceiver;

    public AppUpdateChecker() {
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        this.appContext = contextA;
        this.appVersionStatus = new MutableLiveData<>();
        this.mUpgradeReceiver = new BroadcastReceiver() { // from class: com.heytap.health.settings.me.settings2.viewmodel.AppUpdateChecker$mUpgradeReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.a.f(false);
            }
        };
        e();
        f(true);
    }

    public final void b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!rpc.c()) {
            a7b.f(this.TAG, "checkAppUpdate -> no network");
            y0k.i(qtf.l(R$string.settings_upgrade_network_error));
        } else if (activity.isFinishing() || activity.isDestroyed()) {
            a7b.f(this.TAG, "checkAppUpdate -> activity isFinishing");
        } else {
            a7b.f(this.TAG, "checkAppUpdate -> UpgradeHelper.checkUpgradeManual");
            ekk.b(activity, 0);
        }
    }

    public final void c() {
        LocalBroadcastManager.getInstance(this.appContext).unregisterReceiver(this.mUpgradeReceiver);
    }

    @NotNull
    public final MutableLiveData<String> d() {
        return this.appVersionStatus;
    }

    public final void e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action.upgrade.checked");
        intentFilter.addAction(ekk.ACTION_DOWNLOAD_STATE_CHANGE);
        LocalBroadcastManager.getInstance(this.appContext).registerReceiver(this.mUpgradeReceiver, intentFilter);
    }

    public final void f(boolean silence) {
        if (!rpc.c()) {
            a7b.f(this.TAG, "updateVersionState -> no network");
            return;
        }
        if (!ekk.d(this.appContext)) {
            a7b.f(this.TAG, "updateVersionState -> no update");
            this.appVersionStatus.postValue(qtf.l(R$string.settings_upgrade_no_update));
        } else {
            if (!ekk.h()) {
                a7b.f(this.TAG, "updateVersionState -> has update");
                this.appVersionStatus.postValue(qtf.l(R$string.settings_upgrade_has_update));
                return;
            }
            a7b.f(this.TAG, "updateVersionState -> downing");
            this.appVersionStatus.postValue(qtf.l(R$string.settings_upgrade_downloading));
            if (silence) {
                return;
            }
            ekk.l(this.appContext);
        }
    }
}
