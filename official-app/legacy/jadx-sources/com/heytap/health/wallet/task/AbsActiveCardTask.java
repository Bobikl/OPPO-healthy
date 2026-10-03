package com.heytap.health.wallet.task;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.health.wallet.bean.Content;
import com.heytap.health.wallet.bean.TaskResult;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.b70;
import com.oplus.aiunit.vision.d04;
import com.oplus.aiunit.vision.f70;
import com.oplus.aiunit.vision.j7l;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.tpc;
import com.oplus.aiunit.vision.w60;
import com.oplus.aiunit.vision.y60;
import com.oplus.aiunit.vision.ydc;
import com.oplus.aiunit.vision.z60;
import com.oppo.lib.common.R$string;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AbsActiveCardTask {

    @Keep
    public class ActiveCommandJob extends y60<ActiveResult> {
        private Content activeContent;
        private String aid;
        private boolean isInNfcField;
        private boolean isSendStartEvent;
        private Content unActiveContent;

        public ActiveCommandJob(Content content, Content content2, boolean z, boolean z2, String str) {
            this.unActiveContent = content;
            this.activeContent = content2;
            this.isInNfcField = z;
            this.isSendStartEvent = z2;
            this.aid = str;
        }

        private boolean realActive() {
            t6b.i("BaseApduJob", "realActive: do active: " + this.activeContent);
            return execCommand(this.activeContent, true).getResultCode() == 9000;
        }

        private boolean realDeactive() {
            if (this.unActiveContent != null) {
                t6b.i("BaseApduJob", "realActive: do un active: " + this.unActiveContent);
                if (execCommand(this.unActiveContent, true).getResultCode() != 9000) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.oplus.aiunit.vision.c70
        public void onStart() {
            boolean zRealActive;
            ActiveResult activeResult = AbsActiveCardTask.this.new ActiveResult();
            if (this.isSendStartEvent) {
                ydc.n().v(7, this.aid);
            }
            boolean zRealDeactive = realDeactive();
            if (zRealDeactive) {
                zRealActive = realActive();
                if (!zRealActive) {
                    t6b.i("BaseApduJob", "try again");
                    TaskResult taskResultD = f70.d();
                    if (taskResultD.getResultCode() == 9000) {
                        String strS = aec.s(taskResultD.getContent().getCommands());
                        t6b.i("BaseApduJob", "get aid from ese " + strS);
                        if (!TextUtils.isEmpty(strS) && !"no_activite_aid".equals(strS)) {
                            this.unActiveContent = f70.b(d04.TAG_DEACTIVATE_CARD, strS);
                            zRealDeactive = realDeactive();
                        }
                    }
                    zRealActive = realActive();
                }
            } else {
                zRealActive = false;
            }
            if (zRealActive) {
                t6b.i("BaseApduJob", "active success notify change RF: ");
                String str = z60.AID_CITY_MAP.get(this.aid);
                ydc ydcVarN = ydc.n();
                String str2 = this.aid;
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                ydcVarN.c(str2, str);
            }
            activeResult.isInNfcField = this.isInNfcField;
            activeResult.setUnActiveSuccess(zRealDeactive);
            activeResult.setSuccess(zRealActive);
            notifyResult(activeResult);
        }
    }

    @Keep
    public class ActiveResult {
        private boolean isInNfcField;
        private boolean success;
        private boolean unActiveSuccess;

        public ActiveResult() {
        }

        public boolean isInNfcField() {
            return this.isInNfcField;
        }

        public boolean isSuccess() {
            return this.success;
        }

        public boolean isUnActiveSuccess() {
            return this.unActiveSuccess;
        }

        public void setSuccess(boolean z) {
            this.success = z;
        }

        public void setUnActiveSuccess(boolean z) {
            this.unActiveSuccess = z;
        }
    }

    public class a extends w60<String> {
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f6395c;
        public final /* synthetic */ boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f6396e;

        public a(String str, d dVar, boolean z, boolean z2) {
            this.b = str;
            this.f6395c = dVar;
            this.d = z;
            this.f6396e = z2;
        }

        @Override // com.oplus.aiunit.vision.w60
        public void b(Object obj) {
            AbsActiveCardTask.this.i(this.f6395c, this.d, "get default aid failed, " + obj.toString());
        }

        @Override // com.oplus.aiunit.vision.w60
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(String str) {
            String strU = j7l.u();
            t6b.i("AbsActiveCardTask", " fromAid =" + strU);
            AbsActiveCardTask.this.f(this.b, this.f6395c, this.d, this.f6396e, strU);
        }
    }

    public class b extends w60<ActiveResult> {
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f6397c;
        public final /* synthetic */ d d;

        public b(String str, String str2, d dVar) {
            this.b = str;
            this.f6397c = str2;
            this.d = dVar;
        }

        @Override // com.oplus.aiunit.vision.w60
        public void b(Object obj) {
            AbsActiveCardTask.this.i(this.d, false, obj.toString());
        }

        @Override // com.oplus.aiunit.vision.w60
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(ActiveResult activeResult) {
            String str;
            if (activeResult.isUnActiveSuccess() && (str = this.b) != null) {
                AbsActiveCardTask.this.g(str, false);
            }
            if (!activeResult.isSuccess()) {
                AbsActiveCardTask.this.i(this.d, activeResult.isInNfcField(), "maybe apdu error");
                return;
            }
            AbsActiveCardTask.this.g(this.f6397c, true);
            t6b.f("AbsActiveCardTask", "default aid =" + this.f6397c);
            AbsActiveCardTask.this.j(this.d);
        }
    }

    public class c extends w60<TaskResult> {
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f6399c;
        public final /* synthetic */ boolean d;

        public c(String str, d dVar, boolean z) {
            this.b = str;
            this.f6399c = dVar;
            this.d = z;
        }

        @Override // com.oplus.aiunit.vision.w60
        public void b(Object obj) {
            AbsActiveCardTask.this.i(this.f6399c, this.d, obj.toString());
        }

        @Override // com.oplus.aiunit.vision.w60
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(TaskResult taskResult) {
            if (taskResult.getResultCode() == 9000) {
                AbsActiveCardTask.this.g(this.b, false);
                AbsActiveCardTask.this.j(this.f6399c);
            } else {
                AbsActiveCardTask.this.i(this.f6399c, this.d, "maybe apdu error");
            }
            t6b.i("AbsActiveCardTask", "unActivate result code: " + taskResult.getResultCode());
        }
    }

    public interface d {
        void a(String str, String str2);

        void onSuccess(String str);
    }

    public void d(String str, d dVar, boolean z) {
        e(str, dVar, z, false);
    }

    public void e(String str, d dVar, boolean z, boolean z2) {
        h(new a(str, dVar, z, z2));
    }

    public final void f(String str, d dVar, boolean z, boolean z2, String str2) {
        t6b.i("AbsActiveCardTask", "active from [" + str2 + "] to [" + str + "]");
        if (TextUtils.equals(str2, str)) {
            j(dVar);
            return;
        }
        Content contentB = (TextUtils.isEmpty(str2) || "no_activite_aid".equals(str2)) ? null : f70.b(d04.TAG_DEACTIVATE_CARD, str2);
        if (TextUtils.isEmpty(str) || "no_activite_aid".equals(str)) {
            i(dVar, false, "active aid is null or no_activite_aid");
        } else {
            tpc.b().g(new ActiveCommandJob(contentB, f70.b(d04.TAG_ACTIVATE_CARD, str), z, z2, str), new b(str2, str, dVar));
        }
    }

    public abstract void g(String str, boolean z);

    public final void h(w60<String> w60Var) {
        tpc.b().g(new b70(), w60Var);
    }

    public final void i(d dVar, boolean z, String str) {
        t6b.i("AbsActiveCardTask", "notifyActiveFailed() called with: callback = [" + dVar + "], becauseOfField = [" + z + "], reason = [" + str + "]");
        if (dVar != null) {
            if (z) {
                dVar.a(null, qz0.mContext.getString(R$string.keep_away_from_nfc_field));
            } else {
                dVar.a(null, qz0.mContext.getString(R$string.nfc_card_change_fail));
            }
        }
    }

    public final void j(d dVar) {
        t6b.i("AbsActiveCardTask", "notifyActiveSuccess() called with: callback = [" + dVar);
        if (dVar != null) {
            dVar.onSuccess(qz0.mContext.getString(R$string.set_default_success));
        }
    }

    public void k(String str, boolean z, d dVar) {
        t6b.i("AbsActiveCardTask", "unActivateCurAid() called with: aid = [" + str + "]");
        if (TextUtils.isEmpty(str) || "no_activite_aid".equals(str)) {
            j(dVar);
        } else {
            tpc.b().e(f70.b(d04.TAG_DEACTIVATE_CARD, str), new c(str, dVar, z), true);
        }
    }
}
