package com.heytap.health.watchface.business.creation.category.livephoto;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/livephoto/SupportStyles;", "", "styleMaterials", "", "Lcom/heytap/health/watchface/business/creation/category/livephoto/StyleMaterial;", "(Ljava/util/List;)V", "getStyleMaterials", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SupportStyles {

    @NotNull
    private final List<StyleMaterial> styleMaterials;

    public SupportStyles(@NotNull List<StyleMaterial> styleMaterials) {
        Intrinsics.checkNotNullParameter(styleMaterials, "styleMaterials");
        this.styleMaterials = styleMaterials;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportStyles copy$default(SupportStyles supportStyles, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = supportStyles.styleMaterials;
        }
        return supportStyles.copy(list);
    }

    @NotNull
    public final List<StyleMaterial> component1() {
        return this.styleMaterials;
    }

    @NotNull
    public final SupportStyles copy(@NotNull List<StyleMaterial> styleMaterials) {
        Intrinsics.checkNotNullParameter(styleMaterials, "styleMaterials");
        return new SupportStyles(styleMaterials);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SupportStyles) && Intrinsics.areEqual(this.styleMaterials, ((SupportStyles) other).styleMaterials);
    }

    @NotNull
    public final List<StyleMaterial> getStyleMaterials() {
        return this.styleMaterials;
    }

    public int hashCode() {
        return this.styleMaterials.hashCode();
    }

    @NotNull
    public String toString() {
        return "SupportStyles(styleMaterials=" + this.styleMaterials + ")";
    }
}
