package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class j45 {
    public static final String TEST_ADB_KEY = "drs.test.domain.enable";
    public static final String TEST_DOMAIN = "`||x{2''|m{|%|zikc&\u007fifqgd&kge";
    public static final Map<String, String> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("CN", "`||x{2''gj}{%kgfn%kf&`mq|ixegja&kge");
        map.put(alf.IN, "`||x{2''gj}{%kgfn%af&`mq|ixegjadm&kge");
        map.put(alf.SG, "`||x{2''gj}{%kgfn%{o&`mq|ixegjadm&kge");
        map.put(alf.RU, "`||x{2''gj}{%kgfn%z}&`mq|ixegjadm&kge");
        map.put("EU", "`||x{2''gj}{%kgfn%nz&`mq|ixegjadm&kge");
    }

    public static String a(String str) {
        return en6.a(a.get(str.toUpperCase()));
    }

    public static String b() {
        return en6.a(TEST_DOMAIN);
    }
}
