package com.heytap.health.bandface.watchface.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.b78;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BandFaceNameRes {
    private static final String ALBUM = "Photos";
    private static final String ALBUM_CN = "相册";
    private static final String CLOCK = "Clock";
    private static final String CLOCK_CN = "时钟";

    public static String getAlbumName() {
        Locale locale = b78.a().getResources().getConfiguration().getLocales().get(0);
        return ("zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry())) ? ALBUM_CN : ALBUM;
    }

    public static String getClockName() {
        Locale locale = b78.a().getResources().getConfiguration().getLocales().get(0);
        return ("zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry())) ? CLOCK_CN : CLOCK;
    }
}
