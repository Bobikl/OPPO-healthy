package coil.util;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
final /* synthetic */ class Time$reset$1 extends FunctionReferenceImpl implements Function0<Long> {
    public static final Time$reset$1 INSTANCE = new Time$reset$1();

    public Time$reset$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
