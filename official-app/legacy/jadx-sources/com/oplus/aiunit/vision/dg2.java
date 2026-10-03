package com.oplus.aiunit.vision;

import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.coui.appcompat.preference.ListSelectedItemLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class dg2 {
    public static final int FULL = 4;
    public static final int HEAD = 1;
    public static final int MIDDLE = 2;
    public static final int NONE = 0;
    public static final int TAIL = 3;

    public static int a(int i, int i2) {
        if (i == 1) {
            return 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2 == i - 1 ? 3 : 2;
    }

    public static int b(Preference preference) {
        PreferenceGroup parent = preference.getParent();
        int i = 0;
        if (parent == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < parent.getPreferenceCount(); i2++) {
            Preference preference2 = parent.getPreference(i2);
            if (preference2.isVisible()) {
                arrayList.add(preference2);
            }
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (preference == arrayList.get(i3)) {
                i = i3;
                break;
            }
        }
        Preference preference3 = i > 0 ? (Preference) arrayList.get(i - 1) : null;
        Preference preference4 = i < size - 1 ? (Preference) arrayList.get(i + 1) : null;
        int i4 = (preference3 == null || !c(parent, preference3)) ? 1 : 2;
        if (preference4 == null || !c(parent, preference4)) {
            return i4 == 1 ? 4 : 3;
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(PreferenceGroup preferenceGroup, Preference preference) {
        if (preferenceGroup instanceof PreferenceScreen) {
            return (preference instanceof eg2) && ((eg2) preference).isSupportCardUse();
        }
        return !(preference instanceof PreferenceCategory);
    }

    public static void d(View view, int i) {
        if (view instanceof ListSelectedItemLayout) {
            ((ListSelectedItemLayout) view).setPositionInGroup(i);
        }
    }
}
