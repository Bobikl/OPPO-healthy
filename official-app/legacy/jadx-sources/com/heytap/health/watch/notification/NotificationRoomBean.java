package com.heytap.health.watch.notification;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(primaryKeys = {"packageName"}, tableName = "notification_packages")
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B5\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\"\u0010$J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006'"}, d2 = {"Lcom/heytap/health/watch/notification/NotificationRoomBean;", "Landroid/os/Parcelable;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "packageName", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "appName", "getAppName", "setAppName", "(Ljava/lang/String;)V", ParserTag.VIEW_TYPE, "I", "getViewType", "()I", "appNamePy", "getAppNamePy", "setAppNamePy", "isOpen", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
public final class NotificationRoomBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @ColumnInfo(name = "appName")
    @Nullable
    private String appName;

    @ColumnInfo(name = "appNamePy")
    @Nullable
    private String appNamePy;

    @ColumnInfo(name = "isOpen")
    private final boolean isOpen;

    @ColumnInfo(name = "packageName")
    @NotNull
    private final String packageName;

    @ColumnInfo(name = ParserTag.VIEW_TYPE)
    private final int viewType;

    /* JADX INFO: renamed from: com.heytap.health.watch.notification.NotificationRoomBean$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/health/watch/notification/NotificationRoomBean$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/health/watch/notification/NotificationRoomBean;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/health/watch/notification/NotificationRoomBean;", "<init>", "()V", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<NotificationRoomBean> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NotificationRoomBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotificationRoomBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NotificationRoomBean[] newArray(int size) {
            return new NotificationRoomBean[size];
        }
    }

    public NotificationRoomBean(@NotNull String packageName, @Nullable String str, int i, @Nullable String str2, boolean z) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.appName = str;
        this.viewType = i;
        this.appNamePy = str2;
        this.isOpen = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        return TextUtils.equals(((NotificationRoomBean) other).packageName, this.packageName);
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getAppNamePy() {
        return this.appNamePy;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return this.packageName.hashCode();
    }

    /* JADX INFO: renamed from: isOpen, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setAppNamePy(@Nullable String str) {
        this.appNamePy = str;
    }

    @NotNull
    public String toString() {
        return "{appName=" + this.appName + ", packageName=" + this.packageName + ", viewType=" + this.viewType + ", isOpen=" + this.isOpen + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.packageName);
        parcel.writeString(this.appName);
        parcel.writeInt(this.viewType);
        parcel.writeString(this.appNamePy);
        parcel.writeByte(this.isOpen ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ NotificationRoomBean(String str, String str2, int i, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, (i2 & 16) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NotificationRoomBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        this(string == null ? "" : string, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readByte() != 0);
    }
}
