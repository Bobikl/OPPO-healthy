package com.heytap.store.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class CouponsBean implements Serializable {
    private String code;
    private CouponsDetail mCouponsDetail;
    private String message;

    public class CouponsDetail implements Serializable {
        Long count;
        String link;
        String remark;
        int type;

        public CouponsDetail() {
        }

        public Long getCount() {
            return this.count;
        }

        public String getLink() {
            return this.link;
        }

        public String getRemark() {
            return this.remark;
        }

        public int getType() {
            return this.type;
        }

        public void setCount(Long l2) {
            this.count = l2;
        }

        public void setLink(String str) {
            this.link = str;
        }

        public void setRemark(String str) {
            this.remark = str;
        }

        public void setType(int i) {
            this.type = i;
        }

        public String toString() {
            return "CouponsBean{count=" + this.count + ", link='" + this.link + "', remark='" + this.remark + "', type=" + this.type + '}';
        }
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public CouponsDetail getmCouponsDetail() {
        return this.mCouponsDetail;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setmCouponsDetail(CouponsDetail couponsDetail) {
        this.mCouponsDetail = couponsDetail;
    }

    public String toString() {
        return "CouponsBean{code=" + this.code + ", message='" + this.message + "', mCouponsDetail=" + this.mCouponsDetail + '}';
    }
}
