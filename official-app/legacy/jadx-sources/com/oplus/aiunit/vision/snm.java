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

/* JADX INFO: loaded from: classes12.dex */
public class snm extends qnm {
    public String a = "";
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16664c = false;
    public String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16665e = false;

    public static String c(Context context) {
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
            gnm.a(e2.toString());
            return "ERR";
        }
    }

    @Override // com.oplus.aiunit.vision.qnm
    public void a(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("networkType", this.a);
        jsonObject2.addProperty("cellIP", this.b);
        jsonObject2.addProperty("isVpn", Boolean.valueOf(this.f16664c));
        jsonObject2.addProperty("vpnIP", this.d);
        jsonObject2.addProperty("isProxy", Boolean.valueOf(this.f16665e));
        jsonObject.add("NetInfo", jsonObject2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    @Override // com.oplus.aiunit.vision.qnm
    public boolean b(Context context) {
        String subtypeName;
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            this.a = "NOP";
        } else {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
                        subtypeName = "";
                    } else {
                        subtypeName = activeNetworkInfo.getSubtypeName();
                    }
                } catch (Exception e2) {
                    gnm.a(e2.toString());
                    subtypeName = "ERR";
                }
            } else {
                subtypeName = "";
            }
            this.a = subtypeName;
        }
        try {
            ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(connectivityManager2.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                this.f16664c = true;
            }
        } catch (Exception e3) {
            gnm.a(e3.toString());
        }
        if (!TextUtils.isEmpty(this.a)) {
            this.b = c(context);
        } else if (this.f16664c) {
            this.d = c(context);
        }
        if (TextUtils.isEmpty(System.getProperty("http.proxyHost"))) {
            return false;
        }
        this.f16665e = true;
        return false;
    }
}
