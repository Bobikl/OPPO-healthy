package com.heytap.health.operation.goal;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.account.service.IAccountDeleteService;
import com.oplus.aiunit.vision.mn;
import com.oplus.aiunit.vision.v9g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Route(path = mn.SERVICE_ACCOUNT_DELETE_GOAL)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/heytap/health/operation/goal/GoalDeleteService;", "Lcom/heytap/health/account/service/IAccountDeleteService;", "", "a3", "Landroid/content/Context;", "context", "init", "", "i", "Ljava/lang/String;", "SP_GOAL_CACHE", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class GoalDeleteService implements IAccountDeleteService {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String SP_GOAL_CACHE = "djfadjhfadjf";

    @Override // com.heytap.health.account.service.IAccountDeleteService
    public void a3() {
        v9g.x(this.SP_GOAL_CACHE).k();
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }
}
