package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.wearable.clock.ClockMsg;
import java.util.ArrayList;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class e78 {
    public static final String AUTHORITY_MAIN = "com.coloros.alarmclock.alarmclock";
    public static final Uri NEW_CITY_CONTENT_URI = Uri.parse("content://com.coloros.alarmclock.alarmclock/new_cities");
    public static final Uri b = Uri.parse("content://com.coloros.alarmclock.ai");
    public final Context a;

    public e78(Context context) {
        this.a = context;
    }

    public void a(int i) throws Throwable {
        a7b.f("InterConnHealth.GlobalClockModel", "[addClock] --> " + i);
        Bundle bundle = new Bundle();
        bundle.putInt("city_id", i);
        bundle.putInt("city_update_type", 1);
        b(this.a, "com.coloros.alarmclock.ai", "update_world_clock_list", null, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList<com.heytap.wearable.clock.ClockMsg$ClockCityListResponse$ClockCityInfo>] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> b(Context context, String str, String str2, String str3, Bundle bundle) throws Throwable {
        ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> arrayList;
        ?? r1 = 0;
        ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> arrayListE = null;
        r1 = 0;
        ContentProviderClient contentProviderClient = null;
        try {
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(b);
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        a7b.f("InterConnHealth.GlobalClockModel", "[callAiClockProvider] --> start to get the data");
                        Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(str, str2, str3, bundle);
                        int i = bundleCall.getInt("result");
                        arrayListE = e(str2, bundleCall);
                        a7b.f("InterConnHealth.GlobalClockModel", "[callAiClockProvider] --> resultInt:" + i + ",result:" + bundleCall);
                        r1 = arrayListE;
                    } catch (Exception e2) {
                        e = e2;
                        ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> arrayList2 = arrayListE;
                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                        arrayList = arrayList2;
                        a7b.b("InterConnHealth.GlobalClockModel", "[callAiClockProvider] --> " + e.getMessage());
                        if (contentProviderClient != null) {
                            contentProviderClient.release();
                            contentProviderClient.close();
                        }
                        r1 = arrayList;
                    } catch (Throwable th) {
                        th = th;
                        r1 = contentProviderClientAcquireUnstableContentProviderClient;
                        if (r1 != 0) {
                            r1.release();
                            r1.close();
                        }
                        throw th;
                    }
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            arrayList = null;
        }
        return r1 == 0 ? new ArrayList<>() : r1;
    }

    public void c(int i) throws Throwable {
        a7b.f("InterConnHealth.GlobalClockModel", "[deleteClock] --> " + i);
        Bundle bundle = new Bundle();
        bundle.putInt("city_id", i);
        bundle.putInt("city_update_type", 2);
        b(this.a, "com.coloros.alarmclock.ai", "update_world_clock_list", null, bundle);
    }

    public ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> d() {
        a7b.f("InterConnHealth.GlobalClockModel", "[getAllCity] --> ");
        new Bundle().putString("extra_locale", "zh_CN");
        return b(this.a, "com.coloros.alarmclock.ai", "get_world_clock_list", null, null);
    }

    public final ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> e(String str, Bundle bundle) {
        if ("get_world_clock_list".equals(str)) {
            return f(bundle);
        }
        return null;
    }

    public final ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> f(Bundle bundle) {
        ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> arrayList = new ArrayList<>();
        int i = bundle.getInt("result");
        int[] intArray = bundle.getIntArray("city_id_list");
        String[] stringArray = bundle.getStringArray("city_name_list");
        String[] stringArray2 = bundle.getStringArray("city_timezone_list");
        int[] intArray2 = bundle.getIntArray("city_sort_list");
        if (1 == i && intArray != null && stringArray != null && stringArray2 != null && intArray2 != null) {
            for (int i2 = 0; i2 < intArray.length; i2++) {
                arrayList.add(ClockMsg.ClockCityListResponse.ClockCityInfo.newBuilder().setClockCityId(intArray[i2]).setClockName(TextUtils.isEmpty(stringArray[i2]) ? "" : stringArray[i2]).setClockSortPos(intArray2[i2]).setClockTimezone(TextUtils.isEmpty(stringArray2[i2]) ? "" : stringArray2[i2]).setClockOffset(TextUtils.isEmpty(stringArray2[i2]) ? 0 : TimeZone.getTimeZone(stringArray2[i2]).getOffset(System.currentTimeMillis()) / 1000).build());
            }
        }
        return arrayList;
    }
}
