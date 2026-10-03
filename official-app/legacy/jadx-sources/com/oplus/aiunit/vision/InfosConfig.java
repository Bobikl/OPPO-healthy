package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.o7a, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 :2\u00020\u0001:\u0001\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\"\u00102\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0010\u001a\u0004\b1\u0010\u0012\"\u0004\b'\u0010\u0014R\"\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0019\u001a\u0004\b\u0016\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u00109\u001a\u0002048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b\u000f\u00107\"\u0004\b#\u00108¨\u0006;"}, d2 = {"Lcom/oplus/aiunit/vision/o7a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/oplus/aiunit/vision/m7a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "mStyles", "b", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "packageName", "c", "getPreview", "preview", "I", "getVersionCode", "()I", b2n.g, "(I)V", "versionCode", MapSchema.FIELD_NAME_ENTRY, "getVersionName", "i", "versionName", "f", "getName", "name", "Lcom/oplus/aiunit/vision/hta;", b2n.f, "Lcom/oplus/aiunit/vision/hta;", "getWatchfaceName", "()Lcom/oplus/aiunit/vision/hta;", "j", "(Lcom/oplus/aiunit/vision/hta;)V", "watchfaceName", "getWfType", "setWfType", "wfType", "getPowerConsumeRank", "powerConsumeRank", "isPatch", "Lcom/oplus/aiunit/vision/g9e;", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/g9e;", "()Lcom/oplus/aiunit/vision/g9e;", "(Lcom/oplus/aiunit/vision/g9e;)V", "patch", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class InfosConfig {
    public static final int CREATE_WF_TYPE = 3;
    public static final int PATCH_DISABLE = 0;
    public static final int PATCH_ENABLE = 1;

    @NotNull
    public static final String POWER_DEGREE_HIGH = "9";

    @NotNull
    public static final String POWER_DEGREE_LOW = "1";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("mStyles")
    @NotNull
    private final List<InfoStyles> mStyles;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("packageName")
    @NotNull
    private String packageName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("preview")
    @NotNull
    private final String preview;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("versionCode")
    private int versionCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("versionName")
    @NotNull
    private String versionName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("watchfaceName")
    @NotNull
    private LangDesc watchfaceName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("wfType")
    private int wfType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("powerConsumeRank")
    @NotNull
    private String powerConsumeRank;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("isPatch")
    private int isPatch;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("patch")
    @NotNull
    private Patch patch;

    @NotNull
    public final List<InfoStyles> a() {
        return this.mStyles;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Patch getPatch() {
        return this.patch;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIsPatch() {
        return this.isPatch;
    }

    public final void d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void e(int i) {
        this.isPatch = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfosConfig)) {
            return false;
        }
        InfosConfig infosConfig = (InfosConfig) other;
        return Intrinsics.areEqual(this.mStyles, infosConfig.mStyles) && Intrinsics.areEqual(this.packageName, infosConfig.packageName) && Intrinsics.areEqual(this.preview, infosConfig.preview) && this.versionCode == infosConfig.versionCode && Intrinsics.areEqual(this.versionName, infosConfig.versionName) && Intrinsics.areEqual(this.name, infosConfig.name) && Intrinsics.areEqual(this.watchfaceName, infosConfig.watchfaceName) && this.wfType == infosConfig.wfType && Intrinsics.areEqual(this.powerConsumeRank, infosConfig.powerConsumeRank) && this.isPatch == infosConfig.isPatch && Intrinsics.areEqual(this.patch, infosConfig.patch);
    }

    public final void f(@NotNull Patch patch) {
        Intrinsics.checkNotNullParameter(patch, "<set-?>");
        this.patch = patch;
    }

    public final void g(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.powerConsumeRank = str;
    }

    public final void h(int i) {
        this.versionCode = i;
    }

    public int hashCode() {
        return (((((((((((((((((((this.mStyles.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.preview.hashCode()) * 31) + Integer.hashCode(this.versionCode)) * 31) + this.versionName.hashCode()) * 31) + this.name.hashCode()) * 31) + this.watchfaceName.hashCode()) * 31) + Integer.hashCode(this.wfType)) * 31) + this.powerConsumeRank.hashCode()) * 31) + Integer.hashCode(this.isPatch)) * 31) + this.patch.hashCode();
    }

    public final void i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.versionName = str;
    }

    public final void j(@NotNull LangDesc langDesc) {
        Intrinsics.checkNotNullParameter(langDesc, "<set-?>");
        this.watchfaceName = langDesc;
    }

    @NotNull
    public String toString() {
        return "InfosConfig(mStyles=" + this.mStyles + ", packageName=" + this.packageName + ", preview=" + this.preview + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", name=" + this.name + ", watchfaceName=" + this.watchfaceName + ", wfType=" + this.wfType + ", powerConsumeRank=" + this.powerConsumeRank + ", isPatch=" + this.isPatch + ", patch=" + this.patch + ")";
    }
}
