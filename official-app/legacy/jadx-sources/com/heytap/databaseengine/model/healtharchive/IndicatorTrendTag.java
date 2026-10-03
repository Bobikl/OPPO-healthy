package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/IndicatorTrendTag;", "Landroid/os/Parcelable;", "tagName", "", "tagCode", "tagSort", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTagCode", "()Ljava/lang/String;", "setTagCode", "(Ljava/lang/String;)V", "getTagName", "setTagName", "getTagSort", "()I", "setTagSort", "(I)V", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IndicatorTrendTag implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndicatorTrendTag> CREATOR = new a();

    @Nullable
    private String tagCode;

    @Nullable
    private String tagName;
    private int tagSort;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IndicatorTrendTag> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IndicatorTrendTag createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndicatorTrendTag(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IndicatorTrendTag[] newArray(int i) {
            return new IndicatorTrendTag[i];
        }
    }

    public IndicatorTrendTag() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ IndicatorTrendTag copy$default(IndicatorTrendTag indicatorTrendTag, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = indicatorTrendTag.tagName;
        }
        if ((i2 & 2) != 0) {
            str2 = indicatorTrendTag.tagCode;
        }
        if ((i2 & 4) != 0) {
            i = indicatorTrendTag.tagSort;
        }
        return indicatorTrendTag.copy(str, str2, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTagName() {
        return this.tagName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTagCode() {
        return this.tagCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTagSort() {
        return this.tagSort;
    }

    @NotNull
    public final IndicatorTrendTag copy(@Nullable String tagName, @Nullable String tagCode, int tagSort) {
        return new IndicatorTrendTag(tagName, tagCode, tagSort);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorTrendTag)) {
            return false;
        }
        IndicatorTrendTag indicatorTrendTag = (IndicatorTrendTag) other;
        return Intrinsics.areEqual(this.tagName, indicatorTrendTag.tagName) && Intrinsics.areEqual(this.tagCode, indicatorTrendTag.tagCode) && this.tagSort == indicatorTrendTag.tagSort;
    }

    @Nullable
    public final String getTagCode() {
        return this.tagCode;
    }

    @Nullable
    public final String getTagName() {
        return this.tagName;
    }

    public final int getTagSort() {
        return this.tagSort;
    }

    public int hashCode() {
        String str = this.tagName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tagCode;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.tagSort);
    }

    public final void setTagCode(@Nullable String str) {
        this.tagCode = str;
    }

    public final void setTagName(@Nullable String str) {
        this.tagName = str;
    }

    public final void setTagSort(int i) {
        this.tagSort = i;
    }

    @NotNull
    public String toString() {
        return "IndicatorTrendTag(tagName=" + this.tagName + ", tagCode=" + this.tagCode + ", tagSort=" + this.tagSort + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.tagName);
        parcel.writeString(this.tagCode);
        parcel.writeInt(this.tagSort);
    }

    public IndicatorTrendTag(@Nullable String str, @Nullable String str2, int i) {
        this.tagName = str;
        this.tagCode = str2;
        this.tagSort = i;
    }

    public /* synthetic */ IndicatorTrendTag(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
