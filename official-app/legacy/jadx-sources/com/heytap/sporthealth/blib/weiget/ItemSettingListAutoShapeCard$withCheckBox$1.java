package com.heytap.sporthealth.blib.weiget;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/widget/CheckBox;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ItemSettingListAutoShapeCard$withCheckBox$1 extends Lambda implements Function1<CheckBox, Unit> {
    final /* synthetic */ CompoundButton.OnCheckedChangeListener $listener;
    final /* synthetic */ ItemSettingListAutoShapeCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemSettingListAutoShapeCard$withCheckBox$1(ItemSettingListAutoShapeCard itemSettingListAutoShapeCard, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super(1);
        this.this$0 = itemSettingListAutoShapeCard;
        this.$listener = onCheckedChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CheckBox this_withCheckBox, View view) {
        Intrinsics.checkNotNullParameter(this_withCheckBox, "$this_withCheckBox");
        this_withCheckBox.performClick();
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CheckBox checkBox) {
        invoke2(checkBox);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final CheckBox withCheckBox) {
        Intrinsics.checkNotNullParameter(withCheckBox, "$this$withCheckBox");
        if (this.this$0.getEnable()) {
            withCheckBox.setClickable(true);
            this.this$0.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.sporthealth.blib.weiget.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemSettingListAutoShapeCard$withCheckBox$1.invoke$lambda$0(withCheckBox, view);
                }
            });
        }
        withCheckBox.setOnCheckedChangeListener(this.$listener);
    }
}
