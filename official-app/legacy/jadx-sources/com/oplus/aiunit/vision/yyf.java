package com.oplus.aiunit.vision;

import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.WalkRouteResult;

/* JADX INFO: loaded from: classes12.dex */
public interface yyf {
    void a(RideRouteResult rideRouteResult, int i);

    void b(BusRouteResult busRouteResult, int i);

    void c(WalkRouteResult walkRouteResult, int i);

    void d(DriveRouteResult driveRouteResult, int i);
}
