package com.oplus.aiunit.vision;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, d2 = {"Lpantanal/internal/datachannel/CardAction;", "", "b", "", "a", "pantanal-interface_release"}, k = 2, mv = {1, 8, 0})
public final class wy2 {
    public static final int a(@NotNull CardAction cardAction) {
        Intrinsics.checkNotNullParameter(cardAction, "<this>");
        if (cardAction.getAction() != 2) {
            return 0;
        }
        ConcurrentHashMap<String, String> param = cardAction.getParam();
        String str = param != null ? param.get("life_circle") : null;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1352294148:
                if (!str.equals("create")) {
                    return 0;
                }
                return 300;
            case -1219769254:
                return !str.equals("subscribed") ? 0 : 200;
            case -934426579:
                if (!str.equals("resume")) {
                    return 0;
                }
                return 600;
            case -573930144:
                if (!str.equals(CardAction.LIFE_CIRCLE_VALUE_UPDATE_DATA)) {
                    return 0;
                }
                return 300;
            case 3202370:
                if (!str.equals(CardAction.LIFE_CIRCLE_VALUE_HIDE)) {
                    return 0;
                }
                return 700;
            case 3529469:
                if (!str.equals(CardAction.LIFE_CIRCLE_VALUE_SHOW)) {
                    return 0;
                }
                return 600;
            case 106440182:
                if (!str.equals("pause")) {
                    return 0;
                }
                return 700;
            case 901853107:
                return !str.equals("unsubscribed") ? 0 : 900;
            case 1557372922:
                return !str.equals("destroy") ? 0 : 1000;
            default:
                return 0;
        }
    }

    @NotNull
    public static final String b(@NotNull CardAction cardAction) {
        Intrinsics.checkNotNullParameter(cardAction, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("CardAction(");
        sb.append("action=" + cardAction.getAction());
        ConcurrentHashMap<String, String> param = cardAction.getParam();
        boolean z = false;
        if (param != null && (!param.isEmpty())) {
            z = true;
        }
        if (z) {
            sb.append(",param=" + cardAction.getParam() + ")");
        } else {
            sb.append(")");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "simpleCardAction.toString()");
        return string;
    }
}
