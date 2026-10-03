package p010kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TypeEnhancementInfo {

    @NotNull
    private final Map<Integer, JavaTypeQualifiers> map;

    public TypeEnhancementInfo(@NotNull Map<Integer, JavaTypeQualifiers> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    @NotNull
    public final Map<Integer, JavaTypeQualifiers> getMap() {
        return this.map;
    }
}
