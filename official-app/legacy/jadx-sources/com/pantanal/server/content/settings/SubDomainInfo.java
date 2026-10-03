package com.pantanal.server.content.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.List;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/pantanal/server/content/settings/SubDomainInfo;", "Landroid/os/Parcelable;", "subdomain", "", Constants.KEY_SERVICE_IDS, "", "(Ljava/lang/String;Ljava/util/List;)V", "getServiceIds", "()Ljava/util/List;", "getSubdomain", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SubDomainInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SubDomainInfo> CREATOR = new a();

    @Nullable
    private final List<String> serviceIds;

    @NotNull
    private final String subdomain;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<SubDomainInfo> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SubDomainInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubDomainInfo(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SubDomainInfo[] newArray(int i) {
            return new SubDomainInfo[i];
        }
    }

    public SubDomainInfo(@NotNull String subdomain, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(subdomain, "subdomain");
        this.subdomain = subdomain;
        this.serviceIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubDomainInfo copy$default(SubDomainInfo subDomainInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subDomainInfo.subdomain;
        }
        if ((i & 2) != 0) {
            list = subDomainInfo.serviceIds;
        }
        return subDomainInfo.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubdomain() {
        return this.subdomain;
    }

    @Nullable
    public final List<String> component2() {
        return this.serviceIds;
    }

    @NotNull
    public final SubDomainInfo copy(@NotNull String subdomain, @Nullable List<String> serviceIds) {
        Intrinsics.checkNotNullParameter(subdomain, "subdomain");
        return new SubDomainInfo(subdomain, serviceIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubDomainInfo)) {
            return false;
        }
        SubDomainInfo subDomainInfo = (SubDomainInfo) other;
        return Intrinsics.areEqual(this.subdomain, subDomainInfo.subdomain) && Intrinsics.areEqual(this.serviceIds, subDomainInfo.serviceIds);
    }

    @Nullable
    public final List<String> getServiceIds() {
        return this.serviceIds;
    }

    @NotNull
    public final String getSubdomain() {
        return this.subdomain;
    }

    public int hashCode() {
        int iHashCode = this.subdomain.hashCode() * 31;
        List<String> list = this.serviceIds;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "SubDomainInfo(subdomain=" + this.subdomain + ", serviceIds=" + this.serviceIds + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.subdomain);
        parcel.writeStringList(this.serviceIds);
    }

    public /* synthetic */ SubDomainInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
