package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.r3a, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/r3a;", "Lcom/oplus/aiunit/vision/q6h;", "", "toString", "", "hashCode", "", "other", "", "equals", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", "d", "()Ljava/lang/String;", "attribute", "f", "getColor", "(Ljava/lang/String;)V", "color", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ImageCell extends q6h {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("attribute")
    @NotNull
    private final String attribute;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("color")
    @NotNull
    private String color;

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAttribute() {
        return this.attribute;
    }

    public final void e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageCell)) {
            return false;
        }
        ImageCell imageCell = (ImageCell) other;
        return Intrinsics.areEqual(this.attribute, imageCell.attribute) && Intrinsics.areEqual(this.color, imageCell.color);
    }

    public int hashCode() {
        return (this.attribute.hashCode() * 31) + this.color.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImageCell(attribute=" + this.attribute + ", color=" + this.color + ")";
    }
}
