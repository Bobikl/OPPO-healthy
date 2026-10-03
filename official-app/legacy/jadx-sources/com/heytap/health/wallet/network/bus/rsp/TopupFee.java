package com.heytap.health.wallet.network.bus.rsp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001!B\u0019\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dB\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\""}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/TopupFee;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "component1", "component2", "()Ljava/lang/Integer;", "normal", "actually", "copy", "(ILjava/lang/Integer;)Lcom/heytap/health/wallet/network/bus/rsp/TopupFee;", "", "toString", "hashCode", "", "other", "", "equals", "I", "getNormal", "()I", "Ljava/lang/Integer;", "getActually", "<init>", "(ILjava/lang/Integer;)V", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "a", "commonlib_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TopupFee implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer actually;
    private final int normal;

    /* JADX INFO: renamed from: com.heytap.health.wallet.network.bus.rsp.TopupFee$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/TopupFee$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/health/wallet/network/bus/rsp/TopupFee;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/health/wallet/network/bus/rsp/TopupFee;", "<init>", "()V", "commonlib_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<TopupFee> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TopupFee createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopupFee(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TopupFee[] newArray(int size) {
            return new TopupFee[size];
        }
    }

    public TopupFee(int i, @Nullable Integer num) {
        this.normal = i;
        this.actually = num;
    }

    public static /* synthetic */ TopupFee copy$default(TopupFee topupFee, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = topupFee.normal;
        }
        if ((i2 & 2) != 0) {
            num = topupFee.actually;
        }
        return topupFee.copy(i, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNormal() {
        return this.normal;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getActually() {
        return this.actually;
    }

    @NotNull
    public final TopupFee copy(int normal, @Nullable Integer actually) {
        return new TopupFee(normal, actually);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupFee)) {
            return false;
        }
        TopupFee topupFee = (TopupFee) other;
        return this.normal == topupFee.normal && Intrinsics.areEqual(this.actually, topupFee.actually);
    }

    @Nullable
    public final Integer getActually() {
        return this.actually;
    }

    public final int getNormal() {
        return this.normal;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.normal) * 31;
        Integer num = this.actually;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "TopupFee(normal=" + this.normal + ", actually=" + this.actually + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.normal);
        Integer num = this.actually;
        Intrinsics.checkNotNull(num);
        dest.writeInt(num.intValue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TopupFee(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i = parcel.readInt();
        Object value = parcel.readValue(Integer.TYPE.getClassLoader());
        this(i, value instanceof Integer ? (Integer) value : null);
    }
}
