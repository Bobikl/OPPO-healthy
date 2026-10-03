package com.heytap.sporthealth.blib.basic.ui;

import com.coui.appcompat.preference.COUISwitchLoadingPreference;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00042\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "D", "VM", "Lcom/heytap/sporthealth/blib/basic/BasicStateViewModel;", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nBasicPreferenceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicPreferenceFragment.kt\ncom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment$checkStateBy$4\n*L\n1#1,152:1\n*E\n"})
public final class BasicPreferenceFragment$checkStateBy$4 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ COUISwitchLoadingPreference $this_checkStateBy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicPreferenceFragment$checkStateBy$4(COUISwitchLoadingPreference cOUISwitchLoadingPreference) {
        super(1);
        this.$this_checkStateBy = cOUISwitchLoadingPreference;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean it) {
        this.$this_checkStateBy.stopLoading();
        COUISwitchLoadingPreference cOUISwitchLoadingPreference = this.$this_checkStateBy;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        cOUISwitchLoadingPreference.setChecked(it.booleanValue());
    }
}
