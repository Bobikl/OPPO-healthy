package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/d25;", "", "", "a", "I", "()I", "d", "(I)V", "addedVersion", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "tableName", "", "Lcom/oplus/aiunit/vision/h6a;", "[Lcom/oplus/aiunit/vision/h6a;", "()[Lcom/oplus/aiunit/vision/h6a;", MapSchema.FIELD_NAME_ENTRY, "([Lcom/oplus/aiunit/vision/h6a;)V", "indices", "<init>", "()V", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public final class d25 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int addedVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String tableName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public h6a[] indices = new h6a[0];

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAddedVersion() {
        return this.addedVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h6a[] getIndices() {
        return this.indices;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTableName() {
        return this.tableName;
    }

    public final void d(int i) {
        this.addedVersion = i;
    }

    public final void e(@NotNull h6a[] h6aVarArr) {
        Intrinsics.checkParameterIsNotNull(h6aVarArr, "<set-?>");
        this.indices = h6aVarArr;
    }

    public final void f(@Nullable String str) {
        this.tableName = str;
    }
}
