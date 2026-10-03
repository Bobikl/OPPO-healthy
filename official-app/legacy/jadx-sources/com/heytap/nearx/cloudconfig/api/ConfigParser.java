package com.heytap.nearx.cloudconfig.api;

import com.heytap.nearx.cloudconfig.anotation.Config;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H&¨\u0006\t"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/ConfigParser;", "", "configInfo", "Lkotlin/Pair;", "", "", "service", "Ljava/lang/Class;", "Companion", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface ConfigParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/ConfigParser$Companion;", "", "()V", "DEFAULT", "Lcom/heytap/nearx/cloudconfig/api/ConfigParser;", "getDEFAULT", "()Lcom/heytap/nearx/cloudconfig/api/ConfigParser;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final ConfigParser DEFAULT = new ConfigParser() { // from class: com.heytap.nearx.cloudconfig.api.ConfigParser$Companion$DEFAULT$1
            @Override // com.heytap.nearx.cloudconfig.api.ConfigParser
            @NotNull
            public Pair<String, Integer> configInfo(@NotNull Class<?> service) {
                Intrinsics.checkParameterIsNotNull(service, "service");
                Config config = (Config) service.getAnnotation(Config.class);
                if (!(config instanceof Config)) {
                    throw new IllegalArgumentException("make sure you have set annotation with Module: " + service);
                }
                if (!StringsKt__StringsJVMKt.isBlank(config.configCode())) {
                    return TuplesKt.to(config.configCode(), Integer.valueOf(config.type()));
                }
                throw new IllegalArgumentException("make sure you have set correct module[" + service + "] id");
            }
        };

        private Companion() {
        }

        @NotNull
        public final ConfigParser getDEFAULT() {
            return DEFAULT;
        }
    }

    @NotNull
    Pair<String, Integer> configInfo(@NotNull Class<?> service);
}
