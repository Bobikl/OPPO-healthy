package com.sensorsdata.analytics.android.autotrack.utils;

import android.view.View;
import android.view.ViewGroup;
import com.sensorsdata.analytics.android.autotrack.R;
import com.sensorsdata.analytics.android.sdk.util.SAViewUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class KeyboardViewUtil {
    private static final String MATCH_RULE_KEYBOARD = "^([A-Za-z]|[0-9])";
    private static final String TAG_KEYBOARD = "keyboard_tag";
    private static boolean isSensorsCheckKeyboard = true;

    private static boolean getKeyboardSimilarFatherView(View view) {
        boolean z;
        if (!(view.getParent() instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup.getTag(R.id.sensors_analytics_tag_view_keyboard) != null) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        if (childCount <= 1) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        for (int i = 0; i < childCount; i++) {
            if (iIndexOfChild != i) {
                View childAt = viewGroup.getChildAt(i);
                int i2 = R.id.sensors_analytics_tag_view_keyboard;
                if (childAt.getTag(i2) == null) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        int childCount2 = viewGroup2.getChildCount();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= childCount2) {
                                z = false;
                                break;
                            }
                            if (Pattern.matches(MATCH_RULE_KEYBOARD, SAViewUtils.getViewContent(viewGroup2.getChildAt(i3)))) {
                                z = true;
                                break;
                            }
                            i3++;
                        }
                        if (z) {
                            int i4 = R.id.sensors_analytics_tag_view_keyboard;
                            viewGroup2.setTag(i4, TAG_KEYBOARD);
                            viewGroup.setTag(i4, TAG_KEYBOARD);
                        }
                    } else if (Pattern.matches(MATCH_RULE_KEYBOARD, SAViewUtils.getViewContent(childAt))) {
                        childAt.setTag(i2, TAG_KEYBOARD);
                        viewGroup.setTag(i2, TAG_KEYBOARD);
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static boolean getKeyboardSimilarView(View view) {
        if (!(view.getParent() instanceof ViewGroup)) {
            return getKeyboardSimilarFatherView((View) view.getParent());
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup.getTag(R.id.sensors_analytics_tag_view_keyboard) != null) {
            return true;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        int childCount = viewGroup.getChildCount();
        if (childCount <= 1) {
            return getKeyboardSimilarFatherView(viewGroup);
        }
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (iIndexOfChild != i && Pattern.matches(MATCH_RULE_KEYBOARD, SAViewUtils.getViewContent(viewGroup.getChildAt(i)))) {
                z = true;
                break;
            }
        }
        if (!z) {
            return getKeyboardSimilarFatherView(viewGroup);
        }
        viewGroup.setTag(R.id.sensors_analytics_tag_view_keyboard, TAG_KEYBOARD);
        return true;
    }

    public static boolean isKeyboardView(View view) {
        if (isSensorsCheckKeyboard && view != null && Pattern.matches(MATCH_RULE_KEYBOARD, SAViewUtils.getViewContent(view))) {
            return getKeyboardSimilarView(view);
        }
        return false;
    }
}
