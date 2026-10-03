package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.aiunit.vision.d14;
import com.oplus.statistics.DataTypeConstants;
import com.oplus.statistics.util.VersionUtil;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class PeriodDataBean extends CommonBean {
    public final int l;

    public PeriodDataBean(Context context, String str, String str2, String str3) {
        super(context, str, str2);
        int i = VersionUtil.isSupportPeriodData(context) ? DataTypeConstants.PERIOD_DATA : 1006;
        this.l = i;
        b("dataType", i);
        setLogMap(str3);
    }

    @Override // com.oplus.statistics.data.CommonBean, com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return this.l;
    }

    @Override // com.oplus.statistics.data.CommonBean
    public String toString() {
        return " type is :" + getEventType() + d14.COMMA_REGEX + " tag is :" + getLogTag() + d14.COMMA_REGEX + " eventID is :" + getEventID() + d14.COMMA_REGEX + " map is :" + getLogMap();
    }

    public PeriodDataBean(Context context) {
        super(context);
        int i = VersionUtil.isSupportPeriodData(context) ? DataTypeConstants.PERIOD_DATA : 1006;
        this.l = i;
        b("dataType", i);
    }
}
