package com.platform.usercenter.account.ams.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcLoginParam {
    private String mTicket;

    public static class Builder {
        private String mTicket;

        public AcLoginParam create() {
            return new AcLoginParam(this);
        }

        public Builder setTicket(String str) {
            this.mTicket = str;
            return this;
        }
    }

    public String getTicket() {
        return this.mTicket;
    }

    private AcLoginParam(Builder builder) {
        this.mTicket = builder.mTicket;
    }
}
