package com.heytap.databaseengine.apiv3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.apiv3.data.DataType;
import com.heytap.databaseengine.safeparcel.AbstractSafeParcelable;
import com.heytap.databaseengine.safeparcel.SafeParcelReader;
import com.oplus.aiunit.vision.mcg;
import com.oplus.aiunit.vision.me8;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DataReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataReadRequest> CREATOR = new a();
    private static final String TAG = "DataReadRequest";
    private DataType dataType;
    private long endTime;
    private long startTime;

    public class a implements Parcelable.Creator<DataReadRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataReadRequest createFromParcel(Parcel parcel) {
            return new DataReadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataReadRequest[] newArray(int i) {
            return new DataReadRequest[i];
        }
    }

    public static class b {
        public static /* bridge */ /* synthetic */ DataType a(b bVar) {
            throw null;
        }

        public static /* bridge */ /* synthetic */ long b(b bVar) {
            throw null;
        }

        public static /* bridge */ /* synthetic */ long c(b bVar) {
            throw null;
        }
    }

    public DataReadRequest(b bVar) {
        this.dataType = b.a(bVar);
        this.startTime = b.c(bVar);
        this.endTime = b.b(bVar);
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iP = mcg.p(parcel);
        try {
            mcg.b(parcel, 1, this.dataType, i, false);
            mcg.f(parcel, 2, Long.valueOf(this.startTime));
            mcg.f(parcel, 3, Long.valueOf(this.endTime));
        } catch (Exception e2) {
            me8.i("Value", "Error writing field: " + e2);
        }
        mcg.a(parcel, iP);
    }

    public DataReadRequest(Parcel parcel) {
        int iL = SafeParcelReader.l(parcel);
        while (parcel.dataPosition() < iL) {
            int iG = SafeParcelReader.g(parcel);
            int iA = SafeParcelReader.a(iG);
            if (iA == 1) {
                this.dataType = (DataType) SafeParcelReader.m(parcel, iG, DataType.CREATOR);
            } else if (iA == 2) {
                this.startTime = SafeParcelReader.j(parcel, iG);
            } else if (iA != 3) {
                me8.b(TAG, "unknown field id:" + iA);
                SafeParcelReader.r(parcel, iG);
            } else {
                this.endTime = SafeParcelReader.j(parcel, iG);
            }
        }
    }
}
