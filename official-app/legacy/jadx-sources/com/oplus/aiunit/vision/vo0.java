package com.oplus.aiunit.vision;

import androidx.core.net.MailTo;
import java.util.regex.Pattern;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public class vo0 extends n8a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f17934e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // com.oplus.aiunit.vision.n8a
    public ltc e() {
        String strD = d(f17934e);
        if (strD != null) {
            String strSubstring = strD.substring(1, strD.length() - 1);
            kxa kxaVar = new kxa(MailTo.MAILTO_SCHEME + strSubstring, null);
            kxaVar.b(new zrj(strSubstring));
            return kxaVar;
        }
        String strD2 = d(f);
        if (strD2 == null) {
            return null;
        }
        String strSubstring2 = strD2.substring(1, strD2.length() - 1);
        kxa kxaVar2 = new kxa(strSubstring2, null);
        kxaVar2.b(new zrj(strSubstring2));
        return kxaVar2;
    }

    @Override // com.oplus.aiunit.vision.n8a
    public char m() {
        return Typography.less;
    }
}
