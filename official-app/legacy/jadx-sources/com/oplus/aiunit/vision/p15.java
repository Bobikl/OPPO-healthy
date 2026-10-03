package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u001c\u0010\u001eB3\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR!\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\b\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/p15;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "dbName", "", "b", "I", "c", "()I", "dbVersion", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "()[Ljava/lang/Class;", "dbTableClasses", "", "d", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", "mainIOCheck", "Lcom/oplus/aiunit/vision/t16;", "Lcom/oplus/aiunit/vision/t16;", "()Lcom/oplus/aiunit/vision/t16;", "mDowngradeCallback", "<init>", "(Ljava/lang/String;I[Ljava/lang/Class;ZLcom/oplus/aiunit/vision/t16;)V", "(Ljava/lang/String;I[Ljava/lang/Class;)V", "(Ljava/lang/String;I[Ljava/lang/Class;Lcom/oplus/aiunit/vision/t16;)V", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public final class p15 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String dbName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int dbVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Class<?>[] dbTableClasses;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean mainIOCheck;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t16 mDowngradeCallback;

    public p15(@NotNull String dbName, int i, @NotNull Class<?>[] dbTableClasses, boolean z, @NotNull t16 mDowngradeCallback) {
        Intrinsics.checkParameterIsNotNull(dbName, "dbName");
        Intrinsics.checkParameterIsNotNull(dbTableClasses, "dbTableClasses");
        Intrinsics.checkParameterIsNotNull(mDowngradeCallback, "mDowngradeCallback");
        this.mainIOCheck = z;
        this.dbTableClasses = dbTableClasses;
        this.dbName = dbName;
        this.dbVersion = i;
        this.mDowngradeCallback = mDowngradeCallback;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDbName() {
        return this.dbName;
    }

    @NotNull
    public final Class<?>[] b() {
        return this.dbTableClasses;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDbVersion() {
        return this.dbVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final t16 getMDowngradeCallback() {
        return this.mDowngradeCallback;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getMainIOCheck() {
        return this.mainIOCheck;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p15(@NotNull String dbName, int i, @NotNull Class<?>[] dbTableClasses) {
        this(dbName, i, dbTableClasses, false, new t16());
        Intrinsics.checkParameterIsNotNull(dbName, "dbName");
        Intrinsics.checkParameterIsNotNull(dbTableClasses, "dbTableClasses");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p15(@NotNull String dbName, int i, @NotNull Class<?>[] dbTableClasses, @NotNull t16 mDowngradeCallback) {
        this(dbName, i, dbTableClasses, false, mDowngradeCallback);
        Intrinsics.checkParameterIsNotNull(dbName, "dbName");
        Intrinsics.checkParameterIsNotNull(dbTableClasses, "dbTableClasses");
        Intrinsics.checkParameterIsNotNull(mDowngradeCallback, "mDowngradeCallback");
    }
}
