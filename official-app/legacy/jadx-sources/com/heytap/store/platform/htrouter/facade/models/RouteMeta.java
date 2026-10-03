package com.heytap.store.platform.htrouter.facade.models;

import com.heytap.store.platform.htrouter.facade.annotations.AutoWired;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.oplus.aiunit.vision.jla;
import java.util.Map;
import javax.lang.model.element.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\b\u0016\u0018\u0000 82\u00020\u0001:\u00018B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BO\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\u0010\u000fB\u0097\u0001\b\u0016\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f¢\u0006\u0002\u0010\u0017BY\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0002\u0010\u0018J\b\u00107\u001a\u00020\rH\u0016R \u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0014\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/models/RouteMeta;", "", "()V", "route", "Lcom/heytap/store/platform/htrouter/facade/annotations/Route;", "destination", "Ljava/lang/Class;", "type", "Lcom/heytap/store/platform/htrouter/facade/enums/RouteType;", "rawType", "Ljavax/lang/model/element/Element;", "paramsType", "", "", "", "(Lcom/heytap/store/platform/htrouter/facade/annotations/Route;Ljava/lang/Class;Lcom/heytap/store/platform/htrouter/facade/enums/RouteType;Ljavax/lang/model/element/Element;Ljava/util/Map;)V", "name", "path", "group", "priority", "extra", "injectConfig", "Lcom/heytap/store/platform/htrouter/facade/annotations/AutoWired;", "(Lcom/heytap/store/platform/htrouter/facade/enums/RouteType;Ljavax/lang/model/element/Element;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IILjava/util/Map;)V", "(Lcom/heytap/store/platform/htrouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V", "getDestination", "()Ljava/lang/Class;", "setDestination", "(Ljava/lang/Class;)V", "getExtra", "()I", "setExtra", "(I)V", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "getInjectConfig", "()Ljava/util/Map;", "setInjectConfig", "(Ljava/util/Map;)V", "getParamsType", "setParamsType", "getPath", "setPath", "getPriority", "setPriority", "getRawType", "()Ljavax/lang/model/element/Element;", "setRawType", "(Ljavax/lang/model/element/Element;)V", "getType", "()Lcom/heytap/store/platform/htrouter/facade/enums/RouteType;", "setType", "(Lcom/heytap/store/platform/htrouter/facade/enums/RouteType;)V", "toString", "Companion", "htrouter-annotation"}, k = 1, mv = {1, 1, 15})
public class RouteMeta {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Class<?> destination;
    private int extra;

    @Nullable
    private String group;

    @Nullable
    private Map<String, AutoWired> injectConfig;
    private String name;

    @Nullable
    private Map<String, Integer> paramsType;

    @Nullable
    private String path;
    private int priority;

    @Nullable
    private Element rawType;

    @Nullable
    private RouteType type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JZ\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/models/RouteMeta$Companion;", "", "()V", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/store/platform/htrouter/facade/models/RouteMeta;", "type", "Lcom/heytap/store/platform/htrouter/facade/enums/RouteType;", "destination", "Ljava/lang/Class;", "path", "", "group", "paramsType", "", "", "priority", "extra", "htrouter-annotation"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RouteMeta build(@Nullable RouteType type, @Nullable Class<?> destination, @Nullable String path, @Nullable String group, @Nullable Map<String, Integer> paramsType, int priority, int extra) {
            return new RouteMeta(type, destination, path, group, paramsType, priority, extra);
        }
    }

    @JvmOverloads
    public RouteMeta(@NotNull Route route) {
        this(route, (Class) null, (RouteType) null, (Element) null, (Map) null, 30, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    @NotNull
    public static final RouteMeta build(@Nullable RouteType routeType, @Nullable Class<?> cls, @Nullable String str, @Nullable String str2, @Nullable Map<String, Integer> map, int i, int i2) {
        return INSTANCE.build(routeType, cls, str, str2, map, i, i2);
    }

    @Nullable
    public final Class<?> getDestination() {
        return this.destination;
    }

    public final int getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getGroup() {
        return this.group;
    }

    @Nullable
    public final Map<String, AutoWired> getInjectConfig() {
        return this.injectConfig;
    }

    @Nullable
    public final Map<String, Integer> getParamsType() {
        return this.paramsType;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final Element getRawType() {
        return this.rawType;
    }

    @Nullable
    public final RouteType getType() {
        return this.type;
    }

    public final void setDestination(@Nullable Class<?> cls) {
        this.destination = cls;
    }

    public final void setExtra(int i) {
        this.extra = i;
    }

    public final void setGroup(@Nullable String str) {
        this.group = str;
    }

    public final void setInjectConfig(@Nullable Map<String, AutoWired> map) {
        this.injectConfig = map;
    }

    public final void setParamsType(@Nullable Map<String, Integer> map) {
        this.paramsType = map;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    public final void setRawType(@Nullable Element element) {
        this.rawType = element;
    }

    public final void setType(@Nullable RouteType routeType) {
        this.type = routeType;
    }

    @NotNull
    public String toString() {
        return "RouteMeta(type=" + this.type + ", rawType=" + this.rawType + ", destination=" + this.destination + ", path=" + this.path + ", group=" + this.group + ", priority=" + this.priority + ", extra=" + this.extra + ", paramsType=" + this.paramsType + ", name=" + this.name + ", injectConfig=" + this.injectConfig + ')';
    }

    @JvmOverloads
    public RouteMeta(@NotNull Route route, @Nullable Class<?> cls) {
        this(route, cls, (RouteType) null, (Element) null, (Map) null, 28, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public RouteMeta(@NotNull Route route, @Nullable Class<?> cls, @Nullable RouteType routeType) {
        this(route, cls, routeType, (Element) null, (Map) null, 24, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public RouteMeta(@NotNull Route route, @Nullable Class<?> cls, @Nullable RouteType routeType, @Nullable Element element) {
        this(route, cls, routeType, element, (Map) null, 16, (DefaultConstructorMarker) null);
    }

    public RouteMeta() {
        this.priority = -1;
        this.extra = Integer.MIN_VALUE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RouteMeta(Route route, Class cls, RouteType routeType, Element element, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Element element2;
        Class cls2 = (i & 2) != 0 ? null : cls;
        RouteType routeType2 = (i & 4) != 0 ? null : routeType;
        if ((i & 8) != 0) {
            element2 = null;
        } else {
            element2 = element;
        }
        this(route, cls2, routeType2, element2, (i & 16) != 0 ? null : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RouteMeta(@NotNull Route route, @Nullable Class<?> cls, @Nullable RouteType routeType, @Nullable Element element, @Nullable Map<String, Integer> map) {
        this(routeType, element, cls, route.name(), route.path(), route.group(), map, route.priority(), route.extras(), null, 512, null);
        Intrinsics.checkParameterIsNotNull(route, "route");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RouteMeta(RouteType routeType, Element element, Class cls, String str, String str2, String str3, Map map, int i, int i2, Map map2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        routeType = (i3 & 1) != 0 ? null : routeType;
        if ((i3 & 2) != 0) {
            element = null;
        }
        this(routeType, element, (i3 & 4) != 0 ? null : cls, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : map, (i3 & 128) != 0 ? -1 : i, (i3 & 256) != 0 ? Integer.MIN_VALUE : i2, (i3 & 512) != 0 ? null : map2);
    }

    public RouteMeta(@Nullable RouteType routeType, @Nullable Element element, @Nullable Class<?> cls, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, Integer> map, int i, int i2, @Nullable Map<String, AutoWired> map2) {
        this.type = routeType;
        this.rawType = element;
        this.destination = cls;
        this.name = str;
        this.path = str2;
        this.group = str3;
        this.paramsType = map;
        this.priority = i;
        this.extra = i2;
        this.injectConfig = map2;
    }

    public RouteMeta(@Nullable RouteType routeType, @Nullable Class<?> cls, @Nullable String str, @Nullable String str2, @Nullable Map<String, Integer> map, int i, int i2) {
        this.type = routeType;
        this.destination = cls;
        this.path = str;
        this.group = str2;
        this.paramsType = map;
        this.priority = i;
        this.extra = i2;
    }
}
