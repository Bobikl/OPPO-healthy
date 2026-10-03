package com.lifesense.plugin.ble.c;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.location.LocationManager;
import android.net.Uri;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.text.TextUtils;
import com.lifesense.plugin.ble.data.other.AppPermission;
import com.lifesense.plugin.ble.device.ancs.NAccessService;
import com.lifesense.plugin.ble.device.ancs.NotificationService;
import com.oplus.aiunit.vision.f58;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale"})
public class f {
    private static Uri a = Uri.parse("content://sms/");

    public static AppPermission a(Context context) {
        AppPermission appPermission = new AppPermission();
        appPermission.setNotifyServiceWorking(a(context, NotificationService.class.getName()));
        appPermission.setEnableReceiveNotify(c(context));
        appPermission.setNotifyServiceBind(NotificationService.isServiceBindSuccess());
        appPermission.setAccessServiceWorking(NAccessService.isAccessServiceConnected());
        return appPermission;
    }

    public static boolean b(Context context) {
        try {
            return b(context, "android.permission.ACCESS_FINE_LOCATION") && ((LocationManager) context.getSystemService("location")).isProviderEnabled(f58.GPS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static String c(Context context, String str) {
        Cursor cursorQuery;
        if (context == null) {
            return str;
        }
        ContentResolver contentResolver = context.getContentResolver();
        String[] strArr = {"_id", "display_name"};
        try {
            cursorQuery = contentResolver.query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), strArr, null, null, null);
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                cursorQuery = contentResolver.query(Uri.withAppendedPath(Contacts.Phones.CONTENT_FILTER_URL, Uri.encode(str)), strArr, null, null, null);
            } catch (Exception e3) {
                e3.printStackTrace();
                cursorQuery = null;
            }
        }
        String string = "";
        if (cursorQuery != null) {
            if (cursorQuery.getCount() > 0 && cursorQuery.moveToFirst()) {
                string = cursorQuery.getString(1);
            }
            cursorQuery.close();
        }
        return string;
    }

    public static boolean d(Context context) {
        return a(context, NotificationService.class.getName()) && NotificationService.isServiceBindSuccess();
    }

    public static boolean e(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return ((LocationManager) context.getSystemService("location")).isProviderEnabled(f58.GPS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean f(Context context) {
        try {
            return b(context, "android.permission.ACCESS_FINE_LOCATION");
        } catch (Exception e2) {
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Program_Exception, true, "failed to get fine location permission,has exception:" + e2.toString(), null);
            e2.printStackTrace();
            return false;
        }
    }

    public static String g(Context context) {
        return "gpsStatus=" + e(context) + "; locationPermission=" + f(context);
    }

    public static boolean a(Context context, String str) {
        if (context != null && str != null) {
            try {
                List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
                if (runningServices != null && runningServices.size() > 0) {
                    Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
                    while (it.hasNext()) {
                        if (it.next().service.getClassName().toString().equals(str)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static boolean b(Context context, String str) {
        if (context != null) {
            try {
                if (context.getPackageManager() != null && context.getPackageName() != null && str != null) {
                    PackageManager packageManager = context.getPackageManager();
                    String[] strArr = packageManager.getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                    if (strArr != null && strArr.length != 0) {
                        for (String str2 : strArr) {
                            if (str.equalsIgnoreCase(str2) && packageManager.checkPermission(str2, context.getPackageName()) == 0) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        ContentResolver contentResolver = context.getContentResolver();
        String packageName = context.getPackageName();
        if (contentResolver != null && packageName != null) {
            try {
                if (packageName.length() != 0) {
                    String string = Settings.Secure.getString(contentResolver, "enabled_notification_listeners");
                    return !TextUtils.isEmpty(string) && string.contains(packageName);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
