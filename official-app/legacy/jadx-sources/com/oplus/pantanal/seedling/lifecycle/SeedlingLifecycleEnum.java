package com.oplus.pantanal.seedling.lifecycle;

import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/oplus/pantanal/seedling/lifecycle/SeedlingLifecycleEnum;", "", DBHealthReviewPlan.DESC, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "ON_CARD_CREATE", "ON_SHOW", "ON_HIDE", "ON_DESTROY", "ON_UPDATE_DATA", "ON_SUBSCRIBED", "ON_UNSUBSCRIBED", "ON_SIZE_CHANGED", "ON_HOST_CHANGED", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum SeedlingLifecycleEnum {
    ON_CARD_CREATE("create"),
    ON_SHOW(CardAction.LIFE_CIRCLE_VALUE_SHOW),
    ON_HIDE(CardAction.LIFE_CIRCLE_VALUE_HIDE),
    ON_DESTROY("destroy"),
    ON_UPDATE_DATA(CardAction.LIFE_CIRCLE_VALUE_UPDATE_DATA),
    ON_SUBSCRIBED("subscribed"),
    ON_UNSUBSCRIBED("unsubscribed"),
    ON_SIZE_CHANGED(CardAction.LIFE_CIRCLE_VALUE_SIZE_CHANGE),
    ON_HOST_CHANGED(CardAction.LIFE_CIRCLE_VALUE_HOST_CHANGE);


    @NotNull
    private final String desc;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantanal/seedling/lifecycle/SeedlingLifecycleEnum$Companion;", "", "()V", "byName", "Lcom/oplus/pantanal/seedling/lifecycle/SeedlingLifecycleEnum;", DBHealthReviewPlan.DESC, "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SeedlingLifecycleEnum byName(@NotNull String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            SeedlingLifecycleEnum seedlingLifecycleEnum = SeedlingLifecycleEnum.ON_CARD_CREATE;
            if (Intrinsics.areEqual(desc, seedlingLifecycleEnum.getDesc())) {
                return seedlingLifecycleEnum;
            }
            SeedlingLifecycleEnum seedlingLifecycleEnum2 = SeedlingLifecycleEnum.ON_SHOW;
            if (Intrinsics.areEqual(desc, seedlingLifecycleEnum2.getDesc())) {
                return seedlingLifecycleEnum2;
            }
            SeedlingLifecycleEnum seedlingLifecycleEnum3 = SeedlingLifecycleEnum.ON_HIDE;
            if (Intrinsics.areEqual(desc, seedlingLifecycleEnum3.getDesc())) {
                return seedlingLifecycleEnum3;
            }
            SeedlingLifecycleEnum seedlingLifecycleEnum4 = SeedlingLifecycleEnum.ON_DESTROY;
            if (Intrinsics.areEqual(desc, seedlingLifecycleEnum4.getDesc())) {
                return seedlingLifecycleEnum4;
            }
            SeedlingLifecycleEnum seedlingLifecycleEnum5 = SeedlingLifecycleEnum.ON_UPDATE_DATA;
            if (Intrinsics.areEqual(desc, seedlingLifecycleEnum5.getDesc())) {
                return seedlingLifecycleEnum5;
            }
            SeedlingLifecycleEnum seedlingLifecycleEnum6 = SeedlingLifecycleEnum.ON_SUBSCRIBED;
            if (Intrinsics.areEqual(desc, seedlingLifecycleEnum6.getDesc())) {
                return seedlingLifecycleEnum6;
            }
            SeedlingLifecycleEnum seedlingLifecycleEnum7 = SeedlingLifecycleEnum.ON_UNSUBSCRIBED;
            if (Intrinsics.areEqual(desc, seedlingLifecycleEnum7.getDesc())) {
                return seedlingLifecycleEnum7;
            }
            SeedlingLifecycleEnum seedlingLifecycleEnum8 = SeedlingLifecycleEnum.ON_SIZE_CHANGED;
            if (Intrinsics.areEqual(desc, seedlingLifecycleEnum8.getDesc())) {
                return seedlingLifecycleEnum8;
            }
            SeedlingLifecycleEnum seedlingLifecycleEnum9 = SeedlingLifecycleEnum.ON_HOST_CHANGED;
            if (Intrinsics.areEqual(desc, seedlingLifecycleEnum9.getDesc())) {
                return seedlingLifecycleEnum9;
            }
            return null;
        }
    }

    SeedlingLifecycleEnum(String str) {
        this.desc = str;
    }

    @NotNull
    public static EnumEntries<SeedlingLifecycleEnum> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }
}
