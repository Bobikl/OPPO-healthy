package com.sensorsdata.analytics.android.sdk.plugin.property;

/* JADX INFO: loaded from: classes10.dex */
public class SAPropertyPluginPriority {
    private final long priority;
    public static SAPropertyPluginPriority LOW = new SAPropertyPluginPriority(250);
    public static SAPropertyPluginPriority DEFAULT = new SAPropertyPluginPriority(500);
    public static SAPropertyPluginPriority HIGH = new SAPropertyPluginPriority(750);
    protected static SAPropertyPluginPriority SUPER = new SAPropertyPluginPriority(1431656640);

    public SAPropertyPluginPriority(long j2) {
        this.priority = j2;
    }

    public long getPriority() {
        return this.priority;
    }
}
