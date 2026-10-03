package com.heytap.databaseengine.model.cervicalspine;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003BA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\tH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\tJ\b\u0010\"\u001a\u00020\u0005H\u0016J\u0019\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/heytap/databaseengine/model/cervicalspine/CervicalSpineAction;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "clientModel", "startTimestamp", "", "detectTypeList", "", "Lcom/heytap/databaseengine/model/cervicalspine/DetectType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDetectTypeList", "()Ljava/util/List;", "setDetectTypeList", "(Ljava/util/List;)V", "describeContents", "", "getEndTimestamp", "getSsoid", "getStartTimestamp", "setSsoid", "", "mSsoid", "setStartTimestamp", "mStartTimestamp", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CervicalSpineAction extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CervicalSpineAction> CREATOR = new a();

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;

    @NotNull
    private List<DetectType> detectTypeList;

    @Nullable
    private String ssoid;
    private long startTimestamp;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CervicalSpineAction> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CervicalSpineAction createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j2 = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DetectType.CREATOR.createFromParcel(parcel));
            }
            return new CervicalSpineAction(string, string2, string3, j2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CervicalSpineAction[] newArray(int i) {
            return new CervicalSpineAction[i];
        }
    }

    public /* synthetic */ CervicalSpineAction(String str, String str2, String str3, long j2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, j2, (i & 16) != 0 ? new ArrayList() : list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    @NotNull
    public final List<DetectType> getDetectTypeList() {
        return this.detectTypeList;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    /* JADX INFO: renamed from: getEndTimestamp, reason: from getter */
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @Nullable
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDetectTypeList(@NotNull List<DetectType> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.detectTypeList = list;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStartTimestamp(long mStartTimestamp) {
        this.startTimestamp = mStartTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "CervicalSpineAction(ssoid=" + this.ssoid + ", dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", startTimestamp=" + this.startTimestamp + ", detectTypeList=" + this.detectTypeList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeLong(this.startTimestamp);
        List<DetectType> list = this.detectTypeList;
        parcel.writeInt(list.size());
        Iterator<DetectType> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public CervicalSpineAction(@Nullable String str, @Nullable String str2, @Nullable String str3, long j2, @NotNull List<DetectType> detectTypeList) {
        Intrinsics.checkNotNullParameter(detectTypeList, "detectTypeList");
        this.ssoid = str;
        this.dataClient = str2;
        this.clientModel = str3;
        this.startTimestamp = j2;
        this.detectTypeList = detectTypeList;
    }

    public CervicalSpineAction() {
        this(null, null, null, 0L, new ArrayList());
    }
}
