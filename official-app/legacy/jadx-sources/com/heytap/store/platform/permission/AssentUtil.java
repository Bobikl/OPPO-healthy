package com.heytap.store.platform.permission;

import com.afollestad.assent.Permission;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/heytap/store/platform/permission/AssentUtil;", "", "()V", "permissionString", "", "", "permissions", "", "Lcom/afollestad/assent/Permission;", "permission_release"}, k = 1, mv = {1, 4, 0})
public final class AssentUtil {
    public static final AssentUtil INSTANCE = new AssentUtil();

    private AssentUtil() {
    }

    @NotNull
    public final List<String> permissionString(@NotNull Collection<? extends Permission> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = permissions.iterator();
        while (it.hasNext()) {
            arrayList.add(((Permission) it.next()).getValue());
        }
        return arrayList;
    }
}
