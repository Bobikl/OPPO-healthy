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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/heytap/sports/recommend/bean/EntryData;", "Landroid/os/Parcelable;", "entryId", "", "defaultStr", "", "trans", "Lcom/heytap/sports/recommend/bean/ComEntryCell;", "(ILjava/lang/String;Lcom/heytap/sports/recommend/bean/ComEntryCell;)V", "getDefaultStr", "()Ljava/lang/String;", "getEntryId", "()I", "getTrans", "()Lcom/heytap/sports/recommend/bean/ComEntryCell;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EntryData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<EntryData> CREATOR = new a();

    @NotNull
    private final String defaultStr;
    private final int entryId;

    @Nullable
    private final ComEntryCell trans;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EntryData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EntryData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EntryData(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : ComEntryCell.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EntryData[] newArray(int i) {
            return new EntryData[i];
        }
    }

    public EntryData() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ EntryData copy$default(EntryData entryData, int i, String str, ComEntryCell comEntryCell, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = entryData.entryId;
        }
        if ((i2 & 2) != 0) {
            str = entryData.defaultStr;
        }
        if ((i2 & 4) != 0) {
            comEntryCell = entryData.trans;
        }
        return entryData.copy(i, str, comEntryCell);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEntryId() {
        return this.entryId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefaultStr() {
        return this.defaultStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ComEntryCell getTrans() {
        return this.trans;
    }

    @NotNull
    public final EntryData copy(int entryId, @NotNull String defaultStr, @Nullable ComEntryCell trans) {
        Intrinsics.checkNotNullParameter(defaultStr, "defaultStr");
        return new EntryData(entryId, defaultStr, trans);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryData)) {
            return false;
        }
        EntryData entryData = (EntryData) other;
        return this.entryId == entryData.entryId && Intrinsics.areEqual(this.defaultStr, entryData.defaultStr) && Intrinsics.areEqual(this.trans, entryData.trans);
    }

    @NotNull
    public final String getDefaultStr() {
        return this.defaultStr;
    }

    public final int getEntryId() {
        return this.entryId;
    }

    @Nullable
    public final ComEntryCell getTrans() {
        return this.trans;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.entryId) * 31) + this.defaultStr.hashCode()) * 31;
        ComEntryCell comEntryCell = this.trans;
        return iHashCode + (comEntryCell == null ? 0 : comEntryCell.hashCode());
    }

    @NotNull
    public String toString() {
        return "EntryData(entryId=" + this.entryId + ", defaultStr=" + this.defaultStr + ", trans=" + this.trans + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.entryId);
        parcel.writeString(this.defaultStr);
        ComEntryCell comEntryCell = this.trans;
        if (comEntryCell == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            comEntryCell.writeToParcel(parcel, flags);
        }
    }

    public EntryData(int i, @NotNull String defaultStr, @Nullable ComEntryCell comEntryCell) {
        Intrinsics.checkNotNullParameter(defaultStr, "defaultStr");
        this.entryId = i;
        this.defaultStr = defaultStr;
        this.trans = comEntryCell;
    }

    public /* synthetic */ EntryData(int i, String str, ComEntryCell comEntryCell, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : comEntryCell);
    }
}
