package com.heytap.health.operation.praiseguide;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.praise.PraiseModule;
import com.heytap.health.operations.router.providers.IPraiseService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/operation/PraiseService")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/operation/praiseguide/PraiseServiceImpl;", "Lcom/heytap/health/operations/router/providers/IPraiseService;", "Lcom/heytap/health/base/praise/PraiseModule;", "praiseModule", "", "C9", "Landroid/content/Context;", "context", "init", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class PraiseServiceImpl implements IPraiseService {
    public static final int $stable = 0;

    @Override // com.heytap.health.operations.router.providers.IPraiseService
    public void C9(@NotNull PraiseModule praiseModule) {
        Intrinsics.checkNotNullParameter(praiseModule, "praiseModule");
        new PraiseController().h(praiseModule);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }
}
