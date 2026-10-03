package com.xingin.xhssharesdk.a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1017a f20414c;
        public static final b d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f20415e;
        public final b a;
        public final int b;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        /* JADX INFO: Fake field, exist only in values array */
        a EF1;

        /* JADX INFO: Fake field, exist only in values array */
        a EF2;

        /* JADX INFO: renamed from: com.xingin.xhssharesdk.a.c0$a$a, reason: collision with other inner class name */
        public static enum C1017a extends a {
            public C1017a() {
                super("STRING", 8, b.STRING, 2, 0);
            }
        }

        public static enum b extends a {
            public b(b bVar) {
                super("GROUP", 9, bVar, 3, 0);
            }
        }

        public static enum c extends a {
            public c(b bVar) {
                super("MESSAGE", 10, bVar, 2, 0);
            }
        }

        public static enum d extends a {
            public d(b bVar) {
                super("BYTES", 11, bVar, 2, 0);
            }
        }

        static {
            a aVar = new a("DOUBLE", 0, b.DOUBLE, 1);
            a aVar2 = new a("FLOAT", 1, b.FLOAT, 5);
            b bVar = b.LONG;
            a aVar3 = new a("INT64", 2, bVar, 0);
            a aVar4 = new a("UINT64", 3, bVar, 0);
            b bVar2 = b.INT;
            a aVar5 = new a("INT32", 4, bVar2, 0);
            a aVar6 = new a("FIXED64", 5, bVar, 1);
            a aVar7 = new a("FIXED32", 6, bVar2, 5);
            a aVar8 = new a("BOOL", 7, b.BOOLEAN, 0);
            C1017a c1017a = new C1017a();
            f20414c = c1017a;
            b bVar3 = b.MESSAGE;
            b bVar4 = new b(bVar3);
            d = bVar4;
            f20415e = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, c1017a, bVar4, new c(bVar3), new d(b.BYTE_STRING), new a("UINT32", 12, bVar2, 0), new a("ENUM", 13, b.ENUM, 0), new a("SFIXED32", 14, bVar2, 5), new a("SFIXED64", 15, bVar, 1), new a("SINT32", 16, bVar2, 0), new a("SINT64", 17, bVar, 0)};
        }

        public a(String str, int i, b bVar, int i2) {
            super(str, i);
            this.a = bVar;
            this.b = i2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f20415e.clone();
        }

        public /* synthetic */ a(String str, int i, b bVar, int i2, int i3) {
            this(str, i, bVar, i2);
        }
    }

    public enum b {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(e.b),
        ENUM(null),
        MESSAGE(null);

        public final Object a;

        b(Serializable serializable) {
            this.a = serializable;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class c {
        public static final b a;
        public static final /* synthetic */ c[] b;

        /* JADX INFO: Fake field, exist only in values array */
        c EF0;

        public static enum a extends c {
            public a() {
                super("LOOSE", 0);
            }
        }

        public static enum b extends c {
            public b() {
                super("STRICT", 1);
            }

            public final Object a(com.xingin.xhssharesdk.a.c cVar) {
                return cVar.i();
            }
        }

        /* JADX INFO: renamed from: com.xingin.xhssharesdk.a.c0$c$c, reason: collision with other inner class name */
        public static enum C1018c extends c {
            public C1018c() {
                super("LAZY", 2);
            }
        }

        static {
            a aVar = new a();
            b bVar = new b();
            a = bVar;
            b = new c[]{aVar, bVar, new C1018c()};
        }

        public c(int i, String str) {
            super(str, i);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) b.clone();
        }

        public /* synthetic */ c(String str, int i) {
            this(i, str);
        }
    }

    public static int a(int i, int i2) {
        return (i << 3) | i2;
    }
}
