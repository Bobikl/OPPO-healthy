package com.heytap.databaseengine.apiv3.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.safeparcel.AbstractSafeParcelable;
import com.heytap.databaseengine.safeparcel.SafeParcelReader;
import com.oplus.aiunit.vision.mcg;
import com.oplus.aiunit.vision.me8;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DataPoint extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataPoint> CREATOR = new a();
    private static final String TAG = "DataPoint";
    private DataType dataType;
    private long startTimeStamp;
    private long timeStamp;
    private Value[] values;

    public class a implements Parcelable.Creator<DataPoint> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataPoint createFromParcel(Parcel parcel) {
            return new DataPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataPoint[] newArray(int i) {
            return new DataPoint[i];
        }
    }

    public static class b {
        public final DataPoint a;

        public DataPoint a() {
            return this.a;
        }

        public b b(Element element, float f) {
            this.a.getValue(element).setFloat(f);
            return this;
        }

        public b c(Element element, int i) {
            this.a.getValue(element).setInt(i);
            return this;
        }

        public b d(Element element, String str) {
            this.a.getValue(element).setString(str);
            return this;
        }

        public b e(long j2) {
            this.a.setStartTimeStamp(j2);
            return this;
        }

        public b f(long j2) {
            this.a.setTimeStamp(j2);
            return this;
        }

        public b(DataType dataType) {
            this.a = DataPoint.create(dataType);
        }
    }

    private DataPoint(DataType dataType) {
        this.dataType = dataType;
        List<Element> elements = dataType.getElements();
        this.values = new Value[elements.size()];
        Iterator<Element> it = elements.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.values[i] = new Value(it.next().getFormat());
            i++;
        }
    }

    public static b builder(DataType dataType) {
        return new b(dataType);
    }

    public static DataPoint create(DataType dataType) {
        return new DataPoint(dataType);
    }

    private void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeStamp(long j2) {
        this.startTimeStamp = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(long j2) {
        this.timeStamp = j2;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public Value getValue(Element element) {
        return this.values[getDataType().indexOf(element)];
    }

    public Value[] getValues() {
        return this.values;
    }

    public void setValues(Value[] valueArr) {
        this.values = valueArr;
    }

    @NonNull
    public String toString() {
        return "DataPoint{values=" + Arrays.toString(this.values) + ", dataType=" + this.dataType + ", startTimeStamp=" + this.startTimeStamp + ", timeStamp=" + this.timeStamp + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iP = mcg.p(parcel);
        try {
            mcg.m(parcel, 1, this.values, i, false);
            mcg.b(parcel, 2, this.dataType, i, false);
            mcg.f(parcel, 3, Long.valueOf(this.startTimeStamp));
            mcg.f(parcel, 4, Long.valueOf(this.timeStamp));
        } catch (Exception e2) {
            me8.i("Value", "Error writing field: " + e2);
        }
        mcg.a(parcel, iP);
    }

    public DataPoint(Parcel parcel) {
        int iL = SafeParcelReader.l(parcel);
        while (parcel.dataPosition() < iL) {
            int iG = SafeParcelReader.g(parcel);
            int iA = SafeParcelReader.a(iG);
            if (iA == 1) {
                this.values = (Value[]) SafeParcelReader.n(parcel, iG, Value.CREATOR);
            } else if (iA == 2) {
                this.dataType = (DataType) SafeParcelReader.m(parcel, iG, DataType.CREATOR);
            } else if (iA == 3) {
                this.startTimeStamp = SafeParcelReader.j(parcel, iG);
            } else if (iA != 4) {
                me8.b(TAG, "unknown field id:" + iA);
                SafeParcelReader.r(parcel, iG);
            } else {
                this.timeStamp = SafeParcelReader.j(parcel, iG);
            }
        }
    }
}
