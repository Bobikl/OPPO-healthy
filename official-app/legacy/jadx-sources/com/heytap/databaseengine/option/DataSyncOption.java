package com.heytap.databaseengine.option;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.ebe;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 42\u00020\u0001:\u00015BQ\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b0\u00101B\u0011\b\u0016\u0012\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b0\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R$\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010+\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00066"}, d2 = {"Lcom/heytap/databaseengine/option/DataSyncOption;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "", "toString", "syncAction", "I", "getSyncAction", "()I", "setSyncAction", "(I)V", "syncScope", "getSyncScope", "setSyncScope", "syncDataType", "getSyncDataType", "setSyncDataType", "forcePush", "getForcePush", "setForcePush", "data", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "ssoid", "getSsoid", "setSsoid", "", "earliestVersion", "J", "getEarliestVersion", "()J", "setEarliestVersion", "(J)V", "Lcom/heytap/databaseengine/model/UserInfo;", ebe.KEY_USER_INFO, "getUserInfo", "()Lcom/heytap/databaseengine/model/UserInfo;", "setUserInfo", "(Lcom/heytap/databaseengine/model/UserInfo;)V", "<init>", "(IIIILjava/lang/String;Ljava/lang/String;J)V", "in", "(Landroid/os/Parcel;)V", "CREATOR", "a", "databaseengine_release"}, k = 1, mv = {1, 8, 0})
public final class DataSyncOption implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String data;
    private long earliestVersion;
    private int forcePush;

    @Nullable
    private String ssoid;
    private int syncAction;
    private int syncDataType;
    private int syncScope;

    /* JADX INFO: renamed from: com.heytap.databaseengine.option.DataSyncOption$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/databaseengine/option/DataSyncOption$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/databaseengine/option/DataSyncOption;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/databaseengine/option/DataSyncOption;", "<init>", "()V", "databaseengine_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<DataSyncOption> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataSyncOption createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataSyncOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataSyncOption[] newArray(int size) {
            return new DataSyncOption[size];
        }
    }

    public DataSyncOption() {
        this(0, 0, 0, 0, null, null, 0L, 127, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    public final long getEarliestVersion() {
        return this.earliestVersion;
    }

    public final int getForcePush() {
        return this.forcePush;
    }

    @Nullable
    public final String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncAction() {
        return this.syncAction;
    }

    public final int getSyncDataType() {
        return this.syncDataType;
    }

    public final int getSyncScope() {
        return this.syncScope;
    }

    @Nullable
    public final UserInfo getUserInfo() {
        if (this.data == null) {
            return null;
        }
        return (UserInfo) new Gson().fromJson(this.data, UserInfo.class);
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setEarliestVersion(long j2) {
        this.earliestVersion = j2;
    }

    public final void setForcePush(int i) {
        this.forcePush = i;
    }

    public final void setSsoid(@Nullable String str) {
        this.ssoid = str;
    }

    public final void setSyncAction(int i) {
        this.syncAction = i;
    }

    public final void setSyncDataType(int i) {
        this.syncDataType = i;
    }

    public final void setSyncScope(int i) {
        this.syncScope = i;
    }

    public final void setUserInfo(@Nullable UserInfo userInfo) {
        if (userInfo == null) {
            return;
        }
        this.data = new Gson().toJson(userInfo);
    }

    @NotNull
    public String toString() {
        return "DataSyncOption(syncAction=" + this.syncAction + ", syncScope=" + this.syncScope + ", syncDataType=" + this.syncDataType + ", forcePush=" + this.forcePush + ", data=" + this.data + ", earliestVersion=" + this.earliestVersion + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.syncAction);
        dest.writeInt(this.syncScope);
        dest.writeInt(this.syncDataType);
        dest.writeInt(this.forcePush);
        dest.writeString(this.data);
        dest.writeString(this.ssoid);
        dest.writeLong(this.earliestVersion);
    }

    public DataSyncOption(int i, int i2, int i3, int i4, @Nullable String str, @Nullable String str2, long j2) {
        this.syncAction = i;
        this.syncScope = i2;
        this.syncDataType = i3;
        this.forcePush = i4;
        this.data = str;
        this.ssoid = str2;
        this.earliestVersion = j2;
    }

    public /* synthetic */ DataSyncOption(int i, int i2, int i3, int i4, String str, String str2, long j2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? null : str, (i5 & 32) != 0 ? null : str2, (i5 & 64) != 0 ? 0L : j2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataSyncOption(@NotNull Parcel in) {
        this(0, 0, 0, 0, null, null, 0L, 127, null);
        Intrinsics.checkNotNullParameter(in, "in");
        this.syncAction = in.readInt();
        this.syncScope = in.readInt();
        this.syncDataType = in.readInt();
        this.forcePush = in.readInt();
        this.data = in.readString();
        this.ssoid = in.readString();
        this.earliestVersion = in.readLong();
    }
}
