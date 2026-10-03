package com.oplus.aiunit.vision;

import com.oplus.drs.core.model.OTrackEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ojg {
    public static volatile ojg a;

    public static ojg a() {
        if (a == null) {
            synchronized (ojg.class) {
                if (a == null) {
                    a = new ojg();
                }
            }
        }
        return a;
    }

    public void b(OTrackEvent oTrackEvent, ut9 ut9Var) {
        if (oTrackEvent != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(oTrackEvent);
            c(arrayList, ut9Var);
        } else {
            z6b.k("DirectTrackProcessor", "processEvent: null event");
            if (ut9Var != null) {
                ut9Var.a(null, null);
            }
        }
    }

    public void c(List<OTrackEvent> list, ut9 ut9Var) {
        if (list == null || list.isEmpty()) {
            z6b.k("DirectTrackProcessor", "processEvents: empty events");
            if (ut9Var != null) {
                ut9Var.a(null, null);
                return;
            }
            return;
        }
        z6b.k("DirectTrackProcessor", "processEvents: size=" + list.size());
        if (!t6k.m().p()) {
            t6k.m().x(list, ut9Var);
            return;
        }
        z6b.u("DirectTrackProcessor", "processEvents: preprocess queue overloaded, pending=" + t6k.m().n());
        if (ut9Var != null) {
            ut9Var.a(null, null);
        }
    }
}
