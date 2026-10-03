package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public class tha extends n8a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f17013e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // com.oplus.aiunit.vision.n8a
    @Nullable
    public ltc e() {
        String strD = d(f17013e);
        if (strD == null) {
            return null;
        }
        uha uhaVar = new uha();
        uhaVar.n(strD.substring(2, strD.length() - 2));
        return uhaVar;
    }

    @Override // com.oplus.aiunit.vision.n8a
    public char m() {
        return Typography.dollar;
    }
}
