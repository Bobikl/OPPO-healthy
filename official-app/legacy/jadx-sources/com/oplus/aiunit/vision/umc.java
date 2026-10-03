package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes8.dex */
public class umc extends k7a {
    public String a = "";
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17520c = false;
    public String d = "";

    public static String d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) != 0 || packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            return "NOP";
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress()) {
                        String hostAddress = inetAddressNextElement.getHostAddress();
                        return hostAddress != null ? hostAddress : "";
                    }
                }
            }
            return "";
        } catch (Exception e2) {
            v6b.b(e2.toString());
            return "ERR";
        }
    }

    @Override // com.oplus.aiunit.vision.k7a
    public boolean b(Context context) {
        f(context);
        g(context);
        e(context);
        return false;
    }

    @Override // com.oplus.aiunit.vision.k7a
    public void c(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("networkType", this.a);
        jsonObject2.addProperty("cellIP", this.b);
        jsonObject2.addProperty("isVpn", Boolean.valueOf(this.f17520c));
        jsonObject2.addProperty("vpnIP", this.d);
        jsonObject.add("NetInfo", jsonObject2);
    }

    public final void e(Context context) {
        if (!TextUtils.isEmpty(this.a)) {
            this.b = d(context);
        } else if (this.f17520c) {
            this.d = d(context);
        }
    }

    public final void f(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            this.a = "NOP";
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        String subtypeName = "";
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0) {
                    subtypeName = activeNetworkInfo.getSubtypeName();
                }
            } catch (Exception e2) {
                v6b.b(e2.toString());
                subtypeName = "ERR";
            }
        }
        this.a = subtypeName;
    }

    public final void g(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                return;
            }
            this.f17520c = true;
        } catch (Exception e2) {
            v6b.b(e2.toString());
        }
    }
}
