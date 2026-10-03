package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0001*\u00020\u0004H\u0000¨\u0006\f"}, d2 = {"", "", "d", b2n.g, "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", b2n.f, "f", "c", "b", MapSchema.FIELD_NAME_ENTRY, "a", "i", "device_manager_impl_release"}, k = 2, mv = {1, 8, 0})
public final class yxb {
    public static final boolean a(@NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "<this>");
        return d(messageEvent.getServiceId()) && messageEvent.getCommandId() == 35;
    }

    public static final boolean b(@NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "<this>");
        return h(messageEvent.getServiceId()) && 22 == messageEvent.getCommandId();
    }

    public static final boolean c(@NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "<this>");
        return d(messageEvent.getServiceId()) && (messageEvent.getCommandId() == 8 || messageEvent.getCommandId() == 147);
    }

    public static final boolean d(int i) {
        return i == 1;
    }

    public static final boolean e(@NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "<this>");
        return d(messageEvent.getServiceId()) && messageEvent.getCommandId() == 104;
    }

    public static final boolean f(@NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "<this>");
        return h(messageEvent.getServiceId()) && 20 == messageEvent.getCommandId();
    }

    public static final boolean g(@NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "<this>");
        return h(messageEvent.getServiceId()) && (12 == messageEvent.getCommandId() || 11 == messageEvent.getCommandId());
    }

    public static final boolean h(int i) {
        return i == 11;
    }

    public static final boolean i(@NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "<this>");
        return d(messageEvent.getServiceId()) && messageEvent.getCommandId() == 138;
    }
}
