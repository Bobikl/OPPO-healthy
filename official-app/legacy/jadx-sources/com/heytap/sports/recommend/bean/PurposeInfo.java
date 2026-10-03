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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/heytap/sports/recommend/bean/PurposeInfo;", "Landroid/os/Parcelable;", "purpose", "Lcom/heytap/sports/recommend/bean/GuideSportsPurpose;", "modifyTimestamp", "", "source", "Lcom/heytap/sports/recommend/bean/ModifySource;", "(Lcom/heytap/sports/recommend/bean/GuideSportsPurpose;ILcom/heytap/sports/recommend/bean/ModifySource;)V", "getModifyTimestamp", "()I", "getPurpose", "()Lcom/heytap/sports/recommend/bean/GuideSportsPurpose;", "getSource", "()Lcom/heytap/sports/recommend/bean/ModifySource;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PurposeInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<PurposeInfo> CREATOR = new a();
    private final int modifyTimestamp;

    @NotNull
    private final GuideSportsPurpose purpose;

    @NotNull
    private final ModifySource source;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PurposeInfo> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PurposeInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PurposeInfo(GuideSportsPurpose.valueOf(parcel.readString()), parcel.readInt(), ModifySource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PurposeInfo[] newArray(int i) {
            return new PurposeInfo[i];
        }
    }

    public PurposeInfo() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ PurposeInfo copy$default(PurposeInfo purposeInfo, GuideSportsPurpose guideSportsPurpose, int i, ModifySource modifySource, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            guideSportsPurpose = purposeInfo.purpose;
        }
        if ((i2 & 2) != 0) {
            i = purposeInfo.modifyTimestamp;
        }
        if ((i2 & 4) != 0) {
            modifySource = purposeInfo.source;
        }
        return purposeInfo.copy(guideSportsPurpose, i, modifySource);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GuideSportsPurpose getPurpose() {
        return this.purpose;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getModifyTimestamp() {
        return this.modifyTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ModifySource getSource() {
        return this.source;
    }

    @NotNull
    public final PurposeInfo copy(@NotNull GuideSportsPurpose purpose, int modifyTimestamp, @NotNull ModifySource source) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(source, "source");
        return new PurposeInfo(purpose, modifyTimestamp, source);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurposeInfo)) {
            return false;
        }
        PurposeInfo purposeInfo = (PurposeInfo) other;
        return this.purpose == purposeInfo.purpose && this.modifyTimestamp == purposeInfo.modifyTimestamp && this.source == purposeInfo.source;
    }

    public final int getModifyTimestamp() {
        return this.modifyTimestamp;
    }

    @NotNull
    public final GuideSportsPurpose getPurpose() {
        return this.purpose;
    }

    @NotNull
    public final ModifySource getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((this.purpose.hashCode() * 31) + Integer.hashCode(this.modifyTimestamp)) * 31) + this.source.hashCode();
    }

    @NotNull
    public String toString() {
        return "PurposeInfo(purpose=" + this.purpose + ", modifyTimestamp=" + this.modifyTimestamp + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.purpose.name());
        parcel.writeInt(this.modifyTimestamp);
        parcel.writeString(this.source.name());
    }

    public PurposeInfo(@NotNull GuideSportsPurpose purpose, int i, @NotNull ModifySource source) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(source, "source");
        this.purpose = purpose;
        this.modifyTimestamp = i;
        this.source = source;
    }

    public /* synthetic */ PurposeInfo(GuideSportsPurpose guideSportsPurpose, int i, ModifySource modifySource, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? GuideSportsPurpose.NOT_SET : guideSportsPurpose, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ModifySource.NOT_MODIFY : modifySource);
    }
}
