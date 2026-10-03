package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Parcelable;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.SportMetaData;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.health.base.share.SportShareDataBean;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.sports.R$string;
import com.heytap.sports.record.list.helper.DataHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class zhi {
    @NotNull
    public static String a(Context context, OneTimeSport oneTimeSport, String str) {
        String first;
        StringBuilder sb = new StringBuilder();
        sb.append("deviceType = ");
        sb.append(oneTimeSport.getDeviceType());
        sb.append(",OneTimeSport is ");
        sb.append(oneTimeSport.toString());
        if (oei.j(oneTimeSport.getSportMode())) {
            first = context.getString(R$string.sports_run);
        } else if (oei.d(oneTimeSport.getSportMode())) {
            first = context.getString(com.heytap.health.base.R$string.lib_base_fitness);
        } else {
            SportMetaData sportMetaData = (SportMetaData) GsonUtil.a(oneTimeSport.getMetaData(), SportMetaData.class);
            TrackMetadataStat trackMetadataStat = new TrackMetadataStat();
            trackMetadataStat.setSportMode(oneTimeSport.getSportMode());
            trackMetadataStat.setDeviceCategory(oneTimeSport.getDeviceType());
            if (sportMetaData != null) {
                trackMetadataStat.setSportName(sportMetaData.getSportName());
                trackMetadataStat.setRunExtra(sportMetaData.getRunExtra());
            }
            first = DataHelper.INSTANCE.h(context, trackMetadataStat).getFirst();
        }
        return String.format("%s • %s", str, first);
    }

    public static int b(OneTimeSport oneTimeSport) {
        int sportMode = oneTimeSport.getSportMode();
        return (sportMode == 1 || sportMode == 2 || sportMode == 3 || sportMode == 13 || sportMode == 15 || sportMode == 17 || sportMode == 21 || sportMode == 909 || sportMode == 40 || sportMode == 41) ? 1 : 0;
    }

    public static SportShareDataBean c(Parcelable parcelable, String str, String str2, String str3, boolean z, boolean z2, Context context) {
        SportShareDataBean sportShareDataBean = new SportShareDataBean();
        sportShareDataBean.setAvatar(str);
        sportShareDataBean.setUserName(str2);
        sportShareDataBean.setHasRoute(z);
        sportShareDataBean.setHasLongImage(z2);
        if (parcelable instanceof OneTimeSport) {
            OneTimeSport oneTimeSport = (OneTimeSport) parcelable;
            sportShareDataBean.setSportMode(oneTimeSport.getSportMode());
            sportShareDataBean.setDeviceType(oneTimeSport.getDeviceType());
            sportShareDataBean.setEndTime(oneTimeSport.getStartTimestamp());
            sportShareDataBean.setImageShareType(b(oneTimeSport));
            sportShareDataBean.setCardTitle(a(context, oneTimeSport, str3));
            sportShareDataBean.setRouteSport(d(oneTimeSport.getSportMode()));
            sportShareDataBean.setImageResourceType(ntf.b(oneTimeSport.getSportMode()));
        }
        return sportShareDataBean;
    }

    public static boolean d(int i) {
        return oei.allRideMode.contains(Integer.valueOf(i)) || oei.allRunMode.contains(Integer.valueOf(i)) || oei.allOutdoorMode.contains(Integer.valueOf(i)) || oei.allSnowMode.contains(Integer.valueOf(i)) || 1 == i || 41 == i;
    }
}
