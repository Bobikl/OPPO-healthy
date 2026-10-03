package com.heytap.health.settings.watch.moresettings;

import com.oplus.aiunit.vision.m71;
import com.oplus.aiunit.vision.u91;
import com.oplus.aiunit.vision.y13;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class a {
    public static final int ITEM_TYPE_ABOUT_WATCH = 9;
    public static final int ITEM_TYPE_ALARM_NOTIFY = 28;
    public static final int ITEM_TYPE_BAND_PREFERENCE = 30;
    public static final int ITEM_TYPE_BEHAVIOR_MARKED = 17;
    public static final int ITEM_TYPE_BLUETOOTH_MONITOR = 100;
    public static final int ITEM_TYPE_BT_STATUS = 0;
    public static final int ITEM_TYPE_CAR_LINK = 37;
    public static final int ITEM_TYPE_CONTACT = 15;
    public static final int ITEM_TYPE_CONTACT_INDEPENDENT = 22;
    public static final int ITEM_TYPE_CONTACT_MANAGER = 34;
    public static final int ITEM_TYPE_DEVICE_ADB = 36;
    public static final int ITEM_TYPE_DIVIDER = 4;
    public static final int ITEM_TYPE_FIND_DEVICE = 27;
    public static final int ITEM_TYPE_FIND_WATCH = 5;
    public static final int ITEM_TYPE_FLUID = 35;
    public static final int ITEM_TYPE_GAME = 19;
    public static final int ITEM_TYPE_IP = 41;
    public static final int ITEM_TYPE_LOCATION_HELPER = 31;
    public static final int ITEM_TYPE_LOG = 16;
    public static final int ITEM_TYPE_MANUAL = 29;
    public static final int ITEM_TYPE_MUSIC = 33;
    public static final int ITEM_TYPE_SCHOOL_MODE = 26;
    public static final int ITEM_TYPE_SPORT_PERMISSION = 7;
    public static final int ITEM_TYPE_UNBIND = 10;
    public static final int ITEM_TYPE_WEATHER = 32;
    public static final int ITEM_TYPE_WIFIP2P = 40;

    /* JADX INFO: renamed from: com.heytap.health.settings.watch.moresettings.a$a, reason: collision with other inner class name */
    public interface InterfaceC0565a extends m71 {
        void A();

        void a(String str);

        List<y13> c();

        void f(int i);

        void onDestroy();
    }

    public interface b extends u91<InterfaceC0565a> {
        void N(String str);

        void hideLoadingDialog();

        void u(int i);
    }

    public static boolean a(String str, int i) {
        return i == 32;
    }
}
