package pantanal.app.groupcard;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R4\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lpantanal/app/groupcard/GroupChildCardDataInfo;", "Landroid/os/Parcelable;", "", "toString", "component1", "component2", "cardIdentity", "uiData", "copy", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "Ljava/lang/String;", "getCardIdentity", "()Ljava/lang/String;", "getUiData", "Landroid/graphics/Bitmap;", "value", "viewScreenshot", "Landroid/graphics/Bitmap;", "getViewScreenshot", "()Landroid/graphics/Bitmap;", "setViewScreenshot", "(Landroid/graphics/Bitmap;)V", "getViewScreenshot$annotations", "()V", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class GroupChildCardDataInfo implements Parcelable {

    @NotNull
    private static final String TAG = "GroupChildCardDataInfo";

    @NotNull
    private final String cardIdentity;

    @Nullable
    private final String uiData;

    @Nullable
    private Bitmap viewScreenshot;

    @NotNull
    public static final Parcelable.Creator<GroupChildCardDataInfo> CREATOR = new b();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<GroupChildCardDataInfo> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GroupChildCardDataInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupChildCardDataInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GroupChildCardDataInfo[] newArray(int i) {
            return new GroupChildCardDataInfo[i];
        }
    }

    public GroupChildCardDataInfo(@NotNull String cardIdentity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(cardIdentity, "cardIdentity");
        this.cardIdentity = cardIdentity;
        this.uiData = str;
    }

    public static /* synthetic */ GroupChildCardDataInfo copy$default(GroupChildCardDataInfo groupChildCardDataInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupChildCardDataInfo.cardIdentity;
        }
        if ((i & 2) != 0) {
            str2 = groupChildCardDataInfo.uiData;
        }
        return groupChildCardDataInfo.copy(str, str2);
    }

    public static /* synthetic */ void getViewScreenshot$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardIdentity() {
        return this.cardIdentity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUiData() {
        return this.uiData;
    }

    @NotNull
    public final GroupChildCardDataInfo copy(@NotNull String cardIdentity, @Nullable String uiData) {
        Intrinsics.checkNotNullParameter(cardIdentity, "cardIdentity");
        return new GroupChildCardDataInfo(cardIdentity, uiData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupChildCardDataInfo)) {
            return false;
        }
        GroupChildCardDataInfo groupChildCardDataInfo = (GroupChildCardDataInfo) other;
        return Intrinsics.areEqual(this.cardIdentity, groupChildCardDataInfo.cardIdentity) && Intrinsics.areEqual(this.uiData, groupChildCardDataInfo.uiData);
    }

    @NotNull
    public final String getCardIdentity() {
        return this.cardIdentity;
    }

    @Nullable
    public final String getUiData() {
        return this.uiData;
    }

    @Nullable
    public final Bitmap getViewScreenshot() {
        return this.viewScreenshot;
    }

    public int hashCode() {
        int iHashCode = this.cardIdentity.hashCode() * 31;
        String str = this.uiData;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setViewScreenshot(@Nullable Bitmap bitmap) {
        bs9.a.a(t6e.INSTANCE, TAG, "set viewScreenShot to " + bitmap, false, null, false, 0, false, null, 252, null);
        Bitmap bitmap2 = this.viewScreenshot;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.viewScreenshot = bitmap;
    }

    @NotNull
    public String toString() {
        String str = this.cardIdentity;
        String str2 = this.uiData;
        return "GroupChildCardDataInfo[cardIdentity:" + str + ",uiDataLength:" + (str2 != null ? Integer.valueOf(str2.length()) : null) + ",viewScreenshot:" + this.viewScreenshot;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.cardIdentity);
        parcel.writeString(this.uiData);
    }

    public /* synthetic */ GroupChildCardDataInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
