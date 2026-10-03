package com.heytap.health.sunshine.ui.detail;

import com.coui.appcompat.picker.COUINumberPicker;
import com.heytap.health.sunshine.R$string;
import com.oplus.aiunit.vision.qtf;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/coui/appcompat/picker/COUINumberPicker;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SunshineDetailActivity$showValuePickerDialog$1$2$1 extends Lambda implements Function1<COUINumberPicker, Unit> {
    final /* synthetic */ int $pickerValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SunshineDetailActivity$showValuePickerDialog$1$2$1(int i) {
        super(1);
        this.$pickerValue = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$0(int i) {
        return String.valueOf(i * 5);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(COUINumberPicker cOUINumberPicker) {
        invoke2(cOUINumberPicker);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull COUINumberPicker valuePickerCreater) {
        Intrinsics.checkNotNullParameter(valuePickerCreater, "$this$valuePickerCreater");
        valuePickerCreater.setMinValue(2);
        valuePickerCreater.setMaxValue(24);
        valuePickerCreater.setValue(this.$pickerValue);
        valuePickerCreater.setSelectedValueWidth(qtf.b(30.0f));
        valuePickerCreater.setFormatter(new COUINumberPicker.c() { // from class: com.heytap.health.sunshine.ui.detail.b
            @Override // com.coui.appcompat.picker.COUINumberPicker.c
            public final String format(int i) {
                return SunshineDetailActivity$showValuePickerDialog$1$2$1.invoke$lambda$0(i);
            }
        });
        valuePickerCreater.setUnitText(qtf.l(R$string.health_sunshine_minute));
    }
}
