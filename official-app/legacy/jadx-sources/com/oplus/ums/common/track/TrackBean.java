package com.oplus.ums.common.track;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006$"}, d2 = {"Lcom/oplus/ums/common/track/TrackBean;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "component1", "component2", "component3", "component4", "id", "tag", "data", "path", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTag", "getData", "getPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "track_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class TrackBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String data;

    @NotNull
    private final String id;

    @NotNull
    private final String path;

    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: com.oplus.ums.common.track.TrackBean$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/ums/common/track/TrackBean$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ums/common/track/TrackBean;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/ums/common/track/TrackBean;", "<init>", "()V", "track_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<TrackBean> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrackBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackBean[] newArray(int size) {
            return new TrackBean[size];
        }
    }

    public TrackBean(@NotNull String id, @NotNull String tag, @NotNull String data, @NotNull String path) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(path, "path");
        this.id = id;
        this.tag = tag;
        this.data = data;
        this.path = path;
    }

    public static /* synthetic */ TrackBean copy$default(TrackBean trackBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackBean.id;
        }
        if ((i & 2) != 0) {
            str2 = trackBean.tag;
        }
        if ((i & 4) != 0) {
            str3 = trackBean.data;
        }
        if ((i & 8) != 0) {
            str4 = trackBean.path;
        }
        return trackBean.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final TrackBean copy(@NotNull String id, @NotNull String tag, @NotNull String data, @NotNull String path) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(path, "path");
        return new TrackBean(id, tag, data, path);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackBean)) {
            return false;
        }
        TrackBean trackBean = (TrackBean) other;
        return Intrinsics.areEqual(this.id, trackBean.id) && Intrinsics.areEqual(this.tag, trackBean.tag) && Intrinsics.areEqual(this.data, trackBean.data) && Intrinsics.areEqual(this.path, trackBean.path);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.tag.hashCode()) * 31) + this.data.hashCode()) * 31) + this.path.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrackBean(id=" + this.id + ", tag=" + this.tag + ", data=" + this.data + ", path=" + this.path + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.tag);
        parcel.writeString(this.data);
        parcel.writeString(this.path);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TrackBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNullExpressionValue(string, "parcel.readString()!!");
        String string2 = parcel.readString();
        string2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str = string3 != null ? string3 : "";
        String string4 = parcel.readString();
        Intrinsics.checkNotNull(string4);
        Intrinsics.checkNotNullExpressionValue(string4, "parcel.readString()!!");
        this(string, string2, str, string4);
    }
}
