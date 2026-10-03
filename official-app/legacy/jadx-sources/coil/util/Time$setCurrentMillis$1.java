package coil.util;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class Time$setCurrentMillis$1 extends Lambda implements Function0<Long> {
    final /* synthetic */ long $currentMillis;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Time$setCurrentMillis$1(long j2) {
        super(0);
        this.$currentMillis = j2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final Long invoke() {
        return Long.valueOf(this.$currentMillis);
    }
}
