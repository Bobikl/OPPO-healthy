package com.health.health_seedlingcard.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.health.health_seedlingcard.utlis.SeedCardSendDataToMetisHelper;
import com.heytap.health.operations.router.providers.IOperatorProvider;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.jug;
import com.oplus.aiunit.vision.m8b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/health/health_seedlingcard/receiver/SeedlingCardReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "", "type", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class SeedlingCardReceiver extends BroadcastReceiver {

    @NotNull
    public final String a = SeedCardSendDataToMetisHelper.TAG;

    public final void a(String type, Context context) {
        if (Intrinsics.areEqual(type, jug.STEPS_ACHIEVEMENT_MEDAL)) {
            if (((IOperatorProvider) e1.d().h(IOperatorProvider.class)).E3() != null) {
                SeedCardSendDataToMetisHelper.INSTANCE.b(context);
                return;
            } else {
                m8b.f(this.a, "No step medal data");
                return;
            }
        }
        if (Intrinsics.areEqual(type, jug.SLEEP_STATE)) {
            SeedCardSendDataToMetisHelper.INSTANCE.d(context);
            return;
        }
        m8b.f(this.a, "Unknown type: " + type);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        m8b.f(this.a, "get intent = " + (intent != null ? intent.getAction() : null));
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 385378232 && action.equals(jug.SEEDLINGCARD_ACTION_REQUEST_DATA)) {
            try {
                String stringExtra = intent.getStringExtra(jug.SEEDLINGCARD_ACTION_REQUEST_TYPE);
                m8b.f(this.a, "smart brain get data type=" + stringExtra + " ");
                if (stringExtra != null) {
                    Intrinsics.checkNotNull(context);
                    a(stringExtra, context);
                }
            } catch (Exception e) {
                m8b.b(this.a, e.getMessage());
            }
        }
    }
}
