package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.f7a, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/f7a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMime", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "mime", "b", "f", "semantic", "", "c", "J", "()J", MapSchema.FIELD_NAME_ENTRY, "(J)V", TypedValues.CycleType.S_WAVE_OFFSET, b2n.f, "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final /* data */ class Image {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String mime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public String semantic;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public long offset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public long size;

    public Image() {
        this(null, null, 0L, 0L, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSemantic() {
        return this.semantic;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final void d(@Nullable String str) {
        this.mime = str;
    }

    public final void e(long j2) {
        this.offset = j2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Image)) {
            return false;
        }
        Image image = (Image) other;
        return Intrinsics.areEqual(this.mime, image.mime) && Intrinsics.areEqual(this.semantic, image.semantic) && this.offset == image.offset && this.size == image.size;
    }

    public final void f(@Nullable String str) {
        this.semantic = str;
    }

    public final void g(long j2) {
        this.size = j2;
    }

    public int hashCode() {
        String str = this.mime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.semantic;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.offset)) * 31) + Long.hashCode(this.size);
    }

    @NotNull
    public String toString() {
        return "Image(\n            mime=" + ((Object) this.mime) + ", semantic=" + ((Object) this.semantic) + ", offset=" + this.offset + ", size=" + this.size + "\n            )";
    }

    public Image(@Nullable String str, @Nullable String str2, long j2, long j3) {
        this.mime = str;
        this.semantic = str2;
        this.offset = j2;
        this.size = j3;
    }

    public /* synthetic */ Image(String str, String str2, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3);
    }
}
