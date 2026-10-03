package com.heytap.msp.okipc;

import android.os.Bundle;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public TreeMap<String, String> a = new TreeMap<>();

    public a(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            this.a.put(str, bundle.getString(str));
        }
    }

    public void a(String str, String str2) {
        this.a.put(str, str2);
    }

    @NotNull
    public Bundle b() {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    @Nullable
    public String c(String str) {
        return this.a.get(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        boolean z = true;
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            z = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public a() {
    }
}
