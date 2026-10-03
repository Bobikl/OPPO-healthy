package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import com.oplus.nearx.track.TrackApi;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class jri implements yz9 {
    public static final String DEFAULT_CATEGORY = "2015101";
    public static final String DEFAULT_CATEGORY_TECHNOLOGY = "2015104";
    public static final long KEY_BUSINESS_ID = 20151;

    @Override // com.oplus.aiunit.vision.yz9
    public void a(Context context, String str, Map<String, String> map) {
        TrackApi.t(KEY_BUSINESS_ID).M(DEFAULT_CATEGORY, str, map);
    }

    @Override // com.oplus.aiunit.vision.yz9
    public void b(Context context, String str, Map<String, String> map) {
        TrackApi.t(KEY_BUSINESS_ID).M(DEFAULT_CATEGORY_TECHNOLOGY, str, map);
    }

    @Override // com.oplus.aiunit.vision.yz9
    public void c(Context context, Map<String, String> map) {
        lc0.b(KEY_BUSINESS_ID);
        TrackApi.L((Application) context.getApplicationContext(), new TrackApi.c.a(map.get(rde.KEY_COUNTRY_CODE)).c(false).a());
        TrackApi.t(KEY_BUSINESS_ID).D(new TrackApi.b.a("1333", "lRYdIqQQ3hsTqXHa5tq6tFYB6o6UaTkf").a());
    }
}
