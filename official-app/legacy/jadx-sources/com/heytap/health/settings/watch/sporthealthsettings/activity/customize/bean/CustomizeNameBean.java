package com.heytap.health.settings.watch.sporthealthsettings.activity.customize.bean;

import androidx.annotation.NonNull;
import com.heytap.health.protocol.workout.WorkoutProto$CustomSports;
import com.heytap.health.protocol.workout.WorkoutProto$SportsDataItem;
import com.heytap.health.protocol.workout.WorkoutProto$SportsPageData;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class CustomizeNameBean implements Serializable {
    public static final int TYPE_EMPTY = 1;
    List<CustomizeBean> customizeBeans;
    int dataType;
    String mac;
    int maxSelect;
    String name;

    @NonNull
    String ssid;
    int style;
    int type;

    public CustomizeNameBean(String str) {
        this.ssid = str;
    }

    public List<CustomizeBean> getCustomizeBeans() {
        return this.customizeBeans;
    }

    public int getDataType() {
        return this.dataType;
    }

    public String getMac() {
        return this.mac;
    }

    public int getMaxSelect() {
        return this.maxSelect;
    }

    public String getName() {
        return this.name;
    }

    public String getSsid() {
        return this.ssid;
    }

    public int getStyle() {
        return this.style;
    }

    public int getType() {
        return this.type;
    }

    public boolean isEmpty() {
        return this.type == 1;
    }

    public void setCustomizeBeans(List<CustomizeBean> list) {
        this.customizeBeans = list;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setMaxSelect(int i) {
        this.maxSelect = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public WorkoutProto$CustomSports toPb() {
        WorkoutProto$CustomSports.Builder sportCategory = WorkoutProto$CustomSports.newBuilder().setId(getSsid()).setName(getName()).setSportCategory(getStyle());
        for (CustomizeBean customizeBean : getCustomizeBeans()) {
            WorkoutProto$SportsPageData.Builder pageNum = WorkoutProto$SportsPageData.newBuilder().setPageNum(customizeBean.getIndex());
            for (CustomizeDataBean customizeDataBean : customizeBean.getCustomizeDataBeans()) {
                if (customizeDataBean.isAdd()) {
                    pageNum.addDataItem(WorkoutProto$SportsDataItem.newBuilder().setName(customizeDataBean.getName()).setType(customizeDataBean.getType()).build());
                }
            }
            sportCategory.addSlectedData(pageNum.build());
        }
        return sportCategory.build();
    }

    public String toString() {
        return "CustomizeNameBean{ssid='" + this.ssid + "', name='" + this.name + "', style=" + this.style + ", customizeBeans=" + this.customizeBeans + ", mac='" + this.mac + "', maxSelect=" + this.maxSelect + '}';
    }
}
