package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.oplus.aiunit.vision.k6n;
import com.oplus.aiunit.vision.n6n;
import com.oplus.aiunit.vision.q0n;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class g {
    private File b;
    private Handler d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1136e;
    private boolean f;
    private LinkedList<f> a = new LinkedList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1135c = false;
    private Runnable g = new Runnable() { // from class: com.autonavi.aps.amapapi.restruct.g.1
        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f1135c) {
                return;
            }
            if (g.this.f) {
                g.this.b();
                g.d(g.this);
            }
            if (g.this.d != null) {
                g.this.d.postDelayed(g.this.g, 60000L);
            }
        }
    };

    public g(Context context, Handler handler) {
        this.f1136e = null;
        this.d = handler;
        String path = context.getFilesDir().getPath();
        if (this.f1136e == null) {
            this.f1136e = com.autonavi.aps.amapapi.utils.k.l(context);
        }
        try {
            this.b = new File(path, "hisloc");
        } catch (Throwable th) {
            n6n.a(th);
        }
        a();
        Handler handler2 = this.d;
        if (handler2 != null) {
            handler2.removeCallbacks(this.g);
            this.d.postDelayed(this.g, 60000L);
        }
    }

    public static /* synthetic */ boolean d(g gVar) {
        gVar.f = false;
        return false;
    }

    public final void a(boolean z) {
        if (!z) {
            this.g.run();
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacks(this.g);
        }
        this.f1135c = true;
    }

    public final void b(f fVar) {
        a(fVar, 12);
    }

    public final void c(f fVar) {
        if (this.a.size() > 0) {
            int i = fVar.a;
            if (i != 6 && i != 5) {
                if (this.a.contains(fVar)) {
                    return;
                }
                if (this.a.size() >= 10) {
                    this.a.removeFirst();
                }
                this.a.add(fVar);
                this.f = true;
                return;
            }
            f last = this.a.getLast();
            if (last.f1133c == fVar.f1133c && last.b == fVar.b && last.f1134e == fVar.f1134e) {
                return;
            }
            if (this.a.size() >= 10) {
                this.a.removeFirst();
            }
            this.a.add(fVar);
            this.f = true;
        }
    }

    private static boolean b(ArrayList<d> arrayList, ArrayList<k6n> arrayList2) {
        return arrayList == null || arrayList.size() <= 0 || arrayList2 == null || arrayList2.size() <= 0 || (((long) arrayList.size()) < 4 && ((long) arrayList2.size()) < 20);
    }

    public final void a(f fVar) {
        a(fVar, 1);
    }

    private void a(f fVar, int i) {
        if (fVar == null) {
            return;
        }
        f fVar2 = null;
        int i2 = 0;
        f fVar3 = null;
        for (f fVar4 : this.a) {
            if (fVar4.a == i) {
                if (fVar3 == null) {
                    fVar3 = fVar4;
                }
                i2++;
                fVar2 = fVar4;
            }
        }
        if (fVar2 == null || fVar.d - fVar2.d >= 20000 || com.autonavi.aps.amapapi.utils.k.a(new double[]{fVar.b, fVar.f1133c, fVar2.b, fVar2.f1133c}) >= 20.0f) {
            if (i2 >= 5) {
                this.a.remove(fVar3);
            }
            if (this.a.size() >= 10) {
                this.a.removeFirst();
            }
            this.a.add(fVar);
            this.f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = this.a.iterator();
        while (it.hasNext()) {
            try {
                sb.append(q0n.f(com.autonavi.aps.amapapi.security.a.a(it.next().a().getBytes("UTF-8"), this.f1136e)) + Weather.SEPARATOR);
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        com.autonavi.aps.amapapi.utils.k.a(this.b, string);
    }

    public final List<f> a(ArrayList<d> arrayList, ArrayList<k6n> arrayList2) {
        if (!b(arrayList, arrayList2)) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (f fVar : this.a) {
            if (jCurrentTimeMillis - fVar.d < 21600000000L) {
                arrayList3.add(fVar);
                i++;
            }
            if (i == 10) {
                break;
            }
        }
        return arrayList3;
    }

    private void a() {
        LinkedList<f> linkedList = this.a;
        if (linkedList == null || linkedList.size() <= 0) {
            Iterator<String> it = com.autonavi.aps.amapapi.utils.k.a(this.b).iterator();
            while (it.hasNext()) {
                try {
                    String str = new String(com.autonavi.aps.amapapi.security.a.b(q0n.g(it.next()), this.f1136e), "UTF-8");
                    f fVar = new f();
                    fVar.a(new JSONObject(str));
                    this.a.add(fVar);
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }
}
