package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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

/* JADX INFO: renamed from: com.heytap.databaseengine.model.SleepRRInterval, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B5\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u000bHÖ\u0001J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\u0019\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/heytap/databaseengine/model/SleepRRInterval;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "dataCreatedTimestamp", "", "dataList", "", "", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "describeContents", "getDeviceUniqueId", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepRRIntervalData extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SleepRRIntervalData> CREATOR = new a();

    @NotNull
    private String dataClient;
    private long dataCreatedTimestamp;

    @Nullable
    private List<Integer> dataList;

    @NotNull
    private String ssoid;

    /* JADX INFO: renamed from: com.heytap.databaseengine.model.SleepRRInterval$a */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SleepRRIntervalData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepRRIntervalData createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j2 = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new SleepRRIntervalData(string, string2, j2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepRRIntervalData[] newArray(int i) {
            return new SleepRRIntervalData[i];
        }
    }

    public /* synthetic */ SleepRRIntervalData(String str, String str2, long j2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? null : list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Nullable
    public final List<Integer> getDataList() {
        return this.dataList;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.dataClient;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDataList(@Nullable List<Integer> list) {
        this.dataList = list;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "SleepRRIntervalData(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", dataList=" + this.dataList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeLong(this.dataCreatedTimestamp);
        List<Integer> list = this.dataList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    public SleepRRIntervalData(@NotNull String ssoid, @NotNull String dataClient, long j2, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.dataCreatedTimestamp = j2;
        this.dataList = list;
    }

    public SleepRRIntervalData() {
        this("", "", 0L, null);
    }
}
