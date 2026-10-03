package com.heytap.accessory.base.objectpool;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
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

        public static final class a implements c<StringBuilder> {
            @Override // com.heytap.accessory.base.objectpool.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public StringBuilder a() {
                return new StringBuilder(175);
            }

            public a() {
            }
        }

        public static final class b implements c<StringBuilder> {
            @Override // com.heytap.accessory.base.objectpool.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public StringBuilder a() {
                return new StringBuilder(1500);
            }

            public b() {
            }
        }

        public b() {
            super(10, new a());
            this.a = "StringBuilderPool";
        }

        public b(boolean z) {
            super(10, new b());
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
