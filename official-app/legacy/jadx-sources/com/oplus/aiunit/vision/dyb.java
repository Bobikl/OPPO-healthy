package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\b"}, d2 = {"Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "", "mac", "Lcom/oplus/aiunit/vision/iuf;", "rspType", "Lcom/oplus/aiunit/vision/cyb;", "a", "b", "lib_heytapconnect_release"}, k = 2, mv = {1, 8, 0})
public final class dyb {
    @NotNull
    public static final cyb a(@NotNull MessageEvent messageEvent, @NotNull String mac, @NotNull iuf rspType) {
        Intrinsics.checkNotNullParameter(messageEvent, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(rspType, "rspType");
        if (rspType instanceof iuf.c) {
            return new cyb(mac, messageEvent.getServiceId(), messageEvent.getCommandId());
        }
        if (rspType instanceof iuf.a) {
            return new cyb(mac, messageEvent.getServiceId(), ((iuf.a) rspType).getRspCid());
        }
        if (!(rspType instanceof iuf.b)) {
            throw new NoWhenBranchMatchedException();
        }
        iuf.b bVar = (iuf.b) rspType;
        return new cyb(mac, bVar.getRspSid(), bVar.getRspCid());
    }

    @NotNull
    public static final cyb b(@NotNull MessageEvent messageEvent, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(messageEvent, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new cyb(mac, messageEvent.getServiceId(), messageEvent.getCommandId());
    }
}
