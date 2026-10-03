package com.oplus.aiunit.vision;

import androidx.core.app.FrameMetricsAggregator;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.b3d, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 C2\u00020\u0001:\u0001\tBs\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00109\u001a\u000204\u0012\b\b\u0002\u0010<\u001a\u000204¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR$\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010.\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010+\u001a\u0004\b\t\u0010,\"\u0004\b\u001e\u0010-R$\u00103\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00100\u001a\u0004\b\u0010\u00101\"\u0004\b\"\u00102R\"\u00109\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00105\u001a\u0004\b6\u00107\"\u0004\b\u0017\u00108R\"\u0010<\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00105\u001a\u0004\b:\u00107\"\u0004\b;\u00108R\u001c\u0010@\u001a\n >*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010?¨\u0006D"}, d2 = {"Lcom/oplus/aiunit/vision/b3d;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getOLivePhotoVersion", "()I", b2n.f, "(I)V", "oLivePhotoVersion", "b", "Ljava/lang/String;", "getOLivePhotoOwner", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "oLivePhotoOwner", "c", "Ljava/lang/Boolean;", "getOliveEnable", "()Ljava/lang/Boolean;", "i", "(Ljava/lang/Boolean;)V", "oliveEnable", "d", "getOliveSoundEnable", "j", "oliveSoundEnable", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/Integer;", "getOliveEditorFlag", "()Ljava/lang/Integer;", b2n.g, "(Ljava/lang/Integer;)V", "oliveEditorFlag", "", "Lcom/oplus/aiunit/vision/f7a;", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", wrf.DEFAULT_IMAGES_DIR_NAME, "Lcom/oplus/aiunit/vision/qzb;", "Lcom/oplus/aiunit/vision/qzb;", "()Lcom/oplus/aiunit/vision/qzb;", "(Lcom/oplus/aiunit/vision/qzb;)V", "microVideo", "", "J", "getCoverTimeInUs", "()J", "(J)V", "coverTimeInUs", "getPrimaryPhotoTimeInUs", MapSchema.FIELD_NAME_KEY, "primaryPhotoTimeInUs", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", "logger", "<init>", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Lcom/oplus/aiunit/vision/qzb;JJ)V", "Companion", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final /* data */ class OLivePhoto {

    @NotNull
    public static final String GAIN_MAP_SEMANTIC = "GainMap";

    @NotNull
    public static final String MICRO_VIDEO_SEMANTIC = "MotionPhoto";

    @NotNull
    public static final String ORIGINAL_SEMANTIC = "Original";

    @NotNull
    public static final String PRIMARY_SEMANTIC = "Primary";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int oLivePhotoVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String oLivePhotoOwner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean oliveEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Boolean oliveSoundEnable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer oliveEditorFlag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public List<Image> images;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public MicroVideo microVideo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long coverTimeInUs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long primaryPhotoTimeInUs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Logger logger;

    public OLivePhoto() {
        this(0, null, null, null, null, null, null, 0L, 0L, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    public final List<Image> a() {
        return this.images;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final MicroVideo getMicroVideo() {
        return this.microVideo;
    }

    public final void c(long j2) {
        this.coverTimeInUs = j2;
    }

    public final void d(@Nullable List<Image> list) {
        this.images = list;
    }

    public final void e(@Nullable MicroVideo microVideo) {
        this.microVideo = microVideo;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OLivePhoto)) {
            return false;
        }
        OLivePhoto oLivePhoto = (OLivePhoto) other;
        return this.oLivePhotoVersion == oLivePhoto.oLivePhotoVersion && Intrinsics.areEqual(this.oLivePhotoOwner, oLivePhoto.oLivePhotoOwner) && Intrinsics.areEqual(this.oliveEnable, oLivePhoto.oliveEnable) && Intrinsics.areEqual(this.oliveSoundEnable, oLivePhoto.oliveSoundEnable) && Intrinsics.areEqual(this.oliveEditorFlag, oLivePhoto.oliveEditorFlag) && Intrinsics.areEqual(this.images, oLivePhoto.images) && Intrinsics.areEqual(this.microVideo, oLivePhoto.microVideo) && this.coverTimeInUs == oLivePhoto.coverTimeInUs && this.primaryPhotoTimeInUs == oLivePhoto.primaryPhotoTimeInUs;
    }

    public final void f(@Nullable String str) {
        this.oLivePhotoOwner = str;
    }

    public final void g(int i) {
        this.oLivePhotoVersion = i;
    }

    public final void h(@Nullable Integer num) {
        this.oliveEditorFlag = num;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.oLivePhotoVersion) * 31;
        String str = this.oLivePhotoOwner;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.oliveEnable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.oliveSoundEnable;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.oliveEditorFlag;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<Image> list = this.images;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        MicroVideo microVideo = this.microVideo;
        return ((((iHashCode6 + (microVideo != null ? microVideo.hashCode() : 0)) * 31) + Long.hashCode(this.coverTimeInUs)) * 31) + Long.hashCode(this.primaryPhotoTimeInUs);
    }

    public final void i(@Nullable Boolean bool) {
        this.oliveEnable = bool;
    }

    public final void j(@Nullable Boolean bool) {
        this.oliveSoundEnable = bool;
    }

    public final void k(long j2) {
        this.primaryPhotoTimeInUs = j2;
    }

    @NotNull
    public String toString() {
        return "OLivePhoto(\n            version=" + this.oLivePhotoVersion + "\n            olivePhotoEnable=" + this.oliveEnable + "\n            oliveEditorFlag=" + this.oliveEditorFlag + "\n            owner=" + ((Object) this.oLivePhotoOwner) + ",\n            images=" + this.images + ", \n            microVideo=" + this.microVideo + ", \n            coverTimeInUs=" + this.coverTimeInUs + ",\n            primaryImageTimeInUs=" + this.primaryPhotoTimeInUs + "\n            )";
    }

    public OLivePhoto(int i, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable List<Image> list, @Nullable MicroVideo microVideo, long j2, long j3) {
        this.oLivePhotoVersion = i;
        this.oLivePhotoOwner = str;
        this.oliveEnable = bool;
        this.oliveSoundEnable = bool2;
        this.oliveEditorFlag = num;
        this.images = list;
        this.microVideo = microVideo;
        this.coverTimeInUs = j2;
        this.primaryPhotoTimeInUs = j3;
        this.logger = Logger.getLogger("OLivePhoto");
    }

    public /* synthetic */ OLivePhoto(int i, String str, Boolean bool, Boolean bool2, Integer num, List list, MicroVideo microVideo, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : list, (i2 & 64) == 0 ? microVideo : null, (i2 & 128) != 0 ? 0L : j2, (i2 & 256) != 0 ? -1L : j3);
    }
}
