package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class rmk implements os9 {
    public final String a = "UrlMatcher";
    public List<a> b = new ArrayList();

    public final class a {
        public String a;
        public List<a> b = new ArrayList();

        public a(String str) {
            this.a = str;
        }
    }

    public rmk(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                URL url = new URL(it.next());
                b(url.getProtocol(), url.getHost());
            } catch (MalformedURLException unused) {
            }
        }
    }

    @Override // com.oplus.aiunit.vision.os9
    public boolean a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("match---url: ");
        sb.append(str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            URL url = new URL(str);
            return c(url.getProtocol(), url.getHost());
        } catch (MalformedURLException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("url: ");
            sb2.append(str);
            sb2.append(" is invalid!!!");
            return false;
        }
    }

    public final void b(String... strArr) {
        boolean z;
        List<a> list = this.b;
        for (int i = 0; i < strArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("urlSeg: ");
            sb.append(strArr[i]);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    z = false;
                    break;
                }
                a aVar = list.get(i2);
                if (aVar.a.equalsIgnoreCase(strArr[i])) {
                    list = aVar.b;
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                a aVar2 = new a(strArr[i]);
                list.add(aVar2);
                list = aVar2.b;
            }
        }
    }

    public final boolean c(String... strArr) {
        List<a> list = this.b;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= strArr.length) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("match---urlSeg: ");
            sb.append(strArr[i]);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    z = false;
                    break;
                }
                a aVar = list.get(i2);
                if (aVar.a.equalsIgnoreCase(strArr[i])) {
                    list = aVar.b;
                    break;
                }
                i2++;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
