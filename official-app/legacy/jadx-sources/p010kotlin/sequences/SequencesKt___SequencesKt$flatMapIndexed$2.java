package p010kotlin.sequences;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2<R> extends FunctionReferenceImpl implements Function1<Sequence<? extends R>, Iterator<? extends R>> {
    public static final SequencesKt___SequencesKt$flatMapIndexed$2 INSTANCE = new SequencesKt___SequencesKt$flatMapIndexed$2();

    public SequencesKt___SequencesKt$flatMapIndexed$2() {
        super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Iterator<R> invoke(@NotNull Sequence<? extends R> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.iterator();
    }
}
