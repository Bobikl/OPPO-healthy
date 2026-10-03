package com.google.android.clockwork.companion.partnerapi;

/* JADX INFO: loaded from: classes13.dex */
final class AutoValue_AppNotificationConfig extends AppNotificationConfig {
    private final String appName;
    private final boolean canChangeMuteSetting;
    private final int notificationStatus;
    private final String packageName;

    public static final class Builder extends AppNotificationConfig.Builder {
        private String appName;
        private Boolean canChangeMuteSetting;
        private Integer notificationStatus;
        private String packageName;

        @Override // com.google.android.clockwork.companion.partnerapi.AppNotificationConfig.Builder
        public AppNotificationConfig build() {
            String str = "";
            if (this.packageName == null) {
                str = " packageName";
            }
            if (this.appName == null) {
                str = str + " appName";
            }
            if (this.canChangeMuteSetting == null) {
                str = str + " canChangeMuteSetting";
            }
            if (this.notificationStatus == null) {
                str = str + " notificationStatus";
            }
            if (str.isEmpty()) {
                return new AutoValue_AppNotificationConfig(this.packageName, this.appName, this.canChangeMuteSetting.booleanValue(), this.notificationStatus.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.clockwork.companion.partnerapi.AppNotificationConfig.Builder
        public AppNotificationConfig.Builder setAppName(String str) {
            if (str == null) {
                throw new NullPointerException("Null appName");
            }
            this.appName = str;
            return this;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.AppNotificationConfig.Builder
        public AppNotificationConfig.Builder setCanChangeMuteSetting(boolean z) {
            this.canChangeMuteSetting = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.AppNotificationConfig.Builder
        public AppNotificationConfig.Builder setNotificationStatus(int i) {
            this.notificationStatus = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.AppNotificationConfig.Builder
        public AppNotificationConfig.Builder setPackageName(String str) {
            if (str == null) {
                throw new NullPointerException("Null packageName");
            }
            this.packageName = str;
            return this;
        }

        public Builder() {
        }

        private Builder(AppNotificationConfig appNotificationConfig) {
            this.packageName = appNotificationConfig.getPackageName();
            this.appName = appNotificationConfig.getAppName();
            this.canChangeMuteSetting = Boolean.valueOf(appNotificationConfig.getCanChangeMuteSetting());
            this.notificationStatus = Integer.valueOf(appNotificationConfig.getNotificationStatus());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppNotificationConfig)) {
            return false;
        }
        AppNotificationConfig appNotificationConfig = (AppNotificationConfig) obj;
        return this.packageName.equals(appNotificationConfig.getPackageName()) && this.appName.equals(appNotificationConfig.getAppName()) && this.canChangeMuteSetting == appNotificationConfig.getCanChangeMuteSetting() && this.notificationStatus == appNotificationConfig.getNotificationStatus();
    }

    @Override // com.google.android.clockwork.companion.partnerapi.AppNotificationConfig
    public String getAppName() {
        return this.appName;
    }

    @Override // com.google.android.clockwork.companion.partnerapi.AppNotificationConfig
    public boolean getCanChangeMuteSetting() {
        return this.canChangeMuteSetting;
    }

    @Override // com.google.android.clockwork.companion.partnerapi.AppNotificationConfig
    @AppNotificationStatus
    public int getNotificationStatus() {
        return this.notificationStatus;
    }

    @Override // com.google.android.clockwork.companion.partnerapi.AppNotificationConfig
    public String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return this.notificationStatus ^ ((((((this.packageName.hashCode() ^ 1000003) * 1000003) ^ this.appName.hashCode()) * 1000003) ^ (this.canChangeMuteSetting ? 1231 : 1237)) * 1000003);
    }

    @Override // com.google.android.clockwork.companion.partnerapi.AppNotificationConfig
    public AppNotificationConfig.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "AppNotificationConfig{packageName=" + this.packageName + ", appName=" + this.appName + ", canChangeMuteSetting=" + this.canChangeMuteSetting + ", notificationStatus=" + this.notificationStatus + "}";
    }

    private AutoValue_AppNotificationConfig(String str, String str2, boolean z, int i) {
        this.packageName = str;
        this.appName = str2;
        this.canChangeMuteSetting = z;
        this.notificationStatus = i;
    }
}
