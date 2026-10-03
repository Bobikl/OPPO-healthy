package com.heytap.nearx.uikit.widget.cardlist;

import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.heytap.nearx.uikit.widget.preference.NearCardSupportInterface;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class NearCardListHelper {
    public static final int FULL = 4;
    public static final int HEAD = 1;
    public static final int MIDDLE = 2;
    public static final int NONE = 0;
    public static final int TAIL = 3;

    public static int getPositionInGroup(int i, int i2) {
        if (i == 1) {
            return 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2 == i - 1 ? 3 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isSupportCard(PreferenceGroup preferenceGroup, Preference preference) {
        if (preferenceGroup instanceof PreferenceScreen) {
            return (preference instanceof NearCardSupportInterface) && ((NearCardSupportInterface) preference).isSupportCardUse();
        }
        return !(preference instanceof PreferenceCategory);
    }

    public static void setItemCardBackground(View view, int i) {
        if (view == null || !(view instanceof NearCardListSelectedItemLayout)) {
            return;
        }
        ((NearCardListSelectedItemLayout) view).setPositionInGroup(i);
    }

    public static int getPositionInGroup(Preference preference) {
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
        int i4 = (preference3 == null || !isSupportCard(parent, preference3)) ? 1 : 2;
        if (preference4 == null || !isSupportCard(parent, preference4)) {
            return i4 == 1 ? 4 : 3;
        }
        return i4;
    }
}
