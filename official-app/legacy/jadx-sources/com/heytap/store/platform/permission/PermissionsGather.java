package com.heytap.store.platform.permission;

import com.afollestad.assent.Permission;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/platform/permission/PermissionsGather;", "", "value", "", "Lcom/afollestad/assent/Permission;", "(Ljava/lang/String;ILjava/util/List;)V", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", LanConstants.OPERATOR_UNKNOWN, "STORAGE", "CAMERA", "LOCATION", "CONTACTS", "CALL_LOG", "CALL", "CALENDAR", "permission_release"}, k = 1, mv = {1, 4, 0})
public enum PermissionsGather {
    UNKNOWN(new ArrayList()),
    STORAGE(CollectionsKt__CollectionsKt.mutableListOf(Permission.WRITE_EXTERNAL_STORAGE, Permission.READ_EXTERNAL_STORAGE)),
    CAMERA(CollectionsKt__CollectionsKt.mutableListOf(Permission.CAMERA)),
    LOCATION(CollectionsKt__CollectionsKt.mutableListOf(Permission.ACCESS_FINE_LOCATION, Permission.ACCESS_COARSE_LOCATION)),
    CONTACTS(CollectionsKt__CollectionsKt.mutableListOf(Permission.READ_CONTACTS, Permission.WRITE_CONTACTS)),
    CALL_LOG(CollectionsKt__CollectionsKt.mutableListOf(Permission.READ_CALL_LOG, Permission.WRITE_CALL_LOG)),
    CALL(CollectionsKt__CollectionsKt.mutableListOf(Permission.CALL_PHONE)),
    CALENDAR(CollectionsKt__CollectionsKt.mutableListOf(Permission.READ_CALENDAR, Permission.WRITE_CALENDAR));


    @NotNull
    private List<Permission> value;

    PermissionsGather(List list) {
        this.value = list;
    }

    @NotNull
    public final List<Permission> getValue() {
        return this.value;
    }

    public final void setValue(@NotNull List<Permission> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.value = list;
    }
}
