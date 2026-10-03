package com.heytap.health.wallet.bus.model;

import androidx.annotation.Keep;
import com.heytap.health.base.text.GsonUtil;
import com.oplus.aiunit.vision.t6b;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class BusTag {
    private static final String TAG = "BusTag";
    private List<CardTagBean> card_tag;

    @Keep
    public static class CardTagBean {
        private String border_color;
        private String text;
        private String text_color;

        public String getBorder_color() {
            return this.border_color;
        }

        public String getText() {
            return this.text;
        }

        public String getText_color() {
            return this.text_color;
        }

        public void setBorder_color(String str) {
            this.border_color = str;
        }

        public void setText(String str) {
            this.text = str;
        }

        public void setText_color(String str) {
            this.text_color = str;
        }
    }

    public static BusTag parseByJson(String str) {
        try {
            return (BusTag) GsonUtil.a(str, BusTag.class);
        } catch (Exception e2) {
            t6b.d(TAG, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return null;
        }
    }

    public List<CardTagBean> getCard_tag() {
        return this.card_tag;
    }

    public void setCard_tag(List<CardTagBean> list) {
        this.card_tag = list;
    }
}
