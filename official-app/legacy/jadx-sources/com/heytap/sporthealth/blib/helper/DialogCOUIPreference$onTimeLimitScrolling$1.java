package com.heytap.sporthealth.blib.helper;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class DialogCOUIPreference$onTimeLimitScrolling$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ Function3<Integer, Integer, String, Unit> $onChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogCOUIPreference$onTimeLimitScrolling$1(Function3<? super Integer, ? super Integer, ? super String, Unit> function3) {
        super(1);
        this.$onChange = function3;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String string = newValue.toString();
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{":"}, false, 0, 6, (Object) null);
        Pair pair = TuplesKt.to(Integer.valueOf(Integer.parseInt((String) listSplit$default.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(1))));
        this.$onChange.invoke(Integer.valueOf(((Number) pair.component1()).intValue()), Integer.valueOf(((Number) pair.component2()).intValue()), string);
    }
}
