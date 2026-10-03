package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/g4j;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "model", "I", "()I", "level", "c", "tips", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class g4j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String model;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int level;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tips;

    public g4j(@NotNull String model, int i, @NotNull String tips) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.model = model;
        this.level = i;
        this.tips = tips;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g4j)) {
            return false;
        }
        g4j g4jVar = (g4j) other;
        return Intrinsics.areEqual(this.model, g4jVar.model) && this.level == g4jVar.level && Intrinsics.areEqual(this.tips, g4jVar.tips);
    }

    public int hashCode() {
        return (((this.model.hashCode() * 31) + Integer.hashCode(this.level)) * 31) + this.tips.hashCode();
    }

    @NotNull
    public String toString() {
        return "(" + this.model + "-" + this.level + ")";
    }
}
