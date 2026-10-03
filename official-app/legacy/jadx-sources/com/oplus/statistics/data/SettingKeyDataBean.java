package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.aiunit.vision.y15;
import com.oplus.statistics.agent.StaticPeriodDataRecord;
import com.oplus.statistics.util.VersionUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SettingKeyDataBean extends CommonBean {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20115l;

    public SettingKeyDataBean(Context context, String str, String str2, String str3) {
        super(context, str, str2);
        int i = VersionUtil.isSupportPeriodData(context) ? 1020 : 1006;
        this.f20115l = i;
        b(y15.PARAMS_DATA_TYPE, i);
        setLogMap(str3);
    }

    @Override // com.oplus.statistics.data.CommonBean, com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return this.f20115l;
    }

    public void setLogMap(List<SettingKeyBean> list) {
        super.setLogMap(StaticPeriodDataRecord.list2JsonObject(list).toString());
    }

    @Override // com.oplus.statistics.data.CommonBean
    public String toString() {
        return " type is :" + getEventType() + ", tag is :" + getLogTag() + ", eventID is :" + getEventID() + ", map is :" + getLogMap();
    }

    public SettingKeyDataBean(Context context) {
        super(context);
        int i = VersionUtil.isSupportPeriodData(context) ? 1020 : 1006;
        this.f20115l = i;
        b(y15.PARAMS_DATA_TYPE, i);
    }
}
