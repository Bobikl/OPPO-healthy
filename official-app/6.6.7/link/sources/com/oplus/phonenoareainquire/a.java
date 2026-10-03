package com.oplus.phonenoareainquire;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.oplus.aiunit.vision.tc0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u0000 \u00162\u00020\u0001:\t\u0003\u0007\u000b\u0017\u0018\u0019\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/oplus/phonenoareainquire/a;", "", "Lcom/oplus/phonenoareainquire/a$f;", "a", "Lcom/oplus/phonenoareainquire/a$f;", "mGlobal", "Lcom/oplus/phonenoareainquire/a$i;", "b", "Lcom/oplus/phonenoareainquire/a$i;", "mSystem", "Lcom/oplus/phonenoareainquire/a$g;", "c", "Lcom/oplus/phonenoareainquire/a$g;", "mSecure", "()Lcom/oplus/phonenoareainquire/a$f;", "global", "()Lcom/oplus/phonenoareainquire/a$i;", "system", "()Lcom/oplus/phonenoareainquire/a$g;", "secure", "<init>", "()V", "Companion", "d", "e", "f", "g", "h", "i", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public abstract class a {
    public static final int SETTINGS_TYPE_STOCK_INNER = 1;
    public static final int SETTINGS_TYPE_STOCK_SYSTEM = 2;

    @JvmField
    @NotNull
    public f a;

    @JvmField
    @NotNull
    public i b;

    @JvmField
    @NotNull
    public g c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u000b\u0007B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/phonenoareainquire/a$a;", "Lcom/oplus/phonenoareainquire/a;", "Lcom/oplus/phonenoareainquire/a$f;", "a", "()Lcom/oplus/phonenoareainquire/a$f;", "global", "Lcom/oplus/phonenoareainquire/a$i;", "c", "()Lcom/oplus/phonenoareainquire/a$i;", "system", "Lcom/oplus/phonenoareainquire/a$g;", "b", "()Lcom/oplus/phonenoareainquire/a$g;", "secure", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public static final class a extends a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/phonenoareainquire/a$a$a;", "Lcom/oplus/phonenoareainquire/a$f;", "<init>", "(Lcom/oplus/phonenoareainquire/a$a;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
        public final class a implements f {
            public a() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/phonenoareainquire/a$a$b;", "Lcom/oplus/phonenoareainquire/a$g;", "<init>", "(Lcom/oplus/phonenoareainquire/a$a;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
        public final class b implements g {
            public b() {
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/phonenoareainquire/a$a$c;", "Lcom/oplus/phonenoareainquire/a$i;", "Landroid/content/ContentResolver;", "cr", "", "name", "", "def", "getInt", "<init>", "(Lcom/oplus/phonenoareainquire/a$a;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
        public final class c implements i {
            public c() {
            }

            @Override // com.oplus.phonenoareainquire.a.h
            public int getInt(@Nullable ContentResolver cr, @Nullable String name, int def) {
                return Settings.System.getInt(cr, name, def);
            }
        }

        public a() {
            super(null);
        }

        @Override // com.oplus.phonenoareainquire.a
        @NotNull
        public f a() {
            return new a();
        }

        @Override // com.oplus.phonenoareainquire.a
        @NotNull
        public g b() {
            return new b();
        }

        @Override // com.oplus.phonenoareainquire.a
        @NotNull
        public i c() {
            return new c();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u000b\u0007B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/phonenoareainquire/a$b;", "Lcom/oplus/phonenoareainquire/a;", "Lcom/oplus/phonenoareainquire/a$f;", "a", "()Lcom/oplus/phonenoareainquire/a$f;", "global", "Lcom/oplus/phonenoareainquire/a$i;", "c", "()Lcom/oplus/phonenoareainquire/a$i;", "system", "Lcom/oplus/phonenoareainquire/a$g;", "b", "()Lcom/oplus/phonenoareainquire/a$g;", "secure", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public static final class b extends a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/phonenoareainquire/a$b$a;", "Lcom/oplus/phonenoareainquire/a$f;", "<init>", "(Lcom/oplus/phonenoareainquire/a$b;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
        public final class a implements f {
            public a() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/phonenoareainquire/a$b$b;", "Lcom/oplus/phonenoareainquire/a$g;", "<init>", "(Lcom/oplus/phonenoareainquire/a$b;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
        public final class b implements g {
            public b() {
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/phonenoareainquire/a$b$c;", "Lcom/oplus/phonenoareainquire/a$i;", "Landroid/content/ContentResolver;", "cr", "", "name", "", "def", "getInt", "<init>", "(Lcom/oplus/phonenoareainquire/a$b;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
        public final class c implements i {
            public c() {
            }

            @Override // com.oplus.phonenoareainquire.a.h
            public int getInt(@Nullable ContentResolver cr, @Nullable String name, int def) {
                return tc0.f.b(cr, name, def);
            }
        }

        public b() {
            super(null);
        }

        @Override // com.oplus.phonenoareainquire.a
        @NotNull
        public f a() {
            return new a();
        }

        @Override // com.oplus.phonenoareainquire.a
        @NotNull
        public g b() {
            return new b();
        }

        @Override // com.oplus.phonenoareainquire.a
        @NotNull
        public i c() {
            return new c();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/phonenoareainquire/a$c;", "", "", "type", "Lcom/oplus/phonenoareainquire/a;", "a", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        @NotNull
        public static final c INSTANCE = new c();

        @JvmStatic
        @NotNull
        public static final a a(int type) {
            if (Build.VERSION.SDK_INT >= 30) {
                return type == 2 ? new d() : new b();
            }
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u000b\u0007B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/phonenoareainquire/a$d;", "Lcom/oplus/phonenoareainquire/a;", "Lcom/oplus/phonenoareainquire/a$f;", "a", "()Lcom/oplus/phonenoareainquire/a$f;", "global", "Lcom/oplus/phonenoareainquire/a$i;", "c", "()Lcom/oplus/phonenoareainquire/a$i;", "system", "Lcom/oplus/phonenoareainquire/a$g;", "b", "()Lcom/oplus/phonenoareainquire/a$g;", "secure", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public static final class d extends a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/phonenoareainquire/a$d$a;", "Lcom/oplus/phonenoareainquire/a$f;", "<init>", "(Lcom/oplus/phonenoareainquire/a$d;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
        public final class a implements f {
            public a() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/phonenoareainquire/a$d$b;", "Lcom/oplus/phonenoareainquire/a$g;", "<init>", "(Lcom/oplus/phonenoareainquire/a$d;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
        public final class b implements g {
            public b() {
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¨\u0006\u000b"}, d2 = {"Lcom/oplus/phonenoareainquire/a$d$c;", "Lcom/oplus/phonenoareainquire/a$i;", "Landroid/content/ContentResolver;", "cr", "", "name", "", "def", "getInt", "<init>", "(Lcom/oplus/phonenoareainquire/a$d;)V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
        public final class c implements i {
            public c() {
            }

            @Override // com.oplus.phonenoareainquire.a.h
            @TargetApi(30)
            public int getInt(@Nullable ContentResolver cr, @Nullable String name, int def) {
                return Settings.System.getInt(cr, name, def);
            }
        }

        public d() {
            super(null);
        }

        @Override // com.oplus.phonenoareainquire.a
        @NotNull
        public f a() {
            return new a();
        }

        @Override // com.oplus.phonenoareainquire.a
        @NotNull
        public g b() {
            return new b();
        }

        @Override // com.oplus.phonenoareainquire.a
        @NotNull
        public i c() {
            return new c();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/phonenoareainquire/a$f;", "Lcom/oplus/phonenoareainquire/a$h;", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public interface f extends h {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/phonenoareainquire/a$g;", "Lcom/oplus/phonenoareainquire/a$h;", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public interface g extends h {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/oplus/phonenoareainquire/a$h;", "", "Landroid/content/ContentResolver;", "cr", "", "name", "", "def", "getInt", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public interface h {
        int getInt(@Nullable ContentResolver cr, @Nullable String name, int def);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/phonenoareainquire/a$i;", "Lcom/oplus/phonenoareainquire/a$h;", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public interface i extends h {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract f a();

    @NotNull
    public abstract g b();

    @NotNull
    public abstract i c();

    public a() {
        this.a = a();
        this.b = c();
        this.c = b();
    }
}
