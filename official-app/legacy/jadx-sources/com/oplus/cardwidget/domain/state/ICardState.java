package com.oplus.cardwidget.domain.state;

import android.content.Context;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0011"}, d2 = {"Lcom/oplus/cardwidget/domain/state/ICardState;", "", "onCardCreate", "", "context", "Landroid/content/Context;", "widgetCode", "", "onCardsObserve", "widgetCodes", "", "onDestroy", "onPause", "onRenderFail", "onResume", "subscribed", "unSubscribed", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ICardState {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull ICardState iCardState, @NotNull Context context, @NotNull String widgetCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        }
    }

    void onCardCreate(@NotNull Context context, @NotNull String widgetCode);

    void onCardsObserve(@NotNull Context context, @NotNull List<String> widgetCodes);

    void onDestroy(@NotNull Context context, @NotNull String widgetCode);

    void onPause(@NotNull Context context, @NotNull String widgetCode);

    void onRenderFail(@NotNull Context context, @NotNull String widgetCode);

    void onResume(@NotNull Context context, @NotNull String widgetCode);

    void subscribed(@NotNull Context context, @NotNull String widgetCode);

    void unSubscribed(@NotNull Context context, @NotNull String widgetCode);
}
