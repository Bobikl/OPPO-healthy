package coil.util;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcoil/util/Time;", "", "", "a", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "provider", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class Time {

    @NotNull
    public static final Time INSTANCE = new Time();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static Function0<Long> provider = Time$provider$1.INSTANCE;

    public final long a() {
        return provider.invoke().longValue();
    }
}
