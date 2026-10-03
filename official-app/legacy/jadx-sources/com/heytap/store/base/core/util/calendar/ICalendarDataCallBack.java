package com.heytap.store.base.core.util.calendar;

import com.heytap.store.base.core.util.calendar.bean.CalendarBean;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ICalendarDataCallBack {
    void onFail(int i, String str);

    void onSuccess(List<CalendarBean> list);
}
