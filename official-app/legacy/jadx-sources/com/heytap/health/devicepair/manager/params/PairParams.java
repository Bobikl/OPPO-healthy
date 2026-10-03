package com.heytap.health.devicepair.manager.params;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.watch.thirdparty.ThirdPartyPresenter;
import com.oplus.aiunit.vision.gdb;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0013\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020+HÖ\u0001J\b\u00100\u001a\u00020\u0003H\u0016J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020+HÖ\u0001R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010¨\u00066"}, d2 = {"Lcom/heytap/health/devicepair/manager/params/PairParams;", "Landroid/os/Parcelable;", "id", "", "model", "isMigrate", "", "pairType", ThirdPartyPresenter.TICKET, "accountNumber", "isSecond", "key", Node.I_TAG, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getR1", "()Ljava/lang/String;", "setR1", "(Ljava/lang/String;)V", "getV", "setV", "getAccountNumber", "getId", "setId", "()Z", "getKey", "setKey", "getModel", "setModel", "getPairType", "getTicket", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PairParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PairParams> CREATOR = new a();

    @NotNull
    private String R1;

    @NotNull
    private String V;

    @NotNull
    private final String accountNumber;

    @NotNull
    private String id;
    private final boolean isMigrate;
    private final boolean isSecond;

    @NotNull
    private String key;

    @NotNull
    private String model;

    @NotNull
    private final String pairType;

    @NotNull
    private final String ticket;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PairParams> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PairParams createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PairParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PairParams[] newArray(int i) {
            return new PairParams[i];
        }
    }

    public PairParams(@NotNull String id, @NotNull String model, boolean z, @NotNull String pairType, @NotNull String ticket, @NotNull String accountNumber, boolean z2, @NotNull String key, @NotNull String R1, @NotNull String V) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(pairType, "pairType");
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(R1, "R1");
        Intrinsics.checkNotNullParameter(V, "V");
        this.id = id;
        this.model = model;
        this.isMigrate = z;
        this.pairType = pairType;
        this.ticket = ticket;
        this.accountNumber = accountNumber;
        this.isSecond = z2;
        this.key = key;
        this.R1 = R1;
        this.V = V;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getV() {
        return this.V;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMigrate() {
        return this.isMigrate;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPairType() {
        return this.pairType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTicket() {
        return this.ticket;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSecond() {
        return this.isSecond;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getR1() {
        return this.R1;
    }

    @NotNull
    public final PairParams copy(@NotNull String id, @NotNull String model, boolean isMigrate, @NotNull String pairType, @NotNull String ticket, @NotNull String accountNumber, boolean isSecond, @NotNull String key, @NotNull String R1, @NotNull String V) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(pairType, "pairType");
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(R1, "R1");
        Intrinsics.checkNotNullParameter(V, "V");
        return new PairParams(id, model, isMigrate, pairType, ticket, accountNumber, isSecond, key, R1, V);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PairParams)) {
            return false;
        }
        PairParams pairParams = (PairParams) other;
        return Intrinsics.areEqual(this.id, pairParams.id) && Intrinsics.areEqual(this.model, pairParams.model) && this.isMigrate == pairParams.isMigrate && Intrinsics.areEqual(this.pairType, pairParams.pairType) && Intrinsics.areEqual(this.ticket, pairParams.ticket) && Intrinsics.areEqual(this.accountNumber, pairParams.accountNumber) && this.isSecond == pairParams.isSecond && Intrinsics.areEqual(this.key, pairParams.key) && Intrinsics.areEqual(this.R1, pairParams.R1) && Intrinsics.areEqual(this.V, pairParams.V);
    }

    @NotNull
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getPairType() {
        return this.pairType;
    }

    @NotNull
    public final String getR1() {
        return this.R1;
    }

    @NotNull
    public final String getTicket() {
        return this.ticket;
    }

    @NotNull
    public final String getV() {
        return this.V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.model.hashCode()) * 31;
        boolean z = this.isMigrate;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((iHashCode + r1) * 31) + this.pairType.hashCode()) * 31) + this.ticket.hashCode()) * 31) + this.accountNumber.hashCode()) * 31;
        boolean z2 = this.isSecond;
        return ((((((iHashCode2 + (z2 ? 1 : z2)) * 31) + this.key.hashCode()) * 31) + this.R1.hashCode()) * 31) + this.V.hashCode();
    }

    public final boolean isMigrate() {
        return this.isMigrate;
    }

    public final boolean isSecond() {
        return this.isSecond;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setR1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.R1 = str;
    }

    public final void setV(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.V = str;
    }

    @NotNull
    public String toString() {
        return "PairParams(id='" + gdb.a(this.id) + "', model='" + this.model + "', isMigrate=" + this.isMigrate + ", pairType='" + this.pairType + "', ticket='" + this.ticket + "', accountNumber='" + this.accountNumber + "', isSecond='" + this.isSecond + "', key='" + this.key + "', R1='" + this.R1 + "', V='" + this.V + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.model);
        parcel.writeInt(this.isMigrate ? 1 : 0);
        parcel.writeString(this.pairType);
        parcel.writeString(this.ticket);
        parcel.writeString(this.accountNumber);
        parcel.writeInt(this.isSecond ? 1 : 0);
        parcel.writeString(this.key);
        parcel.writeString(this.R1);
        parcel.writeString(this.V);
    }
}
