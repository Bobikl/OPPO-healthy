package com.oplus.nearx.cloudconfig.datasource;

import com.oplus.aiunit.vision.pu3;
import com.oplus.aiunit.vision.rw4;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"L;", "configId", "Lcom/oplus/aiunit/vision/pu3;", "kotlin.jvm.PlatformType", "invoke", "(L;)Lcom/oplus/nearx/cloudconfig/bean/ConfigTrace;", "kotlin/String", "<anonymous>"}, k = 3, mv = {1, 4, 0})
final class DataSourceManager$copyAssetsConfigs$$inlined$forEach$lambda$1 extends Lambda implements Function1<String, pu3> {
    final /* synthetic */ CopyOnWriteArrayList $successConfigs$inlined;
    final /* synthetic */ rw4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSourceManager$copyAssetsConfigs$$inlined$forEach$lambda$1(rw4 rw4Var, CopyOnWriteArrayList copyOnWriteArrayList) {
        super(1);
        this.$successConfigs$inlined = copyOnWriteArrayList;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ pu3 invoke(String str) {
        invoke2(str);
        return null;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final pu3 invoke2(@NotNull String configId) {
        Intrinsics.checkParameterIsNotNull(configId, "configId");
        rw4.d(null, configId);
        Intrinsics.checkExpressionValueIsNotNull(null, "trace(configId)");
        return null;
    }
}
