package com.heytap.health.ui.widget.listselector;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import com.coui.appcompat.picker.COUINumberPicker;
import com.google.android.material.timepicker.TimeModel;
import com.oplus.aiunit.vision.x05;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class BaseSelectPicker extends COUINumberPicker {
    private static final int DATA_STEP = 2;
    private static final String LOG_TAG = "ListSelectView";
    private static final int MAX_VALUE = 1;
    private static final int MIN_VALUE = 0;
    private static final int PICKER_INIT_MIN_VALUE = 0;
    private int[] mBasicDataInfo;
    private String[] mDisplayedValues;

    public BaseSelectPicker(Context context) {
        super(context);
    }

    public static String timestampToMMdd(long j2) {
        return x05.f(LocalDateTime.ofInstant(Instant.ofEpochMilli(j2 * 1000), ZoneId.systemDefault()).toLocalDate(), "MMMdd");
    }

    public String getDisplayedValue() {
        return this.mDisplayedValues[getValue()];
    }

    public int getSelectedData() {
        int value = getValue();
        int[] iArr = this.mBasicDataInfo;
        return iArr[0] + (value * iArr[2]);
    }

    public int getSelectedIndex() {
        return getValue();
    }

    public void initBasicDataInfo(int[] iArr, String str) {
        int i = (iArr[1] - iArr[0]) / iArr[2];
        this.mBasicDataInfo = iArr;
        setMinValue(0);
        setMaxValue(i);
        setHasBackground(true);
        this.mDisplayedValues = new String[i + 1];
        for (int i2 = 0; i2 <= i; i2++) {
            int i3 = iArr[0] + (iArr[2] * i2);
            this.mDisplayedValues[i2] = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i3)) + str;
        }
        setDisplayedValues(this.mDisplayedValues);
    }

    public void setSelectedData(int i) {
        int[] iArr = this.mBasicDataInfo;
        setValue((i - iArr[0]) / iArr[2]);
    }

    public void setSelectedIndex(int i) {
        setValue(i);
    }

    public BaseSelectPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseSelectPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void initBasicDataInfo(int[] iArr, String str, float f) {
        int i = (iArr[1] - iArr[0]) / iArr[2];
        this.mBasicDataInfo = iArr;
        setMinValue(0);
        setMaxValue(i);
        this.mDisplayedValues = new String[i + 1];
        for (int i2 = 0; i2 <= i; i2++) {
            float f2 = iArr[0] + (iArr[2] * i2);
            if (f2 != 0.0f) {
                f2 /= f;
            }
            String str2 = new DecimalFormat("##0.0").format(f2);
            this.mDisplayedValues[i2] = String.format(Locale.getDefault(), "%s", str2) + str;
        }
        setDisplayedValues(this.mDisplayedValues);
    }

    public void initBasicDataInfo(int[] iArr, String str, boolean z) {
        int i = (iArr[1] - iArr[0]) / iArr[2];
        this.mBasicDataInfo = iArr;
        setMinValue(0);
        setMaxValue(i);
        setHasBackground(true);
        this.mDisplayedValues = new String[i + 1];
        for (int i2 = 0; i2 <= i; i2++) {
            int i3 = iArr[0] + (iArr[2] * i2);
            if (z) {
                this.mDisplayedValues[i2] = timestampToMMdd(i3);
            } else {
                this.mDisplayedValues[i2] = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i3)) + str;
            }
        }
        setDisplayedValues(this.mDisplayedValues);
    }
}
