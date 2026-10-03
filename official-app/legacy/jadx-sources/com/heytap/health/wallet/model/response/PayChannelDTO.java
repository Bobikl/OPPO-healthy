package com.heytap.health.wallet.model.response;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class PayChannelDTO {

    @Tag(3)
    private String channelIcon;

    @Tag(2)
    private int channelType;

    @Tag(5)
    private String commendText;

    @Tag(4)
    private String frameColor;
    private transient boolean isSelect = false;

    @Tag(1)
    private String showName;

    @Tag(6)
    private String textColor;

    public String getChannelIcon() {
        return this.channelIcon;
    }

    public int getChannelType() {
        return this.channelType;
    }

    public String getCommendText() {
        return this.commendText;
    }

    public String getFrameColor() {
        return this.frameColor;
    }

    public String getShowName() {
        return this.showName;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setChannelIcon(String str) {
        this.channelIcon = str;
    }

    public void setChannelType(int i) {
        this.channelType = i;
    }

    public void setCommendText(String str) {
        this.commendText = str;
    }

    public void setFrameColor(String str) {
        this.frameColor = str;
    }

    public void setSelect(boolean z) {
        this.isSelect = z;
    }

    public void setShowName(String str) {
        this.showName = str;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
