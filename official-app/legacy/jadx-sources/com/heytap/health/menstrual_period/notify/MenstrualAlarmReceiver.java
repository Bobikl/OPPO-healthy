package com.heytap.health.menstrual_period.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.aub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/heytap/health/menstrual_period/notify/MenstrualAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", "Companion", "a", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class MenstrualAlarmReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @NotNull
    public static final String ACTION = "com.heytap.health.menstrual_period.alarm_receiver";

    @NotNull
    public static final String KEY_SET_TIME = "key_set_time";

    @NotNull
    public static final String TYPE = "show_type";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, ACTION)) {
            aub aubVar = new aub();
            int intExtra = intent.getIntExtra(TYPE, 0);
            Bundle extras = intent.getExtras();
            a7b.f("MenstrualAlarmReceiver", "type=" + intExtra + ", set time=" + intent.getStringExtra(KEY_SET_TIME));
            aubVar.b(intExtra, extras);
        }
    }
}
