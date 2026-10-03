package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchface.proto.Proto$WfEntity;
import com.heytap.health.watchface.business.store.installer.bean.WfStatusBean;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class j8l {
    public b a;

    public static class a {
        public static final j8l a = new j8l();
    }

    public interface b {
        void a(WfStatusBean wfStatusBean);
    }

    public static j8l a() {
        return a.a;
    }

    public void b(String str, String str2, int i) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(new WfStatusBean(str, str2, i));
        }
    }

    public void c(int i, List<Proto$WfEntity> list) {
        if (list == null || list.size() == 0) {
            ltl.i("WatchActionStatusListener", "[updateWfPackageStatus] wfEntityList=null,and return");
            return;
        }
        Proto$WfEntity proto$WfEntity = list.get(0);
        String wfUnique = proto$WfEntity.getWfUnique();
        String wfVersion = proto$WfEntity.getWfVersion();
        ltl.a("WatchActionStatusListener", "[updateWfPackageStatus] eventType " + i + " unique " + wfUnique + " version " + wfVersion);
        if (i == 2) {
            b(wfUnique, wfVersion, 1);
        } else if (i == 1) {
            b(wfUnique, wfVersion, 2);
        } else if (i == 3) {
            b(wfUnique, wfVersion, 3);
        }
    }

    public void d(int i, List<Proto$WfEntity> list) {
        if (list == null || list.size() == 0) {
            ltl.i("WatchActionStatusListener", "[updateWfStyleAndCurrentStatus] wfEntityList=null,and return");
            return;
        }
        Proto$WfEntity proto$WfEntity = list.get(0);
        String wfUnique = proto$WfEntity.getWfUnique();
        String wfVersion = proto$WfEntity.getWfVersion();
        ltl.a("WatchActionStatusListener", "[updateWfStyleAndCurrentStatus] eventType " + i + " unique " + wfUnique + " version " + wfVersion);
        if (i == 0) {
            b(wfUnique, wfVersion, 1);
        }
    }

    public void setStatusListener(b bVar) {
        this.a = bVar;
    }

    public j8l() {
    }
}
