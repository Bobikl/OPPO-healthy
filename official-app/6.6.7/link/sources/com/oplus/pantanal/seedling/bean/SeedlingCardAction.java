package com.oplus.pantanal.seedling.bean;

import com.oplus.smartenginehelper.ParserTag;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingCardAction;", "", "widgetCode", "", ParserTag.TAG_ACTION, "", "param", "", "(Ljava/lang/String;ILjava/util/Map;)V", "getAction", "()I", "getParam", "()Ljava/util/Map;", "getWidgetCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ACTION", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SeedlingCardAction {

    @NotNull
    public static final String LIFE_CIRCLE_KEY = "life_circle";
    private final int action;

    @Nullable
    private final Map<String, String> param;

    @NotNull
    private final String widgetCode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingCardAction$ACTION;", "", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ACTION {
        public static final int CLICK = 1;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int EXPOSED_STATE = 3;
        public static final int LIFE_CIRCLE = 2;
        public static final int UPDATE = 4;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingCardAction$ACTION$Companion;", "", "()V", "CLICK", "", "EXPOSED_STATE", "LIFE_CIRCLE", "UPDATE", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CLICK = 1;
            public static final int EXPOSED_STATE = 3;
            public static final int LIFE_CIRCLE = 2;
            public static final int UPDATE = 4;

            private Companion() {
            }
        }
    }

    public SeedlingCardAction(@NotNull String str, int i, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "widgetCode");
        this.widgetCode = str;
        this.action = i;
        this.param = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeedlingCardAction copy$default(SeedlingCardAction seedlingCardAction, String str, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = seedlingCardAction.widgetCode;
        }
        if ((i2 & 2) != 0) {
            i = seedlingCardAction.action;
        }
        if ((i2 & 4) != 0) {
            map = seedlingCardAction.param;
        }
        return seedlingCardAction.copy(str, i, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.param;
    }

    @NotNull
    public final SeedlingCardAction copy(@NotNull String widgetCode, int action, @Nullable Map<String, String> param) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        return new SeedlingCardAction(widgetCode, action, param);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingCardAction)) {
            return false;
        }
        SeedlingCardAction seedlingCardAction = (SeedlingCardAction) other;
        return Intrinsics.areEqual(this.widgetCode, seedlingCardAction.widgetCode) && this.action == seedlingCardAction.action && Intrinsics.areEqual(this.param, seedlingCardAction.param);
    }

    public final int getAction() {
        return this.action;
    }

    @Nullable
    public final Map<String, String> getParam() {
        return this.param;
    }

    @NotNull
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    public int hashCode() {
        int iHashCode = ((this.widgetCode.hashCode() * 31) + Integer.hashCode(this.action)) * 31;
        Map<String, String> map = this.param;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "SeedlingCardAction(widgetCode=" + this.widgetCode + ", action=" + this.action + ", param=" + this.param + ")";
    }
}
