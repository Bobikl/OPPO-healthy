package com.oplus.cardwidget.domain.command.data;

import com.oplus.cardwidget.domain.pack.BaseDataPack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/oplus/cardwidget/domain/command/data/CardUpdateCommand;", "Lcom/oplus/cardwidget/domain/command/data/BaseCardCommand;", "widgetCode", "", "data", "Lcom/oplus/cardwidget/domain/pack/BaseDataPack;", "(Ljava/lang/String;Lcom/oplus/cardwidget/domain/pack/BaseDataPack;)V", "getData", "()Lcom/oplus/cardwidget/domain/pack/BaseDataPack;", "getWidgetCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardUpdateCommand extends BaseCardCommand {

    @NotNull
    private final BaseDataPack data;

    @NotNull
    private final String widgetCode;

    public CardUpdateCommand(@NotNull String widgetCode, @NotNull BaseDataPack data) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(data, "data");
        this.widgetCode = widgetCode;
        this.data = data;
        setGenTime(System.currentTimeMillis());
    }

    public static /* synthetic */ CardUpdateCommand copy$default(CardUpdateCommand cardUpdateCommand, String str, BaseDataPack baseDataPack, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardUpdateCommand.widgetCode;
        }
        if ((i & 2) != 0) {
            baseDataPack = cardUpdateCommand.data;
        }
        return cardUpdateCommand.copy(str, baseDataPack);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BaseDataPack getData() {
        return this.data;
    }

    @NotNull
    public final CardUpdateCommand copy(@NotNull String widgetCode, @NotNull BaseDataPack data) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(data, "data");
        return new CardUpdateCommand(widgetCode, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardUpdateCommand)) {
            return false;
        }
        CardUpdateCommand cardUpdateCommand = (CardUpdateCommand) other;
        return Intrinsics.areEqual(this.widgetCode, cardUpdateCommand.widgetCode) && Intrinsics.areEqual(this.data, cardUpdateCommand.data);
    }

    @NotNull
    public final BaseDataPack getData() {
        return this.data;
    }

    @NotNull
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    public int hashCode() {
        return (this.widgetCode.hashCode() * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "CardUpdateCommand(widgetCode=" + this.widgetCode + ", data=" + this.data + ")";
    }
}
