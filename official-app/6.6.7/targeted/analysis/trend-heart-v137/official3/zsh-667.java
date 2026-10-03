package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R(\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/zsh;", "Lcom/oplus/aiunit/vision/u11;", "", "a", "b", "Lcom/oplus/aiunit/vision/l9h;", "Lcom/oplus/aiunit/vision/l9h;", "o", "()Lcom/oplus/aiunit/vision/l9h;", "singleDimenData", "Lcom/oplus/aiunit/vision/gof;", "Lcom/oplus/aiunit/vision/gof;", "f", "()Lcom/oplus/aiunit/vision/gof;", "setFinalDateRange", "(Lcom/oplus/aiunit/vision/gof;)V", "finalDateRange", "", "value", c7n.f, "()Ljava/lang/String;", "setDeviceContent", "(Ljava/lang/String;)V", "deviceContent", MapSchema.FIELD_NAME_ENTRY, "setDeviceTitle", "deviceTitle", "Lcom/oplus/aiunit/vision/r9b;", c7n.g, "()Lcom/oplus/aiunit/vision/r9b;", "setFinalVisibleType", "(Lcom/oplus/aiunit/vision/r9b;)V", "finalVisibleType", "<init>", "(Lcom/oplus/aiunit/vision/l9h;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class zsh implements u11 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final l9h singleDimenData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public RelativeDateRange finalDateRange;

    public zsh(@NotNull l9h singleDimenData) {
        Intrinsics.checkNotNullParameter(singleDimenData, "singleDimenData");
        this.singleDimenData = singleDimenData;
    }

    @Override // com.oplus.aiunit.vision.u11
    public boolean a() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.u11
    public boolean b() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.u11
    @NotNull
    public String e() {
        return this.singleDimenData.getDeviceTitle();
    }

    @Override // com.oplus.aiunit.vision.u11
    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public RelativeDateRange getFinalDateRange() {
        return this.finalDateRange;
    }

    @Override // com.oplus.aiunit.vision.u11
    @NotNull
    public String g() {
        return this.singleDimenData.getDeviceContent();
    }

    @Override // com.oplus.aiunit.vision.u11
    @Nullable
    /* JADX INFO: renamed from: h */
    public r9b getFinalVisibleType() {
        return this.singleDimenData.getDataType();
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final l9h getSingleDimenData() {
        return this.singleDimenData;
    }
}