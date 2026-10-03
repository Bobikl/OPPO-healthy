package com.pantanal.server.content.upkmanage.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b!\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b,\u0010-B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b,\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R$\u0010)\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016¨\u00061"}, d2 = {"Lcom/pantanal/server/content/upkmanage/entity/UpkInfo;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "Landroid/net/Uri;", "copyUri", "Landroid/net/Uri;", "getCopyUri", "()Landroid/net/Uri;", "setCopyUri", "(Landroid/net/Uri;)V", "", "serviceId", "Ljava/lang/String;", "getServiceId", "()Ljava/lang/String;", "setServiceId", "(Ljava/lang/String;)V", "fileHash", "getFileHash", "setFileHash", "packageName", "getPackageName", "setPackageName", Feedback.WIDGET_LABEL, "getLabel", "setLabel", "versionCode", "I", "getVersionCode", "()I", "setVersionCode", "(I)V", "versionName", "getVersionName", "setVersionName", "icons", "getIcons", "setIcons", "<init>", "()V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class UpkInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Uri copyUri;

    @Nullable
    private String fileHash;

    @Nullable
    private String icons;

    @Nullable
    private String label;

    @Nullable
    private String packageName;

    @Nullable
    private String serviceId;
    private int versionCode;

    @Nullable
    private String versionName;

    /* JADX INFO: renamed from: com.pantanal.server.content.upkmanage.entity.UpkInfo$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/pantanal/server/content/upkmanage/entity/UpkInfo$a;", "Landroid/os/Parcelable$Creator;", "Lcom/pantanal/server/content/upkmanage/entity/UpkInfo;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/pantanal/server/content/upkmanage/entity/UpkInfo;", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements Parcelable.Creator<UpkInfo> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UpkInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UpkInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UpkInfo[] newArray(int size) {
            return new UpkInfo[size];
        }
    }

    public UpkInfo() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpkInfo(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.copyUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.serviceId = parcel.readString();
        this.fileHash = parcel.readString();
        this.packageName = parcel.readString();
        this.label = parcel.readString();
        this.versionCode = parcel.readInt();
        this.versionName = parcel.readString();
        this.icons = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Uri getCopyUri() {
        return this.copyUri;
    }

    @Nullable
    public final String getFileHash() {
        return this.fileHash;
    }

    @Nullable
    public final String getIcons() {
        return this.icons;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getServiceId() {
        return this.serviceId;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    public final String getVersionName() {
        return this.versionName;
    }

    public final void setCopyUri(@Nullable Uri uri) {
        this.copyUri = uri;
    }

    public final void setFileHash(@Nullable String str) {
        this.fileHash = str;
    }

    public final void setIcons(@Nullable String str) {
        this.icons = str;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setServiceId(@Nullable String str) {
        this.serviceId = str;
    }

    public final void setVersionCode(int i) {
        this.versionCode = i;
    }

    public final void setVersionName(@Nullable String str) {
        this.versionName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.copyUri, flags);
        parcel.writeString(this.serviceId);
        parcel.writeString(this.fileHash);
        parcel.writeString(this.packageName);
        parcel.writeString(this.label);
        parcel.writeInt(this.versionCode);
        parcel.writeString(this.versionName);
        parcel.writeString(this.icons);
    }
}
