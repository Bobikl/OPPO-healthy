package com.heytap.health.bandface.watchface.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.sc8;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BandFaceOnlineBean implements Serializable {
    public String chineseDesc;
    private String chineseName;
    public String dialKey;
    public String dialType;
    public String dialTypeEnglishName;
    public String dialTypeName;
    public String englishDesc;
    private String englishName;
    public boolean hasChoosed;
    public String previewImg;
    public String resPackageMd5;
    public int resPackageSize;
    public String resPackageUrl;
    public int version;
    public long versionTime;

    public static BandFaceOnlineBean jsonItem(String str) {
        try {
            return (BandFaceOnlineBean) sc8.a(str, BandFaceOnlineBean.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getName() {
        Locale locale = b78.a().getResources().getConfiguration().getLocales().get(0);
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if ("zh".equalsIgnoreCase(language) && "CN".equalsIgnoreCase(country)) {
            String str = this.chineseName;
            return str == null ? "" : str;
        }
        String str2 = this.englishName;
        return str2 == null ? "" : str2;
    }

    public String jsonData() {
        try {
            return sc8.g(this);
        } catch (Exception unused) {
            return "";
        }
    }
}
