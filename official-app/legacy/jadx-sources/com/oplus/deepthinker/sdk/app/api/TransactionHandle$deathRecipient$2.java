package com.oplus.deepthinker.sdk.app.api;

import android.os.IBinder;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.g9k;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/os/IBinder$DeathRecipient;", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class TransactionHandle$deathRecipient$2 extends Lambda implements Function0<IBinder.DeathRecipient> {
    final /* synthetic */ g9k<Object> this$0;

    public TransactionHandle$deathRecipient$2(g9k<Object> g9kVar) {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m5178invoke$lambda0(g9k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        g9k.a(this$0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final IBinder.DeathRecipient invoke() {
        final g9k g9kVar = null;
        return new IBinder.DeathRecipient(g9kVar) { // from class: com.oplus.deepthinker.sdk.app.api.a
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                TransactionHandle$deathRecipient$2.m5178invoke$lambda0(null);
            }
        };
    }
}
