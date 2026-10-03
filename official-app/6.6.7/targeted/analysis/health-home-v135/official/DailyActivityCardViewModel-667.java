package com.heytap.health.daily.viewmodel;

import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.daily.bean.DailyActivityDayBean;
import com.oplus.aiunit.model.iq4;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.p30;
import com.oplus.aiunit.vision.wv8;
import java.time.LocalDate;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
public class DailyActivityCardViewModel extends BaseViewModel {
    public final OLiveData<DailyActivityDayBean> j = new OLiveData<>();
    public final iq4 k = new iq4();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(String str, LocalDate localDate, final DailyActivityDayBean dailyActivityDayBean) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("updateData getTargetStep = ");
        sb.append(dailyActivityDayBean.getTargetStep());
        if (dailyActivityDayBean.getTargetStep() == 0) {
            this.k.b(str, localDate, -3).J(new b24() { // from class: com.oplus.aiunit.vision.kq4
                public final void accept(Object obj) throws Throwable {
                    this.i.z(dailyActivityDayBean, (DailyActivityDayBean) obj);
                }
            }).n0(p30.c()).K0(wv8.c()).c();
        } else {
            this.j.postValue(dailyActivityDayBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(DailyActivityDayBean dailyActivityDayBean, DailyActivityDayBean dailyActivityDayBean2) throws Throwable {
        dailyActivityDayBean.setTargetStep(dailyActivityDayBean2.getTargetStep());
        dailyActivityDayBean.setTargetCalorie(dailyActivityDayBean2.getTargetCalorie());
        dailyActivityDayBean.setTargetActive(dailyActivityDayBean2.getTargetActive());
        dailyActivityDayBean.setTargetTime(dailyActivityDayBean2.getTargetTime());
        this.j.postValue(dailyActivityDayBean);
    }

    public void B(final LocalDate localDate) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateData() called with: date = [");
        sb.append(localDate);
        sb.append("]");
        final String ssoid = cn.c().getSsoid();
        u(this.k.b(ssoid, localDate, fdg.w().z("daily_step_sport_mode", -2)).n0(p30.c()).K0(wv8.c()).a(new b24() { // from class: com.oplus.aiunit.vision.jq4
            public final void accept(Object obj) throws Throwable {
                this.i.A(ssoid, localDate, (DailyActivityDayBean) obj);
            }
        }));
    }

    public OLiveData<DailyActivityDayBean> x() {
        return this.j;
    }

    public DailyActivityDayBean y() {
        return this.k.c();
    }
}