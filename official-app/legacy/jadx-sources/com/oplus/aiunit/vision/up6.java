package com.oplus.aiunit.vision;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class up6 {
    public static final String ENTITY = "&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});";
    public static final String ESCAPABLE = "[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]";
    public static final Pattern a = Pattern.compile("[\\\\&]");
    public static final Pattern b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f17558c = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f17559e = Pattern.compile("[ \t\r\n]+");
    public static final c f = new a();
    public static final c g = new b();

    public static class a implements c {
        @Override // com.oplus.aiunit.vision.up6.c
        public void a(String str, StringBuilder sb) {
            if (str.charAt(0) == '\\') {
                sb.append((CharSequence) str, 1, str.length());
            } else {
                sb.append(vi9.a(str));
            }
        }
    }

    public static class b implements c {
        @Override // com.oplus.aiunit.vision.up6.c
        public void a(String str, StringBuilder sb) {
            if (str.startsWith("%")) {
                if (str.length() == 3) {
                    sb.append(str);
                    return;
                } else {
                    sb.append("%25");
                    sb.append((CharSequence) str, 1, str.length());
                    return;
                }
            }
            for (byte b : str.getBytes(Charset.forName("UTF-8"))) {
                sb.append('%');
                sb.append(up6.d[(b >> 4) & 15]);
                sb.append(up6.d[b & 15]);
            }
        }
    }

    public interface c {
        void a(String str, StringBuilder sb);
    }

    public static String b(String str) {
        return f17559e.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
    }

    public static String c(String str) {
        return b(str.substring(1, str.length() - 1));
    }

    public static String d(Pattern pattern, String str, c cVar) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            cVar.a(matcher.group(), sb);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }

    public static String e(String str) {
        return a.matcher(str).find() ? d(b, str, f) : str;
    }
}
