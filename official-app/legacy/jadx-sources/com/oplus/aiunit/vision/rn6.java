package com.oplus.aiunit.vision;

import java.util.regex.Pattern;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public class rn6 extends n8a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f16271e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // com.oplus.aiunit.vision.n8a
    public ltc e() {
        String strD = d(f16271e);
        if (strD != null) {
            return o(vi9.a(strD));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.n8a
    public char m() {
        return Typography.amp;
    }
}
