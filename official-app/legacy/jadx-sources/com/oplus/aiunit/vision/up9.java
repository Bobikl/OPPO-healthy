package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Hashtable;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class up9 {
    public static void a(StringBuffer stringBuffer, u8f u8fVar, Hashtable hashtable) {
        if (!u8fVar.i()) {
            if (u8fVar.f() != null) {
                b(stringBuffer, u8fVar.f(), hashtable);
                return;
            }
            return;
        }
        wj0[] wj0VarArrH = u8fVar.h();
        boolean z = true;
        for (int i = 0; i != wj0VarArrH.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            b(stringBuffer, wj0VarArrH[i], hashtable);
        }
    }

    public static void b(StringBuffer stringBuffer, wj0 wj0Var, Hashtable hashtable) {
        String str = (String) hashtable.get(wj0Var.g());
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(wj0Var.g().q());
        }
        stringBuffer.append(kam.h);
        stringBuffer.append(i(wj0Var.h()));
    }

    public static boolean c(wj0 wj0Var, wj0 wj0Var2) {
        if (wj0Var == wj0Var2) {
            return true;
        }
        return wj0Var != null && wj0Var2 != null && wj0Var.g().equals(wj0Var2.g()) && e(i(wj0Var.h())).equals(e(i(wj0Var2.h())));
    }

    public static String d(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static String e(String str) {
        String strF = Strings.f(str);
        int i = 0;
        if (strF.length() > 0 && strF.charAt(0) == '#') {
            f1 f1VarF = f(strF);
            if (f1VarF instanceof x1) {
                strF = Strings.f(((x1) f1VarF).getString());
            }
        }
        if (strF.length() > 1) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= strF.length() || strF.charAt(i) != '\\' || strF.charAt(i2) != ' ') {
                    break;
                }
                i += 2;
            }
            int length = strF.length() - 1;
            while (true) {
                int i3 = length - 1;
                if (i3 <= 0 || strF.charAt(i3) != '\\' || strF.charAt(length) != ' ') {
                    break;
                }
                length -= 2;
            }
            if (i > 0 || length < strF.length() - 1) {
                strF = strF.substring(i, length + 1);
            }
        }
        return h(strF);
    }

    public static r1 f(String str) {
        try {
            return r1.i(v79.a(str.substring(1)));
        } catch (IOException e2) {
            throw new IllegalStateException("unknown encoding in name: " + e2);
        }
    }

    public static boolean g(u8f u8fVar, u8f u8fVar2) {
        if (!u8fVar.i()) {
            if (u8fVar2.i()) {
                return false;
            }
            return c(u8fVar.f(), u8fVar2.f());
        }
        if (!u8fVar2.i()) {
            return false;
        }
        wj0[] wj0VarArrH = u8fVar.h();
        wj0[] wj0VarArrH2 = u8fVar2.h();
        if (wj0VarArrH.length != wj0VarArrH2.length) {
            return false;
        }
        for (int i = 0; i != wj0VarArrH.length; i++) {
            if (!c(wj0VarArrH[i], wj0VarArrH2[i])) {
                return false;
            }
        }
        return true;
    }

    public static String h(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i = 1;
            while (i < str.length()) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static String i(f1 f1Var) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(f1Var instanceof x1) || (f1Var instanceof ek4)) {
            try {
                stringBuffer.append("#" + d(v79.b(f1Var.c().e("DER"))));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((x1) f1Var).getString();
            if (string.length() <= 0 || string.charAt(0) != '#') {
                stringBuffer.append(string);
            } else {
                stringBuffer.append("\\" + string);
            }
        }
        int length = stringBuffer.length();
        int i = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i != length) {
            if (stringBuffer.charAt(i) == ',' || stringBuffer.charAt(i) == '\"' || stringBuffer.charAt(i) == '\\' || stringBuffer.charAt(i) == '+' || stringBuffer.charAt(i) == '=' || stringBuffer.charAt(i) == '<' || stringBuffer.charAt(i) == '>' || stringBuffer.charAt(i) == ';') {
                stringBuffer.insert(i, "\\");
                i++;
                length++;
            }
            i++;
        }
        if (stringBuffer.length() > 0) {
            for (int i2 = 0; stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' '; i2 += 2) {
                stringBuffer.insert(i2, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, '\\');
        }
        return stringBuffer.toString();
    }
}
