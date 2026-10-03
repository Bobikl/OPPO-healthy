package com.heytap.databaseengine.apiv3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.apiv3.data.DataSet;
import com.heytap.databaseengine.safeparcel.AbstractSafeParcelable;
import com.heytap.databaseengine.safeparcel.SafeParcelReader;
import com.oplus.aiunit.vision.mcg;
import com.oplus.aiunit.vision.me8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DataInsertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataInsertRequest> CREATOR = new a();
    private static final String TAG = "DataInsertRequest";
    private List<DataSet> dataSetList;

    public class a implements Parcelable.Creator<DataInsertRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataInsertRequest createFromParcel(Parcel parcel) {
            return new DataInsertRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataInsertRequest[] newArray(int i) {
            return new DataInsertRequest[i];
        }
    }

    public static class b {
        public static /* bridge */ /* synthetic */ List a(b bVar) {
            throw null;
        }
    }

    public DataInsertRequest(b bVar) {
        this.dataSetList = new ArrayList();
        this.dataSetList = b.a(bVar);
    }

    public List<DataSet> getData() {
        return this.dataSetList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iP = mcg.p(parcel);
        try {
            mcg.h(parcel, 1, this.dataSetList, i, false);
        } catch (Exception e2) {
            me8.i("Value", "Error writing field: " + e2);
        }
        mcg.a(parcel, iP);
    }

    public DataInsertRequest(Parcel parcel) {
        this.dataSetList = new ArrayList();
        int iL = SafeParcelReader.l(parcel);
        while (parcel.dataPosition() < iL) {
            int iG = SafeParcelReader.g(parcel);
            int iA = SafeParcelReader.a(iG);
            if (iA != 1) {
                me8.b(TAG, "unknown field id:" + iA);
                SafeParcelReader.r(parcel, iG);
            } else {
                this.dataSetList = SafeParcelReader.o(parcel, iG, DataSet.CREATOR);
            }
        }
    }
}
