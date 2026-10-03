package com.heytap.health.watch.notification.impl.ui;

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

/* JADX INFO: loaded from: classes19.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/BrandItem;", "Landroid/os/Parcelable;", "systemApp", "", "brandCode", "", "brandSwitch", "", "brandName", "brandIcon", "hostPkgName", "(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrandCode", "()Ljava/lang/String;", "getBrandIcon", "getBrandName", "getBrandSwitch", "()I", "getHostPkgName", "getSystemApp", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BrandItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BrandItem> CREATOR = new a();

    @NotNull
    private final String brandCode;

    @NotNull
    private final String brandIcon;

    @NotNull
    private final String brandName;
    private final int brandSwitch;

    @NotNull
    private final String hostPkgName;
    private final boolean systemApp;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BrandItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrandItem(parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BrandItem[] newArray(int i) {
            return new BrandItem[i];
        }
    }

    public BrandItem(boolean z, @NotNull String brandCode, int i, @NotNull String brandName, @NotNull String brandIcon, @NotNull String hostPkgName) {
        Intrinsics.checkNotNullParameter(brandCode, "brandCode");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(brandIcon, "brandIcon");
        Intrinsics.checkNotNullParameter(hostPkgName, "hostPkgName");
        this.systemApp = z;
        this.brandCode = brandCode;
        this.brandSwitch = i;
        this.brandName = brandName;
        this.brandIcon = brandIcon;
        this.hostPkgName = hostPkgName;
    }

    public static /* synthetic */ BrandItem copy$default(BrandItem brandItem, boolean z, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = brandItem.systemApp;
        }
        if ((i2 & 2) != 0) {
            str = brandItem.brandCode;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            i = brandItem.brandSwitch;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = brandItem.brandName;
        }
        String str6 = str2;
        if ((i2 & 16) != 0) {
            str3 = brandItem.brandIcon;
        }
        String str7 = str3;
        if ((i2 & 32) != 0) {
            str4 = brandItem.hostPkgName;
        }
        return brandItem.copy(z, str5, i3, str6, str7, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSystemApp() {
        return this.systemApp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBrandCode() {
        return this.brandCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBrandSwitch() {
        return this.brandSwitch;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrandName() {
        return this.brandName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBrandIcon() {
        return this.brandIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHostPkgName() {
        return this.hostPkgName;
    }

    @NotNull
    public final BrandItem copy(boolean systemApp, @NotNull String brandCode, int brandSwitch, @NotNull String brandName, @NotNull String brandIcon, @NotNull String hostPkgName) {
        Intrinsics.checkNotNullParameter(brandCode, "brandCode");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(brandIcon, "brandIcon");
        Intrinsics.checkNotNullParameter(hostPkgName, "hostPkgName");
        return new BrandItem(systemApp, brandCode, brandSwitch, brandName, brandIcon, hostPkgName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandItem)) {
            return false;
        }
        BrandItem brandItem = (BrandItem) other;
        return this.systemApp == brandItem.systemApp && Intrinsics.areEqual(this.brandCode, brandItem.brandCode) && this.brandSwitch == brandItem.brandSwitch && Intrinsics.areEqual(this.brandName, brandItem.brandName) && Intrinsics.areEqual(this.brandIcon, brandItem.brandIcon) && Intrinsics.areEqual(this.hostPkgName, brandItem.hostPkgName);
    }

    @NotNull
    public final String getBrandCode() {
        return this.brandCode;
    }

    @NotNull
    public final String getBrandIcon() {
        return this.brandIcon;
    }

    @NotNull
    public final String getBrandName() {
        return this.brandName;
    }

    public final int getBrandSwitch() {
        return this.brandSwitch;
    }

    @NotNull
    public final String getHostPkgName() {
        return this.hostPkgName;
    }

    public final boolean getSystemApp() {
        return this.systemApp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.systemApp;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((r0 * 31) + this.brandCode.hashCode()) * 31) + Integer.hashCode(this.brandSwitch)) * 31) + this.brandName.hashCode()) * 31) + this.brandIcon.hashCode()) * 31) + this.hostPkgName.hashCode();
    }

    @NotNull
    public String toString() {
        return "BrandItem(systemApp=" + this.systemApp + ", brandCode=" + this.brandCode + ", brandSwitch=" + this.brandSwitch + ", brandName=" + this.brandName + ", brandIcon=" + this.brandIcon + ", hostPkgName=" + this.hostPkgName + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.systemApp ? 1 : 0);
        parcel.writeString(this.brandCode);
        parcel.writeInt(this.brandSwitch);
        parcel.writeString(this.brandName);
        parcel.writeString(this.brandIcon);
        parcel.writeString(this.hostPkgName);
    }

    public /* synthetic */ BrandItem(boolean z, String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, str, i, str2, str3, str4);
    }
}
