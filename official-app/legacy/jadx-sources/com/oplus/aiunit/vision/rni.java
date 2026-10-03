package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import com.oplus.nearx.track.TrackApi;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public class rni implements ry9 {
    public static final String DEFAULT_CATEGORY = "2015101";
    public static final String DEFAULT_CATEGORY_TECHNOLOGY = "2015104";
    public static final long KEY_BUSINESS_ID = 20151;

    @Override // com.oplus.aiunit.vision.ry9
    public void a(Context context, String str, Map<String, String> map) throws JSONException {
        TrackApi.t(KEY_BUSINESS_ID).M(DEFAULT_CATEGORY, str, map);
    }

    @Override // com.oplus.aiunit.vision.ry9
    public void b(Context context, String str, Map<String, String> map) throws JSONException {
        TrackApi.t(KEY_BUSINESS_ID).M(DEFAULT_CATEGORY_TECHNOLOGY, str, map);
    }

    @Override // com.oplus.aiunit.vision.ry9
    public void c(Context context, Map<String, String> map) {
        wb0.b(KEY_BUSINESS_ID);
        TrackApi.L((Application) context.getApplicationContext(), new TrackApi.c.a(map.get("countryCode")).c(false).a());
        TrackApi.t(KEY_BUSINESS_ID).D(new TrackApi.b.a("1333", "lRYdIqQQ3hsTqXHa5tq6tFYB6o6UaTkf").a());
    }
}
