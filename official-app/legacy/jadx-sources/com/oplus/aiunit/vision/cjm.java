package com.oplus.aiunit.vision;

import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.cardwidget.dataLayer.CardDataRepository;
import com.oplus.cardwidget.domain.command.data.UpdateLayoutCommand;
import com.oplus.cardwidget.util.Logger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/cjm;", "", "Lcom/oplus/cardwidget/domain/command/data/UpdateLayoutCommand;", EngineConstant.WAKEUP_TYPE_COMMAND, "", "a", "<init>", "()V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final class cjm {
    public void a(@NotNull UpdateLayoutCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        Logger.INSTANCE.i("Update.SwitchLayoutCommandHandler", command.getWidgetCode() + " handle command is: " + command);
        CardDataRepository cardDataRepository = CardDataRepository.INSTANCE;
        cardDataRepository.setLayoutUpdateTime$com_oplus_card_widget_cardwidget(command.getWidgetCode(), null);
        cardDataRepository.updateLayoutData$com_oplus_card_widget_cardwidget(command.getWidgetCode(), command.getLayoutData());
        cardDataRepository.updateLayoutName$com_oplus_card_widget_cardwidget(command.getWidgetCode(), command.getLayoutName());
        command.setConsumeTime(System.currentTimeMillis());
    }
}
