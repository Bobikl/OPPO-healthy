package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.wallet.business.bus.apdu.ShangHai;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class k03 implements x7e {
    public static final g a = new g(21, 40);
    public static final g b = new g(24, 40);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap<String, x7e> f13096c = new HashMap<>();
    public static k03 d = null;

    public static class a implements x7e {
        @Override // com.oplus.aiunit.vision.x7e
        public String a(String str, String str2) {
            return b(str2.substring(24, 40));
        }

        public final String b(String str) {
            return String.format(Locale.getDefault(), "%s%08d", str.substring(0, 8), Integer.valueOf(e1j.f(e1j.e(str.substring(8)))));
        }
    }

    public static class b implements x7e {
        @Override // com.oplus.aiunit.vision.x7e
        public String a(String str, String str2) {
            return "3154" + str2.substring(24, 40);
        }
    }

    public static class c implements x7e {
        @Override // com.oplus.aiunit.vision.x7e
        public String a(String str, String str2) {
            return c(str2.substring(24, 40));
        }

        public final String b(String str) {
            byte[][] bArr = {new byte[]{5, 6, 8, 1, 0, 2, 3, 7, 9, 4}, new byte[]{4, 8, 1, 3, 7, 2, 5, 9, 0, 6}, new byte[]{1, 7, 2, 6, 8, 5, 9, 3, 4, 0}, new byte[]{7, 9, 0, 3, 1, 2, 6, 8, 4, 5}};
            String strSubstring = str.substring(4);
            char[] charArray = strSubstring.toCharArray();
            int[] iArr = new int[4];
            for (int i = 0; i < 12; i++) {
                int i2 = charArray[i] - '0';
                for (int i3 = 0; i3 < 4; i3++) {
                    iArr[i3] = iArr[i3] + bArr[i3][i2] + i2;
                }
            }
            for (int i4 = 0; i4 < 4; i4++) {
                strSubstring = strSubstring + ((iArr[i4] + 31) % 9);
            }
            return strSubstring;
        }

        public final String c(String str) {
            return b(String.format(Locale.getDefault(), "%s%08d", str.substring(0, 8), Integer.valueOf(e1j.f(e1j.e(str.substring(8))))));
        }
    }

    public static class d implements x7e {
        public static String b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bArrE = e1j.e(str.substring(12, 20));
            int length = bArrE.length;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = bArrE[(length - i) - 1];
            }
            return new DecimalFormat("000000000").format(e1j.f(bArr));
        }

        @Override // com.oplus.aiunit.vision.x7e
        public String a(String str, String str2) {
            return b(str2.substring(20, 40));
        }
    }

    public static class e implements x7e {
        @Override // com.oplus.aiunit.vision.x7e
        public String a(String str, String str2) {
            return b(str2.substring(24, 40));
        }

        public final String b(String str) {
            return String.format(Locale.getDefault(), "%s%08d", str.substring(0, 8), Integer.valueOf(e1j.f(e1j.e(str.substring(8)))));
        }
    }

    public static class f implements x7e {
        @Override // com.oplus.aiunit.vision.x7e
        public String a(String str, String str2) {
            if (str2 == null || str2.length() < 40) {
                return null;
            }
            return b(str2.substring(24, 40));
        }

        public final String b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 1));
            sb.append(str.substring(4));
            String string = sb.toString();
            int iCharAt = string.charAt(0) - '0';
            for (int i = 1; i < string.length(); i++) {
                iCharAt ^= string.charAt(i) - '0';
            }
            return string + (iCharAt % 10);
        }
    }

    public static class g implements x7e {
        public int a;
        public int b;

        public g(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.oplus.aiunit.vision.x7e
        public String a(String str, String str2) {
            int i;
            t6b.b("NoParser", "parseHci" + str2);
            int i2 = this.a;
            if (i2 >= 0 && (i = this.b) >= 0 && i > i2 && str2 != null && str2.length() > this.a) {
                int length = str2.length();
                int i3 = this.b;
                if (length >= i3) {
                    return str2.substring(this.a, i3);
                }
            }
            t6b.i("NoParser", "parseHci fail" + str2);
            return null;
        }
    }

    public static k03 b() {
        if (d == null) {
            synchronized (k03.class) {
                if (d == null) {
                    k03 k03Var = new k03();
                    k03Var.c();
                    d = k03Var;
                }
            }
        }
        return d;
    }

    @Override // com.oplus.aiunit.vision.x7e
    public String a(String str, String str2) {
        x7e x7eVar = f13096c.get(str);
        if (x7eVar != null) {
            return x7eVar.a(str, str2);
        }
        return null;
    }

    public final void c() {
        HashMap<String, x7e> map = f13096c;
        map.put("535A542E57414C4C45542E454E56", new d());
        g gVar = a;
        map.put("A00000063201010510009156000014A1", gVar);
        map.put("5943542E555345525800022058100000", new g(21, 40));
        map.put("A0000006320101055800022058100000", new g(21, 40));
        map.put("A0000000032660869807010000000000", new c());
        g gVar2 = b;
        map.put("4351515041592E5359533331", gVar2);
        map.put("A000000632010105215053555A484F55", gVar);
        map.put("A0000053425748544B", new g(0, 10));
        map.put("A0000006320101054758474D4B", gVar);
        map.put("A0000006320101055358434154", gVar);
        map.put("A0000000032300869807010000000000", new g(32, 40));
        map.put("A0000000033150869807010000000000", new b());
        map.put("A0000053425A5A4854", new f());
        map.put("A0000000031500869807010000000000", new g(28, 40));
        map.put("A0000000033610869807010000000000", new g(40, 56));
        map.put("A000000632010105484E594B54", gVar);
        map.put("A00000063201010504678810FFFFFFFF", gVar);
        map.put("A0000006320101054A4C4A4C54", gVar);
        map.put("A00000004644574F50504F53484149", new ShangHai("A00000004644574F50504F53484149"));
        map.put("A0000006320101060200290046445774", new ShangHai("A0000006320101060200290046445774"));
        map.put("A000000632010105116044414C49414E", gVar);
        map.put("A0000000033180869807010000000000", gVar);
        map.put("A0000006320101055359534A54", gVar);
        map.put("5A4A422E5359532E4444463031", gVar2);
        map.put("A0000006320101054842534A5A", gVar);
        map.put("A00000063201010501273020FFFFFFFF", gVar);
        map.put("A000000632010105535A4B5700000731", gVar);
        map.put("315041592E5359532E44444630310791", new a());
        map.put("A000000632010105535A4B5700000931", gVar);
        map.put("D156000015CCECB8AECDA8BFA8", new g(24, 40));
        map.put("A0000006320101053000300100083010", gVar);
        map.put("6A682ECAD0C3F1BFA8", new g(20, 40));
        map.put("A00000063201010502697010FFFFFFFF", new g(20, 40));
        map.put("A000000003869807004580", new e());
        map.put("A0000006320101054842594B54", gVar);
        map.put("A00000063201010511215449414E4A49", gVar);
    }
}
