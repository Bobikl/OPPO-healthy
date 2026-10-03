package com.oplus.aiunit.vision;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface fj8 {

    @Deprecated
    public static final fj8 NONE = new a();
    public static final fj8 DEFAULT = new cva.a().a();

    public class a implements fj8 {
        @Override // com.oplus.aiunit.vision.fj8
        public Map<String, String> a() {
            return Collections.emptyMap();
        }
    }

    Map<String, String> a();
}
