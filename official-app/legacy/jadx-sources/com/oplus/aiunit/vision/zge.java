package com.oplus.aiunit.vision;

import android.util.ArraySet;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class zge {
    public static final String TAG = "PersonalInfoManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile zge f19407c;
    public UserInfo a;
    public WeakReference<LifecycleOwner> b;

    public class a implements ul4.b {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ul4.b
        public void d(@NonNull Node node, @NonNull auc aucVar) {
            if (aucVar != auc.a.INSTANCE || ((LifecycleOwner) zge.this.b.get()) == null) {
                return;
            }
            zge.q();
        }

        @Override // com.oplus.aiunit.vision.ul4.b
        public void getInterestingStatus(@NonNull ArraySet<auc> arraySet) {
            arraySet.add(auc.a.INSTANCE);
        }
    }

    public class b extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ahe f19408j;

        public b(ahe aheVar) {
            this.f19408j = aheVar;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            int i = 170;
            int i2 = 60;
            if (commonBackBean.getErrorCode() != 0) {
                this.f19408j.a(170, 60, "", "");
                return;
            }
            if (commonBackBean.getObj() == null) {
                this.f19408j.a(170, 60, "", "");
                return;
            }
            ArrayList arrayList = (ArrayList) commonBackBean.getObj();
            if (arrayList == null || arrayList.isEmpty() || arrayList.get(0) == null) {
                this.f19408j.a(170, 60, "", "");
                return;
            }
            try {
                zge.this.a = (UserInfo) arrayList.get(0);
                if (zge.this.a.getHeight() != null && !zge.this.a.getHeight().equalsIgnoreCase("0")) {
                    i = Integer.parseInt(zge.this.a.getHeight()) / 10;
                }
                if (zge.this.a.getWeight() != null && !zge.this.a.getWeight().equalsIgnoreCase("0")) {
                    i2 = Integer.parseInt(zge.this.a.getWeight()) / 1000;
                }
                String sex = zge.this.a.getSex();
                String birthday = zge.this.a.getBirthday();
                if (sex == null || sex.trim().length() == 0) {
                    sex = "M";
                }
                if (birthday == null || birthday.trim().length() == 0) {
                    birthday = UserInfo.BIRTHDAY_DEFAULT;
                }
                this.f19408j.b(i, i2, sex, birthday);
                StringBuilder sb = new StringBuilder();
                sb.append("queryHWeightValues success:height = ");
                sb.append(i);
                sb.append(" weight = ");
                sb.append(i2);
            } catch (NumberFormatException e2) {
                a7b.b(zge.TAG, "parse data exception, message:" + e2.getMessage());
                this.f19408j.a(i, i2, "", "");
            }
        }
    }

    public zge(LifecycleOwner lifecycleOwner) {
        if (this.b == null) {
            this.b = new WeakReference<>(lifecycleOwner);
        }
        gl4.devicePrimary.nodeApi.l(new a());
    }

    public static zge i(LifecycleOwner lifecycleOwner) {
        if (f19407c == null) {
            synchronized (zge.class) {
                if (f19407c == null) {
                    f19407c = new zge(lifecycleOwner);
                }
            }
        }
        return f19407c;
    }

    public static /* synthetic */ List j(CommonBackBean commonBackBean) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("syncUserInfoToWatch get userInfo: errorCode ");
        sb.append(commonBackBean.getErrorCode());
        return (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) ? new ArrayList() : (List) commonBackBean.getObj();
    }

    public static /* synthetic */ List k(CommonBackBean commonBackBean) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("syncUserInfoToWatch get weight goal info: errorCode ");
        sb.append(commonBackBean.getErrorCode());
        return (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) ? new ArrayList() : (List) commonBackBean.getObj();
    }

    public static /* synthetic */ void l(Object obj) throws Throwable {
    }

    public static /* synthetic */ void m(Throwable th) throws Throwable {
        a7b.c(TAG, "syncUserInfoToWatch failed: " + th.getMessage(), th);
    }

    public static int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e2) {
            a7b.b(TAG, "parseString2Int e = " + e2.getMessage());
            return 0;
        }
    }

    public static Object p(List<UserInfo> list, List<UserGoalInfo> list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("sendBodyProperties2Device skip, userInfos size=");
            sb.append(list == null ? 0 : list.size());
            sb.append(", userGoalInfos size=");
            sb.append(list2 != null ? list2.size() : 0);
            a7b.m(TAG, sb.toString());
            return Boolean.FALSE;
        }
        MessageEvent messageEventV0 = xxb.v0(n(list2.get(0).getValue()));
        a7b.f(TAG, "sendWeightGoal2Device");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sendWeightGoal2Device:");
        sb2.append(messageEventV0.toString());
        zq0.w().R(messageEventV0);
        UserInfo userInfo = list.get(0);
        return Boolean.valueOf(kr0.e().j(userInfo.getBirthday().replace("-", ""), n(userInfo.getHeight()) / 10, n(userInfo.getWeight()) / 1000, "M".equals(userInfo.getSex()) ? 1 : 0, n(userInfo.getWeight()), userInfo.getModifiedTime(), userInfo.getBloodPressureType()));
    }

    public static void q() {
        String ssoid = um.c().getSsoid();
        VirtualAccountData virtualAccountDataI = gl4.businessApi.i(gl4.managerApi.getCurrentConnectId());
        if (virtualAccountDataI == null) {
            lbd.k1(SportHealthDataAPI.getInstance().getUserInfo(ssoid).j0(new d08() { // from class: com.oplus.aiunit.vision.uge
                @Override // com.oplus.aiunit.vision.d08
                public final Object apply(Object obj) {
                    return zge.j((CommonBackBean) obj);
                }
            }), SportHealthDataAPI.getInstance().getUserGoalInfo(ssoid, 1).j0(new d08() { // from class: com.oplus.aiunit.vision.vge
                @Override // com.oplus.aiunit.vision.d08
                public final Object apply(Object obj) {
                    return zge.k((CommonBackBean) obj);
                }
            }), new md1() { // from class: com.oplus.aiunit.vision.wge
                @Override // com.oplus.aiunit.vision.md1
                public final Object apply(Object obj, Object obj2) {
                    return zge.p((List) obj, (List) obj2);
                }
            }).b(new o14() { // from class: com.oplus.aiunit.vision.xge
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) throws Throwable {
                    zge.l(obj);
                }
            }, new o14() { // from class: com.oplus.aiunit.vision.yge
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) throws Throwable {
                    zge.m((Throwable) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("syncUserInfoToWatch: ");
        sb.append(virtualAccountDataI);
        kr0 kr0VarE = kr0.e();
        String strReplace = virtualAccountDataI.getBirthday().replace("-", "");
        int iN = n(virtualAccountDataI.getHeight()) / 10;
        int iN2 = n(virtualAccountDataI.getWeight()) / 1000;
        boolean zEquals = "M".equals(virtualAccountDataI.getSex());
        kr0VarE.j(strReplace, iN, iN2, zEquals ? 1 : 0, n(virtualAccountDataI.getWeight()), 0L, 0);
    }

    public void o(LifecycleOwner lifecycleOwner, ahe aheVar) {
        ((mdd) SportHealthDataAPI.getInstance().getUserInfo(um.c().getSsoid()).n0(f30.c()).d1(l4g.b(lifecycleOwner))).subscribe(new b(aheVar));
    }
}
