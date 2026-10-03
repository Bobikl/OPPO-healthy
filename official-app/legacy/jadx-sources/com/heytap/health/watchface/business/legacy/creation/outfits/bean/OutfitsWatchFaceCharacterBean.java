package com.heytap.health.watchface.business.legacy.creation.outfits.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OutfitsWatchFaceCharacterBean implements Parcelable {
    public static final Parcelable.Creator<OutfitsWatchFaceCharacterBean> CREATOR = new a();
    private List<Integer> mColors;
    private OutfitsWatchFaceBean mOutfitsWatchFaceBean;

    public class a implements Parcelable.Creator<OutfitsWatchFaceCharacterBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OutfitsWatchFaceCharacterBean createFromParcel(Parcel parcel) {
            return new OutfitsWatchFaceCharacterBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OutfitsWatchFaceCharacterBean[] newArray(int i) {
            return new OutfitsWatchFaceCharacterBean[i];
        }
    }

    public OutfitsWatchFaceCharacterBean(List<Integer> list, OutfitsWatchFaceBean outfitsWatchFaceBean) {
        this.mColors = list;
        this.mOutfitsWatchFaceBean = outfitsWatchFaceBean;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Integer> getColors() {
        return this.mColors;
    }

    public OutfitsWatchFaceBean getOutfitsWatchFaceBean() {
        return this.mOutfitsWatchFaceBean;
    }

    public void setColors(List<Integer> list) {
        this.mColors = list;
    }

    public void setOutfitsWatchFaceBean(OutfitsWatchFaceBean outfitsWatchFaceBean) {
        this.mOutfitsWatchFaceBean = outfitsWatchFaceBean;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.mColors);
        parcel.writeParcelable(this.mOutfitsWatchFaceBean, i);
    }

    public OutfitsWatchFaceCharacterBean(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.mColors = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        this.mOutfitsWatchFaceBean = (OutfitsWatchFaceBean) parcel.readParcelable(OutfitsWatchFaceBean.class.getClassLoader());
    }
}
