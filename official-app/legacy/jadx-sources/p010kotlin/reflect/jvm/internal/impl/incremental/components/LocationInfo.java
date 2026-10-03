package p010kotlin.reflect.jvm.internal.impl.incremental.components;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface LocationInfo {
    @NotNull
    String getFilePath();

    @NotNull
    Position getPosition();
}
