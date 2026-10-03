package com.heytap.health.wallet.bus.model;

import androidx.annotation.Keep;
import com.heytap.health.base.text.GsonUtil;
import com.oplus.aiunit.vision.t6b;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class BusAreaAndDiscount {
    private static final String TAG = "BusAreaAndDiscount";
    private List<DiscountInfoBean> discount_info;

    @Keep
    public static class DiscountInfoBean {
        private String content;
        private String title;
        private String title_color;
        private String url;

        public String getContent() {
            return this.content;
        }

        public String getTitle() {
            return this.title;
        }

        public String getTitle_color() {
            return this.title_color;
        }

        public String getUrl() {
            return this.url;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setTitle_color(String str) {
            this.title_color = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public static BusAreaAndDiscount parseByJson(String str) {
        try {
            return (BusAreaAndDiscount) GsonUtil.a(str, BusAreaAndDiscount.class);
        } catch (Exception e2) {
            t6b.d(TAG, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return null;
        }
    }

    public List<DiscountInfoBean> getDiscount_info() {
        return this.discount_info;
    }

    public void setDiscount_info(List<DiscountInfoBean> list) {
        this.discount_info = list;
    }
}
