package com.heytap.wallet.business.bus.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.heytap.health.wallet.model.NfcCardDetail;
import com.oplus.aiunit.vision.e1j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class SearchCardBean implements Comparable<SearchCardBean>, Parcelable {
    public static final Parcelable.Creator<SearchCardBean> CREATOR = new a();
    private String matchPin;
    private String namePinYin;
    private ArrayList<String> namePinyinList;
    private NfcCardDetail nfcCardDetail;
    private String pinyinFirst;

    public class a implements Parcelable.Creator<SearchCardBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SearchCardBean createFromParcel(Parcel parcel) {
            return new SearchCardBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SearchCardBean[] newArray(int i) {
            return new SearchCardBean[i];
        }
    }

    public SearchCardBean() {
        this.matchPin = "";
        this.namePinYin = "";
        this.namePinyinList = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getMatchPin() {
        return this.matchPin;
    }

    public String getNamePinYin() {
        return this.namePinYin;
    }

    public ArrayList<String> getNamePinyinList() {
        return this.namePinyinList;
    }

    public NfcCardDetail getNfcCardDetail() {
        return this.nfcCardDetail;
    }

    public String getPinyinFirst() {
        return this.pinyinFirst;
    }

    public void setMatchPin(String str) {
        this.matchPin = str;
    }

    public void setNamePinYin(String str) {
        this.namePinYin = str;
    }

    public void setNfcCardDetail(NfcCardDetail nfcCardDetail) {
        this.nfcCardDetail = nfcCardDetail;
    }

    public void setPinyinFirst(String str) {
        this.pinyinFirst = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.nfcCardDetail, i);
        parcel.writeString(this.pinyinFirst);
        parcel.writeString(this.matchPin);
        parcel.writeString(this.namePinYin);
        parcel.writeStringList(this.namePinyinList);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull SearchCardBean searchCardBean) {
        return e1j.s(this.nfcCardDetail.getAppCode()) - e1j.s(searchCardBean.nfcCardDetail.getAppCode());
    }

    public SearchCardBean(Parcel parcel) {
        this.matchPin = "";
        this.namePinYin = "";
        this.namePinyinList = new ArrayList<>();
        this.nfcCardDetail = (NfcCardDetail) parcel.readParcelable(NfcCardDetail.class.getClassLoader());
        this.pinyinFirst = parcel.readString();
        this.matchPin = parcel.readString();
        this.namePinYin = parcel.readString();
        this.namePinyinList = parcel.createStringArrayList();
    }
}
