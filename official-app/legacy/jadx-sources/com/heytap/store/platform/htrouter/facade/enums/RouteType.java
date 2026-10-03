package com.heytap.store.platform.htrouter.facade.enums;

import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/enums/RouteType;", "", "id", "", "className", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "setClassName", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "ACTIVITY", "SERVICE", LanConstants.OPERATOR_PROVIDER, "CONTENT_PROVIDER", "BROADCAST", "METHOD", "FRAGMENT", LanConstants.OPERATOR_UNKNOWN, "Companion", "htrouter-annotation"}, k = 1, mv = {1, 1, 15})
public enum RouteType {
    ACTIVITY(0, Consts.ACTIVITY),
    SERVICE(1, Consts.SERVICE),
    PROVIDER(2, Consts.I_PROVIDER),
    CONTENT_PROVIDER(-1, "android.app.ContentProvider"),
    BROADCAST(-1, ""),
    METHOD(-1, ""),
    FRAGMENT(-1, Consts.FRAGMENT),
    UNKNOWN(-1, "");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String className;
    private int id;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/enums/RouteType$Companion;", "", "()V", "parse", "Lcom/heytap/store/platform/htrouter/facade/enums/RouteType;", "name", "", "htrouter-annotation"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RouteType parse(@NotNull String name) {
            Intrinsics.checkParameterIsNotNull(name, "name");
            for (RouteType routeType : RouteType.values()) {
                if (Intrinsics.areEqual(routeType.getClassName(), name)) {
                    return routeType;
                }
            }
            return RouteType.UNKNOWN;
        }
    }

    RouteType(int i, String str) {
        this.id = i;
        this.className = str;
    }

    @JvmStatic
    @NotNull
    public static final RouteType parse(@NotNull String str) {
        return INSTANCE.parse(str);
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    public final int getId() {
        return this.id;
    }

    public final void setClassName(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.className = str;
    }

    public final void setId(int i) {
        this.id = i;
    }
}
