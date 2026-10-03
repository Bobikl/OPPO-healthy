package com.oplus.aiunit.vision;

import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.settings.me.mine.LastWeekReadStatus;

/* JADX INFO: loaded from: classes17.dex */
public class gql {

    public class a extends u61<LastWeekReadStatus> {
        public final /* synthetic */ MutableLiveData i;

        public a(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            a7b.b("WeeklyReportRepository", "unreadWeeklyCount onFailure");
            this.i.postValue(Boolean.FALSE);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(LastWeekReadStatus lastWeekReadStatus) {
            a7b.f("WeeklyReportRepository", "unreadWeeklyCount onSuccess");
            if (lastWeekReadStatus == null || lastWeekReadStatus.getStatus() != 0) {
                this.i.postValue(Boolean.FALSE);
            } else {
                this.i.postValue(Boolean.TRUE);
            }
        }
    }

    public void a(BaseActivity baseActivity, MutableLiveData<Boolean> mutableLiveData) {
        ((mdd) ((xpl) com.heytap.health.network.core.a.j(xpl.class)).b().L0(su8.c()).d1(l4g.b(baseActivity))).subscribe(new a(mutableLiveData));
    }
}
