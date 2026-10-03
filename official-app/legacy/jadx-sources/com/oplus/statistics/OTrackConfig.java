package com.oplus.statistics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
public class OTrackConfig {
    public static final OTrackConfig DUMMY = new OTrackConfig();
    public static final int ENV_DEBUG = 1;
    public static final int ENV_RELEASE = 0;
    public static final int HEADER_FLAG_GUID = 4;
    public static final int HEADER_FLAG_IMEI = 1;
    public static final int HEADER_FLAG_PCBA = 2;
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20085c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20086e;

    public static class Builder {
        public int a = 0;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20087c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f20088e;

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
            this.f20088e = str;
            return this;
        }

        public Builder setEnv(int i) {
            this.a = i;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f20087c = str;
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
        return this.f20086e;
    }

    public int getEnv() {
        return this.a;
    }

    public int getHeaderFlag() {
        return this.b;
    }

    public String getPackageName() {
        return this.f20085c;
    }

    public String getVersionName() {
        return this.d;
    }

    public void setAppName(String str) {
        this.f20086e = str;
    }

    public void setPackageName(String str) {
        this.f20085c = str;
    }

    public void setVersionName(String str) {
        this.d = str;
    }

    public OTrackConfig() {
        this.f20085c = "";
        this.d = "";
        this.f20086e = "";
    }

    public OTrackConfig(Builder builder) {
        this.f20085c = "";
        this.d = "";
        this.f20086e = "";
        this.a = builder.a;
        this.f20085c = builder.f20087c;
        this.d = builder.d;
        this.f20086e = builder.f20088e;
        this.b = builder.b;
    }
}
