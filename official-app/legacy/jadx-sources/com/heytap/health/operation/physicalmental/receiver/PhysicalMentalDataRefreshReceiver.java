package com.heytap.health.operation.physicalmental.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.provider.adapter.open.PhysicalMentalAdapter;
import com.heytap.health.core.provider.adapter.open.PhysicalMentalStatAdapter;
import com.oplus.aiunit.vision.a7b;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/heytap/health/operation/physicalmental/receiver/PhysicalMentalDataRefreshReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", "Companion", "a", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class PhysicalMentalDataRefreshReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (TextUtils.equals(intent.getAction(), "com.heytap.health.action_data_refresh") && intent.getIntExtra("refresh_type", 0) == 23) {
            a7b.f("PhysicalMentalDataRefreshReceiver", "new physical mental data");
            PhysicalMentalAdapter.INSTANCE.a(context);
            PhysicalMentalStatAdapter.INSTANCE.a(context);
        }
    }
}
