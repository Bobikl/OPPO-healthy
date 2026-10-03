package com.heytap.health.oobe.dto;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.oobe.Variants;
import com.heytap.health.watchpair.R$string;
import com.oplus.aiunit.vision.qtf;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Parcelize
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00017BY\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J[\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0018\u001a\u00020\fHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001d\u001a\u00020\fHÖ\u0001J\u0019\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\fHÖ\u0001R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b&\u0010%R!\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b3\u00102¨\u00068"}, d2 = {"Lcom/heytap/health/oobe/dto/OOBEFail;", "Landroid/os/Parcelable;", "", "toString", "", "component1", "component2", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "component3", "Lcom/heytap/health/oobe/OOBEPairingData;", "component4", "", "component5", "component6", "component7", "title", DBHealthReviewPlan.DESC, "failFragment", "pairingData", "code", "extra", "log", "copy", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "getDesc", "Ljava/lang/Class;", "getFailFragment", "()Ljava/lang/Class;", "Lcom/heytap/health/oobe/OOBEPairingData;", "getPairingData", "()Lcom/heytap/health/oobe/OOBEPairingData;", "I", "getCode", "()I", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "getLog", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Class;Lcom/heytap/health/oobe/OOBEPairingData;ILjava/lang/String;Ljava/lang/String;)V", "Companion", "a", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OOBEFail implements Parcelable {
    public static final int ERROR_BT_BOND = -911;
    public static final int ERROR_OAF_CONNECT = -922;
    private final int code;

    @NotNull
    private final CharSequence desc;

    @NotNull
    private final String extra;

    @Nullable
    private final Class<? extends Fragment> failFragment;

    @NotNull
    private final String log;

    @Nullable
    private final Variants pairingData;

    @NotNull
    private final CharSequence title;

    @NotNull
    public static final Parcelable.Creator<OOBEFail> CREATOR = new b();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<OOBEFail> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OOBEFail createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OOBEFail((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (Class) parcel.readSerializable(), parcel.readInt() == 0 ? null : Variants.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OOBEFail[] newArray(int i) {
            return new OOBEFail[i];
        }
    }

    public OOBEFail() {
        this(null, null, null, null, 0, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OOBEFail copy$default(OOBEFail oOBEFail, CharSequence charSequence, CharSequence charSequence2, Class cls, Variants variants, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = oOBEFail.title;
        }
        if ((i2 & 2) != 0) {
            charSequence2 = oOBEFail.desc;
        }
        CharSequence charSequence3 = charSequence2;
        if ((i2 & 4) != 0) {
            cls = oOBEFail.failFragment;
        }
        Class cls2 = cls;
        if ((i2 & 8) != 0) {
            variants = oOBEFail.pairingData;
        }
        Variants variants2 = variants;
        if ((i2 & 16) != 0) {
            i = oOBEFail.code;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str = oOBEFail.extra;
        }
        String str3 = str;
        if ((i2 & 64) != 0) {
            str2 = oOBEFail.log;
        }
        return oOBEFail.copy(charSequence, charSequence3, cls2, variants2, i3, str3, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CharSequence getDesc() {
        return this.desc;
    }

    @Nullable
    public final Class<? extends Fragment> component3() {
        return this.failFragment;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Variants getPairingData() {
        return this.pairingData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLog() {
        return this.log;
    }

    @NotNull
    public final OOBEFail copy(@NotNull CharSequence title, @NotNull CharSequence desc, @Nullable Class<? extends Fragment> failFragment, @Nullable Variants pairingData, int code, @NotNull String extra, @NotNull String log) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(extra, "extra");
        Intrinsics.checkNotNullParameter(log, "log");
        return new OOBEFail(title, desc, failFragment, pairingData, code, extra, log);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OOBEFail)) {
            return false;
        }
        OOBEFail oOBEFail = (OOBEFail) other;
        return Intrinsics.areEqual(this.title, oOBEFail.title) && Intrinsics.areEqual(this.desc, oOBEFail.desc) && Intrinsics.areEqual(this.failFragment, oOBEFail.failFragment) && Intrinsics.areEqual(this.pairingData, oOBEFail.pairingData) && this.code == oOBEFail.code && Intrinsics.areEqual(this.extra, oOBEFail.extra) && Intrinsics.areEqual(this.log, oOBEFail.log);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final CharSequence getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    public final Class<? extends Fragment> getFailFragment() {
        return this.failFragment;
    }

    @NotNull
    public final String getLog() {
        return this.log;
    }

    @Nullable
    public final Variants getPairingData() {
        return this.pairingData;
    }

    @NotNull
    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.desc.hashCode()) * 31;
        Class<? extends Fragment> cls = this.failFragment;
        int iHashCode2 = (iHashCode + (cls == null ? 0 : cls.hashCode())) * 31;
        Variants variants = this.pairingData;
        return ((((((iHashCode2 + (variants != null ? variants.hashCode() : 0)) * 31) + Integer.hashCode(this.code)) * 31) + this.extra.hashCode()) * 31) + this.log.hashCode();
    }

    @NotNull
    public String toString() {
        CharSequence charSequence = this.desc;
        return "desc:" + ((Object) charSequence) + "  -> log:" + this.log;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        TextUtils.writeToParcel(this.title, parcel, flags);
        TextUtils.writeToParcel(this.desc, parcel, flags);
        parcel.writeSerializable(this.failFragment);
        Variants variants = this.pairingData;
        if (variants == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            variants.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.code);
        parcel.writeString(this.extra);
        parcel.writeString(this.log);
    }

    public OOBEFail(@NotNull CharSequence title, @NotNull CharSequence desc, @Nullable Class<? extends Fragment> cls, @Nullable Variants variants, int i, @NotNull String extra, @NotNull String log) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(extra, "extra");
        Intrinsics.checkNotNullParameter(log, "log");
        this.title = title;
        this.desc = desc;
        this.failFragment = cls;
        this.pairingData = variants;
        this.code = i;
        this.extra = extra;
        this.log = log;
    }

    public /* synthetic */ OOBEFail(CharSequence charSequence, CharSequence charSequence2, Class cls, Variants variants, int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? qtf.l(R$string.oobe_pair_default) : charSequence, (i2 & 2) != 0 ? "" : charSequence2, (i2 & 4) != 0 ? null : cls, (i2 & 8) == 0 ? variants : null, (i2 & 16) != 0 ? 2 : i, (i2 & 32) == 0 ? str : "", (i2 & 64) != 0 ? "no log" : str2);
    }
}
