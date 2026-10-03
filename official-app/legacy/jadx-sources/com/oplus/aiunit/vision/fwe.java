package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class fwe {
    public List<String> a;
    public static final String b = zv8.API_PATH + "v1/c2s/sport/steps/syncStepsDetail";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f11531c = zv8.API_PATH + "v1/c2s/sport/steps/queryStepsDetailVersion";
    public static final String d = zv8.API_PATH + "v1/c2s/sport/steps/queryStepsDetailData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f11532e = zv8.API_PATH + "v2/c2s/sport/steps/pullStepsDetailData";
    public static final String f = zv8.API_PATH + "v1/c2s/sport/steps/syncStepsStat";
    public static final String g = zv8.API_PATH + "v1/c2s/sport/steps/queryStepsStatVersion";
    public static final String h = zv8.API_PATH + "v2/c2s/sport/steps/queryStepsStatData";
    public static final String i = zv8.API_PATH + "v1/c2s/sport/data/syncSportRecord";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f11533j = zv8.API_PATH + "v1/c2s/sport/data/querySportRecordVersion";
    public static final String k = zv8.API_PATH + "v2/c2s/sport/data/querySportRecordData";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f11534l = zv8.API_PATH + "v1/c2s/sport/data/syncSportStat";
    public static final String m = zv8.API_PATH + "v1/c2s/sport/data/querySportStatVersion";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f11535n = zv8.API_PATH + "v2/c2s/sport/data/querySportStatData";
    public static final String o = zv8.API_PATH + "v1/c2s/sport/data/deleteSportRecord";
    public static final String p = zv8.API_PATH + "v2/c2s/sport/goal/queryUserGoal";
    public static final String q = zv8.API_PATH + "v1/c2s/sport/goal/reportGoal";
    public static final String r = zv8.API_PATH + "v1/c2s/shared/dataMigration";
    public static final String s = zv8.API_PATH + "v1/c2s/shared/queryFriendBaseData";
    public static final String t = zv8.API_PATH + "v1/c2s/shared/queryFriendDetailData";
    public static final String u = zv8.API_PATH + "v1/c2s/shared/queryLastSummaryVersion";
    public static final String v = zv8.API_PATH + "v1/c2s/shared/sendPushMessage";
    public static final String w = zv8.API_PATH + "v1/c2s/shared/syncFriendSummaryData";
    public static final String x = zv8.API_PATH + "v1/c2s/shared/syncFriendSummaryList";
    public static final String y = zv8.API_PATH + "v1/c2s/health/weight/addUserTag";
    public static final String z = zv8.API_PATH + "v1/c2s/health/weight/addWeight";
    public static final String A = zv8.API_PATH + "v1/c2s/health/weight/assignWeightToUser";
    public static final String B = zv8.API_PATH + "v1/c2s/health/weight/deleteUserTag";
    public static final String C = zv8.API_PATH + "v1/c2s/health/weight/deleteWeightList";
    public static final String D = zv8.API_PATH + "v1/c2s/health/weight/editUserTag";
    public static final String E = zv8.API_PATH + "v1/c2s/health/weight/querySignedWeight";
    public static final String F = zv8.API_PATH + "v1/c2s/health/weight/queryUnsignedWeight";
    public static final String G = zv8.API_PATH + "v1/c2s/health/weight/queryUserTagList";
    public static final String H = zv8.API_PATH + "v1/c2s/health/weight/queryUserWeight";
    public static final String I = zv8.API_PATH + "v1/c2s/health/weight/queryWeightCalculateResult";
    public static final String J = zv8.API_PATH + "v1/c2s/physique/evaluation/deletePhysiqueEvaluation";
    public static final String K = zv8.API_PATH + "v1/c2s/physique/evaluation/queryMyPhysiqueEvaluation";
    public static final String L = zv8.API_PATH + "v1/c2s/physique/evaluation/queryPhysiqueEvaluationScoreRanking";
    public static final String M = zv8.API_PATH + "v1/c2s/physique/evaluation/reportPhysiqueEvaluation";
    public static final String N = zv8.API_PATH + "v1/c2s/health/queryAppUsageDetail";

    public static class a {
        public static final fwe a = new fwe();
    }

    public static fwe b() {
        return a.a;
    }

    public final void a() {
        this.a.add(b);
        this.a.add(f11531c);
        this.a.add(d);
        this.a.add(f11532e);
        this.a.add(f);
        this.a.add(g);
        this.a.add(h);
        this.a.add(i);
        this.a.add(f11533j);
        this.a.add(k);
        this.a.add(f11534l);
        this.a.add(m);
        this.a.add(f11535n);
        this.a.add(o);
        this.a.add(p);
        this.a.add(q);
        this.a.add(v);
        this.a.add(s);
        this.a.add(r);
        this.a.add(t);
        this.a.add(u);
        this.a.add(w);
        this.a.add(x);
        this.a.add(y);
        this.a.add(z);
        this.a.add(A);
        this.a.add(B);
        this.a.add(C);
        this.a.add(D);
        this.a.add(E);
        this.a.add(F);
        this.a.add(H);
        this.a.add(I);
        this.a.add(G);
        this.a.add(J);
        this.a.add(K);
        this.a.add(L);
        this.a.add(M);
        this.a.add(N);
    }

    public synchronized List<String> c() {
        return this.a;
    }

    public fwe() {
        this.a = null;
        this.a = new ArrayList();
        a();
    }
}
