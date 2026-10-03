package com.heytap.health.daily.calendar;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.health.daily.bean.DailyActivityCalendarDayBean;
import com.oplus.aiunit.vision.jq2;
import com.oplus.aiunit.vision.qp4;
import java.time.LocalDate;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class CalendarMonthViewModel extends ViewModel {
    public final MutableLiveData<Object> i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jq2 f3840j = new jq2();
    public final MutableLiveData<Map<LocalDate, DailyActivityCalendarDayBean>> k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MutableLiveData<Map<LocalDate, qp4>> f3841l = new MutableLiveData<>();

    public MutableLiveData<Map<LocalDate, DailyActivityCalendarDayBean>> u() {
        return this.k;
    }

    public MutableLiveData<Map<LocalDate, qp4>> v() {
        return this.f3841l;
    }

    public void w(@NonNull String str) {
        this.f3840j.c(str);
    }

    public void x() {
        this.f3840j.a(this.k);
    }

    public void y() {
        this.f3840j.b(this.f3841l);
    }
}
