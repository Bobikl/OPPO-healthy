package com.oplus.aiunit.vision;

import com.amap.api.services.geocoder.RegeocodeAddress;
import com.google.android.gms.actions.SearchIntents;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/amap/api/services/geocoder/RegeocodeAddress;", "Lcom/oplus/aiunit/vision/ukf;", SearchIntents.EXTRA_QUERY, "Lcom/oplus/aiunit/vision/b5b;", "a", "home_impl_release"}, k = 2, mv = {1, 8, 0})
public final class tkf {
    @NotNull
    public static final b5b a(@NotNull RegeocodeAddress regeocodeAddress, @NotNull ukf query) {
        Intrinsics.checkNotNullParameter(regeocodeAddress, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        b5b b5bVar = new b5b();
        String city = regeocodeAddress.getCity();
        if (city == null) {
            city = "";
        }
        b5bVar.m(city);
        String district = regeocodeAddress.getDistrict();
        if (district == null) {
            district = "";
        }
        b5bVar.p(district);
        String adCode = regeocodeAddress.getAdCode();
        if (adCode == null) {
            adCode = "";
        }
        b5bVar.k(adCode);
        String province = regeocodeAddress.getProvince();
        if (province == null) {
            province = "";
        }
        b5bVar.u(province);
        String formatAddress = regeocodeAddress.getFormatAddress();
        b5bVar.l(formatAddress != null ? formatAddress : "");
        b5bVar.s(11);
        b5bVar.n("GCJ02");
        DecimalFormatSymbols decimalFormatSymbols = x05.TIME_FORMAT_LOCALE_CN_SYMBOL;
        b5bVar.r(new DecimalFormat("0.00000", decimalFormatSymbols).format(query.e().getLatitude()));
        b5bVar.t(new DecimalFormat("0.00000", decimalFormatSymbols).format(query.e().getLongitude()));
        b5bVar.q(0);
        return b5bVar;
    }
}
