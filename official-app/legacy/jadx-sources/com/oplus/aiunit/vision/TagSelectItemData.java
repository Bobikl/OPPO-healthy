package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.fnj, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/fnj;", "", "", y15.PARAMS_DATA_TYPE, "", "tagFieldEng", "name", "", "isFocus", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/oplus/aiunit/vision/fnj;", "toString", "hashCode", "other", "equals", "I", "c", "()I", "b", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "d", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TagSelectItemData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int dataType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String tagFieldEng;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Boolean isFocus;

    public TagSelectItemData(int i, @NotNull String tagFieldEng, @NotNull String name, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(tagFieldEng, "tagFieldEng");
        Intrinsics.checkNotNullParameter(name, "name");
        this.dataType = i;
        this.tagFieldEng = tagFieldEng;
        this.name = name;
        this.isFocus = bool;
    }

    public static /* synthetic */ TagSelectItemData b(TagSelectItemData tagSelectItemData, int i, String str, String str2, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tagSelectItemData.dataType;
        }
        if ((i2 & 2) != 0) {
            str = tagSelectItemData.tagFieldEng;
        }
        if ((i2 & 4) != 0) {
            str2 = tagSelectItemData.name;
        }
        if ((i2 & 8) != 0) {
            bool = tagSelectItemData.isFocus;
        }
        return tagSelectItemData.a(i, str, str2, bool);
    }

    @NotNull
    public final TagSelectItemData a(int dataType, @NotNull String tagFieldEng, @NotNull String name, @Nullable Boolean isFocus) {
        Intrinsics.checkNotNullParameter(tagFieldEng, "tagFieldEng");
        Intrinsics.checkNotNullParameter(name, "name");
        return new TagSelectItemData(dataType, tagFieldEng, name, isFocus);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTagFieldEng() {
        return this.tagFieldEng;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagSelectItemData)) {
            return false;
        }
        TagSelectItemData tagSelectItemData = (TagSelectItemData) other;
        return this.dataType == tagSelectItemData.dataType && Intrinsics.areEqual(this.tagFieldEng, tagSelectItemData.tagFieldEng) && Intrinsics.areEqual(this.name, tagSelectItemData.name) && Intrinsics.areEqual(this.isFocus, tagSelectItemData.isFocus);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getIsFocus() {
        return this.isFocus;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.dataType) * 31) + this.tagFieldEng.hashCode()) * 31) + this.name.hashCode()) * 31;
        Boolean bool = this.isFocus;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "TagSelectItemData(dataType=" + this.dataType + ", tagFieldEng=" + this.tagFieldEng + ", name=" + this.name + ", isFocus=" + this.isFocus + ")";
    }
}
