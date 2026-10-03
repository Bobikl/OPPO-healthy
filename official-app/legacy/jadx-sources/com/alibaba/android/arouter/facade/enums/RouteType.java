package com.alibaba.android.arouter.facade.enums;

import com.heytap.store.platform.htrouter.compiler.utils.Consts;

/* JADX INFO: loaded from: classes12.dex */
public enum RouteType {
    ACTIVITY(0, Consts.ACTIVITY),
    SERVICE(1, Consts.SERVICE),
    PROVIDER(2, "com.alibaba.android.arouter.facade.template.IProvider"),
    CONTENT_PROVIDER(-1, "android.app.ContentProvider"),
    BOARDCAST(-1, ""),
    METHOD(-1, ""),
    FRAGMENT(-1, Consts.FRAGMENT),
    UNKNOWN(-1, "Unknown route type");

    String className;
    int id;

    RouteType(int i, String str) {
        this.id = i;
        this.className = str;
    }

    public static RouteType parse(String str) {
        for (RouteType routeType : values()) {
            if (routeType.getClassName().equals(str)) {
                return routeType;
            }
        }
        return UNKNOWN;
    }

    public String getClassName() {
        return this.className;
    }

    public int getId() {
        return this.id;
    }

    public RouteType setClassName(String str) {
        this.className = str;
        return this;
    }

    public RouteType setId(int i) {
        this.id = i;
        return this;
    }
}
