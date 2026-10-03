package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreOsaSummarize;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b2\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B·\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f¢\u0006\u0002\u0010\u001aJ\t\u0010E\u001a\u00020\fHÖ\u0001J\b\u0010F\u001a\u00020\u0005H\u0016J\b\u0010G\u001a\u00020\u0005H\u0016J\u000e\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0005J\b\u0010K\u001a\u00020\u0005H\u0016J\u0019\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\fHÖ\u0001R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0019\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0014\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\u001a\u0010\u0018\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010 \"\u0004\b8\u0010\"R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010\u0012\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010 \"\u0004\bB\u0010\"R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010 \"\u0004\bD\u0010\"¨\u0006P"}, d2 = {"Lcom/heytap/databaseengine/model/snore/SnoreOsaSummarize;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "dataCreatedTimestamp", "", "recordStartTimestamp", "recordEndTimestamp", "resultCode", "", DBSnoreOsaSummarize.AI, "", DBSnoreOsaSummarize.REI, "snoreNum", "validSignalLen", "snoreFreq", "totalSignalLen", "meanRespRate", "snoreFeats", "", "silencedRatio", "silencedTime", "audioStates", "(Ljava/lang/String;Ljava/lang/String;JJJIFFIIFIFLjava/util/List;III)V", "getAi", "()F", "setAi", "(F)V", "getAudioStates", "()I", "setAudioStates", "(I)V", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getMeanRespRate", "setMeanRespRate", "getRecordEndTimestamp", "setRecordEndTimestamp", "getRecordStartTimestamp", "setRecordStartTimestamp", "getRei", "setRei", "getResultCode", "setResultCode", "getSilencedRatio", "setSilencedRatio", "getSilencedTime", "setSilencedTime", "getSnoreFeats", "()Ljava/util/List;", "setSnoreFeats", "(Ljava/util/List;)V", "getSnoreFreq", "setSnoreFreq", "getSnoreNum", "setSnoreNum", "getTotalSignalLen", "setTotalSignalLen", "getValidSignalLen", "setValidSignalLen", "describeContents", "getDeviceUniqueId", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnoreOsaSummarize extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SnoreOsaSummarize> CREATOR = new a();
    private float ai;
    private int audioStates;

    @NotNull
    private String dataClient;
    private long dataCreatedTimestamp;
    private float meanRespRate;
    private long recordEndTimestamp;
    private long recordStartTimestamp;
    private float rei;
    private int resultCode;
    private int silencedRatio;
    private int silencedTime;

    @Nullable
    private List<Float> snoreFeats;
    private float snoreFreq;
    private int snoreNum;

    @NotNull
    private String ssoid;
    private int totalSignalLen;
    private int validSignalLen;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SnoreOsaSummarize> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SnoreOsaSummarize createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            int i = parcel.readInt();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            float f3 = parcel.readFloat();
            int i4 = parcel.readInt();
            float f4 = parcel.readFloat();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int i6 = 0;
                while (i6 != i5) {
                    arrayList2.add(Float.valueOf(parcel.readFloat()));
                    i6++;
                    i5 = i5;
                }
                arrayList = arrayList2;
            }
            return new SnoreOsaSummarize(string, string2, j2, j3, j4, i, f, f2, i2, i3, f3, i4, f4, arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SnoreOsaSummarize[] newArray(int i) {
            return new SnoreOsaSummarize[i];
        }
    }

    public /* synthetic */ SnoreOsaSummarize(String str, String str2, long j2, long j3, long j4, int i, float f, float f2, int i2, int i3, float f3, int i4, float f4, List list, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) == 0 ? str2 : "", (i8 & 4) != 0 ? 0L : j2, (i8 & 8) != 0 ? 0L : j3, (i8 & 16) == 0 ? j4 : 0L, (i8 & 32) != 0 ? 0 : i, (i8 & 64) != 0 ? 0.0f : f, (i8 & 128) != 0 ? 0.0f : f2, (i8 & 256) != 0 ? 0 : i2, (i8 & 512) != 0 ? 0 : i3, (i8 & 1024) != 0 ? 0.0f : f3, (i8 & 2048) != 0 ? 0 : i4, (i8 & 4096) != 0 ? 0.0f : f4, (i8 & 8192) != 0 ? null : list, (i8 & 16384) != 0 ? 0 : i5, (i8 & 32768) != 0 ? 0 : i6, (i8 & 65536) != 0 ? 0 : i7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final float getAi() {
        return this.ai;
    }

    public final int getAudioStates() {
        return this.audioStates;
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

    public final float getMeanRespRate() {
        return this.meanRespRate;
    }

    public final long getRecordEndTimestamp() {
        return this.recordEndTimestamp;
    }

    public final long getRecordStartTimestamp() {
        return this.recordStartTimestamp;
    }

    public final float getRei() {
        return this.rei;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final int getSilencedRatio() {
        return this.silencedRatio;
    }

    public final int getSilencedTime() {
        return this.silencedTime;
    }

    @Nullable
    public final List<Float> getSnoreFeats() {
        return this.snoreFeats;
    }

    public final float getSnoreFreq() {
        return this.snoreFreq;
    }

    public final int getSnoreNum() {
        return this.snoreNum;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getTotalSignalLen() {
        return this.totalSignalLen;
    }

    public final int getValidSignalLen() {
        return this.validSignalLen;
    }

    public final void setAi(float f) {
        this.ai = f;
    }

    public final void setAudioStates(int i) {
        this.audioStates = i;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setMeanRespRate(float f) {
        this.meanRespRate = f;
    }

    public final void setRecordEndTimestamp(long j2) {
        this.recordEndTimestamp = j2;
    }

    public final void setRecordStartTimestamp(long j2) {
        this.recordStartTimestamp = j2;
    }

    public final void setRei(float f) {
        this.rei = f;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    public final void setSilencedRatio(int i) {
        this.silencedRatio = i;
    }

    public final void setSilencedTime(int i) {
        this.silencedTime = i;
    }

    public final void setSnoreFeats(@Nullable List<Float> list) {
        this.snoreFeats = list;
    }

    public final void setSnoreFreq(float f) {
        this.snoreFreq = f;
    }

    public final void setSnoreNum(int i) {
        this.snoreNum = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setTotalSignalLen(int i) {
        this.totalSignalLen = i;
    }

    public final void setValidSignalLen(int i) {
        this.validSignalLen = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "SnoreOsaSummarize(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", resultCode=" + this.resultCode + ", ai=" + this.ai + ", rei=" + this.rei + ", snoreNum=" + this.snoreNum + ", validSignalLen=" + this.validSignalLen + ", snoreFreq=" + this.snoreFreq + ", totalSignalLen=" + this.totalSignalLen + ", meanRespRate=" + this.meanRespRate + ", snoreFeats=" + this.snoreFeats + ", silencedRatio=" + this.silencedRatio + ", silencedTime=" + this.silencedTime + ", audioStates=" + this.audioStates + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeLong(this.recordStartTimestamp);
        parcel.writeLong(this.recordEndTimestamp);
        parcel.writeInt(this.resultCode);
        parcel.writeFloat(this.ai);
        parcel.writeFloat(this.rei);
        parcel.writeInt(this.snoreNum);
        parcel.writeInt(this.validSignalLen);
        parcel.writeFloat(this.snoreFreq);
        parcel.writeInt(this.totalSignalLen);
        parcel.writeFloat(this.meanRespRate);
        List<Float> list = this.snoreFeats;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Float> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeFloat(it.next().floatValue());
            }
        }
        parcel.writeInt(this.silencedRatio);
        parcel.writeInt(this.silencedTime);
        parcel.writeInt(this.audioStates);
    }

    public SnoreOsaSummarize(@NotNull String ssoid, @NotNull String dataClient, long j2, long j3, long j4, int i, float f, float f2, int i2, int i3, float f3, int i4, float f4, @Nullable List<Float> list, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.dataCreatedTimestamp = j2;
        this.recordStartTimestamp = j3;
        this.recordEndTimestamp = j4;
        this.resultCode = i;
        this.ai = f;
        this.rei = f2;
        this.snoreNum = i2;
        this.validSignalLen = i3;
        this.snoreFreq = f3;
        this.totalSignalLen = i4;
        this.meanRespRate = f4;
        this.snoreFeats = list;
        this.silencedRatio = i5;
        this.silencedTime = i6;
        this.audioStates = i7;
    }

    public SnoreOsaSummarize() {
        this("", "", 0L, 0L, 0L, 0, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0.0f, null, 0, 0, 0);
    }
}
