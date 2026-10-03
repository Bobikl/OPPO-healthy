package com.heytap.health.settings.watch.schoolmode.bean;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSet;
import com.oplus.aiunit.vision.hig;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SchoolModeConfig {
    private int amEndTime;
    private int amStartTime;
    private boolean enable;
    private int pmEndTime;
    private int pmStartTime;
    private int repeatTime;

    public SchoolModeConfig() {
        this.enable = false;
        this.repeatTime = 31;
        this.amStartTime = 2048;
        this.amEndTime = 3072;
        this.pmStartTime = hig.DEFAULT_PM_START_TIME;
        this.pmEndTime = 4352;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SchoolModeConfig)) {
            return super.equals(obj);
        }
        SchoolModeConfig schoolModeConfig = (SchoolModeConfig) obj;
        return schoolModeConfig.enable == this.enable && schoolModeConfig.repeatTime == this.repeatTime && schoolModeConfig.amStartTime == this.amStartTime && schoolModeConfig.amEndTime == this.amEndTime && schoolModeConfig.pmStartTime == this.pmStartTime && schoolModeConfig.pmEndTime == this.pmEndTime;
    }

    public int getAmEndTime() {
        return this.amEndTime;
    }

    public int getAmStartTime() {
        return this.amStartTime;
    }

    public int getPmEndTime() {
        return this.pmEndTime;
    }

    public int getPmStartTime() {
        return this.pmStartTime;
    }

    public int getRepeatTime() {
        return this.repeatTime;
    }

    public boolean isChanged() {
        return !this.enable && this.repeatTime == 0 && this.amStartTime == 0 && this.amEndTime == 0 && this.pmStartTime == 0 && this.pmEndTime == 0;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setAmEndTime(int i) {
        this.amEndTime = i;
    }

    public void setAmStartTime(int i) {
        this.amStartTime = i;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setPmEndTime(int i) {
        this.pmEndTime = i;
    }

    public void setPmStartTime(int i) {
        this.pmStartTime = i;
    }

    public void setRepeatTime(int i) {
        this.repeatTime = i;
    }

    public String toString() {
        return "SchoolModeConfig{enable=" + this.enable + ", repeatTime=" + this.repeatTime + ", amStartTime=" + this.amStartTime + ", amEndTime=" + this.amEndTime + ", pmStartTime=" + this.pmStartTime + ", pmEndTime=" + this.pmEndTime + '}';
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SchoolModeConfig m4648clone() {
        SchoolModeConfig schoolModeConfig = new SchoolModeConfig();
        schoolModeConfig.setEnable(this.enable);
        schoolModeConfig.setRepeatTime(this.repeatTime);
        schoolModeConfig.setAmStartTime(this.amStartTime);
        schoolModeConfig.setAmEndTime(this.amEndTime);
        schoolModeConfig.setPmStartTime(this.pmStartTime);
        schoolModeConfig.setPmEndTime(this.pmEndTime);
        return schoolModeConfig;
    }

    public SchoolModeConfig(SchoolModeProto$SchoolModeSet schoolModeProto$SchoolModeSet) {
        this.enable = false;
        this.repeatTime = 31;
        this.amStartTime = 2048;
        this.amEndTime = 3072;
        this.pmStartTime = hig.DEFAULT_PM_START_TIME;
        this.pmEndTime = 4352;
        this.enable = schoolModeProto$SchoolModeSet.getEnable() == 1;
        this.repeatTime = schoolModeProto$SchoolModeSet.getRepeatTime();
        this.amStartTime = schoolModeProto$SchoolModeSet.getAmStartTime();
        this.amEndTime = schoolModeProto$SchoolModeSet.getAmEndTime();
        this.pmStartTime = schoolModeProto$SchoolModeSet.getPmStartTime();
        this.pmEndTime = schoolModeProto$SchoolModeSet.getPmEndTime();
    }
}
