package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.heytap.databaseengine.model.weight.WeightLabel;
import com.heytap.databaseengineservice.db.AppDatabase;
import com.heytap.databaseengineservice.db.table.DBSportDataStat;
import com.heytap.databaseengineservice.db.table.DBUserInfo;
import com.heytap.databaseengineservice.db.table.weight.DBWeightBodyFat;
import com.heytap.databaseengineservice.sync.network.DBBaseResponse;
import com.heytap.databaseengineservice.sync.weight.WeightCalResultRsp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class t6f {
    public static final int QUERY_WEIGHT_ORDER_ASC = 1;
    public static final int QUERY_WEIGHT_PAGE_SIZE = 10;
    public static final String USER_TAG_ID = "userTagId";
    public static final String WEIGHT_ID = "weightId";
    public final Context a;
    public final kql b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t47 f16905c;
    public final boolean d;

    public class a extends zi4<List<DBWeightBodyFat>> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long[] f16906j;
        public final /* synthetic */ int[] k;

        public a(String str, long[] jArr, int[] iArr) {
            this.i = str;
            this.f16906j = jArr;
            this.k = iArr;
        }

        @Override // com.oplus.aiunit.vision.zi4
        public void b(Throwable th, String str) {
            cj4.b("QueryWeightData", "queryUserWeight onFailure: " + str);
        }

        @Override // com.oplus.aiunit.vision.zi4
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(List<DBWeightBodyFat> list) {
            cj4.c("QueryWeightData", "queryUserWeight success!");
            if (hz.b(list)) {
                return;
            }
            cj4.a("QueryWeightData", "queryUserWeight success! result: " + list);
            Collections.sort(list, Comparator.comparingLong(new p02()));
            Iterator<DBWeightBodyFat> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DBWeightBodyFat next = it.next();
                if (TextUtils.isEmpty(next.getUserTagId()) || "0".equals(next.getUserTagId())) {
                    next.setUserTagId("");
                }
                next.setSsoid(this.i);
                boolean z = v05.i(next.getMeasurementTime()) == v05.i(System.currentTimeMillis());
                cj4.c("QueryWeightData", "queryUserWeight success! current day: " + z);
                if (z) {
                    w62.e(t6f.this.a, 4);
                }
                if (!TextUtils.isEmpty(next.getUserTagId())) {
                    t6f.this.p(next, false);
                }
            }
            t6f.this.b.a(list);
            this.f16906j[0] = list.get(list.size() - 1).getModifiedTime();
            this.k[0] = list.size();
            if (this.k[0] < 10) {
                t6f.this.t(this.i);
            }
        }
    }

    public class b extends zi4<WeightCalResultRsp> {
        public final /* synthetic */ DBWeightBodyFat i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f16908j;

        public b(DBWeightBodyFat dBWeightBodyFat, boolean z) {
            this.i = dBWeightBodyFat;
            this.f16908j = z;
        }

        @Override // com.oplus.aiunit.vision.zi4
        public void b(Throwable th, String str) {
            cj4.b("QueryWeightData", str);
        }

        @Override // com.oplus.aiunit.vision.zi4
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(WeightCalResultRsp weightCalResultRsp) {
            cj4.c("QueryWeightData", "queryCalculateResult onSuccess");
            if (weightCalResultRsp == null) {
                at.b(t6f.this.a, ap6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL, at.INTENT_ACTION_WEIGHT);
            } else {
                t6f.this.r(this.i, weightCalResultRsp, this.f16908j);
                at.a(t6f.this.a, at.INTENT_ACTION_WEIGHT);
            }
        }
    }

    public t6f(boolean z) {
        this.d = z;
        Context applicationContext = qa2.common.b().getApplicationContext();
        this.a = applicationContext;
        this.f16905c = (t47) qa2.syncCloudEncrypt.j0(t47.class);
        this.b = AppDatabase.K(applicationContext).h1();
    }

    public static /* synthetic */ boolean l(int[] iArr, int[] iArr2, DBBaseResponse dBBaseResponse) throws Throwable {
        iArr[0] = dBBaseResponse.getErrorCode();
        iArr2[0] = iArr2[0] + 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jdd m(int[] iArr, int[] iArr2, JsonObject jsonObject, Object obj) throws Throwable {
        if (iArr[0] != 23208 || iArr2[0] > 5 || !this.d) {
            return lbd.m0();
        }
        cj4.a("QueryWeightData", "queryCalculateResult repeat para: " + jsonObject + ", repeat times: " + iArr2[0]);
        return lbd.b1((int) Math.pow(2.0d, iArr2[0] - 1), TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jdd n(final int[] iArr, final int[] iArr2, final JsonObject jsonObject, lbd lbdVar) throws Throwable {
        return lbdVar.Q(new d08() { // from class: com.oplus.aiunit.vision.s6f
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return this.i.m(iArr, iArr2, jsonObject, obj);
            }
        });
    }

    public long i(String str, String str2) {
        return this.b.p(str, str2, System.currentTimeMillis());
    }

    public long j(String str) {
        return this.b.o(str, System.currentTimeMillis());
    }

    public long k(String str) {
        return this.b.l(str, System.currentTimeMillis());
    }

    public void o(String str) {
        cj4.c("QueryWeightData", "pullWeightDataFromCloud begin! repeat get weight cal: " + this.d);
        long[] jArr = {k(str)};
        int[] iArr = {10};
        while (iArr[0] >= 10) {
            iArr[0] = 0;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("pageSize", (Number) 10);
            jsonObject.addProperty("modifiedTime", Long.valueOf(jArr[0]));
            jsonObject.addProperty("order", (Number) 1);
            cj4.a("QueryWeightData", "queryUserWeight para: " + jsonObject);
            this.f16905c.c(jsonObject).L0(u9j.b()).subscribe(new a(str, jArr, iArr));
        }
    }

    public final void p(DBWeightBodyFat dBWeightBodyFat, boolean z) {
        final int[] iArr = {0};
        final int[] iArr2 = {0};
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userTagId", dBWeightBodyFat.getUserTagId());
        jsonObject.addProperty(WEIGHT_ID, dBWeightBodyFat.getWeightId());
        this.f16905c.h(jsonObject).P(new mpe() { // from class: com.oplus.aiunit.vision.q6f
            @Override // com.oplus.aiunit.vision.mpe
            public final boolean test(Object obj) {
                return t6f.l(iArr2, iArr, (DBBaseResponse) obj);
            }
        }).y0(new d08() { // from class: com.oplus.aiunit.vision.r6f
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return this.i.n(iArr2, iArr, jsonObject, (lbd) obj);
            }
        }).L0(u9j.b()).subscribe(new b(dBWeightBodyFat, z));
    }

    public void q(DBWeightBodyFat dBWeightBodyFat) {
        p(dBWeightBodyFat, true);
    }

    public final void r(DBWeightBodyFat dBWeightBodyFat, WeightCalResultRsp weightCalResultRsp, boolean z) {
        cj4.c("QueryWeightData", "saveCalResultDownloadData enter!");
        cj4.a("QueryWeightData", "saveCalResultDownloadData userTagId: " + dBWeightBodyFat.getUserTagId() + ", weightId: " + dBWeightBodyFat.getWeightId() + ", body: " + weightCalResultRsp.toString());
        String bodyStyleText = weightCalResultRsp.getBodyStyleText();
        String bodyAdviceText = weightCalResultRsp.getBodyAdviceText();
        int weight = weightCalResultRsp.getWeight();
        List<WeightLabel> weightLabelList = weightCalResultRsp.getWeightLabelList();
        dBWeightBodyFat.setWeight(String.valueOf(weight));
        dBWeightBodyFat.setBodyStyleText(bodyStyleText);
        dBWeightBodyFat.setBodyAdviceText(bodyAdviceText);
        dBWeightBodyFat.setMetadata(sc8.g(weightLabelList));
        this.b.h(dBWeightBodyFat);
        if (z) {
            t(dBWeightBodyFat.getSsoid());
        }
        for (WeightLabel weightLabel : weightLabelList) {
            if ("基础代谢".equals(weightLabel.getLabel())) {
                s(dBWeightBodyFat.getSsoid(), v05.i(dBWeightBodyFat.getMeasurementTime()), Double.valueOf(Math.max(weightLabel.getLabelValue(), 0.0d)).longValue());
            }
        }
    }

    public final void s(String str, int i, long j2) {
        gai gaiVarO0 = AppDatabase.K(this.a).O0();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (DBSportDataStat dBSportDataStat : gaiVarO0.p(str, Arrays.asList(-2, -4, -3), i)) {
            if (dBSportDataStat.getStaticCalSource() < 200) {
                dBSportDataStat.setTotalStaticCal(j2);
                dBSportDataStat.setStaticCalSource(200);
                dBSportDataStat.setSyncStatus(0);
                arrayList.add(dBSportDataStat);
                z = true;
            }
        }
        if (z) {
            gaiVarO0.b(arrayList);
        }
    }

    public final void t(String str) {
        DBWeightBodyFat dBWeightBodyFatE = AppDatabase.K(this.a).h1().e(str);
        if (dBWeightBodyFatE != null) {
            DBUserInfo dBUserInfoQuery = AppDatabase.K(this.a).e1().query(str);
            if (dBWeightBodyFatE.getMeasurementTime() > dBUserInfoQuery.getModifiedTime()) {
                bt4.g(dBUserInfoQuery, 2);
                dBUserInfoQuery.setWeight(dBWeightBodyFatE.getWeight());
                dBUserInfoQuery.setModifiedTime(dBWeightBodyFatE.getMeasurementTime());
                bt4.g(dBUserInfoQuery, 1);
                AppDatabase.K(this.a).e1().b(dBUserInfoQuery);
                kt4.INSTANCE.h(3, 0);
            }
        }
        tvi.G(this.a, str);
    }
}
