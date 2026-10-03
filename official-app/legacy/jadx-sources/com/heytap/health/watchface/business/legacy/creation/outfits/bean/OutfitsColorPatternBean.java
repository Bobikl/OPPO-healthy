package com.heytap.health.watchface.business.legacy.creation.outfits.bean;

import android.graphics.Color;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OutfitsColorPatternBean {
    private String mMainColor;
    private String mSecondColor;
    private String mThirdColor;

    public OutfitsColorPatternBean(String str, String str2, String str3) {
        this.mMainColor = str;
        this.mSecondColor = str2;
        this.mThirdColor = str3;
    }

    public String getMainColor() {
        return this.mMainColor;
    }

    public int getMainColorInt() {
        return Color.parseColor(this.mMainColor);
    }

    public String getSecondColor() {
        return this.mSecondColor;
    }

    public int getSecondColorInt() {
        return Color.parseColor(this.mSecondColor);
    }

    public String getThirdColor() {
        return this.mThirdColor;
    }

    public int getThirdColorInt() {
        return Color.parseColor(this.mThirdColor);
    }

    public void setMainColor(String str) {
        this.mMainColor = str;
    }

    public void setSecondColor(String str) {
        this.mSecondColor = str;
    }

    public void setThirdColor(String str) {
        this.mThirdColor = str;
    }
}
