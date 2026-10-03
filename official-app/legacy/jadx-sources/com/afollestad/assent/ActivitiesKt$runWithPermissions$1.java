package com.afollestad.assent;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/afollestad/assent/AssentResult;", "invoke"}, k = 3, mv = {1, 1, 16})
final class ActivitiesKt$runWithPermissions$1 extends Lambda implements Function1<AssentResult, Unit> {
    final /* synthetic */ Function1 $execute;
    final /* synthetic */ Permission[] $permissions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitiesKt$runWithPermissions$1(Permission[] permissionArr, Function1 function1) {
        super(1);
        this.$permissions = permissionArr;
        this.$execute = function1;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AssentResult assentResult) {
        invoke2(assentResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AssentResult it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
        Permission[] permissionArr = this.$permissions;
        if (it.d((Permission[]) Arrays.copyOf(permissionArr, permissionArr.length))) {
            this.$execute.invoke(it);
        }
    }
}
