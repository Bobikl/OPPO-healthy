package com.oplus.aiunit.vision;

import com.heytap.health.base.switchManager.SwitchBean;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public class g6j {
    public static final String a = "com.oplus.aiunit.vision.g6j";

    public class a extends u61<SwitchBean> {
        public final /* synthetic */ int i;

        public a(int i) {
            this.i = i;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            a7b.b(g6j.a, "update switch state failed: " + str);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(SwitchBean switchBean) {
            String unused = g6j.a;
            StringBuilder sb = new StringBuilder();
            sb.append("update switch state successful: ");
            sb.append(switchBean.toString());
            v9g.w().S("switch_type_state_" + this.i, switchBean.getSwitchStatus());
            v9g.w().U("switch_type_config_" + this.i, switchBean.getConfig());
            v9g.w().T("switch_type_start_time_" + this.i, switchBean.getValidTimestamp());
            v9g.w().T("switch_type_end_time_" + this.i, switchBean.getEndTimestamp());
        }
    }

    public static class b {
        public static g6j a = new g6j();
    }

    public static g6j c() {
        return b.a;
    }

    public String b(int i) {
        return v9g.w().D("switch_type_config_" + i);
    }

    public void d() {
        Iterator<Integer> it = s6j.typeList.iterator();
        while (it.hasNext()) {
            e(it.next().intValue());
        }
    }

    public final void e(int i) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("switchType", Integer.valueOf(i));
        ((p6j) com.heytap.health.network.core.a.j(p6j.class)).f(map).L0(su8.c()).subscribe(new a(i));
    }

    public g6j() {
    }
}
