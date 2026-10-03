package com.heytap.databaseengine.option;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.databaseengine.model.SportHealthData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class DataInsertOption implements Parcelable {
    public static final Parcelable.Creator<DataInsertOption> CREATOR = new a();
    private int dataTable;
    private List<SportHealthData> datas;

    public class a implements Parcelable.Creator<DataInsertOption> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataInsertOption createFromParcel(Parcel parcel) {
            return new DataInsertOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataInsertOption[] newArray(int i) {
            return new DataInsertOption[i];
        }
    }

    public DataInsertOption() {
        this.datas = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDataTable() {
        return this.dataTable;
    }

    public List<SportHealthData> getDatas() {
        return this.datas;
    }

    public void setDataTable(int i) {
        this.dataTable = i;
    }

    public void setDatas(List<SportHealthData> list) {
        this.datas = list;
    }

    public String toString() {
        return "DataInsertOption{datas=" + this.datas + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.datas);
        parcel.writeInt(this.dataTable);
    }

    public DataInsertOption(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.datas = arrayList;
        parcel.readList(arrayList, SportHealthData.class.getClassLoader());
        this.dataTable = parcel.readInt();
    }
}
