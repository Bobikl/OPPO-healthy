package com.heytap.log.nx.obus;

import android.content.Context;

/* JADX INFO: loaded from: classes19.dex */
public class StatConfigInfo {
    private final Context appContext;
    private final String openid;
    private final String packName;
    private final String region;

    public static final class Builder {
        private Context appContext;
        private String mOpenId;
        private String mRegion;
        private String packName;

        public Builder ApplicationContext(Context context) {
            this.appContext = context;
            return this;
        }

        public Builder OpenId(String str) {
            this.mOpenId = str;
            return this;
        }

        public StatConfigInfo build() {
            StatConfigInfo statConfigInfo = new StatConfigInfo(this);
            if (statConfigInfo.getAppContext() != null) {
                return statConfigInfo;
            }
            throw new IllegalStateException("hlog: AppContext is not initialization");
        }

        public Builder packName(String str) {
            this.packName = str;
            return this;
        }

        public Builder region(String str) {
            this.mRegion = str;
            return this;
        }
    }

    public StatConfigInfo(Builder builder) {
        this.region = builder.mRegion;
        this.appContext = builder.appContext;
        this.openid = builder.mOpenId;
        this.packName = builder.packName;
    }

    public Context getAppContext() {
        return this.appContext;
    }

    public String getOpenId() {
        return this.openid;
    }

    public String getPackName() {
        return this.packName;
    }

    public String getRegion() {
        return this.region;
    }
}
