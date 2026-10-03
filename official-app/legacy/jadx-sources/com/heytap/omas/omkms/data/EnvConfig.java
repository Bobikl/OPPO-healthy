package com.heytap.omas.omkms.data;

import androidx.annotation.Keep;
import com.heytap.omas.omkms.exception.AuthenticationException;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public enum EnvConfig {
    RELEASE(Env.RELEASE),
    DEV(Env.DEV),
    TEST(Env.TEST);

    private final Env env;

    @Keep
    public enum Env {
        RELEASE { // from class: com.heytap.omas.omkms.data.EnvConfig.Env.1
            @Override // com.heytap.omas.omkms.data.EnvConfig.Env
            public String getEnvName() {
                return "release-env";
            }

            @Override // com.heytap.omas.omkms.data.EnvConfig.Env
            public String getEnvUrl() {
                return com.heytap.omas.omkms.network.a.a();
            }
        },
        DEV { // from class: com.heytap.omas.omkms.data.EnvConfig.Env.2
            @Override // com.heytap.omas.omkms.data.EnvConfig.Env
            public String getEnvName() {
                return "dev-env";
            }

            @Override // com.heytap.omas.omkms.data.EnvConfig.Env
            public String getEnvUrl() throws AuthenticationException {
                try {
                    Class<?> cls = Class.forName("com.oplus.seckitenv.EnvConfig");
                    return (String) cls.getDeclaredMethod("getDevHost", new Class[0]).invoke(cls.newInstance(), new Object[0]);
                } catch (Exception e2) {
                    com.heytap.omas.a.e.i.b("Env", "getEnvUrl: " + e2);
                    throw new AuthenticationException("Should use debugImplementation for seckit-env dependencies." + e2);
                }
            }
        },
        TEST { // from class: com.heytap.omas.omkms.data.EnvConfig.Env.3
            @Override // com.heytap.omas.omkms.data.EnvConfig.Env
            public String getEnvName() {
                return "test-env";
            }

            @Override // com.heytap.omas.omkms.data.EnvConfig.Env
            public String getEnvUrl() throws AuthenticationException {
                try {
                    Class<?> cls = Class.forName("com.oplus.seckitenv.EnvConfig");
                    return (String) cls.getDeclaredMethod("getTestHost", new Class[0]).invoke(cls.newInstance(), new Object[0]);
                } catch (Exception e2) {
                    com.heytap.omas.a.e.i.b("Env", "getEnvUrl: exception detail:" + e2);
                    throw new AuthenticationException("Should use debugImplementation for seckit-env dependencies." + e2);
                }
            }
        };

        public abstract String getEnvName();

        public abstract String getEnvUrl() throws AuthenticationException;
    }

    EnvConfig(Env env) {
        this.env = env;
    }

    public String getEnvName() {
        return this.env.getEnvName();
    }

    public String getEnvUrl() throws AuthenticationException {
        return this.env.getEnvUrl();
    }
}
