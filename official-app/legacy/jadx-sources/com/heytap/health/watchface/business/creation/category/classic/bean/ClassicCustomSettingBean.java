package com.heytap.health.watchface.business.creation.category.classic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ClassicCustomSettingBean extends WatchFaceCustomStyleListBean<ClassicCustomSettingItemBean> {
    public static final Parcelable.Creator<ClassicCustomSettingBean> CREATOR = new a();
    protected String bgColorStr;

    @SerializedName("options")
    private List<ClassicCustomSettingItemBean> optionsList;

    public class a implements Parcelable.Creator<ClassicCustomSettingBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassicCustomSettingBean createFromParcel(Parcel parcel) {
            return new ClassicCustomSettingBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ClassicCustomSettingBean[] newArray(int i) {
            return new ClassicCustomSettingBean[i];
        }
    }

    public ClassicCustomSettingBean() {
        this.optionsList = new ArrayList();
    }

    @Override // com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListBean, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBgColorStr() {
        return this.bgColorStr;
    }

    public List<ClassicCustomSettingItemBean> getOptionsList() {
        return this.optionsList;
    }

    public void setBgColorStr(String str) {
        this.bgColorStr = str;
    }

    public void setOptionsList(List<ClassicCustomSettingItemBean> list) {
        this.optionsList = list;
    }

    @Override // com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.bgColorStr);
        parcel.writeTypedList(this.optionsList);
    }

    public ClassicCustomSettingBean(Parcel parcel) {
        super(parcel);
        this.optionsList = new ArrayList();
        this.bgColorStr = parcel.readString();
        parcel.readTypedList(this.optionsList, ClassicCustomSettingItemBean.CREATOR);
    }
}
