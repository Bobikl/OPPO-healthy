package com.oplus.aiunit.vision;

import android.content.ContentValues;
import androidx.lifecycle.MutableLiveData;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import com.heytap.health.devicemanager.api.WatchPairService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class wri {
    public String a = "8000";

    public class a extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f18376j;

        public a(MutableLiveData mutableLiveData) {
            this.f18376j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            if (commonBackBean.getErrorCode() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("queryStepGoal error ");
                sb.append(commonBackBean.getErrorCode());
            } else if (commonBackBean.getObj() != null) {
                ArrayList arrayList = (ArrayList) commonBackBean.getObj();
                if (arrayList.get(0) != null) {
                    UserGoalInfo userGoalInfo = (UserGoalInfo) arrayList.get(0);
                    wri.this.a = userGoalInfo.getValue();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("queryStepGoal Success:");
                    sb2.append(wri.this.a);
                }
            }
            this.f18376j.postValue(wri.this.a);
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            super.onError(th);
            a7b.b("StepGoalRepository", "obtain queryStepGoal error, msg : " + th.getMessage());
            this.f18376j.postValue(wri.this.a);
        }
    }

    public class b extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f18377j;
        public final /* synthetic */ int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f18378l;

        public b(MutableLiveData mutableLiveData, int i, MutableLiveData mutableLiveData2) {
            this.f18377j = mutableLiveData;
            this.k = i;
            this.f18378l = mutableLiveData2;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            StringBuilder sb = new StringBuilder();
            sb.append("setStepGoal  ErrorCode:");
            sb.append(commonBackBean.getErrorCode());
            this.f18377j.postValue(Integer.valueOf(commonBackBean.getErrorCode()));
            if (commonBackBean.getErrorCode() == 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("stepGoal", Integer.valueOf(this.k));
                SportDataAdapter.J(b78.a(), contentValues);
                ((WatchPairService) x0.d().b(WatchPairService.SERVICE_WATCH_PAIR).navigation()).da(this.k);
                this.f18378l.postValue(String.valueOf(this.k));
            }
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            super.onError(th);
            StringBuilder sb = new StringBuilder();
            sb.append("setStepGoal  ErrorCode:");
            sb.append(th.getMessage());
            this.f18377j.postValue(101001);
        }
    }

    public void c(MutableLiveData<String> mutableLiveData) {
        SportHealthDataAPI.getInstance().getUserGoalInfo(um.c().getSsoid(), 0).L0(su8.c()).subscribe(new a(mutableLiveData));
    }

    public void d(int i, MutableLiveData<Integer> mutableLiveData, MutableLiveData<String> mutableLiveData2) {
        ArrayList arrayList = new ArrayList();
        UserGoalInfo userGoalInfo = new UserGoalInfo();
        userGoalInfo.setSsoid(um.c().getSsoid());
        userGoalInfo.setType(0);
        userGoalInfo.setValue(String.valueOf(i));
        userGoalInfo.setSyncStatus(0);
        userGoalInfo.setModifiedTime(System.currentTimeMillis());
        arrayList.add(userGoalInfo);
        SportHealthDataAPI.getInstance().setUserGoalInfo(arrayList).subscribe(new b(mutableLiveData, i, mutableLiveData2));
    }
}
