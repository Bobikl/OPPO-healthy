package com.heytap.health.core.provider.auth.struct;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class WhiteCallerBody {
    private String config;
    private int switchStatus;

    @Keep
    public static class ConfigBean {
        private String packageName;
        private List<String> scopes;
        private List<String> sha1;

        public ConfigBean(String str, List<String> list, List<String> list2) {
            this.packageName = str;
            this.sha1 = list;
            this.scopes = list2;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public List<String> getScopes() {
            return this.scopes;
        }

        public List<String> getSha1() {
            return this.sha1;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setScopes(List<String> list) {
            this.scopes = list;
        }

        public void setSha1(List<String> list) {
            this.sha1 = list;
        }

        public String toString() {
            return "ConfigBean{packageName='" + this.packageName + "', sha1=" + this.sha1 + ", scopes=" + this.scopes + '}';
        }
    }

    public String getConfig() {
        return this.config;
    }

    public int getSwitchStatus() {
        return this.switchStatus;
    }

    public void setConfig(String str) {
        this.config = str;
    }

    public void setSwitchStatus(int i) {
        this.switchStatus = i;
    }
}
