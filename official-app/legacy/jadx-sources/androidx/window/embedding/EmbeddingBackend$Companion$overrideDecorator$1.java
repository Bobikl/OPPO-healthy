package androidx.window.embedding;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class EmbeddingBackend$Companion$overrideDecorator$1 extends FunctionReferenceImpl implements Function1<EmbeddingBackend, EmbeddingBackend> {
    public EmbeddingBackend$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, EmbeddingBackendDecorator.class, "decorate", "decorate(Landroidx/window/embedding/EmbeddingBackend;)Landroidx/window/embedding/EmbeddingBackend;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final EmbeddingBackend invoke(@NotNull EmbeddingBackend p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((EmbeddingBackendDecorator) this.receiver).decorate(p0);
    }
}
