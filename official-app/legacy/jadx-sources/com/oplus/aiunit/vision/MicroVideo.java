package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.protostuff.MapSchema;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.qzb, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R$\u0010$\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010'\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/qzb;", "", "Ljava/io/InputStream;", "livePhotoInputStream", "c", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMime", "()Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;)V", "mime", "", "b", "J", "()J", "f", "(J)V", TypedValues.CycleType.S_WAVE_OFFSET, "d", "length", "getRealLength", b2n.f, "realLength", "Ljava/lang/Long;", "getVideoStartUs", "()Ljava/lang/Long;", "i", "(Ljava/lang/Long;)V", "videoStartUs", "getVideoEndUs", b2n.g, "videoEndUs", "<init>", "(Ljava/lang/String;JJJLjava/lang/Long;Ljava/lang/Long;)V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final /* data */ class MicroVideo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String mime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long offset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public long length;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public long realLength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Long videoStartUs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public Long videoEndUs;

    public MicroVideo() {
        this(null, 0L, 0L, 0L, null, null, 63, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    @NotNull
    public final InputStream c(@NotNull InputStream livePhotoInputStream) {
        Intrinsics.checkNotNullParameter(livePhotoInputStream, "livePhotoInputStream");
        return new ByteArrayInputStream(ud7.a(livePhotoInputStream, this.offset, (int) this.length));
    }

    public final void d(long j2) {
        this.length = j2;
    }

    public final void e(@Nullable String str) {
        this.mime = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MicroVideo)) {
            return false;
        }
        MicroVideo microVideo = (MicroVideo) other;
        return Intrinsics.areEqual(this.mime, microVideo.mime) && this.offset == microVideo.offset && this.length == microVideo.length && this.realLength == microVideo.realLength && Intrinsics.areEqual(this.videoStartUs, microVideo.videoStartUs) && Intrinsics.areEqual(this.videoEndUs, microVideo.videoEndUs);
    }

    public final void f(long j2) {
        this.offset = j2;
    }

    public final void g(long j2) {
        this.realLength = j2;
    }

    public final void h(@Nullable Long l2) {
        this.videoEndUs = l2;
    }

    public int hashCode() {
        String str = this.mime;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.offset)) * 31) + Long.hashCode(this.length)) * 31) + Long.hashCode(this.realLength)) * 31;
        Long l2 = this.videoStartUs;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.videoEndUs;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public final void i(@Nullable Long l2) {
        this.videoStartUs = l2;
    }

    @NotNull
    public String toString() {
        return "MicroVideo(\n            mime=" + ((Object) this.mime) + ", offset=" + this.offset + ", length=" + this.length + ", realLength=" + this.realLength + ", videoStartUs=" + this.videoStartUs + ", videoEndUs=" + this.videoEndUs + "\n            )";
    }

    public MicroVideo(@Nullable String str, long j2, long j3, long j4, @Nullable Long l2, @Nullable Long l3) {
        this.mime = str;
        this.offset = j2;
        this.length = j3;
        this.realLength = j4;
        this.videoStartUs = l2;
        this.videoEndUs = l3;
    }

    public /* synthetic */ MicroVideo(String str, long j2, long j3, long j4, Long l2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3);
    }
}
