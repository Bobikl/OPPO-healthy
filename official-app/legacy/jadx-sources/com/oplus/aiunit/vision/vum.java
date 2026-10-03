package com.oplus.aiunit.vision;

import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class vum implements Comparator {
    public String i;

    public vum(String str) {
        this.i = str;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        long jOptLong = ((JSONObject) obj).optLong(this.i);
        long jOptLong2 = ((JSONObject) obj2).optLong(this.i);
        if (jOptLong < jOptLong2) {
            return -1;
        }
        return jOptLong > jOptLong2 ? 1 : 0;
    }
}
