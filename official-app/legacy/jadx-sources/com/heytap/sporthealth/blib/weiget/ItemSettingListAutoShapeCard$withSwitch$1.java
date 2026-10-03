package com.heytap.sporthealth.blib.weiget;

import android.view.View;
import android.widget.CompoundButton;
import com.coui.appcompat.couiswitch.COUISwitch;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/coui/appcompat/couiswitch/COUISwitch;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ItemSettingListAutoShapeCard$withSwitch$1 extends Lambda implements Function1<COUISwitch, Unit> {
    final /* synthetic */ CompoundButton.OnCheckedChangeListener $listener;
    final /* synthetic */ ItemSettingListAutoShapeCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemSettingListAutoShapeCard$withSwitch$1(ItemSettingListAutoShapeCard itemSettingListAutoShapeCard, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super(1);
        this.this$0 = itemSettingListAutoShapeCard;
        this.$listener = onCheckedChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(COUISwitch this_withSwitch, View view) {
        Intrinsics.checkNotNullParameter(this_withSwitch, "$this_withSwitch");
        this_withSwitch.performClick();
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(COUISwitch cOUISwitch) {
        invoke2(cOUISwitch);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final COUISwitch withSwitch) {
        Intrinsics.checkNotNullParameter(withSwitch, "$this$withSwitch");
        if (this.this$0.getEnable()) {
            withSwitch.setClickable(true);
            this.this$0.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.sporthealth.blib.weiget.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemSettingListAutoShapeCard$withSwitch$1.invoke$lambda$0(withSwitch, view);
                }
            });
            withSwitch.setOnCheckedChangeListener(this.$listener);
        }
    }
}
