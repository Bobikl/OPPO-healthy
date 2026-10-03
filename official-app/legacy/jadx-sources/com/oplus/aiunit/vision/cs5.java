package com.oplus.aiunit.vision;

import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.heytap.health.base.switchManager.SwitchBean;
import com.heytap.health.dialog.DialogSection;
import com.heytap.health.dialog.KeepAliveSection;
import com.heytap.health.dialog.MovingDialogSection;
import com.heytap.health.dialog.ProtocolUpdateDialogSection;
import com.heytap.health.dialog.SpaceDialogSection;
import com.heytap.health.dialog.UpdateDialogSection;
import com.heytap.health.dialog.WeeklyDialogSection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class cs5 {
    public static final String TAG = "SectionProcess ==> ";
    public static long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static List<String> f10221e;
    public DialogSection a;
    public List<DialogSection> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public as5 f10222c;

    public class a extends u61<SwitchBean> {
        public final /* synthetic */ long i;

        public a(long j2) {
            this.i = j2;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            a7b.b(cs5.TAG, "Failed to get dialog order: " + th);
            cs5.this.m();
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(SwitchBean switchBean) {
            a7b.f(cs5.TAG, "requestDialogOrder：result:" + switchBean);
            cs5.d = this.i;
            String config = switchBean != null ? switchBean.getConfig() : "";
            if (TextUtils.isEmpty(config)) {
                cs5.this.m();
                return;
            }
            try {
                JsonObject asJsonObject = JsonParser.parseString(config).getAsJsonObject();
                String asString = asJsonObject.has("order") ? asJsonObject.get("order").getAsString() : "";
                if (asJsonObject.has(bs5.SP_KEY_HOME_SPACE_INTERVAL)) {
                    bs5.d(asJsonObject.get(bs5.SP_KEY_HOME_SPACE_INTERVAL).getAsInt());
                }
                if (asJsonObject.has(bs5.SP_KEY_SPACE_INTERVAL)) {
                    bs5.g(asJsonObject.get(bs5.SP_KEY_SPACE_INTERVAL).getAsInt());
                }
                cs5.f10221e = cs5.this.j(asString);
                cs5.this.n(cs5.f10221e);
            } catch (Exception e2) {
                a7b.n(cs5.TAG, "requestDialogOrder:" + e2, e2);
                cs5.this.m();
            }
        }
    }

    public cs5(as5 as5Var) {
        this.f10222c = as5Var;
    }

    public final DialogSection f(String str) {
        str.hashCode();
        switch (str) {
            case "Moving":
                return new MovingDialogSection();
            case "Update":
                return new UpdateDialogSection();
            case "Weekly":
                return new WeeklyDialogSection();
            case "ProtocolUpdate":
                return new ProtocolUpdateDialogSection();
            case "Space":
                return new SpaceDialogSection();
            case "KeepAlive":
                return new KeepAliveSection();
            default:
                return null;
        }
    }

    public void g() {
        Iterator<DialogSection> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.b.clear();
    }

    public final boolean h(long j2, long j3) {
        if (j2 == 0) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j3);
        return (calendar.get(6) != calendar2.get(6) || calendar.get(1) != calendar2.get(1)) && (((j3 - j2) > 3600000L ? 1 : ((j3 - j2) == 3600000L ? 0 : -1)) > 0);
    }

    public void i(int i, int i2, @Nullable Intent intent) {
        for (DialogSection dialogSection : this.b) {
            if (dialogSection != null) {
                dialogSection.h(i, i2, intent);
            }
        }
    }

    public List<String> j(String str) {
        return (str == null || str.isEmpty()) ? Arrays.asList("ProtocolUpdate,Moving,KeepAlive,Weekly,Space,Update".split(",")) : Arrays.asList(str.split(","));
    }

    public void k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f10221e == null || h(d, jCurrentTimeMillis)) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("switchType", "100");
            ((p6j) com.heytap.health.network.core.a.j(p6j.class)).f(map).L0(su8.d("dialog_order")).n0(f30.c()).subscribe(new a(jCurrentTimeMillis));
        }
    }

    @MainThread
    public void l(DialogSection dialogSection) {
        if (!m3k.h()) {
            a7b.b(TAG, "hasAgreeHealth == false,return!");
            return;
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalThreadStateException("dialogSection must start on main thread !!!");
        }
        if (dialogSection == null) {
            return;
        }
        if (this.f10222c == null) {
            a7b.b(TAG, "context is null");
            return;
        }
        int i = -1;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (this.b.get(i2).getClass().getSimpleName().equals(dialogSection.getClass().getSimpleName())) {
                i = i2;
            }
        }
        if (i == -1) {
            this.b.add(dialogSection);
        } else {
            dialogSection = this.b.get(i);
        }
        try {
            this.a = dialogSection;
            dialogSection.b(this.f10222c);
            this.a.j(this);
        } catch (Exception e2) {
            a7b.b(TAG, "Exception: " + e2.getMessage());
        }
    }

    public final void m() {
        List<String> listJ = j("");
        f10221e = listJ;
        n(listJ);
    }

    public final void n(List<String> list) {
        a7b.f(TAG, "startDialogsByOrder order:" + list);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            DialogSection dialogSectionF = f(it.next());
            if (dialogSectionF != null) {
                arrayList.add(dialogSectionF);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (i != arrayList.size() - 1) {
                ((DialogSection) arrayList.get(i)).k((DialogSection) arrayList.get(i + 1));
            }
        }
        l((DialogSection) arrayList.get(0));
    }
}
