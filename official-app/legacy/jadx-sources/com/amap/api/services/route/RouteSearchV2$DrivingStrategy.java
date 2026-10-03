package com.amap.api.services.route;

/* JADX INFO: loaded from: classes12.dex */
public enum RouteSearchV2$DrivingStrategy {
    DEFAULT(32),
    AVOID_CONGESTION(33),
    HIGHWAY_PRIORITY(34),
    AVOID_HIGHWAY(35),
    LESS_CHARGE(36),
    ROAD_PRIORITY(37),
    SPEED_PRIORITY(38),
    AVOID_CONGESTION_HIGHWAY_PRIORITY(39),
    AVOID_CONGESTION_AVOID_HIGHWAY(40),
    AVOID_CONGESTION_LESS_CHARGE(41),
    LESS_CHARGE_AVOID_HIGHWAY(42),
    AVOID_CONGESTION_LESS_CHARGE_AVOID_HIGHWAY(43),
    AVOID_CONGESTION_ROAD_PRIORITY(44),
    AVOID_CONGESTION_SPEED_PRIORITY(45);

    int a;

    RouteSearchV2$DrivingStrategy(int i) {
        this.a = i;
    }

    public static RouteSearchV2$DrivingStrategy fromValue(int i) {
        return values()[i - 32];
    }

    public final int getValue() {
        return this.a;
    }
}
