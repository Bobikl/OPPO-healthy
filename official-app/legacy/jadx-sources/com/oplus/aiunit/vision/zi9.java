package com.oplus.aiunit.vision;

import java.util.regex.Pattern;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public class zi9 extends n8a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f19429e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override // com.oplus.aiunit.vision.n8a
    public ltc e() {
        String strD = d(f19429e);
        if (strD == null) {
            return null;
        }
        yi9 yi9Var = new yi9();
        yi9Var.m(strD);
        return yi9Var;
    }

    @Override // com.oplus.aiunit.vision.n8a
    public char m() {
        return Typography.less;
    }
}
