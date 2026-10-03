package com.oplus.oms.split.full.splitrequest;

import android.content.Context;
import com.oplus.aiunit.vision.b7i;
import com.oplus.aiunit.vision.h7i;
import com.oplus.aiunit.vision.j7i;
import com.oplus.aiunit.vision.sgd;
import com.oplus.aiunit.vision.w7i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class SplitOmsJsonLoadStrategy {
    public boolean a = false;
    public Context b;

    public static class b {
        public static final SplitOmsJsonLoadStrategy a = new SplitOmsJsonLoadStrategy(null);
    }

    public SplitOmsJsonLoadStrategy() {
    }

    public static SplitOmsJsonLoadStrategy getInstance() {
        return b.a;
    }

    public String[] getDynamicFeatures() {
        if (!this.a) {
            w7i.e("SplitOmsJsonLoadStrategy", "dynamicModules from omsConfig ", new Object[0]);
            return b7i.b();
        }
        Collection<h7i> collectionE = j7i.s().e(this.b);
        if (collectionE == null || collectionE.isEmpty()) {
            w7i.e("SplitOmsJsonLoadStrategy", "allSplits is empty", new Object[0]);
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        Iterator<h7i> it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().q());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        w7i.e("SplitOmsJsonLoadStrategy", "dynamicModules from oms.json " + Arrays.toString(strArr), new Object[0]);
        return strArr;
    }

    public boolean getIsCustomizeOmsJsonStatus() {
        return this.a;
    }

    public sgd getOmsJsonCustomProvider() {
        return null;
    }

    public void setIsCustomizeOmsJsonStatus(boolean z, Context context) {
        this.a = z;
        this.b = context;
    }

    public void setOmsJsonCustomProvider(sgd sgdVar) {
    }

    public SplitOmsJsonLoadStrategy(a aVar) {
    }
}
