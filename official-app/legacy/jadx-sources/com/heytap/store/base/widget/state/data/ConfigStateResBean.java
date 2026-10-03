package com.heytap.store.base.widget.state.data;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.c8l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/heytap/store/base/widget/state/data/ConfigStateResBean;", "", c8l.IMAGE_KEY, "", "isCanUseImgPath", "", "netErrorImgPath", "title", "btnTitle", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBtnTitle", "()Ljava/lang/String;", "getImage", "()Z", "setCanUseImgPath", "(Z)V", "getNetErrorImgPath", "setNetErrorImgPath", "(Ljava/lang/String;)V", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ConfigStateResBean {

    @Nullable
    private final String btnTitle;

    @Nullable
    private final String image;
    private boolean isCanUseImgPath;

    @Nullable
    private String netErrorImgPath;

    @Nullable
    private final String title;

    public ConfigStateResBean() {
        this(null, false, null, null, null, 31, null);
    }

    public static /* synthetic */ ConfigStateResBean copy$default(ConfigStateResBean configStateResBean, String str, boolean z, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = configStateResBean.image;
        }
        if ((i & 2) != 0) {
            z = configStateResBean.isCanUseImgPath;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = configStateResBean.netErrorImgPath;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = configStateResBean.title;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = configStateResBean.btnTitle;
        }
        return configStateResBean.copy(str, z2, str5, str6, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsCanUseImgPath() {
        return this.isCanUseImgPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNetErrorImgPath() {
        return this.netErrorImgPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBtnTitle() {
        return this.btnTitle;
    }

    @NotNull
    public final ConfigStateResBean copy(@Nullable String image, boolean isCanUseImgPath, @Nullable String netErrorImgPath, @Nullable String title, @Nullable String btnTitle) {
        return new ConfigStateResBean(image, isCanUseImgPath, netErrorImgPath, title, btnTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigStateResBean)) {
            return false;
        }
        ConfigStateResBean configStateResBean = (ConfigStateResBean) other;
        return Intrinsics.areEqual(this.image, configStateResBean.image) && this.isCanUseImgPath == configStateResBean.isCanUseImgPath && Intrinsics.areEqual(this.netErrorImgPath, configStateResBean.netErrorImgPath) && Intrinsics.areEqual(this.title, configStateResBean.title) && Intrinsics.areEqual(this.btnTitle, configStateResBean.btnTitle);
    }

    @Nullable
    public final String getBtnTitle() {
        return this.btnTitle;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getNetErrorImgPath() {
        return this.netErrorImgPath;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    public int hashCode() {
        String str = this.image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isCanUseImgPath;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        String str2 = this.netErrorImgPath;
        int iHashCode2 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.btnTitle;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isCanUseImgPath() {
        return this.isCanUseImgPath;
    }

    public final void setCanUseImgPath(boolean z) {
        this.isCanUseImgPath = z;
    }

    public final void setNetErrorImgPath(@Nullable String str) {
        this.netErrorImgPath = str;
    }

    @NotNull
    public String toString() {
        return "ConfigStateResBean(image=" + ((Object) this.image) + ", isCanUseImgPath=" + this.isCanUseImgPath + ", netErrorImgPath=" + ((Object) this.netErrorImgPath) + ", title=" + ((Object) this.title) + ", btnTitle=" + ((Object) this.btnTitle) + ')';
    }

    public ConfigStateResBean(@Nullable String str, boolean z, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.image = str;
        this.isCanUseImgPath = z;
        this.netErrorImgPath = str2;
        this.title = str3;
        this.btnTitle = str4;
    }

    public /* synthetic */ ConfigStateResBean(String str, boolean z, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
