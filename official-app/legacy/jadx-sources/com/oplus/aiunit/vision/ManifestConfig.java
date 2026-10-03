package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.efb, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R.\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\fR.\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0017\"\u0004\b\u001a\u0010.¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/efb;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "aodStyle", "b", "getPreview", "preview", "d", Const.Arguments.Open.STYLE, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Lcom/oplus/aiunit/vision/hta;", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/hta;", "getWatchfaceName", "()Lcom/oplus/aiunit/vision/hta;", "f", "(Lcom/oplus/aiunit/vision/hta;)V", "watchfaceName", "Z", "getHasVideo", "()Z", "setHasVideo", "(Z)V", "hasVideo", b2n.f, "I", "getWfType", "()I", "wfType", b2n.g, "getUuid", "(Ljava/lang/String;)V", "uuid", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ManifestConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("aodStyle")
    @NotNull
    private List<? extends List<? extends Object>> aodStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("preview")
    @NotNull
    private final List<Object> preview;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(Const.Arguments.Open.STYLE)
    @NotNull
    private List<? extends List<? extends Object>> style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("watchfaceName")
    @NotNull
    private LangDesc watchfaceName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("hasVideo")
    private boolean hasVideo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("wfType")
    private final int wfType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("UUID")
    @NotNull
    private String uuid;

    @NotNull
    public final List<List<Object>> a() {
        return this.aodStyle;
    }

    @NotNull
    public final List<List<Object>> b() {
        return this.style;
    }

    public final void c(@NotNull List<? extends List<? extends Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.aodStyle = list;
    }

    public final void d(@NotNull List<? extends List<? extends Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.style = list;
    }

    public final void e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManifestConfig)) {
            return false;
        }
        ManifestConfig manifestConfig = (ManifestConfig) other;
        return Intrinsics.areEqual(this.aodStyle, manifestConfig.aodStyle) && Intrinsics.areEqual(this.preview, manifestConfig.preview) && Intrinsics.areEqual(this.style, manifestConfig.style) && Intrinsics.areEqual(this.name, manifestConfig.name) && Intrinsics.areEqual(this.watchfaceName, manifestConfig.watchfaceName) && this.hasVideo == manifestConfig.hasVideo && this.wfType == manifestConfig.wfType && Intrinsics.areEqual(this.uuid, manifestConfig.uuid);
    }

    public final void f(@NotNull LangDesc langDesc) {
        Intrinsics.checkNotNullParameter(langDesc, "<set-?>");
        this.watchfaceName = langDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((this.aodStyle.hashCode() * 31) + this.preview.hashCode()) * 31) + this.style.hashCode()) * 31) + this.name.hashCode()) * 31) + this.watchfaceName.hashCode()) * 31;
        boolean z = this.hasVideo;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + Integer.hashCode(this.wfType)) * 31) + this.uuid.hashCode();
    }

    @NotNull
    public String toString() {
        return "ManifestConfig(aodStyle=" + this.aodStyle + ", preview=" + this.preview + ", style=" + this.style + ", name=" + this.name + ", watchfaceName=" + this.watchfaceName + ", hasVideo=" + this.hasVideo + ", wfType=" + this.wfType + ", uuid=" + this.uuid + ")";
    }
}
