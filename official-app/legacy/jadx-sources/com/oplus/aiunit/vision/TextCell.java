package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.jsj, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u000f\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012R\u001a\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012R\u001a\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010\u0012R\u001a\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b*\u0010\u0012R\u001a\u0010.\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b-\u0010\u0012R\u001a\u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u00061"}, d2 = {"Lcom/oplus/aiunit/vision/jsj;", "Lcom/oplus/aiunit/vision/j91;", "", "toString", "", "hashCode", "", "other", "", "equals", "d", "Ljava/lang/String;", "getAlign", "()Ljava/lang/String;", "align", MapSchema.FIELD_NAME_ENTRY, "I", "getBaseLine", "()I", "baseLine", "f", "getColor", "(Ljava/lang/String;)V", "color", b2n.f, "getFont", "font", "", b2n.g, "Ljava/util/List;", "getGroup", "()Ljava/util/List;", "group", "i", "getH", "j", "getLetterspace", "letterspace", MapSchema.FIELD_NAME_KEY, "getRotation", "rotation", LogFieldKey.LEVEL_KEY, "getTextSize", ParserTag.TAG_TEXT_SIZE, LogFieldKey.MESSAGE_KEY, "getW", "w", "n", "attribute", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TextCell extends j91 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("align")
    @NotNull
    private final String align;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("baseLine")
    private final int baseLine;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("color")
    @NotNull
    private String color;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("font")
    @NotNull
    private final String font;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("group")
    @NotNull
    private final List<Object> group;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName(b2n.g)
    private final int h;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("letterspace")
    private final int letterspace;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("rotation")
    private final int rotation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(ParserTag.TAG_TEXT_SIZE)
    private final int textSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @SerializedName("w")
    private final int w;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("attribute")
    @NotNull
    private final String attribute;

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
        if (!(other instanceof TextCell)) {
            return false;
        }
        TextCell textCell = (TextCell) other;
        return Intrinsics.areEqual(this.align, textCell.align) && this.baseLine == textCell.baseLine && Intrinsics.areEqual(this.color, textCell.color) && Intrinsics.areEqual(this.font, textCell.font) && Intrinsics.areEqual(this.group, textCell.group) && this.h == textCell.h && this.letterspace == textCell.letterspace && this.rotation == textCell.rotation && this.textSize == textCell.textSize && this.w == textCell.w && Intrinsics.areEqual(this.attribute, textCell.attribute);
    }

    public int hashCode() {
        return (((((((((((((((((((this.align.hashCode() * 31) + Integer.hashCode(this.baseLine)) * 31) + this.color.hashCode()) * 31) + this.font.hashCode()) * 31) + this.group.hashCode()) * 31) + Integer.hashCode(this.h)) * 31) + Integer.hashCode(this.letterspace)) * 31) + Integer.hashCode(this.rotation)) * 31) + Integer.hashCode(this.textSize)) * 31) + Integer.hashCode(this.w)) * 31) + this.attribute.hashCode();
    }

    @NotNull
    public String toString() {
        return "TextCell(align=" + this.align + ", baseLine=" + this.baseLine + ", color=" + this.color + ", font=" + this.font + ", group=" + this.group + ", h=" + this.h + ", letterspace=" + this.letterspace + ", rotation=" + this.rotation + ", textSize=" + this.textSize + ", w=" + this.w + ", attribute=" + this.attribute + ")";
    }
}
