package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.Module;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/wearable/linkservice/sdk/Node;", "", "a", "lib_heytapconnect_impl_release"}, k = 2, mv = {1, 8, 0})
public final class ttc {
    public static final boolean a(@NotNull Node node) {
        Module stubModule;
        Intrinsics.checkNotNullParameter(node, "<this>");
        if (node.getMainModule() == null) {
            return false;
        }
        return (node.getMainModule().getState() == 2) || ((stubModule = node.getStubModule()) != null && stubModule.getState() == 2);
    }
}
