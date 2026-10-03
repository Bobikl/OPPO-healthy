package com.oplus.aiunit.vision;

import com.heytap.wearable.watch.emergency.safeguard.GuardPush;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.dz2, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\n\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/dz2;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/wearable/watch/emergency/safeguard/GuardPush;", "a", "Lcom/heytap/wearable/watch/emergency/safeguard/GuardPush;", "c", "()Lcom/heytap/wearable/watch/emergency/safeguard/GuardPush;", "f", "(Lcom/heytap/wearable/watch/emergency/safeguard/GuardPush;)V", "push", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "instanceId", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "()Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", MapSchema.FIELD_NAME_ENTRY, "(Lcom/oplus/pantanal/seedling/bean/SeedlingCard;)V", "card", "d", "Z", "()Z", b2n.f, "(Z)V", "veb", "<init>", "(Lcom/heytap/wearable/watch/emergency/safeguard/GuardPush;Ljava/lang/String;Lcom/oplus/pantanal/seedling/bean/SeedlingCard;Z)V", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CardCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public GuardPush push;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String instanceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public SeedlingCard card;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public boolean veb;

    public CardCache(@NotNull GuardPush push, @NotNull String instanceId, @Nullable SeedlingCard seedlingCard, boolean z) {
        Intrinsics.checkNotNullParameter(push, "push");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.push = push;
        this.instanceId = instanceId;
        this.card = seedlingCard;
        this.veb = z;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SeedlingCard getCard() {
        return this.card;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final GuardPush getPush() {
        return this.push;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getVeb() {
        return this.veb;
    }

    public final void e(@Nullable SeedlingCard seedlingCard) {
        this.card = seedlingCard;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardCache)) {
            return false;
        }
        CardCache cardCache = (CardCache) other;
        return Intrinsics.areEqual(this.push, cardCache.push) && Intrinsics.areEqual(this.instanceId, cardCache.instanceId) && Intrinsics.areEqual(this.card, cardCache.card) && this.veb == cardCache.veb;
    }

    public final void f(@NotNull GuardPush guardPush) {
        Intrinsics.checkNotNullParameter(guardPush, "<set-?>");
        this.push = guardPush;
    }

    public final void g(boolean z) {
        this.veb = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((this.push.hashCode() * 31) + this.instanceId.hashCode()) * 31;
        SeedlingCard seedlingCard = this.card;
        int iHashCode2 = (iHashCode + (seedlingCard == null ? 0 : seedlingCard.hashCode())) * 31;
        boolean z = this.veb;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode2 + r2;
    }

    @NotNull
    public String toString() {
        return "CardCache(push=" + this.push + ", instanceId=" + this.instanceId + ", card=" + this.card + ", veb=" + this.veb + ")";
    }

    public /* synthetic */ CardCache(GuardPush guardPush, String str, SeedlingCard seedlingCard, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(guardPush, (i & 2) != 0 ? "" : str, seedlingCard, (i & 8) != 0 ? false : z);
    }
}
