package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes15.dex */
public class x0h {
    public static final String MD_5 = "MD5";
    public static final String TAG = "SharePrefUtil";
    public static final String UTF_8 = "UTF-8";

    public static void a(String str) {
        v9g.x(str).k();
    }

    public static Object b(String str, String str2, Object obj) {
        v9g v9gVarX = v9g.x(str);
        if (obj instanceof String) {
            return v9gVarX.E(str2, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(v9gVarX.z(str2, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(v9gVarX.r(str2, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(v9gVarX.v(str2, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(v9gVarX.B(str2, ((Long) obj).longValue()));
        }
        return null;
    }

    public static String c(String str) {
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return strE.substring(0, 16);
    }

    public static void d(String str, String str2, Object obj) {
        if (obj == null) {
            return;
        }
        v9g v9gVarX = v9g.x(str);
        if (obj instanceof String) {
            v9gVarX.U(str2, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            v9gVarX.S(str2, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            v9gVarX.W(str2, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            v9gVarX.R(str2, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            v9gVarX.T(str2, ((Long) obj).longValue());
        } else {
            v9gVarX.U(str2, obj.toString());
        }
    }

    public static String e(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UnsupportedEncodingException ");
            sb2.append(e2.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("NoSuchAlgorithmException ");
            sb3.append(e3.getMessage());
            return null;
        }
    }
}
