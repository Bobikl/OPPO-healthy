package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.devicemanager.api.ICloudDeviceProcessorService;
import com.heytap.health.network.core.BaseResponse;

/* JADX INFO: loaded from: classes19.dex */
public class dc5 {

    public class a extends cc5 {
        public final /* synthetic */ cc5 a;

        public a(cc5 cc5Var) {
            this.a = cc5Var;
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void a(BaseResponse baseResponse) {
            this.a.a(baseResponse);
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void b(Throwable th, String str) {
            this.a.b(th, str);
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void c(Object obj) {
            this.a.c(obj);
        }
    }

    public class b extends cc5 {
        public final /* synthetic */ cc5 a;

        public b(cc5 cc5Var) {
            this.a = cc5Var;
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void a(BaseResponse baseResponse) {
            this.a.a(baseResponse);
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void b(Throwable th, String str) {
            this.a.b(th, str);
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void c(Object obj) {
            this.a.c(obj);
        }
    }

    public class c extends cc5 {
        public final /* synthetic */ cc5 a;

        public c(cc5 cc5Var) {
            this.a = cc5Var;
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void a(BaseResponse baseResponse) {
            this.a.a(baseResponse);
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void b(Throwable th, String str) {
            this.a.b(th, str);
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void c(Object obj) {
            this.a.c(obj);
        }
    }

    public class d extends cc5 {
        public final /* synthetic */ cc5 a;

        public d(cc5 cc5Var) {
            this.a = cc5Var;
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void b(Throwable th, String str) {
            this.a.b(th, str);
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void c(Object obj) {
            this.a.c(obj);
        }
    }

    public class e implements b93 {
        public final /* synthetic */ b93 a;

        public e(b93 b93Var) {
            this.a = b93Var;
        }

        @Override // com.oplus.aiunit.vision.b93
        public void a() {
            this.a.a();
        }

        @Override // com.oplus.aiunit.vision.b93
        public void b(int i, String str) {
            this.a.b(i, str);
        }

        @Override // com.oplus.aiunit.vision.b93
        public void c() {
            this.a.c();
        }
    }

    public class f extends cc5 {
        public final /* synthetic */ cc5 a;

        public f(cc5 cc5Var) {
            this.a = cc5Var;
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void b(Throwable th, String str) {
            cc5 cc5Var = this.a;
            if (cc5Var != null) {
                cc5Var.b(th, str);
            }
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void c(Object obj) {
            cc5 cc5Var = this.a;
            if (cc5Var != null) {
                cc5Var.c(obj);
            }
        }
    }

    public static void a(ypf ypfVar, String str, String str2, String str3, boolean z, cc5 cc5Var) {
        e().G6(ypfVar, str, str2, str3, z, new b(cc5Var));
    }

    public static void b(String str, String str2, cc5 cc5Var) {
        e().F4(str, str2, new a(cc5Var));
    }

    public static void c(Context context, String str, v83 v83Var) {
        e().b4(context, str, v83Var);
    }

    public static void d(Context context, String str, b93 b93Var) {
        e().K(context, str, new e(b93Var));
    }

    public static ICloudDeviceProcessorService e() {
        return (ICloudDeviceProcessorService) x0.d().b(ICloudDeviceProcessorService.SERVICE_PATH).navigation();
    }

    public static void f(String str, int i, cc5 cc5Var) {
        e().A9(str, i, new d(cc5Var));
    }

    public static void g(cc5 cc5Var) {
        e().pa(cc5Var);
    }

    public static void h(String str, cc5 cc5Var) {
        e().T7(str, new f(cc5Var));
    }

    public static void i(ypf ypfVar, cc5 cc5Var) {
        e().o9(ypfVar, cc5Var);
    }

    public static void j(String str, String str2, String str3, cc5 cc5Var) {
        e().t8(str, str2, str3, new c(cc5Var));
    }
}
