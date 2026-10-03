package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class ve2 {
    public static final char ENABLED_ACCESSIBILITY_SERVICES_SEPARATOR = ':';
    public static final TextUtils.SimpleStringSplitter a = new TextUtils.SimpleStringSplitter(':');

    public static Set<ComponentName> a(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
        if (string == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        TextUtils.SimpleStringSplitter simpleStringSplitter = a;
        simpleStringSplitter.setString(string);
        while (simpleStringSplitter.hasNext()) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(simpleStringSplitter.next());
            if (componentNameUnflattenFromString != null) {
                hashSet.add(componentNameUnflattenFromString);
            }
        }
        return hashSet;
    }

    public static boolean b(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean c(Context context) {
        return d(context) && b(context);
    }

    public static boolean d(Context context) {
        Set<ComponentName> setA = a(context);
        if (setA != null && !setA.isEmpty()) {
            Iterator<ComponentName> it = setA.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().getPackageName(), "com.google.android.marvin.talkback")) {
                    return true;
                }
            }
        }
        return false;
    }
}
