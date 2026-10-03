package com.heytap.health.watchface.business.creation.category.livephoto;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/livephoto/StyleMaterial;", "", "styleIconUrl", "", "styleName", "styleId", "styleImageUrl", "styleDesc", "styleRequire", "", "Lcom/heytap/health/watchface/business/creation/category/livephoto/StyleRequire;", "select", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getSelect", "()Z", "setSelect", "(Z)V", "getStyleDesc", "()Ljava/lang/String;", "getStyleIconUrl", "getStyleId", "getStyleImageUrl", "getStyleName", "getStyleRequire", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StyleMaterial {
    private boolean select;

    @NotNull
    private final String styleDesc;

    @NotNull
    private final String styleIconUrl;

    @NotNull
    private final String styleId;

    @NotNull
    private final String styleImageUrl;

    @NotNull
    private final String styleName;

    @NotNull
    private final List<StyleRequire> styleRequire;

    public StyleMaterial(@NotNull String styleIconUrl, @NotNull String styleName, @NotNull String styleId, @NotNull String styleImageUrl, @NotNull String styleDesc, @NotNull List<StyleRequire> styleRequire, boolean z) {
        Intrinsics.checkNotNullParameter(styleIconUrl, "styleIconUrl");
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(styleImageUrl, "styleImageUrl");
        Intrinsics.checkNotNullParameter(styleDesc, "styleDesc");
        Intrinsics.checkNotNullParameter(styleRequire, "styleRequire");
        this.styleIconUrl = styleIconUrl;
        this.styleName = styleName;
        this.styleId = styleId;
        this.styleImageUrl = styleImageUrl;
        this.styleDesc = styleDesc;
        this.styleRequire = styleRequire;
        this.select = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StyleMaterial copy$default(StyleMaterial styleMaterial, String str, String str2, String str3, String str4, String str5, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = styleMaterial.styleIconUrl;
        }
        if ((i & 2) != 0) {
            str2 = styleMaterial.styleName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = styleMaterial.styleId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = styleMaterial.styleImageUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = styleMaterial.styleDesc;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = styleMaterial.styleRequire;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            z = styleMaterial.select;
        }
        return styleMaterial.copy(str, str6, str7, str8, str9, list2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStyleIconUrl() {
        return this.styleIconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyleName() {
        return this.styleName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyleId() {
        return this.styleId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyleImageUrl() {
        return this.styleImageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStyleDesc() {
        return this.styleDesc;
    }

    @NotNull
    public final List<StyleRequire> component6() {
        return this.styleRequire;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSelect() {
        return this.select;
    }

    @NotNull
    public final StyleMaterial copy(@NotNull String styleIconUrl, @NotNull String styleName, @NotNull String styleId, @NotNull String styleImageUrl, @NotNull String styleDesc, @NotNull List<StyleRequire> styleRequire, boolean select) {
        Intrinsics.checkNotNullParameter(styleIconUrl, "styleIconUrl");
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(styleImageUrl, "styleImageUrl");
        Intrinsics.checkNotNullParameter(styleDesc, "styleDesc");
        Intrinsics.checkNotNullParameter(styleRequire, "styleRequire");
        return new StyleMaterial(styleIconUrl, styleName, styleId, styleImageUrl, styleDesc, styleRequire, select);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleMaterial)) {
            return false;
        }
        StyleMaterial styleMaterial = (StyleMaterial) other;
        return Intrinsics.areEqual(this.styleIconUrl, styleMaterial.styleIconUrl) && Intrinsics.areEqual(this.styleName, styleMaterial.styleName) && Intrinsics.areEqual(this.styleId, styleMaterial.styleId) && Intrinsics.areEqual(this.styleImageUrl, styleMaterial.styleImageUrl) && Intrinsics.areEqual(this.styleDesc, styleMaterial.styleDesc) && Intrinsics.areEqual(this.styleRequire, styleMaterial.styleRequire) && this.select == styleMaterial.select;
    }

    public final boolean getSelect() {
        return this.select;
    }

    @NotNull
    public final String getStyleDesc() {
        return this.styleDesc;
    }

    @NotNull
    public final String getStyleIconUrl() {
        return this.styleIconUrl;
    }

    @NotNull
    public final String getStyleId() {
        return this.styleId;
    }

    @NotNull
    public final String getStyleImageUrl() {
        return this.styleImageUrl;
    }

    @NotNull
    public final String getStyleName() {
        return this.styleName;
    }

    @NotNull
    public final List<StyleRequire> getStyleRequire() {
        return this.styleRequire;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((((((this.styleIconUrl.hashCode() * 31) + this.styleName.hashCode()) * 31) + this.styleId.hashCode()) * 31) + this.styleImageUrl.hashCode()) * 31) + this.styleDesc.hashCode()) * 31) + this.styleRequire.hashCode()) * 31;
        boolean z = this.select;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }

    @NotNull
    public String toString() {
        return "StyleMaterial(styleIconUrl=" + this.styleIconUrl + ", styleName=" + this.styleName + ", styleId=" + this.styleId + ", styleImageUrl=" + this.styleImageUrl + ", styleDesc=" + this.styleDesc + ", styleRequire=" + this.styleRequire + ", select=" + this.select + ")";
    }
}
