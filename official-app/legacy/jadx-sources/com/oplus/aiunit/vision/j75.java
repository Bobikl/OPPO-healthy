package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class j75 {
    public static final Map<String, String> a;
    public static final Map<String, String> b;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("CN", "`||x{2''gj}{%kf&lk&`mq|ixegja&kge");
        map.put(alf.IN, "`||x{2''gj}{%af&lk&`mq|ixegjadm&kge");
        map.put(alf.SG, "`||x{2''gj}{%{o&lk&`mq|ixegjadm&kge");
        map.put(alf.RU, "`||x{2''gj}{%lk%z}&`mq|ixegjadm&kge");
        map.put("EU", "`||x{2''gj}{%lk%m}&`mq|ixegjadm&kge");
        HashMap map2 = new HashMap();
        b = map2;
        map2.put("CN", "`||x{2''gj}{%lk|mk`%kf&`mq|ixegja&kge");
        map2.put(alf.IN, "`||x{2''gj}{%lk|mk`%af&`mq|ixegjadm&kge");
        map2.put(alf.SG, "`||x{2''gj}{%lk|mk`%{o&`mq|ixegjadm&kge");
        map2.put(alf.RU, "`||x{2''gj}{%lk%z}&`mq|ixegjadm&kge");
        map2.put("EU", "`||x{2''gj}{%lk|mk`%nz&`mq|ixegjadm&kge");
    }

    public static String a(String str) {
        return en6.a(a.get(str.toUpperCase()));
    }

    public static String b(String str) {
        return en6.a(b.get(str.toUpperCase()));
    }
}
