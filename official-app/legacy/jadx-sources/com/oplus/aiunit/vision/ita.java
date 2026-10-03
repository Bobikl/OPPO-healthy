package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Configuration;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/ita;", "", "Lcom/oplus/aiunit/vision/hta;", "lang", "", "a", "Landroid/content/Context;", "context", "", "resId", "Ljava/util/Locale;", CityBean.LOCALE, "b", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ita {

    @NotNull
    public static final ita INSTANCE = new ita();

    @NotNull
    public final String a(@NotNull LangDesc lang) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        String strA = kta.a();
        if (strA != null) {
            int iHashCode = strA.hashCode();
            if (iHashCode != 115861276) {
                if (iHashCode != 115861428) {
                    if (iHashCode == 115861812 && strA.equals("zh_TW")) {
                        return lang.getTw();
                    }
                } else if (strA.equals("zh_HK")) {
                    return lang.getHk();
                }
            } else if (strA.equals("zh_CN")) {
                return lang.getCn();
            }
        }
        return lang.getEn();
    }

    @NotNull
    public final String b(@NotNull Context context, int resId, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        String string = context.createConfigurationContext(configuration).getResources().getString(resId);
        Intrinsics.checkNotNullExpressionValue(string, "localContext.resources.getString(resId)");
        return string;
    }
}
