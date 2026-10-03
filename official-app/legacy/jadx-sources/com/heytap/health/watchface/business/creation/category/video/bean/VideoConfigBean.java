package com.heytap.health.watchface.business.creation.category.video.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.health.watchface.business.creation.category.video.VideoCustomPresenter;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/bean/VideoConfigBean;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "", "other", "", "equals", "hashCode", VideoCustomPresenter.INDEX_TIME_STYLE, "I", "getTimeStyle", "()I", "setTimeStyle", "(I)V", "playType", "getPlayType", "setPlayType", "", "timeColor", "Ljava/lang/String;", "getTimeColor", "()Ljava/lang/String;", "setTimeColor", "(Ljava/lang/String;)V", "<init>", "()V", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class VideoConfigBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int playType;

    @NotNull
    private String timeColor;
    private int timeStyle;

    /* JADX INFO: renamed from: com.heytap.health.watchface.business.creation.category.video.bean.VideoConfigBean$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/bean/VideoConfigBean$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/health/watchface/business/creation/category/video/bean/VideoConfigBean;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/health/watchface/business/creation/category/video/bean/VideoConfigBean;", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<VideoConfigBean> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VideoConfigBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VideoConfigBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VideoConfigBean[] newArray(int size) {
            return new VideoConfigBean[size];
        }
    }

    public VideoConfigBean() {
        this.timeColor = "#FFFFFFFF";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(VideoConfigBean.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.watchface.business.creation.category.video.bean.VideoConfigBean");
        VideoConfigBean videoConfigBean = (VideoConfigBean) other;
        return this.timeStyle == videoConfigBean.timeStyle && this.playType == videoConfigBean.playType && Intrinsics.areEqual(this.timeColor, videoConfigBean.timeColor);
    }

    public final int getPlayType() {
        return this.playType;
    }

    @NotNull
    public final String getTimeColor() {
        return this.timeColor;
    }

    public final int getTimeStyle() {
        return this.timeStyle;
    }

    public int hashCode() {
        return (((this.timeStyle * 31) + this.playType) * 31) + this.timeColor.hashCode();
    }

    public final void setPlayType(int i) {
        this.playType = i;
    }

    public final void setTimeColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeColor = str;
    }

    public final void setTimeStyle(int i) {
        this.timeStyle = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.timeStyle);
        dest.writeInt(this.playType);
        dest.writeString(this.timeColor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoConfigBean(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.timeStyle = parcel.readInt();
        this.playType = parcel.readInt();
        String string = parcel.readString();
        this.timeColor = string == null ? "#FFFFFFFF" : string;
    }
}
