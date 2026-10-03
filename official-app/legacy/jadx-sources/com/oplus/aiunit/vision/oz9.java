package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.utrace.sdk.UTraceContext;
import com.pantanal.server.content.upkmanage.entity.UpkInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/oz9;", "", "Landroid/content/Context;", "context", "", "serviceId", "Lcom/oplus/utrace/sdk/UTraceContext;", "parentCtx", "", "version", "Lcom/pantanal/server/content/upkmanage/entity/UpkInfo;", "a", "(Landroid/content/Context;Ljava/lang/String;Lcom/oplus/utrace/sdk/UTraceContext;Ljava/lang/Long;)Lcom/pantanal/server/content/upkmanage/entity/UpkInfo;", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public interface oz9 {
    @Nullable
    UpkInfo a(@NotNull Context context, @NotNull String serviceId, @Nullable UTraceContext parentCtx, @Nullable Long version);
}
