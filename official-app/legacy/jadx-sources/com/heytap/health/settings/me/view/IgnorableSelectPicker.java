package com.heytap.health.settings.me.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import com.coui.appcompat.picker.COUINumberPicker;
import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class IgnorableSelectPicker extends COUINumberPicker {
    private static final int DATA_STEP_INDEX = 2;
    public static final int IGNORED_INDEX = -1;
    public static final String IGNORED_STRING = "--";
    private static final int MAX_VALUE_INDEX = 1;
    private static final int MIN_VALUE_INDEX = 0;
    private static final int PICKER_INIT_MIN_VALUE = 0;
    private static final String TAG = "IgnorableSelectPicker";
    private int[] mBasicDataInfo;
    private String[] mDisplayedValues;
    private boolean showIgnorable;

    public IgnorableSelectPicker(Context context) {
        super(context);
        this.showIgnorable = true;
    }

    public String getDisplayedValue() {
        return this.mDisplayedValues[getValue()];
    }

    public int getSelectedData() {
        int selectedIndex = getSelectedIndex();
        if (selectedIndex < 0) {
            return -1;
        }
        int[] iArr = this.mBasicDataInfo;
        return iArr[0] + (selectedIndex * iArr[2]);
    }

    public int getSelectedIndex() {
        return getValue() - (this.showIgnorable ? 1 : 0);
    }

    public void initBasicDataInfo(int[] iArr, String str) {
        initBasicDataInfo(iArr, str, "--", true);
    }

    public void resumeSelectable() {
        setDisplayedValues(this.mDisplayedValues);
        int[] iArr = this.mBasicDataInfo;
        int i = (iArr[1] - iArr[0]) / iArr[2];
        if (this.showIgnorable) {
            i++;
        }
        setMinValue(0);
        setMaxValue(i);
    }

    public void setSelectedData(int i) {
        int[] iArr = this.mBasicDataInfo;
        setValue(((i - iArr[0]) / iArr[2]) + (this.showIgnorable ? 1 : 0));
    }

    public void setSelectedIndex(int i) {
        setValue(i + (this.showIgnorable ? 1 : 0));
    }

    public void setUnSelectable() {
        setMinValue(0);
        setMaxValue(0);
        setDisplayedValues(new String[]{"--"});
    }

    public void initBasicDataInfo(int[] iArr, String str, String str2, boolean z) {
        int i;
        this.showIgnorable = z;
        int i2 = (iArr[1] - iArr[0]) / iArr[2];
        if (z) {
            i2++;
            i = 1;
        } else {
            i = 0;
        }
        this.mBasicDataInfo = iArr;
        setMinValue(0);
        setMaxValue(i2);
        setHasBackground(true);
        String[] strArr = new String[i2 + 1];
        this.mDisplayedValues = strArr;
        strArr[0] = str2;
        for (int i3 = i; i3 <= i2; i3++) {
            int i4 = (iArr[0] + (iArr[2] * i3)) - i;
            this.mDisplayedValues[i3] = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i4)) + str;
        }
        setDisplayedValues(this.mDisplayedValues);
    }

    public IgnorableSelectPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.showIgnorable = true;
    }

    public IgnorableSelectPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.showIgnorable = true;
    }
}
