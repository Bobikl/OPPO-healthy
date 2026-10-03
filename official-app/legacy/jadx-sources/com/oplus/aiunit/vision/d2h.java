package com.oplus.aiunit.vision;

import androidx.annotation.CheckResult;
import com.afollestad.assent.Permission;
import com.heytap.health.settings.me.settings2.permission.PermissionDetailAct;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/d2h;", "", "Lcom/afollestad/assent/Permission;", PermissionDetailAct.PERMISSION, "", "b", "a", "core"}, k = 1, mv = {1, 4, 0})
public interface d2h {
    @CheckResult
    boolean a(@NotNull Permission permission);

    boolean b(@NotNull Permission permission);
}
