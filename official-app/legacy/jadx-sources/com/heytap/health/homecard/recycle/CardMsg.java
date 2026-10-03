package com.heytap.health.homecard.recycle;

import androidx.annotation.Keep;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.homecard.constant.HomeCardDataEnum$TextOneSpanStyle;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class CardMsg {
    private String cardCode;
    private HomeCardDataEnum$CardUiMode cardUiMode;
    private String className;
    private HomeCardDataEnum$DataType dataType;
    private int displayPos;
    private HomeCardDataEnum$TextOneSpanStyle style;

    public CardMsg(HomeCardDataEnum$DataType homeCardDataEnum$DataType, HomeCardDataEnum$CardUiMode homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle homeCardDataEnum$TextOneSpanStyle, int i, String str) {
        this.dataType = homeCardDataEnum$DataType;
        this.cardUiMode = homeCardDataEnum$CardUiMode;
        this.style = homeCardDataEnum$TextOneSpanStyle;
        this.displayPos = i;
        this.className = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.dataType == ((CardMsg) obj).dataType;
    }

    public HomeCardDataEnum$CardUiMode getCardUiMode() {
        return this.cardUiMode;
    }

    public String getClassName() {
        return this.className;
    }

    public HomeCardDataEnum$DataType getDataType() {
        return this.dataType;
    }

    public int getDisplayPos() {
        return this.displayPos;
    }

    public HomeCardDataEnum$TextOneSpanStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        return Objects.hash(this.dataType);
    }

    public void setCardUiMode(HomeCardDataEnum$CardUiMode homeCardDataEnum$CardUiMode) {
        this.cardUiMode = homeCardDataEnum$CardUiMode;
    }

    public void setClassName(String str) {
        this.className = str;
    }

    public void setDataType(HomeCardDataEnum$DataType homeCardDataEnum$DataType) {
        this.dataType = homeCardDataEnum$DataType;
    }

    public void setDisplayPos(int i) {
        this.displayPos = i;
    }

    public void setStyle(HomeCardDataEnum$TextOneSpanStyle homeCardDataEnum$TextOneSpanStyle) {
        this.style = homeCardDataEnum$TextOneSpanStyle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardMsg{dataType=");
        Object obj = this.dataType;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", cardType=");
        Object obj2 = this.cardUiMode;
        if (obj2 == null) {
            obj2 = "null";
        }
        sb.append(obj2);
        sb.append(", style=");
        Object obj3 = this.style;
        if (obj3 == null) {
            obj3 = "null";
        }
        sb.append(obj3);
        sb.append(", className='");
        String str = this.className;
        sb.append(str != null ? str : "null");
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public CardMsg() {
    }

    public CardMsg(HomeCardDataEnum$DataType homeCardDataEnum$DataType) {
        this.dataType = homeCardDataEnum$DataType;
    }
}
