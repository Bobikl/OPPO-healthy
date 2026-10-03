package com.oplus.aiunit.vision;

import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ogm {
    public static ogm c = new ogm();
    public jaf.b a = null;
    public jaf.b b = new a(this);

    public class a implements jaf.b {
        public a(ogm ogmVar) {
        }

        @Override // com.oplus.aiunit.vision.jaf.b
        public void onStat(Map<String, String> map) {
            StringBuilder sb = new StringBuilder();
            for (String str : map.keySet()) {
                sb.append("[");
                sb.append(str);
                sb.append(":");
                sb.append(map.get(str));
                sb.append("]");
            }
            y4n.b("router_stat", "fail to stat:" + sb.toString());
        }
    }

    public static ogm b() {
        return c;
    }

    public jaf.b a() {
        jaf.b bVar = this.a;
        return bVar != null ? bVar : this.b;
    }
}
