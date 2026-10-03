package com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.coui.appcompat.picker.COUINumberPicker;
import com.coui.appcompat.picker.COUITimeLimitPicker;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.g;
import com.heytap.health.settings.watch.widget.OplusNearTimePicker;
import com.liulishuo.okdownload.DownloadTask;
import com.oplus.aiunit.model.tlg;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.hxc;
import com.oplus.aiunit.vision.lyc;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.quh;
import java.util.ArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
public class g {

    public interface a {
        void a(int i, int i2);
    }

    public static String h(int i) {
        int i2;
        Context contextA = e88.a();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 <= 6; i3++) {
            if (((i >> i3) & 1) == 1) {
                switch (i3) {
                    case 0:
                        arrayList.add(contextA.getResources().getString(R.string.settings_sleep_user_all_habit_monday_desc));
                        break;
                    case 1:
                        arrayList.add(contextA.getResources().getString(R.string.settings_sleep_user_all_habit_tuesday_desc));
                        break;
                    case 2:
                        arrayList.add(contextA.getResources().getString(R.string.settings_sleep_user_all_habit_wednesday_desc));
                        break;
                    case 3:
                        arrayList.add(contextA.getResources().getString(R.string.settings_sleep_user_all_habit_thursday_desc));
                        break;
                    case 4:
                        arrayList.add(contextA.getResources().getString(R.string.settings_sleep_user_all_habit_friday_desc));
                        break;
                    case 5:
                        arrayList.add(contextA.getResources().getString(R.string.settings_sleep_user_all_habit_saturday_desc));
                        break;
                    case 6:
                        arrayList.add(contextA.getResources().getString(R.string.settings_sleep_user_all_habit_sunday_desc));
                        break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        switch (arrayList.size()) {
            case 1:
                i2 = R.string.settings_sleep_user_all_habit_day1;
                break;
            case 2:
                i2 = R.string.settings_sleep_user_all_habit_day2;
                break;
            case 3:
                i2 = R.string.settings_sleep_user_all_habit_day3;
                break;
            case 4:
                i2 = R.string.settings_sleep_user_all_habit_day4;
                break;
            case 5:
                i2 = R.string.settings_sleep_user_all_habit_day5;
                break;
            case 6:
                i2 = R.string.settings_sleep_user_all_habit_day6;
                break;
            case 7:
                i2 = R.string.settings_sleep_user_all_habit_day7;
                break;
            default:
                return "";
        }
        String str = String.format(contextA.getString(i2), arrayList.toArray());
        m8b.f("Sleep-Setting", "result: " + str);
        return str;
    }

    public static boolean i(String str) {
        return !e88.a().getPackageManager().queryIntentActivities(new Intent(str), DownloadTask.Builder.DEFAULT_SYNC_BUFFER_SIZE).isEmpty();
    }

    public static /* synthetic */ void l(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        lyc.b(activity, (Integer) null);
    }

    public static /* synthetic */ String n(int i) {
        return String.valueOf(i * 15);
    }

    public static /* synthetic */ void o(OplusNearTimePicker oplusNearTimePicker, COUITimeLimitPicker cOUITimeLimitPicker, int i, int i2) {
        int iA = quh.a((i << 8) | (i2 * 15));
        if (iA == 0) {
            oplusNearTimePicker.r(2, 3);
        } else if (iA == 22) {
            oplusNearTimePicker.r(0, 0);
        } else {
            oplusNearTimePicker.r(0, 3);
        }
    }

    public static /* synthetic */ void p(a aVar, OplusNearTimePicker oplusNearTimePicker, DialogInterface dialogInterface, int i) {
        aVar.a(oplusNearTimePicker.getCurrentHour().intValue(), oplusNearTimePicker.getCurrentMinute().intValue() * 15);
    }

    public static void q(final Context context, int i) {
        new HealthAlertDialogBuilder(context).W(context.getResources().getString(R.string.settings_sleep_banner_notification_dialog_title)).K(context.getResources().getString(i)).T(context.getResources().getString(R.string.settings_sleep_notification_dialog_open), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.urh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                hxc.e(context, "SleepSettingChannelId");
            }
        }).M(context.getResources().getString(R.string.settings_sleep_banner_notification_dialog_cancel), (DialogInterface.OnClickListener) null).setCancelable(false).create().show();
    }

    public static void r(final Context context, int i) {
        new HealthAlertDialogBuilder(context).W(context.getResources().getString(R.string.settings_sleep_notification_dialog_title)).K(context.getResources().getString(i)).T(context.getResources().getString(R.string.settings_sleep_notification_dialog_open), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.vrh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                hxc.f(context);
            }
        }).M(context.getResources().getString(R.string.settings_sleep_notification_dialog_cancel), (DialogInterface.OnClickListener) null).setCancelable(false).create().show();
    }

    public static void s(final Activity activity) {
        new HealthAlertDialogBuilder(activity).V(R.string.settings_sound_notification_title).J(R.string.settings_sound_notification_content).R(com.heytap.health.watch.notification.R.string.settings_notification_guide_open, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.srh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                g.l(activity, dialogInterface, i);
            }
        }).L(R.string.settings_cancel, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.trh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setCancelable(false).create().show();
    }

    public static void t(Context context, int i, final a aVar) {
        COUIAlertDialogBuilder cOUIAlertDialogBuilder = new COUIAlertDialogBuilder(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.settings_sleep_time_picker1, (ViewGroup) null);
        cOUIAlertDialogBuilder.setView(viewInflate);
        cOUIAlertDialogBuilder.setCancelable(false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.sleep_duration_tv);
        textView.setText(context.getString(R.string.settings_sleep_goal_panel_desc));
        textView.setVisibility(0);
        COUIToolbar cOUIToolbarFindViewById = viewInflate.findViewById(R.id.normal_bottom_sheet_toolbar);
        cOUIToolbarFindViewById.setTitle(context.getString(R.string.settings_sleep_goal_panel_title));
        cOUIToolbarFindViewById.setNavigationIcon((Drawable) null);
        cOUIToolbarFindViewById.setIsTitleCenterStyle(true);
        final OplusNearTimePicker oplusNearTimePicker = (OplusNearTimePicker) viewInflate.findViewById(R.id.sleep_time_picker);
        oplusNearTimePicker.setTextVisibility(false);
        oplusNearTimePicker.setIs24HourView(Boolean.TRUE);
        oplusNearTimePicker.q(quh.a(0), quh.a(5632));
        oplusNearTimePicker.r(0, 3);
        oplusNearTimePicker.setMinuteFormatter(new COUINumberPicker.c() { // from class: com.oplus.aiunit.vision.wrh
            public final String format(int i2) {
                return g.n(i2);
            }
        });
        oplusNearTimePicker.setOnTimeChangedListener(new COUITimeLimitPicker.i() { // from class: com.oplus.aiunit.vision.xrh
            public final void d(COUITimeLimitPicker cOUITimeLimitPicker, int i2, int i3) {
                g.o(oplusNearTimePicker, cOUITimeLimitPicker, i2, i3);
            }
        });
        if (i == 0) {
            i = tlg.DEFAULT_AM_START_TIME;
        }
        oplusNearTimePicker.setCurrentHour(Integer.valueOf(quh.a(i)));
        oplusNearTimePicker.setCurrentMinute(Integer.valueOf(quh.b(i) / 15));
        cOUIAlertDialogBuilder.R(com.heytap.health.base.R.string.lib_base_dialog_confirm, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.yrh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                g.p(aVar, oplusNearTimePicker, dialogInterface, i2);
            }
        });
        cOUIAlertDialogBuilder.L(com.heytap.health.base.R.string.lib_base_share_dialog_cancel, (DialogInterface.OnClickListener) null);
        cOUIAlertDialogBuilder.show();
    }

    public static boolean u() {
        return i("android.settings.USAGE_ACCESS_SETTINGS");
    }
}