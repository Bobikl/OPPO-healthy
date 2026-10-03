package com.platform.usercenter.tools.algorithm;

import android.text.TextUtils;
import android.util.Base64;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes9.dex */
public class Base64Helper {
    public static String base64Decode(String str) {
        try {
            return !TextUtils.isEmpty(str) ? new String(Base64.decode(str, 0), StandardCharsets.UTF_8) : "";
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return "";
        }
    }

    public static String base64DecodeSafe(String str) {
        try {
            return !TextUtils.isEmpty(str) ? new String(Base64.decode(str, 10), StandardCharsets.UTF_8) : "";
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return "";
        }
    }

    public static String base64Encode(String str) {
        try {
            return !TextUtils.isEmpty(str) ? new String(Base64.encode(str.getBytes(), 0), StandardCharsets.UTF_8) : "";
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return "";
        }
    }

    public static String base64EncodeSafe(String str) {
        try {
            return !TextUtils.isEmpty(str) ? new String(Base64.encode(str.getBytes(), 10), StandardCharsets.UTF_8) : "";
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return "";
        }
    }
}
