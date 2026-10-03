package com.oplus.aiunit.vision;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import pantanal.app.bean.PantaCardEngineType;

/* JADX INFO: loaded from: classes11.dex */
public interface x6e {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void e(x6e x6eVar, int i, int i2, Map map, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onNewPluginFound");
        }
        if ((i3 & 4) != 0) {
            map = null;
        }
        x6eVar.a(i, i2, map);
    }

    default void a(int i, int i2, @Nullable Map<String, ? extends Object> map) {
    }

    @Deprecated(message = "please use onNewPluginFound instead")
    default void b(int i, int i2, int i3, long j2) {
    }

    void c(@NotNull PantaCardEngineType pantaCardEngineType);

    void d(@NotNull PantaCardEngineType pantaCardEngineType, int i, @NotNull String str);
}
