package p010kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public final class ExcludedTypeAnnotations {

    @NotNull
    public static final ExcludedTypeAnnotations INSTANCE = new ExcludedTypeAnnotations();

    @NotNull
    private static final Set<FqName> internalAnnotationsForResolve = SetsKt__SetsKt.setOf((Object[]) new FqName[]{new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact")});

    private ExcludedTypeAnnotations() {
    }

    @NotNull
    public final Set<FqName> getInternalAnnotationsForResolve() {
        return internalAnnotationsForResolve;
    }
}
