package com.heytap.health.bandface.watchface.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.b78;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BandFaceTypeBean {

    @SerializedName("dialType")
    public String dialType;

    @SerializedName("dialTypeEnglishName")
    public String dialTypeEnglishName;

    @SerializedName("dialTypeName")
    public String dialTypeName;

    public String getDialTypeName() {
        Locale locale = b78.a().getResources().getConfiguration().getLocales().get(0);
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if ("zh".equalsIgnoreCase(language) && "CN".equalsIgnoreCase(country)) {
            String str = this.dialTypeName;
            return str == null ? "" : str;
        }
        String str2 = this.dialTypeEnglishName;
        return str2 == null ? "" : str2;
    }
}
