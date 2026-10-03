package com.heytap.databaseengine.apiv3.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.safeparcel.AbstractSafeParcelable;
import com.heytap.databaseengine.safeparcel.SafeParcelReader;
import com.oplus.aiunit.vision.mcg;
import com.oplus.aiunit.vision.me8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataSet> CREATOR = new a();
    private static final String TAG = "DataSet";
    private List<DataPoint> dataPoints;
    private DataType dataType;
    private int needSplit;

    public class a implements Parcelable.Creator<DataSet> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataSet createFromParcel(Parcel parcel) {
            return new DataSet(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataSet[] newArray(int i) {
            return new DataSet[i];
        }
    }

    public static class b {
        public final DataSet a;

        public b a(DataPoint dataPoint) {
            this.a.add(dataPoint);
            return this;
        }

        public b b(List<DataPoint> list) {
            this.a.addAll(list);
            return this;
        }

        public DataSet c() {
            return this.a;
        }

        public b(DataType dataType) {
            this.a = DataSet.create(dataType);
        }
    }

    private DataSet(DataType dataType) {
        this.dataPoints = new ArrayList();
        this.dataType = dataType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(DataPoint dataPoint) {
        this.dataPoints.add(dataPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAll(List<DataPoint> list) {
        this.dataPoints.addAll(list);
    }

    public static b builder(DataType dataType) {
        return new b(dataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DataSet create(DataType dataType) {
        return new DataSet(dataType);
    }

    public List<DataPoint> getDataPoints() {
        return this.dataPoints;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public int getNeedSplit() {
        return this.needSplit;
    }

    public void setNeedSplit(int i) {
        this.needSplit = i;
    }

    @NonNull
    public String toString() {
        return "DataSet{dataPoints=" + this.dataPoints + ", dataType=" + this.dataType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iP = mcg.p(parcel);
        try {
            mcg.h(parcel, 1, this.dataPoints, i, false);
            mcg.b(parcel, 2, this.dataType, i, false);
            mcg.e(parcel, 3, Integer.valueOf(this.needSplit));
        } catch (Exception e2) {
            me8.i("Value", "Error writing field: " + e2);
        }
        mcg.a(parcel, iP);
    }

    public DataSet(Parcel parcel) {
        this.dataPoints = new ArrayList();
        int iL = SafeParcelReader.l(parcel);
        while (parcel.dataPosition() < iL) {
            int iG = SafeParcelReader.g(parcel);
            int iA = SafeParcelReader.a(iG);
            if (iA == 1) {
                this.dataPoints = SafeParcelReader.o(parcel, iG, DataPoint.CREATOR);
            } else if (iA == 2) {
                this.dataType = (DataType) SafeParcelReader.m(parcel, iG, DataType.CREATOR);
            } else if (iA != 3) {
                me8.b(TAG, "unknown field id:" + iA);
                SafeParcelReader.r(parcel, iG);
            } else {
                this.needSplit = SafeParcelReader.h(parcel, iG);
            }
        }
    }
}
