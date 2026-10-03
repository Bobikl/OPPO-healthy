package com.oplus.aiunit.vision;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gcm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static gcm f11717c = new gcm();
    public x7f.b a = null;
    public x7f.b b = new a(this);

    public class a implements x7f.b {
        public a(gcm gcmVar) {
        }

        @Override // com.oplus.aiunit.vision.x7f.b
        public void onStat(Map<String, String> map) {
            StringBuilder sb = new StringBuilder();
            for (String str : map.keySet()) {
                sb.append("[");
                sb.append(str);
                sb.append(":");
                sb.append(map.get(str));
                sb.append("]");
            }
            xzm.b("router_stat", "fail to stat:" + sb.toString());
        }
    }

    public static gcm b() {
        return f11717c;
    }

    public x7f.b a() {
        x7f.b bVar = this.a;
        return bVar != null ? bVar : this.b;
    }
}
