package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.xia, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0013\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/xia;", "", "", "toString", "", "a", "I", "b", "()I", "f", "(I)V", "marker", "getLength", MapSchema.FIELD_NAME_ENTRY, "length", "c", b2n.f, TypedValues.CycleType.S_WAVE_OFFSET, "", "d", "[B", "()[B", "([B)V", "data", "<init>", "()V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class Section {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int marker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int length;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int offset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public byte[] data;

    @NotNull
    public final byte[] a() {
        byte[] bArr = this.data;
        if (bArr != null) {
            return bArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("data");
        return null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMarker() {
        return this.marker;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    public final void d(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.data = bArr;
    }

    public final void e(int i) {
        this.length = i;
    }

    public final void f(int i) {
        this.marker = i;
    }

    public final void g(int i) {
        this.offset = i;
    }

    @NotNull
    public String toString() {
        return "Section(\" \n            marker=" + kzc.a(this.marker) + ", \n            length=" + this.length + ", \n            offset=" + this.offset + ",\n            )";
    }
}
