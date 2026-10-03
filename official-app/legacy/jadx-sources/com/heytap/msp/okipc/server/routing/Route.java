package com.heytap.msp.okipc.server.routing;

import com.heytap.msp.okipc.server.Handler;
import com.oplus.aiunit.vision.n04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class Route {
    public d a;
    public a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f7344c;
    public final Map<String, Handler> d;

    public interface ManualDispatchBlock {
        void invoke(com.heytap.msp.okipc.server.b bVar);
    }

    public interface RouteBlock {
        com.heytap.msp.okipc.e invoke(com.heytap.msp.okipc.server.b bVar) throws Exception;
    }

    public Route(d dVar, a aVar) {
        this.d = new LinkedHashMap();
        this.a = dVar;
        this.b = aVar;
    }

    public static List<String> b(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty() || strTrim.equals("/")) {
            return Collections.emptyList();
        }
        if (strTrim.contains("?")) {
            throw new IllegalArgumentException("Query parameters are not supported in routing paths.");
        }
        if (strTrim.startsWith("/")) {
            strTrim = strTrim.substring(1);
        }
        if (strTrim.contains("/")) {
            throw new IllegalArgumentException("Only a single path segment is supported.");
        }
        if (strTrim.contains(n04.OPEN_BRACE_REGEX) || strTrim.contains("}")) {
            throw new IllegalArgumentException("Path parameter syntax is no longer supported.");
        }
        if (strTrim.isEmpty()) {
            throw new IllegalArgumentException("Path segment must not be empty.");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strTrim);
        return arrayList;
    }

    public Handler a(String str) {
        return str == null ? this.f7344c : this.d.get(str);
    }

    public Route c(String str, Handler handler) {
        List<String> listB = b(str);
        if (listB.size() > 1) {
            throw new IllegalArgumentException("Only single path segment is supported.");
        }
        String str2 = listB.isEmpty() ? null : listB.get(0);
        if (str2 == null) {
            this.f7344c = handler;
        } else {
            this.d.put(str2, handler);
        }
        return this;
    }

    public Route() {
        this(new b(), new a());
    }
}
