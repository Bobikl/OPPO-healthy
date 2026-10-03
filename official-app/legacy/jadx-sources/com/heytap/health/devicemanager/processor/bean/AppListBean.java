package com.heytap.health.devicemanager.processor.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.gdb;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0000H\u0016J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007HÖ\u0001R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/AppListBean;", "Landroid/os/Parcelable;", "", "mac", "", "installAppSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "(Ljava/lang/String;Ljava/util/HashSet;)V", "getInstallAppSet", "()Ljava/util/HashSet;", "setInstallAppSet", "(Ljava/util/HashSet;)V", "getMac", "()Ljava/lang/String;", "clone", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppListBean implements Parcelable, Cloneable {

    @NotNull
    public static final Parcelable.Creator<AppListBean> CREATOR = new a();

    @NotNull
    private HashSet<Integer> installAppSet;

    @NotNull
    private final String mac;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppListBean> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppListBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            HashSet hashSet = new HashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                hashSet.add(Integer.valueOf(parcel.readInt()));
            }
            return new AppListBean(string, hashSet);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AppListBean[] newArray(int i) {
            return new AppListBean[i];
        }
    }

    public AppListBean(@NotNull String mac, @NotNull HashSet<Integer> installAppSet) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(installAppSet, "installAppSet");
        this.mac = mac;
        this.installAppSet = installAppSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppListBean copy$default(AppListBean appListBean, String str, HashSet hashSet, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appListBean.mac;
        }
        if ((i & 2) != 0) {
            hashSet = appListBean.installAppSet;
        }
        return appListBean.copy(str, hashSet);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final HashSet<Integer> component2() {
        return this.installAppSet;
    }

    @NotNull
    public final AppListBean copy(@NotNull String mac, @NotNull HashSet<Integer> installAppSet) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(installAppSet, "installAppSet");
        return new AppListBean(mac, installAppSet);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppListBean)) {
            return false;
        }
        AppListBean appListBean = (AppListBean) other;
        return Intrinsics.areEqual(this.mac, appListBean.mac) && Intrinsics.areEqual(this.installAppSet, appListBean.installAppSet);
    }

    @NotNull
    public final HashSet<Integer> getInstallAppSet() {
        return this.installAppSet;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    public int hashCode() {
        return (this.mac.hashCode() * 31) + this.installAppSet.hashCode();
    }

    public final void setInstallAppSet(@NotNull HashSet<Integer> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
        this.installAppSet = hashSet;
    }

    @NotNull
    public String toString() {
        return "AppListBean(mac='" + gdb.a(this.mac) + "', installAppSet=" + this.installAppSet + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.mac);
        HashSet<Integer> hashSet = this.installAppSet;
        parcel.writeInt(hashSet.size());
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AppListBean m4636clone() {
        try {
            Object objClone = super.clone();
            Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type com.heytap.health.devicemanager.processor.bean.AppListBean");
            AppListBean appListBean = (AppListBean) objClone;
            appListBean.installAppSet = new HashSet<>(this.installAppSet);
            return appListBean;
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public /* synthetic */ AppListBean(String str, HashSet hashSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new HashSet() : hashSet);
    }
}
