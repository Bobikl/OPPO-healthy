package com.oplus.aiunit.vision;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class de {
    public static final String CONTEXT_IS_NULL = "context is null.";
    public static final String TAG = "AcOpenDeviceInfoUtil";

    public static String a() {
        return Locale.getDefault().getLanguage();
    }

    public static String b(Context context) {
        String string = jc.h() ? "en-US" : "zh-CN";
        if (uf.a() < 24) {
            String languageTag = Locale.getDefault().toLanguageTag();
            if ("id-ID".equalsIgnoreCase(languageTag)) {
                string = "in-ID";
            } else {
                Locale localeForLanguageTag = Locale.forLanguageTag(languageTag);
                string = localeForLanguageTag.getLanguage() + "-" + localeForLanguageTag.getCountry();
            }
        } else {
            if (context == null) {
                throw new NullPointerException("context is null.");
            }
            try {
                int identifier = context.getResources().getIdentifier("language_values_exam", TypedValues.Custom.S_STRING, "oplus");
                if (identifier != -1) {
                    string = context.getResources().getString(identifier);
                }
            } catch (Exception e2) {
                AcLogUtil.e(TAG, "getLanguageTag " + e2.getMessage());
            }
        }
        AcLogUtil.e(TAG, "languageTag:" + string);
        return string;
    }

    public static boolean c(@Nullable Context context) {
        if (context == null) {
            AcLogUtil.i(TAG, "getTalkBackState getTalkBackState context == null");
            return false;
        }
        if (!(Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled", 0) == 1)) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList.isEmpty()) {
            AcLogUtil.i(TAG, "getTalkBackState getTalkBackState accessibilityServices isEmpty");
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if ("com.google.android.marvin.talkback".equals(accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName) && "com.google.android.marvin.talkback.TalkBackService".equals(accessibilityServiceInfo.getResolveInfo().serviceInfo.name)) {
                return true;
            }
        }
        return false;
    }
}
