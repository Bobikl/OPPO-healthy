package com.oplus.aiunit.vision;

import com.afollestad.assent.AssentResult;
import com.afollestad.assent.Permission;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.zde, reason: from toString */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001BJ\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012+\u0010 \u001a'\u0012#\u0012!\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0017j\u0002`\u001d0\u0016¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010 \u001a'\u0012#\u0012!\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0017j\u0002`\u001d0\u00168\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u000b\u0010\u001f¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/zde;", "", "", "hashCode", "other", "", "equals", "", "toString", "", "Lcom/afollestad/assent/Permission;", "a", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "permissions", "I", "c", "()I", "d", "(I)V", vc.KEY_REQUEST_CODE, "", "Lkotlin/Function1;", "Lcom/afollestad/assent/AssentResult;", "Lkotlin/ParameterName;", "name", "result", "", "Lcom/afollestad/assent/Callback;", "Ljava/util/List;", "()Ljava/util/List;", "callbacks", "<init>", "(Ljava/util/Set;ILjava/util/List;)V", "core"}, k = 1, mv = {1, 4, 0})
public final /* data */ class PendingRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Set<Permission> permissions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int requestCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<Function1<AssentResult, Unit>> callbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public PendingRequest(@NotNull Set<? extends Permission> permissions, int i, @NotNull List<Function1<AssentResult, Unit>> callbacks) {
        Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        Intrinsics.checkParameterIsNotNull(callbacks, "callbacks");
        this.permissions = permissions;
        this.requestCode = i;
        this.callbacks = callbacks;
    }

    @NotNull
    public final List<Function1<AssentResult, Unit>> a() {
        return this.callbacks;
    }

    @NotNull
    public final Set<Permission> b() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRequestCode() {
        return this.requestCode;
    }

    public final void d(int i) {
        this.requestCode = i;
    }

    public boolean equals(@Nullable Object other) {
        return other != null && (other instanceof PendingRequest) && jk3.b(this.permissions, ((PendingRequest) other).permissions);
    }

    public int hashCode() {
        return this.permissions.hashCode();
    }

    @NotNull
    public String toString() {
        return "PendingRequest(permissions=" + this.permissions + ", requestCode=" + this.requestCode + ", callbacks=" + this.callbacks + ")";
    }
}
