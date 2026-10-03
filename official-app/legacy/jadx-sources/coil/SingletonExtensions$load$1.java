package coil;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: coil.-SingletonExtensions$load$1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil/request/a$a;", "", "invoke", "(Lcoil/request/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,114:1\n*E\n"})
public final class SingletonExtensions$load$1 extends Lambda implements Function1<coil.request.a.C0136a, Unit> {
    public static final SingletonExtensions$load$1 INSTANCE = new SingletonExtensions$load$1();

    public SingletonExtensions$load$1() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull coil.request.a.C0136a c0136a) {
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(coil.request.a.C0136a c0136a) {
        invoke2(c0136a);
        return Unit.INSTANCE;
    }
}
