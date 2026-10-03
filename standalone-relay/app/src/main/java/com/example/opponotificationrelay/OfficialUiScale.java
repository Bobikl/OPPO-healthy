package com.example.opponotificationrelay;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
/** Official 6.6.7 density rule, applied locally without changing the app or system configuration. */
final class OfficialUiScale {
    // Port of y95.e density selection, scoped to navigation rather than changing every page.
    static float density(Context c){
        int width=c.getResources().getDisplayMetrics().widthPixels;String brand=Build.BRAND.toLowerCase(java.util.Locale.ROOT);
        float fallback=c.getResources().getDisplayMetrics().density;
        if(c instanceof Activity&&((Activity)c).isInMultiWindowMode())return fallback;
        boolean special=brand.contains("huawei")||brand.contains("honor")||brand.contains("zte");
        if(width<=720||(special&&width<=896))return 2;
        if(width<=1140||(special&&width<=1223))return 3;
        if(width<=1280)return 3.5f;
        if(width<=1440||(special&&width<=1344))return 4;
        if(width<=1644&&brand.contains("sony"))return 3;
        return fallback;
    }
    static Context darkContext(Context context){
        Configuration config=new Configuration(context.getResources().getConfiguration());
        config.densityDpi=Math.round(density(context)*160);
        config.uiMode=(config.uiMode&~Configuration.UI_MODE_NIGHT_MASK)|Configuration.UI_MODE_NIGHT_YES;
        return context.createConfigurationContext(config);
    }
}
