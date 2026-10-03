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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/heytap/sports/recommend/bean/BaseInfo;", "Landroid/os/Parcelable;", "pInfo", "Lcom/heytap/sports/recommend/bean/PurposeInfo;", "data", "Lcom/heytap/sports/recommend/bean/Questionnaire;", "version", "", "(Lcom/heytap/sports/recommend/bean/PurposeInfo;Lcom/heytap/sports/recommend/bean/Questionnaire;I)V", "getData", "()Lcom/heytap/sports/recommend/bean/Questionnaire;", "getPInfo", "()Lcom/heytap/sports/recommend/bean/PurposeInfo;", "getVersion", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BaseInfo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BaseInfo> CREATOR = new a();

    @Nullable
    private final Questionnaire data;

    @NotNull
    private final PurposeInfo pInfo;
    private final int version;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BaseInfo> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BaseInfo(PurposeInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Questionnaire.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BaseInfo[] newArray(int i) {
            return new BaseInfo[i];
        }
    }

    public BaseInfo(@NotNull PurposeInfo pInfo, @Nullable Questionnaire questionnaire, int i) {
        Intrinsics.checkNotNullParameter(pInfo, "pInfo");
        this.pInfo = pInfo;
        this.data = questionnaire;
        this.version = i;
    }

    public static /* synthetic */ BaseInfo copy$default(BaseInfo baseInfo, PurposeInfo purposeInfo, Questionnaire questionnaire, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            purposeInfo = baseInfo.pInfo;
        }
        if ((i2 & 2) != 0) {
            questionnaire = baseInfo.data;
        }
        if ((i2 & 4) != 0) {
            i = baseInfo.version;
        }
        return baseInfo.copy(purposeInfo, questionnaire, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PurposeInfo getPInfo() {
        return this.pInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Questionnaire getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final BaseInfo copy(@NotNull PurposeInfo pInfo, @Nullable Questionnaire data, int version) {
        Intrinsics.checkNotNullParameter(pInfo, "pInfo");
        return new BaseInfo(pInfo, data, version);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseInfo)) {
            return false;
        }
        BaseInfo baseInfo = (BaseInfo) other;
        return Intrinsics.areEqual(this.pInfo, baseInfo.pInfo) && Intrinsics.areEqual(this.data, baseInfo.data) && this.version == baseInfo.version;
    }

    @Nullable
    public final Questionnaire getData() {
        return this.data;
    }

    @NotNull
    public final PurposeInfo getPInfo() {
        return this.pInfo;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.pInfo.hashCode() * 31;
        Questionnaire questionnaire = this.data;
        return ((iHashCode + (questionnaire == null ? 0 : questionnaire.hashCode())) * 31) + Integer.hashCode(this.version);
    }

    @NotNull
    public String toString() {
        return "BaseInfo(pInfo=" + this.pInfo + ", data=" + this.data + ", version=" + this.version + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.pInfo.writeToParcel(parcel, flags);
        Questionnaire questionnaire = this.data;
        if (questionnaire == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            questionnaire.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.version);
    }

    public /* synthetic */ BaseInfo(PurposeInfo purposeInfo, Questionnaire questionnaire, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(purposeInfo, (i2 & 2) != 0 ? null : questionnaire, (i2 & 4) != 0 ? 1 : i);
    }
}
