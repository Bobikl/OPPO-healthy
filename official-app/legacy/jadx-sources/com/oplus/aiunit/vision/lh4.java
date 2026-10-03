package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.settings.watch.sporthealthsettings.activity.customize.bean.CustomizeNameBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class lh4 {
    public static final String TAG = "CustomizeDao";
    public static List<CustomizeNameBean> a = new LinkedList();
    public static Map<Integer, String> b = new HashMap();

    public static void a() {
        a.clear();
        b.clear();
    }

    public static int b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("deleteBySsid: ");
        sb.append(str);
        Iterator<CustomizeNameBean> it = a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getSsid().equals(str)) {
                a.remove(i);
                return 1;
            }
            i++;
        }
        return i;
    }

    public static Map<Integer, String> c() {
        return b;
    }

    public static void d(Map<Integer, String> map) {
        b.clear();
        b.putAll(map);
    }

    public static void e(CustomizeNameBean customizeNameBean) {
        StringBuilder sb = new StringBuilder();
        sb.append("insert: ");
        sb.append(customizeNameBean);
        a.add(customizeNameBean);
    }

    public static void f(List<CustomizeNameBean> list) {
        if (qe0.w()) {
            for (CustomizeNameBean customizeNameBean : list) {
                StringBuilder sb = new StringBuilder();
                sb.append("insert: ");
                sb.append(customizeNameBean);
            }
        }
        a.clear();
        a.addAll(list);
    }

    public static List<CustomizeNameBean> g(@NotNull String str, @NotNull String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("queryAllByMacAndName: mac:");
        sb.append(str);
        sb.append("  name:");
        sb.append(str2);
        LinkedList linkedList = new LinkedList();
        for (CustomizeNameBean customizeNameBean : a) {
            String mac = customizeNameBean.getMac();
            Object name = customizeNameBean.getName();
            String strA = kgi.a(customizeNameBean.getStyle());
            if (str.equals(mac) && (str2.equals(name) || (!oei.b(customizeNameBean.getStyle()) && !TextUtils.isEmpty(strA) && str2.equals(strA)))) {
                linkedList.add(customizeNameBean);
            }
        }
        return linkedList;
    }

    public static boolean h() {
        return b.isEmpty();
    }

    public static int i(CustomizeNameBean customizeNameBean) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateCustomize: ");
        sb.append(customizeNameBean);
        Iterator<CustomizeNameBean> it = a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (customizeNameBean.getSsid().equals(it.next().getSsid())) {
                a.set(i, customizeNameBean);
                return 1;
            }
            i++;
        }
        return i;
    }
}
