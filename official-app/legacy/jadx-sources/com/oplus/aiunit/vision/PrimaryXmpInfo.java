package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.kue, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 S2\u00020\u0001:\u0002\t\u0010B\u0007¢\u0006\u0004\bQ\u0010RJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010)\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b \u0010#\"\u0004\b(\u0010%R\"\u0010,\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010!\u001a\u0004\b'\u0010#\"\u0004\b+\u0010%R\"\u0010/\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010!\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R$\u00102\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b1\u0010\u0019R*\u0010:\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b\t\u00107\"\u0004\b8\u00109R$\u0010=\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b;\u0010\u0017\"\u0004\b<\u0010\u0019R$\u0010B\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010>\u001a\u0004\b\u0014\u0010?\"\u0004\b@\u0010AR$\u0010D\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010>\u001a\u0004\b5\u0010?\"\u0004\bC\u0010AR$\u0010I\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010E\u001a\u0004\b\u0010\u0010F\"\u0004\bG\u0010HR$\u0010N\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010J\u001a\u0004\b0\u0010K\"\u0004\bL\u0010MR$\u0010P\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010J\u001a\u0004\b*\u0010K\"\u0004\bO\u0010M¨\u0006T"}, d2 = {"Lcom/oplus/aiunit/vision/kue;", "", "", LogFieldKey.MESSAGE_KEY, "n", "o", "", "toString", "", "a", "I", "getLivePhotoSpecVersion", "()I", "r", "(I)V", "livePhotoSpecVersion", "b", "getMotionPhoto", "u", "motionPhoto", "c", "Ljava/lang/String;", "getMotionPhotoVersion", "()Ljava/lang/String;", "y", "(Ljava/lang/String;)V", "motionPhotoVersion", "d", MapSchema.FIELD_NAME_KEY, "C", "oLivePhotoVersion", "", MapSchema.FIELD_NAME_ENTRY, "J", LogFieldKey.LEVEL_KEY, "()J", "D", "(J)V", "oLiveVideoLength", "f", "w", "motionPhotoPresentationTimestampUs", b2n.f, "x", "motionPhotoPrimaryPresentationTimestampUs", b2n.g, "setMotionPhotoVideoOffset", "motionPhotoVideoOffset", "i", "v", "motionPhotoOwner", "", "Lcom/oplus/aiunit/vision/kue$b;", "j", "Ljava/util/List;", "()Ljava/util/List;", LogFieldKey.PROCESS_NAME_KEY, "(Ljava/util/List;)V", "containerItems", "getHdrgmVersion", "q", "hdrgmVersion", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "t", "(Ljava/lang/Boolean;)V", "motionEnable", c8l.KEY_B, "motionSoundEnable", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "s", "(Ljava/lang/Integer;)V", "motionEditorFlag", "Ljava/lang/Long;", "()Ljava/lang/Long;", "A", "(Ljava/lang/Long;)V", "motionPhotoVideoStart", "z", "motionPhotoVideoEnd", "<init>", "()V", "Companion", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class PrimaryXmpInfo {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int motionPhoto;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long oLiveVideoLength;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long motionPhotoVideoOffset;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String motionPhotoOwner;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<b> containerItems;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public String hdrgmVersion;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean motionEnable;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Boolean motionSoundEnable;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer motionEditorFlag;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public Long motionPhotoVideoStart;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Long motionPhotoVideoEnd;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int livePhotoSpecVersion = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String motionPhotoVersion = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int oLivePhotoVersion = 1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long motionPhotoPresentationTimestampUs = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long motionPhotoPrimaryPresentationTimestampUs = -1;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.kue$b */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/kue$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;)V", "mimeType", "c", b2n.f, "semantic", "I", "()I", "d", "(I)V", "length", "getPadding", "f", "padding", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String mimeType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String semantic;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int length;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int padding;

        public b() {
            this(null, null, 0, 0, 15, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSemantic() {
            return this.semantic;
        }

        public final void d(int i) {
            this.length = i;
        }

        public final void e(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.mimeType = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.areEqual(this.mimeType, bVar.mimeType) && Intrinsics.areEqual(this.semantic, bVar.semantic) && this.length == bVar.length && this.padding == bVar.padding;
        }

        public final void f(int i) {
            this.padding = i;
        }

        public final void g(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.semantic = str;
        }

        public int hashCode() {
            return (((((this.mimeType.hashCode() * 31) + this.semantic.hashCode()) * 31) + Integer.hashCode(this.length)) * 31) + Integer.hashCode(this.padding);
        }

        @NotNull
        public String toString() {
            return "\n                ContainerItem(\n                    mimeType='" + this.mimeType + "', \n                    semantic='" + this.semantic + "', \n                    length=" + this.length + ", \n                    padding=" + this.padding + "\n                )";
        }

        public b(@NotNull String mimeType, @NotNull String semantic, int i, int i2) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Intrinsics.checkNotNullParameter(semantic, "semantic");
            this.mimeType = mimeType;
            this.semantic = semantic;
            this.length = i;
            this.padding = i2;
        }

        public /* synthetic */ b(String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? -1 : i2);
        }
    }

    public final void A(@Nullable Long l2) {
        this.motionPhotoVideoStart = l2;
    }

    public final void B(@Nullable Boolean bool) {
        this.motionSoundEnable = bool;
    }

    public final void C(int i) {
        this.oLivePhotoVersion = i;
    }

    public final void D(long j2) {
        this.oLiveVideoLength = j2;
    }

    @Nullable
    public final List<b> a() {
        return this.containerItems;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getMotionEditorFlag() {
        return this.motionEditorFlag;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getMotionEnable() {
        return this.motionEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMotionPhotoOwner() {
        return this.motionPhotoOwner;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getMotionPhotoPresentationTimestampUs() {
        return this.motionPhotoPresentationTimestampUs;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getMotionPhotoPrimaryPresentationTimestampUs() {
        return this.motionPhotoPrimaryPresentationTimestampUs;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getMotionPhotoVideoEnd() {
        return this.motionPhotoVideoEnd;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getMotionPhotoVideoOffset() {
        return this.motionPhotoVideoOffset;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getMotionPhotoVideoStart() {
        return this.motionPhotoVideoStart;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getMotionSoundEnable() {
        return this.motionSoundEnable;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getOLivePhotoVersion() {
        return this.oLivePhotoVersion;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getOLiveVideoLength() {
        return this.oLiveVideoLength;
    }

    public final boolean m() {
        return this.motionPhoto == 1;
    }

    public final boolean n() {
        return this.livePhotoSpecVersion == 1;
    }

    public final boolean o() {
        return this.livePhotoSpecVersion == 2;
    }

    public final void p(@Nullable List<b> list) {
        this.containerItems = list;
    }

    public final void q(@Nullable String str) {
        this.hdrgmVersion = str;
    }

    public final void r(int i) {
        this.livePhotoSpecVersion = i;
    }

    public final void s(@Nullable Integer num) {
        this.motionEditorFlag = num;
    }

    public final void t(@Nullable Boolean bool) {
        this.motionEnable = bool;
    }

    @NotNull
    public String toString() {
        return "PrimaryXmpInfo(\n            livePhotoSpecVersion=" + this.livePhotoSpecVersion + ",\n            motionPhoto=" + this.motionPhoto + ", \n            motionPhotoVersion=" + this.motionPhotoVersion + ", \n            oLivePhotoVersion=" + this.oLivePhotoVersion + ",\n            motionPhotoPresentationTimestampUs=" + this.motionPhotoPresentationTimestampUs + ", \n            motionPhotoPrimaryPresentationTimestampUs=" + this.motionPhotoPrimaryPresentationTimestampUs + ", \n            motionPhotoVideoOffset=" + this.motionPhotoVideoOffset + "\n            motionPhotoEnable=" + this.motionEnable + "\n            motionPhotoSoundEnable=" + this.motionSoundEnable + "\n            motionPhotoEditorFlag=" + this.motionEditorFlag + "\n            motionPhotoVideoStart=" + this.motionPhotoVideoStart + "\n            motionPhotoVideoEnd=" + this.motionPhotoVideoEnd + "\n            owner=" + ((Object) this.motionPhotoOwner) + "\n            containerItems=" + this.containerItems + "\n            )";
    }

    public final void u(int i) {
        this.motionPhoto = i;
    }

    public final void v(@Nullable String str) {
        this.motionPhotoOwner = str;
    }

    public final void w(long j2) {
        this.motionPhotoPresentationTimestampUs = j2;
    }

    public final void x(long j2) {
        this.motionPhotoPrimaryPresentationTimestampUs = j2;
    }

    public final void y(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.motionPhotoVersion = str;
    }

    public final void z(@Nullable Long l2) {
        this.motionPhotoVideoEnd = l2;
    }
}
