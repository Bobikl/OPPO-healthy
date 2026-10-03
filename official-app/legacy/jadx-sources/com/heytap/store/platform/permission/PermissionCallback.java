package com.heytap.store.platform.permission;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/platform/permission/PermissionCallback;", "", "onDenied", "", "permissions", "", "", "permanentlyDenied", "", "onGranted", "isAllGranted", "permission_release"}, k = 1, mv = {1, 4, 0})
public interface PermissionCallback {
    void onDenied(@NotNull List<String> permissions, boolean permanentlyDenied);

    void onGranted(@NotNull List<String> permissions, boolean isAllGranted);
}
