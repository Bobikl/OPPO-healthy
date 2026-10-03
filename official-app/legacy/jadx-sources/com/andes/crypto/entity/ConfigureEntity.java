package com.andes.crypto.entity;

import android.content.Context;
import androidx.annotation.Keep;
import com.andes.crypto.enums.EnvironmentType;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public class ConfigureEntity {
    private final Context context;
    private final EnvironmentType environmentType;
    private final String publicKey;

    @Keep
    public static final class Builder {
        private Context context;
        private EnvironmentType environmentType;
        private String publicKey;

        public ConfigureEntity build() {
            return new ConfigureEntity(this);
        }

        public Builder setContext(Context context) {
            this.context = context;
            return this;
        }

        public Builder setEnvironment(EnvironmentType environmentType) {
            this.environmentType = environmentType;
            return this;
        }

        public Builder setPublicKey(String str) {
            this.publicKey = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Context getContext() {
        return this.context;
    }

    public EnvironmentType getEnvironmentType() {
        return this.environmentType;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    private ConfigureEntity(Builder builder) {
        this.environmentType = builder.environmentType;
        this.context = builder.context;
        this.publicKey = builder.publicKey;
    }
}
