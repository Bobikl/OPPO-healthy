package com.heytap.health.health.familymode.response;

import androidx.annotation.Keep;
import com.heytap.health.health.familymode.request.FamilyBloodOxygenWarningRecord;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DailyBloodOxygenData {
    private List<FamilyBloodOxygenWarningRecord> bloodOxygenWarningRecordList;
    private int maxBloodOxygenSaturation;
    private int minBloodOxygenSaturation;

    public List<FamilyBloodOxygenWarningRecord> getBloodOxygenWarningRecordList() {
        return this.bloodOxygenWarningRecordList;
    }

    public int getMaxBloodOxygenSaturation() {
        return this.maxBloodOxygenSaturation;
    }

    public int getMinBloodOxygenSaturation() {
        return this.minBloodOxygenSaturation;
    }

    public String toString() {
        return "DailyBloodOxygenData{minBloodOxygenSaturation=" + this.minBloodOxygenSaturation + ", maxBloodOxygenSaturation=" + this.maxBloodOxygenSaturation + ", bloodOxygenWarningRecordList=" + this.bloodOxygenWarningRecordList + '}';
    }
}
