package io.noties.markwon.core;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.oplus.aiunit.vision.a7e;
import com.oplus.aiunit.vision.auj;
import com.oplus.aiunit.vision.bi1;
import com.oplus.aiunit.vision.dk3;
import com.oplus.aiunit.vision.duj;
import com.oplus.aiunit.vision.e5i;
import com.oplus.aiunit.vision.f6a;
import com.oplus.aiunit.vision.fk3;
import com.oplus.aiunit.vision.fza;
import com.oplus.aiunit.vision.hgb;
import com.oplus.aiunit.vision.hh8;
import com.oplus.aiunit.vision.iza;
import com.oplus.aiunit.vision.j6;
import com.oplus.aiunit.vision.jj8;
import com.oplus.aiunit.vision.kpf;
import com.oplus.aiunit.vision.kxa;
import com.oplus.aiunit.vision.l4a;
import com.oplus.aiunit.vision.l97;
import com.oplus.aiunit.vision.ltc;
import com.oplus.aiunit.vision.mj8;
import com.oplus.aiunit.vision.ngb;
import com.oplus.aiunit.vision.nrd;
import com.oplus.aiunit.vision.ntj;
import com.oplus.aiunit.vision.o3h;
import com.oplus.aiunit.vision.o82;
import com.oplus.aiunit.vision.ol6;
import com.oplus.aiunit.vision.ord;
import com.oplus.aiunit.vision.p1j;
import com.oplus.aiunit.vision.p2a;
import com.oplus.aiunit.vision.qgb;
import com.oplus.aiunit.vision.qh1;
import com.oplus.aiunit.vision.r1j;
import com.oplus.aiunit.vision.rl6;
import com.oplus.aiunit.vision.s1i;
import com.oplus.aiunit.vision.sxa;
import com.oplus.aiunit.vision.yh1;
import com.oplus.aiunit.vision.zj3;
import com.oplus.aiunit.vision.zrj;
import com.oplus.aiunit.vision.zya;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public class a extends j6 {
    public final List<p> a = new ArrayList(0);
    public boolean b;

    /* JADX INFO: renamed from: io.noties.markwon.core.a$a, reason: collision with other inner class name */
    public class C1026a implements qgb.c<auj> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull auj aujVar) {
            qgbVar.A(aujVar);
            int length = qgbVar.length();
            qgbVar.builder().append(Typography.nbsp);
            qgbVar.o(aujVar, length);
            qgbVar.d(aujVar);
        }
    }

    public class b implements qgb.c<jj8> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull jj8 jj8Var) {
            qgbVar.A(jj8Var);
            int length = qgbVar.length();
            qgbVar.F(jj8Var);
            CoreProps.HEADING_LEVEL.d(qgbVar.g(), Integer.valueOf(jj8Var.n()));
            qgbVar.o(jj8Var, length);
            qgbVar.d(jj8Var);
        }
    }

    public class c implements qgb.c<s1i> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull s1i s1iVar) {
            qgbVar.builder().append(StringUtil.SPACE);
        }
    }

    public class d implements qgb.c<hh8> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull hh8 hh8Var) {
            qgbVar.n();
        }
    }

    public class e implements qgb.c<a7e> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull a7e a7eVar) {
            boolean zY = a.y(a7eVar);
            if (!zY) {
                qgbVar.A(a7eVar);
            }
            int length = qgbVar.length();
            qgbVar.F(a7eVar);
            CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.d(qgbVar.g(), Boolean.valueOf(zY));
            qgbVar.o(a7eVar, length);
            if (zY) {
                return;
            }
            qgbVar.d(a7eVar);
        }
    }

    public class f implements qgb.c<kxa> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull kxa kxaVar) {
            int length = qgbVar.length();
            qgbVar.F(kxaVar);
            CoreProps.LINK_DESTINATION.d(qgbVar.g(), kxaVar.m());
            qgbVar.o(kxaVar, length);
        }
    }

    public class g implements qgb.c<zrj> {
        public g() {
        }

        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull zrj zrjVar) {
            String strM = zrjVar.m();
            qgbVar.builder().d(strM);
            if (a.this.a.isEmpty()) {
                return;
            }
            int length = qgbVar.length() - strM.length();
            Iterator it = a.this.a.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(qgbVar, strM, length);
            }
        }
    }

    public class h implements qgb.c<p1j> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull p1j p1jVar) {
            int length = qgbVar.length();
            qgbVar.F(p1jVar);
            qgbVar.o(p1jVar, length);
        }
    }

    public class i implements qgb.c<ol6> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull ol6 ol6Var) {
            int length = qgbVar.length();
            qgbVar.F(ol6Var);
            qgbVar.o(ol6Var, length);
        }
    }

    public class j implements qgb.c<yh1> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull yh1 yh1Var) {
            qgbVar.A(yh1Var);
            int length = qgbVar.length();
            qgbVar.F(yh1Var);
            qgbVar.o(yh1Var, length);
            qgbVar.d(yh1Var);
        }
    }

    public class k implements qgb.c<zj3> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull zj3 zj3Var) {
            int length = qgbVar.length();
            qgbVar.builder().append(Typography.nbsp).d(zj3Var.m()).append(Typography.nbsp);
            qgbVar.o(zj3Var, length);
        }
    }

    public class l implements qgb.c<l97> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull l97 l97Var) {
            a.I(qgbVar, l97Var.q(), l97Var.r(), l97Var);
        }
    }

    public class m implements qgb.c<f6a> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull f6a f6aVar) {
            a.I(qgbVar, null, f6aVar.n(), f6aVar);
        }
    }

    public class n implements qgb.c<p2a> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull p2a p2aVar) {
            e5i e5iVar = qgbVar.m().c().get(p2a.class);
            if (e5iVar == null) {
                qgbVar.F(p2aVar);
                return;
            }
            int length = qgbVar.length();
            qgbVar.F(p2aVar);
            if (length == qgbVar.length()) {
                qgbVar.builder().append((char) 65532);
            }
            hgb hgbVarM = qgbVar.m();
            boolean z = p2aVar.f() instanceof kxa;
            String strB = hgbVarM.a().b(p2aVar.m());
            kpf kpfVarG = qgbVar.g();
            l4a.DESTINATION.d(kpfVarG, strB);
            l4a.REPLACEMENT_TEXT_IS_LINK.d(kpfVarG, Boolean.valueOf(z));
            l4a.IMAGE_SIZE.d(kpfVarG, null);
            qgbVar.a(length, e5iVar.a(hgbVarM, kpfVarG));
        }
    }

    public class o implements qgb.c<fza> {
        @Override // com.oplus.aiunit.vision.qgb.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull qgb qgbVar, @NonNull fza fzaVar) {
            int length = qgbVar.length();
            qgbVar.F(fzaVar);
            qh1 qh1VarF = fzaVar.f();
            if (qh1VarF instanceof nrd) {
                nrd nrdVar = (nrd) qh1VarF;
                int iQ = nrdVar.q();
                CoreProps.LIST_ITEM_TYPE.d(qgbVar.g(), CoreProps.ListItemType.ORDERED);
                CoreProps.ORDERED_LIST_ITEM_NUMBER.d(qgbVar.g(), Integer.valueOf(iQ));
                nrdVar.s(nrdVar.q() + 1);
            } else {
                CoreProps.LIST_ITEM_TYPE.d(qgbVar.g(), CoreProps.ListItemType.BULLET);
                CoreProps.BULLET_LIST_ITEM_LEVEL.d(qgbVar.g(), Integer.valueOf(a.B(fzaVar)));
            }
            qgbVar.o(fzaVar, length);
            if (qgbVar.C(fzaVar)) {
                qgbVar.n();
            }
        }
    }

    public interface p {
        void a(@NonNull qgb qgbVar, @NonNull String str, int i);
    }

    public static void A(@NonNull qgb.b bVar) {
        bVar.a(fza.class, new o());
    }

    public static int B(@NonNull ltc ltcVar) {
        int i2 = 0;
        for (ltc ltcVarF = ltcVar.f(); ltcVarF != null; ltcVarF = ltcVarF.f()) {
            if (ltcVarF instanceof fza) {
                i2++;
            }
        }
        return i2;
    }

    public static void C(@NonNull qgb.b bVar) {
        bVar.a(nrd.class, new o3h());
    }

    public static void D(@NonNull qgb.b bVar) {
        bVar.a(a7e.class, new e());
    }

    public static void E(@NonNull qgb.b bVar) {
        bVar.a(s1i.class, new c());
    }

    public static void F(@NonNull qgb.b bVar) {
        bVar.a(p1j.class, new h());
    }

    public static void H(@NonNull qgb.b bVar) {
        bVar.a(auj.class, new C1026a());
    }

    @VisibleForTesting
    public static void I(@NonNull qgb qgbVar, @Nullable String str, @NonNull String str2, @NonNull ltc ltcVar) {
        qgbVar.A(ltcVar);
        int length = qgbVar.length();
        qgbVar.builder().append(Typography.nbsp).append('\n').append(qgbVar.m().d().a(str, str2));
        qgbVar.n();
        qgbVar.builder().append(Typography.nbsp);
        CoreProps.CODE_BLOCK_INFO.d(qgbVar.g(), str);
        qgbVar.o(ltcVar, length);
        qgbVar.d(ltcVar);
    }

    public static void o(@NonNull qgb.b bVar) {
        bVar.a(yh1.class, new j());
    }

    public static void p(@NonNull qgb.b bVar) {
        bVar.a(o82.class, new o3h());
    }

    public static void q(@NonNull qgb.b bVar) {
        bVar.a(zj3.class, new k());
    }

    @NonNull
    public static a r() {
        return new a();
    }

    public static void s(@NonNull qgb.b bVar) {
        bVar.a(ol6.class, new i());
    }

    public static void t(@NonNull qgb.b bVar) {
        bVar.a(l97.class, new l());
    }

    public static void u(@NonNull qgb.b bVar) {
        bVar.a(hh8.class, new d());
    }

    public static void v(@NonNull qgb.b bVar) {
        bVar.a(jj8.class, new b());
    }

    public static void w(qgb.b bVar) {
        bVar.a(p2a.class, new n());
    }

    public static void x(@NonNull qgb.b bVar) {
        bVar.a(f6a.class, new m());
    }

    public static boolean y(@NonNull a7e a7eVar) {
        qh1 qh1VarF = a7eVar.f();
        if (qh1VarF == null) {
            return false;
        }
        ltc ltcVarF = qh1VarF.f();
        if (ltcVarF instanceof zya) {
            return ((zya) ltcVarF).n();
        }
        return false;
    }

    public static void z(@NonNull qgb.b bVar) {
        bVar.a(kxa.class, new f());
    }

    public final void G(@NonNull qgb.b bVar) {
        bVar.a(zrj.class, new g());
    }

    @Override // com.oplus.aiunit.vision.j6, com.oplus.aiunit.vision.mgb
    public void b(@NonNull TextView textView) {
        if (this.b || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.oplus.aiunit.vision.j6, com.oplus.aiunit.vision.mgb
    public void d(@NonNull qgb.b bVar) {
        G(bVar);
        F(bVar);
        s(bVar);
        o(bVar);
        q(bVar);
        t(bVar);
        x(bVar);
        w(bVar);
        p(bVar);
        C(bVar);
        A(bVar);
        H(bVar);
        v(bVar);
        E(bVar);
        u(bVar);
        D(bVar);
        z(bVar);
    }

    @Override // com.oplus.aiunit.vision.j6, com.oplus.aiunit.vision.mgb
    public void f(@NonNull ngb.a aVar) {
        dk3 dk3Var = new dk3();
        aVar.b(p1j.class, new r1j()).b(ol6.class, new rl6()).b(yh1.class, new bi1()).b(zj3.class, new fk3()).b(l97.class, dk3Var).b(f6a.class, dk3Var).b(fza.class, new iza()).b(jj8.class, new mj8()).b(kxa.class, new sxa()).b(auj.class, new duj());
    }

    @Override // com.oplus.aiunit.vision.j6, com.oplus.aiunit.vision.mgb
    public void k(@NonNull TextView textView, @NonNull Spanned spanned) {
        ord.a(textView, spanned);
        if (spanned instanceof Spannable) {
            ntj.a((Spannable) spanned, textView);
        }
    }
}
