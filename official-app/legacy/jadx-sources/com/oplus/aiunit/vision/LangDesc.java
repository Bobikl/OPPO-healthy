package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.hta, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/hta;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "en", "cn", "c", "hk", "d", "tw", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LangDesc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("en")
    @NotNull
    private final String en;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("zh_CN")
    @NotNull
    private final String cn;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("zh_HK")
    @NotNull
    private final String hk;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("zh_TW")
    @NotNull
    private final String tw;

    public LangDesc(@NotNull String en, @NotNull String cn, @NotNull String hk, @NotNull String tw) {
        Intrinsics.checkNotNullParameter(en, "en");
        Intrinsics.checkNotNullParameter(cn, "cn");
        Intrinsics.checkNotNullParameter(hk, "hk");
        Intrinsics.checkNotNullParameter(tw, "tw");
        this.en = en;
        this.cn = cn;
        this.hk = hk;
        this.tw = tw;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCn() {
        return this.cn;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEn() {
        return this.en;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHk() {
        return this.hk;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTw() {
        return this.tw;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LangDesc)) {
            return false;
        }
        LangDesc langDesc = (LangDesc) other;
        return Intrinsics.areEqual(this.en, langDesc.en) && Intrinsics.areEqual(this.cn, langDesc.cn) && Intrinsics.areEqual(this.hk, langDesc.hk) && Intrinsics.areEqual(this.tw, langDesc.tw);
    }

    public int hashCode() {
        return (((((this.en.hashCode() * 31) + this.cn.hashCode()) * 31) + this.hk.hashCode()) * 31) + this.tw.hashCode();
    }

    @NotNull
    public String toString() {
        return "LangDesc(en=" + this.en + ", cn=" + this.cn + ", hk=" + this.hk + ", tw=" + this.tw + ")";
    }
}
