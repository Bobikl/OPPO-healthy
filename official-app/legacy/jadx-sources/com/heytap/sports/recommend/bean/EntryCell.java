package com.heytap.sports.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/heytap/sports/recommend/bean/EntryCell;", "Landroid/os/Parcelable;", "langCode", "", "entryStr", "(Ljava/lang/String;Ljava/lang/String;)V", "getEntryStr", "()Ljava/lang/String;", "getLangCode", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EntryCell implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<EntryCell> CREATOR = new a();

    @NotNull
    private final String entryStr;

    @NotNull
    private final String langCode;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EntryCell> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EntryCell createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EntryCell(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EntryCell[] newArray(int i) {
            return new EntryCell[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EntryCell() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EntryCell copy$default(EntryCell entryCell, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryCell.langCode;
        }
        if ((i & 2) != 0) {
            str2 = entryCell.entryStr;
        }
        return entryCell.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLangCode() {
        return this.langCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntryStr() {
        return this.entryStr;
    }

    @NotNull
    public final EntryCell copy(@NotNull String langCode, @NotNull String entryStr) {
        Intrinsics.checkNotNullParameter(langCode, "langCode");
        Intrinsics.checkNotNullParameter(entryStr, "entryStr");
        return new EntryCell(langCode, entryStr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryCell)) {
            return false;
        }
        EntryCell entryCell = (EntryCell) other;
        return Intrinsics.areEqual(this.langCode, entryCell.langCode) && Intrinsics.areEqual(this.entryStr, entryCell.entryStr);
    }

    @NotNull
    public final String getEntryStr() {
        return this.entryStr;
    }

    @NotNull
    public final String getLangCode() {
        return this.langCode;
    }

    public int hashCode() {
        return (this.langCode.hashCode() * 31) + this.entryStr.hashCode();
    }

    @NotNull
    public String toString() {
        return "EntryCell(langCode=" + this.langCode + ", entryStr=" + this.entryStr + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.langCode);
        parcel.writeString(this.entryStr);
    }

    public EntryCell(@NotNull String langCode, @NotNull String entryStr) {
        Intrinsics.checkNotNullParameter(langCode, "langCode");
        Intrinsics.checkNotNullParameter(entryStr, "entryStr");
        this.langCode = langCode;
        this.entryStr = entryStr;
    }

    public /* synthetic */ EntryCell(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
