package com.oplus.deepthinker.sdk.app.awareness.capability;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/IntentCapabilityEvent;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEvent;", "Landroid/content/Intent;", "event", "eventId", "", "(Landroid/content/Intent;I)V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class IntentCapabilityEvent extends CapabilityEvent<Intent> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentCapabilityEvent(@NotNull Intent event, int i) {
        super(Intent.class, event, i);
        Intrinsics.checkNotNullParameter(event, "event");
    }
}
