package com.heytap.health.sleep.description;

import android.content.Intent;
import androidx.preference.Preference;
import com.heytap.sporthealth.blib.helper.HCOUIJumpPreference;
import com.oplus.aiunit.vision.ugh;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/heytap/sporthealth/blib/helper/HCOUIJumpPreference;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SleepDescListFragment$showScreen$1$1$1 extends Lambda implements Function1<HCOUIJumpPreference, Unit> {
    final /* synthetic */ ugh $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepDescListFragment$showScreen$1$1$1(ugh ughVar) {
        super(1);
        this.$data = ughVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(HCOUIJumpPreference this_jump, ugh data, Preference preference) {
        Intrinsics.checkNotNullParameter(this_jump, "$this_jump");
        Intrinsics.checkNotNullParameter(data, "$data");
        this_jump.getContext().startActivity(new Intent(this_jump.getContext(), data.a()));
        return true;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HCOUIJumpPreference hCOUIJumpPreference) {
        invoke2(hCOUIJumpPreference);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final HCOUIJumpPreference jump) {
        Intrinsics.checkNotNullParameter(jump, "$this$jump");
        jump.setTitle(this.$data.getTitle());
        final ugh ughVar = this.$data;
        jump.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.heytap.health.sleep.description.a
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean onPreferenceClick(Preference preference) {
                return SleepDescListFragment$showScreen$1$1$1.invoke$lambda$0(jump, ughVar, preference);
            }
        });
    }
}
