package com.oplus.aiunit.vision;

import com.oplus.instant.router.Instant;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class kbm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static kbm f13227c = new kbm();
    public Instant.IStatisticsProvider a = null;
    public Instant.IStatisticsProvider b = new a(this);

    public class a implements Instant.IStatisticsProvider {
        public a(kbm kbmVar) {
        }

        @Override // com.oplus.instant.router.Instant.IStatisticsProvider
        public void onStat(Map<String, String> map) {
            StringBuilder sb = new StringBuilder();
            for (String str : map.keySet()) {
                sb.append("[");
                sb.append(str);
                sb.append(":");
                sb.append(map.get(str));
                sb.append("]");
            }
            epm.e("router_stat", "fail to stat:" + sb.toString());
        }
    }

    public static kbm c() {
        return f13227c;
    }

    public Instant.IStatisticsProvider a() {
        Instant.IStatisticsProvider iStatisticsProvider = this.a;
        return iStatisticsProvider != null ? iStatisticsProvider : this.b;
    }

    public void b(Instant.IStatisticsProvider iStatisticsProvider) {
        this.a = iStatisticsProvider;
    }
}
