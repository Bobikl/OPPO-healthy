package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(19)
public class j7h implements rbb {
    public static final Bitmap.Config[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f12788e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final c a = new c();
    public final gc8<b, Bitmap> b = new gc8<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f12789c = new HashMap();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    public static final class b implements nne {
        public final c a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f12790c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // com.oplus.aiunit.vision.nne
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Bitmap.Config config) {
            this.b = i;
            this.f12790c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && uqk.e(this.f12790c, bVar.f12790c);
        }

        public int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.f12790c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return j7h.h(this.b, this.f12790c);
        }
    }

    @VisibleForTesting
    public static class c extends u51<b> {
        @Override // com.oplus.aiunit.vision.u51
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        d = configArr;
        f12788e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public static Bitmap.Config[] i(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return f12788e;
        }
        int i = a.a[config.ordinal()];
        if (i == 1) {
            return d;
        }
        if (i == 2) {
            return f;
        }
        if (i != 3) {
            return i != 4 ? new Bitmap.Config[]{config} : h;
        }
        return g;
    }

    @Override // com.oplus.aiunit.vision.rbb
    public String a(int i, int i2, Bitmap.Config config) {
        return h(uqk.h(i, i2, config), config);
    }

    @Override // com.oplus.aiunit.vision.rbb
    public void b(Bitmap bitmap) {
        b bVarE = this.a.e(uqk.i(bitmap), bitmap.getConfig());
        this.b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = navigableMapJ.get(Integer.valueOf(bVarE.b));
        navigableMapJ.put(Integer.valueOf(bVarE.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.oplus.aiunit.vision.rbb
    @Nullable
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        b bVarG = g(uqk.h(i, i2, config), config);
        Bitmap bitmapA = this.b.a(bVarG);
        if (bitmapA != null) {
            f(Integer.valueOf(bVarG.b), bitmapA);
            bitmapA.reconfigure(i, i2, config);
        }
        return bitmapA;
    }

    @Override // com.oplus.aiunit.vision.rbb
    public int d(Bitmap bitmap) {
        return uqk.i(bitmap);
    }

    @Override // com.oplus.aiunit.vision.rbb
    public String e(Bitmap bitmap) {
        return h(uqk.i(bitmap), bitmap.getConfig());
    }

    public final void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    public final b g(int i, Bitmap.Config config) {
        b bVarE = this.a.e(i, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer numCeilingKey = j(config2).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i * 8) {
                if (numCeilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVarE;
                        }
                    } else if (config2.equals(config)) {
                        return bVarE;
                    }
                }
                this.a.c(bVarE);
                return this.a.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    public final NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f12789c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f12789c.put(config, treeMap);
        return treeMap;
    }

    @Override // com.oplus.aiunit.vision.rbb
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapF = this.b.f();
        if (bitmapF != null) {
            f(Integer.valueOf(uqk.i(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f12789c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f12789c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
