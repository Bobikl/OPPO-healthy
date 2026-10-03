package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            String strReverse = this._t1.reverse(str);
            return strReverse != null ? this._t2.reverse(strReverse) : strReverse;
        }

        public String toString() {
            return "[ChainedTransformer(" + this._t1 + ", " + this._t2 + ")]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    public static final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            return str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }

    public static class a extends NameTransformer {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f2293j;

        public a(String str, String str2) {
            this.i = str;
            this.f2293j = str2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (!str.startsWith(this.i)) {
                return null;
            }
            String strSubstring = str.substring(this.i.length());
            if (strSubstring.endsWith(this.f2293j)) {
                return strSubstring.substring(0, strSubstring.length() - this.f2293j.length());
            }
            return null;
        }

        public String toString() {
            return "[PreAndSuffixTransformer('" + this.i + "','" + this.f2293j + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.i + str + this.f2293j;
        }
    }

    public static class b extends NameTransformer {
        public final /* synthetic */ String i;

        public b(String str) {
            this.i = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.startsWith(this.i)) {
                return str.substring(this.i.length());
            }
            return null;
        }

        public String toString() {
            return "[PrefixTransformer('" + this.i + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.i + str;
        }
    }

    public static class c extends NameTransformer {
        public final /* synthetic */ String i;

        public c(String str) {
            this.i = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.endsWith(this.i)) {
                return str.substring(0, str.length() - this.i.length());
            }
            return null;
        }

        public String toString() {
            return "[SuffixTransformer('" + this.i + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str + this.i;
        }
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(String str, String str2) {
        boolean z = (str == null || str.isEmpty()) ? false : true;
        boolean z2 = (str2 == null || str2.isEmpty()) ? false : true;
        if (z) {
            return z2 ? new a(str, str2) : new b(str);
        }
        return z2 ? new c(str2) : NOP;
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);
}
