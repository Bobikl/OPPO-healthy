package com.oplus.aiunit.vision;

import com.afollestad.assent.GrantResult;
import com.afollestad.assent.Permission;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\f"}, d2 = {"", "Lcom/afollestad/assent/Permission;", "forPermission", "Lcom/oplus/aiunit/vision/d2h;", "shouldShowRationale", "Lcom/afollestad/assent/GrantResult;", "a", "", "", "permissions", "", "b", "core"}, k = 2, mv = {1, 4, 0})
public final class qb8 {
    @NotNull
    public static final GrantResult a(int i, @NotNull Permission forPermission, @NotNull d2h shouldShowRationale) {
        Intrinsics.checkParameterIsNotNull(forPermission, "forPermission");
        Intrinsics.checkParameterIsNotNull(shouldShowRationale, "shouldShowRationale");
        if (shouldShowRationale.a(forPermission)) {
            return GrantResult.PERMANENTLY_DENIED;
        }
        return i != 0 ? GrantResult.DENIED : GrantResult.GRANTED;
    }

    @NotNull
    public static final List<GrantResult> b(@NotNull int[] mapGrantResults, @NotNull Set<? extends Permission> permissions, @NotNull d2h shouldShowRationale) {
        Intrinsics.checkParameterIsNotNull(mapGrantResults, "$this$mapGrantResults");
        Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        Intrinsics.checkParameterIsNotNull(shouldShowRationale, "shouldShowRationale");
        ArrayList arrayList = new ArrayList(mapGrantResults.length);
        int length = mapGrantResults.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(a(mapGrantResults[i], (Permission) CollectionsKt___CollectionsKt.elementAt(permissions, i2), shouldShowRationale));
            i++;
            i2++;
        }
        return arrayList;
    }
}
