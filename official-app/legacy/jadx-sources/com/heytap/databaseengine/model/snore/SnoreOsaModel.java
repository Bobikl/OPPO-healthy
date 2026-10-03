package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003Bg\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\t\u0010+\u001a\u00020\fHÖ\u0001J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005J\b\u00101\u001a\u00020\u0005H\u0016J\u0019\u00102\u001a\u00020/2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\fHÖ\u0001R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016¨\u00066"}, d2 = {"Lcom/heytap/databaseengine/model/snore/SnoreOsaModel;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "dataCreatedTimestamp", "", "recordStartTimestamp", "recordEndTimestamp", "totalSignalLen", "", "curFrameSnoreNum", "lastFrameSnoreNum", "features", "", "", "(Ljava/lang/String;Ljava/lang/String;JJJIIILjava/util/List;)V", "getCurFrameSnoreNum", "()I", "setCurFrameSnoreNum", "(I)V", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getFeatures", "()Ljava/util/List;", "setFeatures", "(Ljava/util/List;)V", "getLastFrameSnoreNum", "setLastFrameSnoreNum", "getRecordEndTimestamp", "setRecordEndTimestamp", "getRecordStartTimestamp", "setRecordStartTimestamp", "getTotalSignalLen", "setTotalSignalLen", "describeContents", "getDeviceUniqueId", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnoreOsaModel extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SnoreOsaModel> CREATOR = new a();
    private int curFrameSnoreNum;

    @NotNull
    private String dataClient;
    private long dataCreatedTimestamp;

    @Nullable
    private List<Float> features;
    private int lastFrameSnoreNum;
    private long recordEndTimestamp;
    private long recordStartTimestamp;

    @NotNull
    private String ssoid;
    private int totalSignalLen;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SnoreOsaModel> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SnoreOsaModel createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(Float.valueOf(parcel.readFloat()));
                }
                arrayList = arrayList2;
            }
            return new SnoreOsaModel(string, string2, j2, j3, j4, i, i2, i3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SnoreOsaModel[] newArray(int i) {
            return new SnoreOsaModel[i];
        }
    }

    public /* synthetic */ SnoreOsaModel(String str, String str2, long j2, long j3, long j4, int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) == 0 ? str2 : "", (i4 & 4) != 0 ? 0L : j2, (i4 & 8) != 0 ? 0L : j3, (i4 & 16) == 0 ? j4 : 0L, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) == 0 ? i3 : 0, (i4 & 256) != 0 ? null : list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getCurFrameSnoreNum() {
        return this.curFrameSnoreNum;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.dataClient;
    }

    @Nullable
    public final List<Float> getFeatures() {
        return this.features;
    }

    public final int getLastFrameSnoreNum() {
        return this.lastFrameSnoreNum;
    }

    public final long getRecordEndTimestamp() {
        return this.recordEndTimestamp;
    }

    public final long getRecordStartTimestamp() {
        return this.recordStartTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getTotalSignalLen() {
        return this.totalSignalLen;
    }

    public final void setCurFrameSnoreNum(int i) {
        this.curFrameSnoreNum = i;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setFeatures(@Nullable List<Float> list) {
        this.features = list;
    }

    public final void setLastFrameSnoreNum(int i) {
        this.lastFrameSnoreNum = i;
    }

    public final void setRecordEndTimestamp(long j2) {
        this.recordEndTimestamp = j2;
    }

    public final void setRecordStartTimestamp(long j2) {
        this.recordStartTimestamp = j2;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setTotalSignalLen(int i) {
        this.totalSignalLen = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "SnoreOsaModel(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", totalSignalLen=" + this.totalSignalLen + ", curFrameSnoreNum=" + this.curFrameSnoreNum + ", lastFrameSnoreNum=" + this.lastFrameSnoreNum + ", features=" + this.features + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeLong(this.recordStartTimestamp);
        parcel.writeLong(this.recordEndTimestamp);
        parcel.writeInt(this.totalSignalLen);
        parcel.writeInt(this.curFrameSnoreNum);
        parcel.writeInt(this.lastFrameSnoreNum);
        List<Float> list = this.features;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Float> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeFloat(it.next().floatValue());
        }
    }

    public SnoreOsaModel(@NotNull String ssoid, @NotNull String dataClient, long j2, long j3, long j4, int i, int i2, int i3, @Nullable List<Float> list) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.dataCreatedTimestamp = j2;
        this.recordStartTimestamp = j3;
        this.recordEndTimestamp = j4;
        this.totalSignalLen = i;
        this.curFrameSnoreNum = i2;
        this.lastFrameSnoreNum = i3;
        this.features = list;
    }

    public SnoreOsaModel() {
        this("", "", 0L, 0L, 0L, 0, 0, 0, null);
    }
}
