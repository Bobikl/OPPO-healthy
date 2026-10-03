package com.oplus.ocs.wearengine.p2pclient.file;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.ebe;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001)B+\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b$\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001d¨\u0006*"}, d2 = {"Lcom/oplus/ocs/wearengine/p2pclient/file/SendFileRequest;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "", "component1", "component2", "component3", "component4", "requestPackageName", ebe.TARGET_PACKAGE_NAME, "filePath", "fileInfo", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getRequestPackageName", "()Ljava/lang/String;", "setRequestPackageName", "(Ljava/lang/String;)V", "getTargetPackageName", "setTargetPackageName", "getFilePath", "setFilePath", "getFileInfo", "setFileInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SendFileRequest implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String fileInfo;

    @Nullable
    private String filePath;

    @NotNull
    private String requestPackageName;

    @NotNull
    private String targetPackageName;

    /* JADX INFO: renamed from: com.oplus.ocs.wearengine.p2pclient.file.SendFileRequest$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/ocs/wearengine/p2pclient/file/SendFileRequest$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/p2pclient/file/SendFileRequest;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/p2pclient/file/SendFileRequest;", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<SendFileRequest> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SendFileRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SendFileRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SendFileRequest[] newArray(int size) {
            return new SendFileRequest[size];
        }
    }

    public SendFileRequest(@NotNull String requestPackageName, @NotNull String targetPackageName, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(requestPackageName, "requestPackageName");
        Intrinsics.checkNotNullParameter(targetPackageName, "targetPackageName");
        this.requestPackageName = requestPackageName;
        this.targetPackageName = targetPackageName;
        this.filePath = str;
        this.fileInfo = str2;
    }

    public static /* synthetic */ SendFileRequest copy$default(SendFileRequest sendFileRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendFileRequest.requestPackageName;
        }
        if ((i & 2) != 0) {
            str2 = sendFileRequest.targetPackageName;
        }
        if ((i & 4) != 0) {
            str3 = sendFileRequest.filePath;
        }
        if ((i & 8) != 0) {
            str4 = sendFileRequest.fileInfo;
        }
        return sendFileRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestPackageName() {
        return this.requestPackageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTargetPackageName() {
        return this.targetPackageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileInfo() {
        return this.fileInfo;
    }

    @NotNull
    public final SendFileRequest copy(@NotNull String requestPackageName, @NotNull String targetPackageName, @Nullable String filePath, @Nullable String fileInfo) {
        Intrinsics.checkNotNullParameter(requestPackageName, "requestPackageName");
        Intrinsics.checkNotNullParameter(targetPackageName, "targetPackageName");
        return new SendFileRequest(requestPackageName, targetPackageName, filePath, fileInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendFileRequest)) {
            return false;
        }
        SendFileRequest sendFileRequest = (SendFileRequest) other;
        return Intrinsics.areEqual(this.requestPackageName, sendFileRequest.requestPackageName) && Intrinsics.areEqual(this.targetPackageName, sendFileRequest.targetPackageName) && Intrinsics.areEqual(this.filePath, sendFileRequest.filePath) && Intrinsics.areEqual(this.fileInfo, sendFileRequest.fileInfo);
    }

    @Nullable
    public final String getFileInfo() {
        return this.fileInfo;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final String getRequestPackageName() {
        return this.requestPackageName;
    }

    @NotNull
    public final String getTargetPackageName() {
        return this.targetPackageName;
    }

    public int hashCode() {
        int iHashCode = ((this.requestPackageName.hashCode() * 31) + this.targetPackageName.hashCode()) * 31;
        String str = this.filePath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileInfo;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setFileInfo(@Nullable String str) {
        this.fileInfo = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setRequestPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requestPackageName = str;
    }

    public final void setTargetPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetPackageName = str;
    }

    @NotNull
    public String toString() {
        return "SendFileRequest(requestPackageName=" + this.requestPackageName + ", targetPackageName=" + this.targetPackageName + ", filePath=" + this.filePath + ", fileInfo=" + this.fileInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.requestPackageName);
        dest.writeString(this.targetPackageName);
        dest.writeString(this.filePath);
        dest.writeString(this.fileInfo);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SendFileRequest(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        String string2 = parcel.readString();
        Intrinsics.checkNotNull(string2);
        this(string, string2, parcel.readString(), parcel.readString());
    }
}
