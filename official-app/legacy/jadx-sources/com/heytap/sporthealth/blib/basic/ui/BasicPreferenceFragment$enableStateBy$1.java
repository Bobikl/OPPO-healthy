package com.heytap.sporthealth.blib.basic.ui;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u0004*\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "D", "VM", "Lcom/heytap/sporthealth/blib/basic/BasicStateViewModel;", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nBasicPreferenceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicPreferenceFragment.kt\ncom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment$enableStateBy$1\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n*L\n1#1,152:1\n155#2:153\n*S KotlinDebug\n*F\n+ 1 BasicPreferenceFragment.kt\ncom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment$enableStateBy$1\n*L\n130#1:153\n*E\n"})
public final class BasicPreferenceFragment$enableStateBy$1 extends Lambda implements Function1<Object, Boolean> {
    final /* synthetic */ Function1<Object, Boolean> $transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicPreferenceFragment$enableStateBy$1(Function1<Object, Boolean> function1) {
        super(1);
        this.$transform = function1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function1
    @Nullable
    public final Boolean invoke(@Nullable Object obj) {
        Function1<Object, Boolean> function1 = this.$transform;
        Intrinsics.reifiedOperationMarker(2, "D");
        Intrinsics.checkNotNull(obj);
        return function1.invoke(obj);
    }
}
