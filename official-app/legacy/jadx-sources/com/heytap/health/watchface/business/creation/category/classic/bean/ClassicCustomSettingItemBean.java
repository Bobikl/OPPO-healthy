package com.heytap.health.watchface.business.creation.category.classic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ClassicCustomSettingItemBean extends WatchFaceCustomStyleListItem {
    public static final Parcelable.Creator<ClassicCustomSettingItemBean> CREATOR = new a();
    private List<ClassicWidgetBean> widgets;

    public class a implements Parcelable.Creator<ClassicCustomSettingItemBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassicCustomSettingItemBean createFromParcel(Parcel parcel) {
            return new ClassicCustomSettingItemBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ClassicCustomSettingItemBean[] newArray(int i) {
            return new ClassicCustomSettingItemBean[i];
        }
    }

    public ClassicCustomSettingItemBean() {
        this.widgets = new ArrayList();
    }

    public List<ClassicWidgetBean> getWidgets() {
        return this.widgets;
    }

    public void setWidgets(List<ClassicWidgetBean> list) {
        this.widgets = list;
    }

    @Override // com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.widgets);
    }

    public ClassicCustomSettingItemBean(Parcel parcel) {
        super(parcel);
        ArrayList arrayList = new ArrayList();
        this.widgets = arrayList;
        parcel.readTypedList(arrayList, ClassicWidgetBean.CREATOR);
    }
}
