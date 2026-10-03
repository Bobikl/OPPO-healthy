package com.heytap.device.bpg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.store.base.core.util.deeplink.DeepLinkUrlPath;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.List;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\u0006\u0010%\u001a\u00020\u000bJ\u0006\u0010&\u001a\u00020\u000bJ\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020 HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006-"}, d2 = {"Lcom/heytap/device/bpg/StepData;", "Landroid/os/Parcelable;", "topImg", "", "title", "tips", "centerImg", "replace", "", "type", "showButton", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "getCenterImg", "()Ljava/lang/String;", "getReplace", "()Ljava/util/List;", "getShowButton", "()Z", "getTips", "getTitle", "getTopImg", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "isBind", "isSearch", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_third_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StepData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StepData> CREATOR = new a();

    @NotNull
    private final String centerImg;

    @NotNull
    private final List<String> replace;
    private final boolean showButton;

    @NotNull
    private final String tips;

    @NotNull
    private final String title;

    @NotNull
    private final String topImg;

    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StepData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StepData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StepData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StepData[] newArray(int i) {
            return new StepData[i];
        }
    }

    public StepData(@NotNull String topImg, @NotNull String title, @NotNull String tips, @NotNull String centerImg, @NotNull List<String> replace, @NotNull String type, boolean z) {
        Intrinsics.checkNotNullParameter(topImg, "topImg");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(centerImg, "centerImg");
        Intrinsics.checkNotNullParameter(replace, "replace");
        Intrinsics.checkNotNullParameter(type, "type");
        this.topImg = topImg;
        this.title = title;
        this.tips = tips;
        this.centerImg = centerImg;
        this.replace = replace;
        this.type = type;
        this.showButton = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StepData copy$default(StepData stepData, String str, String str2, String str3, String str4, List list, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stepData.topImg;
        }
        if ((i & 2) != 0) {
            str2 = stepData.title;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = stepData.tips;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = stepData.centerImg;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            list = stepData.replace;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            str5 = stepData.type;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            z = stepData.showButton;
        }
        return stepData.copy(str, str6, str7, str8, list2, str9, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopImg() {
        return this.topImg;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCenterImg() {
        return this.centerImg;
    }

    @NotNull
    public final List<String> component5() {
        return this.replace;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowButton() {
        return this.showButton;
    }

    @NotNull
    public final StepData copy(@NotNull String topImg, @NotNull String title, @NotNull String tips, @NotNull String centerImg, @NotNull List<String> replace, @NotNull String type, boolean showButton) {
        Intrinsics.checkNotNullParameter(topImg, "topImg");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(centerImg, "centerImg");
        Intrinsics.checkNotNullParameter(replace, "replace");
        Intrinsics.checkNotNullParameter(type, "type");
        return new StepData(topImg, title, tips, centerImg, replace, type, showButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) other;
        return Intrinsics.areEqual(this.topImg, stepData.topImg) && Intrinsics.areEqual(this.title, stepData.title) && Intrinsics.areEqual(this.tips, stepData.tips) && Intrinsics.areEqual(this.centerImg, stepData.centerImg) && Intrinsics.areEqual(this.replace, stepData.replace) && Intrinsics.areEqual(this.type, stepData.type) && this.showButton == stepData.showButton;
    }

    @NotNull
    public final String getCenterImg() {
        return this.centerImg;
    }

    @NotNull
    public final List<String> getReplace() {
        return this.replace;
    }

    public final boolean getShowButton() {
        return this.showButton;
    }

    @NotNull
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTopImg() {
        return this.topImg;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((((((this.topImg.hashCode() * 31) + this.title.hashCode()) * 31) + this.tips.hashCode()) * 31) + this.centerImg.hashCode()) * 31) + this.replace.hashCode()) * 31) + this.type.hashCode()) * 31;
        boolean z = this.showButton;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final boolean isBind() {
        return Intrinsics.areEqual(this.type, "bind");
    }

    public final boolean isSearch() {
        return Intrinsics.areEqual(this.type, DeepLinkUrlPath.URL_SEARCH);
    }

    @NotNull
    public String toString() {
        return "StepData(topImg=" + this.topImg + ", title=" + this.title + ", tips=" + this.tips + ", centerImg=" + this.centerImg + ", replace=" + this.replace + ", type=" + this.type + ", showButton=" + this.showButton + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.topImg);
        parcel.writeString(this.title);
        parcel.writeString(this.tips);
        parcel.writeString(this.centerImg);
        parcel.writeStringList(this.replace);
        parcel.writeString(this.type);
        parcel.writeInt(this.showButton ? 1 : 0);
    }

    public /* synthetic */ StepData(String str, String str2, String str3, String str4, List list, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, (i & 32) != 0 ? "step" : str5, (i & 64) != 0 ? true : z);
    }
}
