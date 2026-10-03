package com.heytap.health.oobe;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.FrameMetricsAggregator;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.oobe.repo.VirtualAccount;
import com.heytap.health.watch.thirdparty.ThirdPartyPresenter;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.q3d;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.health.oobe.OOBEPairingData, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Parcelize
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003Jw\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\t\u00106\u001a\u00020\tHÖ\u0001J\u0013\u00107\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\tHÖ\u0001J\u0006\u0010;\u001a\u00020\u0007J\u0006\u0010<\u001a\u00020\u0007J\u0006\u0010=\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020\u0007J\u0006\u0010?\u001a\u00020\u0007J\b\u0010@\u001a\u00020\u0003H\u0016J\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\tJ\u0019\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\tHÖ\u0001R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014¨\u0006H"}, d2 = {"Lcom/heytap/health/oobe/OOBEPairingData;", "Landroid/os/Parcelable;", "address", "", "pairType", "Lcom/heytap/health/oobe/PairType;", "isFamily", "", "oobeState", "", ThirdPartyPresenter.TICKET, "accountNumber", "key", Node.I_TAG, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "model", "familyMemInfo", "Lcom/heytap/health/oobe/repo/VirtualAccount;", "(Ljava/lang/String;Lcom/heytap/health/oobe/PairType;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/oobe/repo/VirtualAccount;)V", "getR1", "()Ljava/lang/String;", "getV", "getAccountNumber", "getAddress", "getFamilyMemInfo", "()Lcom/heytap/health/oobe/repo/VirtualAccount;", "setFamilyMemInfo", "(Lcom/heytap/health/oobe/repo/VirtualAccount;)V", "()Z", "setFamily", "(Z)V", "getKey", "getModel", "setModel", "(Ljava/lang/String;)V", "getOobeState", "()I", "setOobeState", "(I)V", "getPairType", "()Lcom/heytap/health/oobe/PairType;", "getTicket", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "isPairFamily", "isPairIWatch", "isPairNewPhone", "isPairNormal", "isPairSecond", "toString", "updateOobeState", "", "state", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Variants implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Variants> CREATOR = new a();

    @NotNull
    private final String R1;

    @NotNull
    private final String V;

    @NotNull
    private final String accountNumber;

    @NotNull
    private final String address;

    @NotNull
    private VirtualAccount familyMemInfo;
    private boolean isFamily;

    @NotNull
    private final String key;

    @NotNull
    private String model;
    private int oobeState;

    @NotNull
    private final PairType pairType;

    @NotNull
    private final String ticket;

    /* JADX INFO: renamed from: com.heytap.health.oobe.OOBEPairingData$a */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Variants> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Variants createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Variants(parcel.readString(), (PairType) parcel.readParcelable(Variants.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), VirtualAccount.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Variants[] newArray(int i) {
            return new Variants[i];
        }
    }

    public Variants(@NotNull String address, @NotNull PairType pairType, boolean z, int i, @NotNull String ticket, @NotNull String accountNumber, @NotNull String key, @NotNull String R1, @NotNull String V, @NotNull String model, @NotNull VirtualAccount familyMemInfo) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(pairType, "pairType");
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(R1, "R1");
        Intrinsics.checkNotNullParameter(V, "V");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(familyMemInfo, "familyMemInfo");
        this.address = address;
        this.pairType = pairType;
        this.isFamily = z;
        this.oobeState = i;
        this.ticket = ticket;
        this.accountNumber = accountNumber;
        this.key = key;
        this.R1 = R1;
        this.V = V;
        this.model = model;
        this.familyMemInfo = familyMemInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VirtualAccount getFamilyMemInfo() {
        return this.familyMemInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PairType getPairType() {
        return this.pairType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsFamily() {
        return this.isFamily;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOobeState() {
        return this.oobeState;
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

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getR1() {
        return this.R1;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getV() {
        return this.V;
    }

    @NotNull
    public final Variants copy(@NotNull String address, @NotNull PairType pairType, boolean isFamily, int oobeState, @NotNull String ticket, @NotNull String accountNumber, @NotNull String key, @NotNull String R1, @NotNull String V, @NotNull String model, @NotNull VirtualAccount familyMemInfo) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(pairType, "pairType");
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(R1, "R1");
        Intrinsics.checkNotNullParameter(V, "V");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(familyMemInfo, "familyMemInfo");
        return new Variants(address, pairType, isFamily, oobeState, ticket, accountNumber, key, R1, V, model, familyMemInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Variants)) {
            return false;
        }
        Variants variants = (Variants) other;
        return Intrinsics.areEqual(this.address, variants.address) && Intrinsics.areEqual(this.pairType, variants.pairType) && this.isFamily == variants.isFamily && this.oobeState == variants.oobeState && Intrinsics.areEqual(this.ticket, variants.ticket) && Intrinsics.areEqual(this.accountNumber, variants.accountNumber) && Intrinsics.areEqual(this.key, variants.key) && Intrinsics.areEqual(this.R1, variants.R1) && Intrinsics.areEqual(this.V, variants.V) && Intrinsics.areEqual(this.model, variants.model) && Intrinsics.areEqual(this.familyMemInfo, variants.familyMemInfo);
    }

    @NotNull
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final VirtualAccount getFamilyMemInfo() {
        return this.familyMemInfo;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public final int getOobeState() {
        return this.oobeState;
    }

    @NotNull
    public final PairType getPairType() {
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
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public int hashCode() {
        int iHashCode = ((this.address.hashCode() * 31) + this.pairType.hashCode()) * 31;
        boolean z = this.isFamily;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((((((iHashCode + r1) * 31) + Integer.hashCode(this.oobeState)) * 31) + this.ticket.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.key.hashCode()) * 31) + this.R1.hashCode()) * 31) + this.V.hashCode()) * 31) + this.model.hashCode()) * 31) + this.familyMemInfo.hashCode();
    }

    public final boolean isFamily() {
        return this.isFamily;
    }

    public final boolean isPairFamily() {
        return this.isFamily || Intrinsics.areEqual(this.pairType, PairType.FAMILY.INSTANCE);
    }

    public final boolean isPairIWatch() {
        return (TextUtils.isEmpty(this.R1) || TextUtils.isEmpty(this.key)) ? false : true;
    }

    public final boolean isPairNewPhone() {
        return Intrinsics.areEqual(this.pairType, PairType.Migrate.INSTANCE);
    }

    public final boolean isPairNormal() {
        return Intrinsics.areEqual(this.pairType, PairType.NORMAL.INSTANCE) && !isPairIWatch();
    }

    public final boolean isPairSecond() {
        return Intrinsics.areEqual(this.pairType, PairType.SECOND.INSTANCE);
    }

    public final void setFamily(boolean z) {
        this.isFamily = z;
    }

    public final void setFamilyMemInfo(@NotNull VirtualAccount virtualAccount) {
        Intrinsics.checkNotNullParameter(virtualAccount, "<set-?>");
        this.familyMemInfo = virtualAccount;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setOobeState(int i) {
        this.oobeState = i;
    }

    @NotNull
    public String toString() {
        return "Variants(address='" + OOBELogKt.b(this.address) + "', pairType=" + this.pairType + ", isFamily=" + this.isFamily + ", oobeState=" + this.oobeState + ", ticket='" + OOBELogKt.b(this.ticket) + "', accountNumber='" + OOBELogKt.b(this.accountNumber) + "', key='" + OOBELogKt.b(this.key) + "', R1='" + this.R1 + "', V='" + this.V + "', model='" + this.model + "'";
    }

    public final void updateOobeState(int state) {
        q3d.h(b78.a(), this.address, state);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.address);
        parcel.writeParcelable(this.pairType, flags);
        parcel.writeInt(this.isFamily ? 1 : 0);
        parcel.writeInt(this.oobeState);
        parcel.writeString(this.ticket);
        parcel.writeString(this.accountNumber);
        parcel.writeString(this.key);
        parcel.writeString(this.R1);
        parcel.writeString(this.V);
        parcel.writeString(this.model);
        this.familyMemInfo.writeToParcel(parcel, flags);
    }

    public /* synthetic */ Variants(String str, PairType pairType, boolean z, int i, String str2, String str3, String str4, String str5, String str6, String str7, VirtualAccount virtualAccount, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? PairType.NORMAL.INSTANCE : pairType, (i2 & 4) != 0 ? false : z, (i2 & 8) == 0 ? i : 0, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) == 0 ? str6 : "", (i2 & 512) != 0 ? "OBB213" : str7, (i2 & 1024) != 0 ? new VirtualAccount(null, null, null, null, null, null, null, null, 0, FrameMetricsAggregator.EVERY_DURATION, null) : virtualAccount);
    }
}
