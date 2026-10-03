package com.oplus.aiunit.vision;

import com.heytap.connect.cipher.AESUtil;
import io.netty.util.internal.StringUtil;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: loaded from: classes11.dex */
public class bli {
    public static final char[] a = AESUtil.HEX.toCharArray();

    public static StringBuilder a(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb;
    }

    public static StringBuilder b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(".\"");
        sb.append(str2);
        sb.append('\"');
        return sb;
    }

    public static StringBuilder c(StringBuilder sb, String str, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            b(sb, str, strArr[i]);
            if (i < length - 1) {
                sb.append(StringUtil.COMMA);
            }
        }
        return sb;
    }

    public static StringBuilder d(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append('\"');
            sb.append(strArr[i]);
            sb.append('\"');
            if (i < length - 1) {
                sb.append(StringUtil.COMMA);
            }
        }
        return sb;
    }

    public static StringBuilder e(StringBuilder sb, String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            b(sb, str, strArr[i]).append("=?");
            if (i < strArr.length - 1) {
                sb.append(StringUtil.COMMA);
            }
        }
        return sb;
    }

    public static StringBuilder f(StringBuilder sb, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            a(sb, strArr[i]).append("=?");
            if (i < strArr.length - 1) {
                sb.append(StringUtil.COMMA);
            }
        }
        return sb;
    }

    public static StringBuilder g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < i - 1) {
                sb.append("?,");
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    public static StringBuilder h(StringBuilder sb, String str, yye yyeVar) {
        if (str != null) {
            sb.append(str);
            sb.append('.');
        }
        sb.append('\"');
        sb.append(yyeVar.f19199e);
        sb.append('\"');
        return sb;
    }

    public static String i(String str) {
        return "SELECT COUNT(*) FROM \"" + str + '\"';
    }

    public static String j(String str, String[] strArr) {
        String str2 = '\"' + str + '\"';
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(str2);
        if (strArr != null && strArr.length > 0) {
            sb.append(" WHERE ");
            e(sb, str2, strArr);
        }
        return sb.toString();
    }

    public static String k(String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('\"');
        sb.append(str2);
        sb.append('\"');
        sb.append(" (");
        d(sb, strArr);
        sb.append(") VALUES (");
        g(sb, strArr.length);
        sb.append(')');
        return sb.toString();
    }

    public static String l(String str, String str2, String[] strArr, boolean z) {
        if (str2 == null || str2.length() < 0) {
            throw new DaoException("Table alias required");
        }
        StringBuilder sb = new StringBuilder(z ? "SELECT DISTINCT " : "SELECT ");
        c(sb, str2, strArr).append(" FROM ");
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        sb.append(StringUtil.SPACE);
        sb.append(str2);
        sb.append(StringUtil.SPACE);
        return sb.toString();
    }

    public static String m(String str, String[] strArr, String[] strArr2) {
        String str2 = '\"' + str + '\"';
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(str2);
        sb.append(" SET ");
        f(sb, strArr);
        sb.append(" WHERE ");
        e(sb, str2, strArr2);
        return sb.toString();
    }
}
