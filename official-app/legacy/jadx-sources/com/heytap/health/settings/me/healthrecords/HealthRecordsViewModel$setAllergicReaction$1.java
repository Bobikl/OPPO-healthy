package com.heytap.health.settings.me.healthrecords;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class HealthRecordsViewModel$setAllergicReaction$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    public HealthRecordsViewModel$setAllergicReaction$1(Object obj) {
        super(1, obj, a.class, "onSetAllergicReactionFail", "onSetAllergicReactionFail(Ljava/lang/String;)V", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((a) this.receiver).p6(p0);
    }
}
