package com.heytap.wearable.watch.bandclock.clockdetail;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import com.heytap.health.ui.widget.listselector.BaseListSelector;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class StringFormatSelectPicker extends BaseListSelector {
    private static final int DATA_STEP = 2;
    private static final String LOG_TAG = "StringFormatSelectPicker";
    private static final int MAX_VALUE = 1;
    private static final int MIN_VALUE = 0;
    private static final int PICKER_INIT_MIN_VALUE = 0;
    private int[] mBasicDataInfo;
    private String[] mDisplayedValues;

    public StringFormatSelectPicker(Context context) {
        super(context);
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
        this.mDisplayedValues = new String[i + 1];
        for (int i2 = 0; i2 <= i; i2++) {
            this.mDisplayedValues[i2] = String.format(Locale.getDefault(), str, Integer.valueOf(iArr[0] + (iArr[2] * i2)));
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

    public StringFormatSelectPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StringFormatSelectPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
