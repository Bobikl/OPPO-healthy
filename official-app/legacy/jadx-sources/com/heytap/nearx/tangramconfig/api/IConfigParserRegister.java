package com.heytap.nearx.tangramconfig.api;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.Env;
import com.oplus.aiunit.vision.r7b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JG\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b\"\u0006\u0012\u0002\b\u00030\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/IConfigParserRegister;", "", "Lcom/heytap/nearx/tangramconfig/api/ConfigParser;", "configParser", "Lcom/heytap/nearx/tangramconfig/Env;", "apiEnv", "Lcom/oplus/aiunit/vision/r7b;", "logger", "", "Ljava/lang/Class;", "clazz", "", "registerConfigParser", "(Lcom/heytap/nearx/tangramconfig/api/ConfigParser;Lcom/heytap/nearx/tangramconfig/Env;Lcom/oplus/aiunit/vision/r7b;[Ljava/lang/Class;)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1})
public interface IConfigParserRegister {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void registerConfigParser$default(IConfigParserRegister iConfigParserRegister, ConfigParser configParser, Env env, r7b r7bVar, Class[] clsArr, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerConfigParser");
            }
            if ((i & 1) != 0) {
                configParser = null;
            }
            iConfigParserRegister.registerConfigParser(configParser, env, r7bVar, clsArr);
        }
    }

    void registerConfigParser(@Nullable ConfigParser configParser, @NotNull Env apiEnv, @NotNull r7b logger, @NotNull Class<?>... clazz);
}
