package com.xingin.xhssharesdk.model.sharedata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public class XhsImageInfo implements Parcelable {
    public static final Parcelable.Creator<XhsImageInfo> CREATOR = new a();

    @NonNull
    private final List<XhsImageResourceBean> imageResourceList;

    public class a implements Parcelable.Creator<XhsImageInfo> {
        @Override // android.os.Parcelable.Creator
        public final XhsImageInfo createFromParcel(Parcel parcel) {
            return new XhsImageInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final XhsImageInfo[] newArray(int i) {
            return new XhsImageInfo[i];
        }
    }

    public XhsImageInfo(Parcel parcel) {
        this.imageResourceList = parcel.createTypedArrayList(XhsImageResourceBean.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public List<XhsImageResourceBean> getImageResourceList() {
        return this.imageResourceList;
    }

    public boolean isValid() {
        return !this.imageResourceList.isEmpty();
    }

    public JSONArray toJsonForDeeplink() {
        JSONArray jSONArray = new JSONArray();
        Iterator<XhsImageResourceBean> it = this.imageResourceList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJsonForDeeplink());
        }
        return jSONArray;
    }

    public String toString() {
        return "XhsImageInfo{imageInfoList=" + this.imageResourceList + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeTypedList(this.imageResourceList);
    }

    public XhsImageInfo(@NonNull List<XhsImageResourceBean> list) {
        this.imageResourceList = list;
    }
}
