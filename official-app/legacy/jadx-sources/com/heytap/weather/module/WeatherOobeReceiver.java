package com.heytap.weather.module;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/heytap/weather/module/WeatherOobeReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", "Companion", "a", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WeatherOobeReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static boolean a;

    /* JADX INFO: renamed from: com.heytap.weather.module.WeatherOobeReceiver$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/heytap/weather/module/WeatherOobeReceiver$a;", "", "Landroid/content/Context;", "context", "", "a", "", "TAG", "Ljava/lang/String;", "", "sRegistered", "Z", "<init>", "()V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@Nullable Context context) {
            boolean z = WeatherOobeReceiver.a;
            StringBuilder sb = new StringBuilder();
            sb.append("registerSyncReceiver sRegistered is ");
            sb.append(z);
            if (WeatherOobeReceiver.a) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.op.smartwear.native.weather.RECEIVER");
            Intrinsics.checkNotNull(context);
            LocalBroadcastManager.getInstance(context).registerReceiver(new WeatherOobeReceiver(), intentFilter);
            WeatherOobeReceiver.a = true;
        }
    }

    @JvmStatic
    public static final void c(@Nullable Context context) {
        INSTANCE.a(context);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder();
        sb.append("onReceive() called with: action = [");
        sb.append(action);
        sb.append("]");
        if (Intrinsics.areEqual("com.op.smartwear.native.weather.RECEIVER", action)) {
            WeatherTransportApi.INSTANCE.b();
            WeatherMainApi.INSTANCE.a(true);
        }
    }
}
