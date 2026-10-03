package com.oplus.statistics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class OTrackConfig {
    public static final OTrackConfig DUMMY = new OTrackConfig();
    public static final int ENV_DEBUG = 1;
    public static final int ENV_RELEASE = 0;
    public static final int HEADER_FLAG_GUID = 4;
    public static final int HEADER_FLAG_IMEI = 1;
    public static final int HEADER_FLAG_PCBA = 2;
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;

    public static class Builder {
        public int a = 0;
        public int b;
        public String c;
        public String d;
        public String e;

        public OTrackConfig build() {
            return new OTrackConfig(this);
        }

        public Builder enableGuidHeader() {
            this.b |= 4;
            return this;
        }

        public Builder enableImeiHeader() {
            this.b |= 1;
            return this;
        }

        public Builder enablePcbaHeader() {
            this.b |= 2;
            return this;
        }

        public Builder setAppName(String str) {
            this.e = str;
            return this;
        }

        public Builder setEnv(int i) {
            this.a = i;
            return this;
        }

        public Builder setPackageName(String str) {
            this.c = str;
            return this;
        }

        public Builder setVersionName(String str) {
            this.d = str;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EnvType {
    }

    public String getAppName() {
        return this.e;
    }

    public int getEnv() {
        return this.a;
    }

    public int getHeaderFlag() {
        return this.b;
    }

    public String getPackageName() {
        return this.c;
    }

    public String getVersionName() {
        return this.d;
    }

    public void setAppName(String str) {
        this.e = str;
    }

    public void setPackageName(String str) {
        this.c = str;
    }

    public void setVersionName(String str) {
        this.d = str;
    }

    public OTrackConfig() {
        this.c = "";
        this.d = "";
        this.e = "";
    }

    public OTrackConfig(Builder builder) {
        this.c = "";
        this.d = "";
        this.e = "";
        this.a = builder.a;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.b = builder.b;
    }
}
