package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.aiunit.vision.d14;
import com.oplus.statistics.DataTypeConstants;
import com.oplus.statistics.agent.StaticPeriodDataRecord;
import com.oplus.statistics.util.VersionUtil;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SettingKeyDataBean extends CommonBean {
    public final int l;

    public SettingKeyDataBean(Context context, String str, String str2, String str3) {
        super(context, str, str2);
        int i = VersionUtil.isSupportPeriodData(context) ? DataTypeConstants.SETTING_KEY : 1006;
        this.l = i;
        b("dataType", i);
        setLogMap(str3);
    }

    @Override // com.oplus.statistics.data.CommonBean, com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return this.l;
    }

    public void setLogMap(List<SettingKeyBean> list) {
        super.setLogMap(StaticPeriodDataRecord.list2JsonObject(list).toString());
    }

    @Override // com.oplus.statistics.data.CommonBean
    public String toString() {
        return " type is :" + getEventType() + d14.COMMA_REGEX + " tag is :" + getLogTag() + d14.COMMA_REGEX + " eventID is :" + getEventID() + d14.COMMA_REGEX + " map is :" + getLogMap();
    }

    public SettingKeyDataBean(Context context) {
        super(context);
        int i = VersionUtil.isSupportPeriodData(context) ? DataTypeConstants.SETTING_KEY : 1006;
        this.l = i;
        b("dataType", i);
    }
}
