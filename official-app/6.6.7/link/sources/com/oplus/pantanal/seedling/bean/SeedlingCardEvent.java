package com.oplus.pantanal.seedling.bean;

import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingCardEvent;", "", "card", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", ParserTag.TAG_ACTION, "", "params", "Lorg/json/JSONObject;", "(Lcom/oplus/pantanal/seedling/bean/SeedlingCard;ILorg/json/JSONObject;)V", "getAction", "()I", "getCard", "()Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "getParams", "()Lorg/json/JSONObject;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SeedlingCardEvent {
    private final int action;

    @NotNull
    private final SeedlingCard card;

    @NotNull
    private final JSONObject params;

    public SeedlingCardEvent(@NotNull SeedlingCard seedlingCard, int i, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(seedlingCard, "card");
        Intrinsics.checkNotNullParameter(jSONObject, "params");
        this.card = seedlingCard;
        this.action = i;
        this.params = jSONObject;
    }

    public static /* synthetic */ SeedlingCardEvent copy$default(SeedlingCardEvent seedlingCardEvent, SeedlingCard seedlingCard, int i, JSONObject jSONObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            seedlingCard = seedlingCardEvent.card;
        }
        if ((i2 & 2) != 0) {
            i = seedlingCardEvent.action;
        }
        if ((i2 & 4) != 0) {
            jSONObject = seedlingCardEvent.params;
        }
        return seedlingCardEvent.copy(seedlingCard, i, jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SeedlingCard getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JSONObject getParams() {
        return this.params;
    }

    @NotNull
    public final SeedlingCardEvent copy(@NotNull SeedlingCard card, int action, @NotNull JSONObject params) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(params, "params");
        return new SeedlingCardEvent(card, action, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingCardEvent)) {
            return false;
        }
        SeedlingCardEvent seedlingCardEvent = (SeedlingCardEvent) other;
        return Intrinsics.areEqual(this.card, seedlingCardEvent.card) && this.action == seedlingCardEvent.action && Intrinsics.areEqual(this.params, seedlingCardEvent.params);
    }

    public final int getAction() {
        return this.action;
    }

    @NotNull
    public final SeedlingCard getCard() {
        return this.card;
    }

    @NotNull
    public final JSONObject getParams() {
        return this.params;
    }

    public int hashCode() {
        return (((this.card.hashCode() * 31) + Integer.hashCode(this.action)) * 31) + this.params.hashCode();
    }

    @NotNull
    public String toString() {
        return "SeedlingCardEvent(card=" + this.card + ", action=" + this.action + ", params=" + this.params + ")";
    }
}
