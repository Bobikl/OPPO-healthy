package com.oplus.channel.client.data;

import com.oplus.cardwidget.proto.CardActionProto;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"getLifeCircleAction", "", "Lcom/oplus/cardwidget/proto/CardActionProto;", "toAction", "Lcom/oplus/channel/client/data/Action;", "com.oplus.card.widget.cardwidget"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DataConverterUtilKt {
    @NotNull
    public static final String getLifeCircleAction(@NotNull CardActionProto cardActionProto) {
        String str;
        Intrinsics.checkNotNullParameter(cardActionProto, "<this>");
        Action action = toAction(cardActionProto);
        return (action.getAction() != 2 || (str = action.getExtraParams().get("life_circle")) == null) ? "" : str;
    }

    @NotNull
    public static final Action toAction(@NotNull CardActionProto cardActionProto) {
        Intrinsics.checkNotNullParameter(cardActionProto, "<this>");
        int action = cardActionProto.getAction();
        Map<String, String> paramMap = cardActionProto.getParamMap();
        Intrinsics.checkNotNullExpressionValue(paramMap, "this.paramMap");
        return new Action(false, action, paramMap, 1, null);
    }
}
