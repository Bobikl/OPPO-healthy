package com.afollestad.assent;

import com.heytap.health.settings.me.settings2.permission.PermissionDetailAct;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/afollestad/assent/GrantResult;", PermissionDetailAct.PERMISSION, "Lcom/afollestad/assent/Permission;", "invoke"}, k = 3, mv = {1, 1, 16})
final class AssentResult$isAllDenied$1 extends Lambda implements Function1<Permission, GrantResult> {
    final /* synthetic */ AssentResult this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssentResult$isAllDenied$1(AssentResult assentResult) {
        super(1);
        this.this$0 = assentResult;
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final GrantResult invoke(@NotNull Permission permission) {
        Intrinsics.checkParameterIsNotNull(permission, "permission");
        GrantResult grantResult = this.this$0.b().get(permission);
        if (grantResult != null) {
            return grantResult;
        }
        throw new IllegalStateException(("Permission " + permission + " not in result map.").toString());
    }
}
