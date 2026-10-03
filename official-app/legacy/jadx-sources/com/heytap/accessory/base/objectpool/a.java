package com.heytap.accessory.base.objectpool;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static b a = new b();
    public static b b = new b(true);

    public static StringBuilder a() {
        return a.a();
    }

    public static StringBuilder b() {
        return b.a();
    }

    public static class b extends com.heytap.accessory.base.objectpool.b<StringBuilder> {

        /* JADX INFO: renamed from: com.heytap.accessory.base.objectpool.a$b$a, reason: collision with other inner class name */
        public static final class C0228a implements c<StringBuilder> {
            @Override // com.heytap.accessory.base.objectpool.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public StringBuilder a() {
                return new StringBuilder(175);
            }

            public C0228a() {
            }
        }

        /* JADX INFO: renamed from: com.heytap.accessory.base.objectpool.a$b$b, reason: collision with other inner class name */
        public static final class C0229b implements c<StringBuilder> {
            @Override // com.heytap.accessory.base.objectpool.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public StringBuilder a() {
                return new StringBuilder(1500);
            }

            public C0229b() {
            }
        }

        public b() {
            super(10, new C0228a());
            this.a = "StringBuilderPool";
        }

        public b(boolean z) {
            super(10, new C0229b());
            this.a = "StringBuilderPoolBig";
        }
    }

    public static void a(StringBuilder sb) {
        sb.setLength(0);
        a.a(sb);
    }

    public static void b(StringBuilder sb) {
        sb.setLength(0);
        b.a(sb);
    }
}
