package com.oplus.channel.client.data;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/oplus/channel/client/data/Action;", "", "shouldForceFetch", "", "action", "", "extraParams", "", "", "(ZILjava/util/Map;)V", "getAction", "()I", "getExtraParams", "()Ljava/util/Map;", "getShouldForceFetch", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "ACTION", "Companion", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Action {

    @NotNull
    private static final Action ACTION_CREATE;

    @NotNull
    private static final Action ACTION_PAUSE;

    @NotNull
    private static final Action ACTION_RESUME;

    @NotNull
    private static final Action ACTION_START;

    @NotNull
    private static final Action ACTION_STOP;

    @NotNull
    public static final String CLICK_ID_KEY = "click_id";

    @NotNull
    public static final String CONFIGURATION_LIST_KEY = "configuration_list_key";

    @NotNull
    public static final String EXPOSED_STATE_KEY = "exposed_state";

    @NotNull
    public static final String EXPOSED_STATE_VALUE_EXPOSED = "exposed";

    @NotNull
    public static final String EXPOSED_STATE_VALUE_HIDDEN = "hidden";

    @NotNull
    public static final String LIFE_CIRCLE_KEY = "life_circle";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_CREATE = "create";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_DESTROY = "destroy";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_PAUSE = "pause";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_RESUME = "resume";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_START = "start";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_STOP = "stop";

    @NotNull
    public static final String PUBLISH_CONFIGURATION_LIST = "publish_configuration_list";
    private final int action;

    @NotNull
    private final Map<String, String> extraParams;
    private final boolean shouldForceFetch;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Action ACTION_DESTROY = new Action(false, 2, MapsKt__MapsJVMKt.mapOf(TuplesKt.to("life_circle", "destroy")), 1, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/channel/client/data/Action$ACTION;", "", "Companion", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ACTION {
        public static final int CLICK = 1;
        public static final int CONFIGURATION_LIST = 5;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int EXPOSED_STATE = 3;
        public static final int INVALIDATE = 4;
        public static final int LIFE_CIRCLE = 2;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/oplus/channel/client/data/Action$ACTION$Companion;", "", "()V", "CLICK", "", "CONFIGURATION_LIST", "EXPOSED_STATE", "INVALIDATE", "LIFE_CIRCLE", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CLICK = 1;
            public static final int CONFIGURATION_LIST = 5;
            public static final int EXPOSED_STATE = 3;
            public static final int INVALIDATE = 4;
            public static final int LIFE_CIRCLE = 2;

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/oplus/channel/client/data/Action$Companion;", "", "()V", "ACTION_CREATE", "Lcom/oplus/channel/client/data/Action;", "getACTION_CREATE", "()Lcom/oplus/channel/client/data/Action;", "ACTION_DESTROY", "getACTION_DESTROY", "ACTION_PAUSE", "getACTION_PAUSE", "ACTION_RESUME", "getACTION_RESUME", "ACTION_START", "getACTION_START", "ACTION_STOP", "getACTION_STOP", "CLICK_ID_KEY", "", "CONFIGURATION_LIST_KEY", "EXPOSED_STATE_KEY", "EXPOSED_STATE_VALUE_EXPOSED", "EXPOSED_STATE_VALUE_HIDDEN", "LIFE_CIRCLE_KEY", "LIFE_CIRCLE_VALUE_CREATE", "LIFE_CIRCLE_VALUE_DESTROY", "LIFE_CIRCLE_VALUE_PAUSE", "LIFE_CIRCLE_VALUE_RESUME", "LIFE_CIRCLE_VALUE_START", "LIFE_CIRCLE_VALUE_STOP", "PUBLISH_CONFIGURATION_LIST", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Action getACTION_CREATE() {
            return Action.ACTION_CREATE;
        }

        @NotNull
        public final Action getACTION_DESTROY() {
            return Action.ACTION_DESTROY;
        }

        @NotNull
        public final Action getACTION_PAUSE() {
            return Action.ACTION_PAUSE;
        }

        @NotNull
        public final Action getACTION_RESUME() {
            return Action.ACTION_RESUME;
        }

        @NotNull
        public final Action getACTION_START() {
            return Action.ACTION_START;
        }

        @NotNull
        public final Action getACTION_STOP() {
            return Action.ACTION_STOP;
        }
    }

    static {
        boolean z = false;
        int i = 2;
        int i2 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ACTION_CREATE = new Action(z, i, MapsKt__MapsJVMKt.mapOf(TuplesKt.to("life_circle", "create")), i2, defaultConstructorMarker);
        ACTION_START = new Action(z, i, MapsKt__MapsJVMKt.mapOf(TuplesKt.to("life_circle", "create")), i2, defaultConstructorMarker);
        boolean z2 = false;
        int i3 = 2;
        int i4 = 1;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        ACTION_STOP = new Action(z2, i3, MapsKt__MapsJVMKt.mapOf(TuplesKt.to("life_circle", LIFE_CIRCLE_VALUE_STOP)), i4, defaultConstructorMarker2);
        ACTION_RESUME = new Action(z, i, MapsKt__MapsJVMKt.mapOf(TuplesKt.to("life_circle", "resume")), i2, defaultConstructorMarker);
        ACTION_PAUSE = new Action(z2, i3, MapsKt__MapsJVMKt.mapOf(TuplesKt.to("life_circle", "pause")), i4, defaultConstructorMarker2);
    }

    public Action(boolean z, int i, @NotNull Map<String, String> extraParams) {
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        this.shouldForceFetch = z;
        this.action = i;
        this.extraParams = extraParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Action copy$default(Action action, boolean z, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = action.shouldForceFetch;
        }
        if ((i2 & 2) != 0) {
            i = action.action;
        }
        if ((i2 & 4) != 0) {
            map = action.extraParams;
        }
        return action.copy(z, i, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShouldForceFetch() {
        return this.shouldForceFetch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.extraParams;
    }

    @NotNull
    public final Action copy(boolean shouldForceFetch, int action, @NotNull Map<String, String> extraParams) {
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        return new Action(shouldForceFetch, action, extraParams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Action)) {
            return false;
        }
        Action action = (Action) other;
        return this.shouldForceFetch == action.shouldForceFetch && this.action == action.action && Intrinsics.areEqual(this.extraParams, action.extraParams);
    }

    public final int getAction() {
        return this.action;
    }

    @NotNull
    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    public final boolean getShouldForceFetch() {
        return this.shouldForceFetch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.shouldForceFetch;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Integer.hashCode(this.action)) * 31) + this.extraParams.hashCode();
    }

    @NotNull
    public String toString() {
        return "Action(shouldForceFetch=" + this.shouldForceFetch + ", action=" + this.action + ", extraParams=" + this.extraParams + ')';
    }

    public /* synthetic */ Action(boolean z, int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, i, map);
    }
}
