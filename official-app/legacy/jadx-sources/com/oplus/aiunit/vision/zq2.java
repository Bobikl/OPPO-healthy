package com.oplus.aiunit.vision;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes15.dex */
public class zq2 {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19515c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19516e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ContentValues f19517j;

    public static class a {
        public final ContentValues a = new ContentValues();
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f19518c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f19519e;
        public String f;
        public String g;
        public long h;
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f19520j;

        public zq2 k() {
            return new zq2(this);
        }

        public a l(String str) {
            this.d = str;
            this.a.put(iim.a.f, str);
            return this;
        }

        public a m(String str) {
            this.f19520j = str;
            this.a.put("duration", str);
            return this;
        }

        public a n(String str) {
            this.g = str;
            this.a.put("dtend", str);
            return this;
        }

        public a o(String str) {
            this.b = str;
            this.a.put("_id", str);
            return this;
        }

        public a p(String str) {
            this.f19519e = str;
            this.a.put("eventLocation", str);
            return this;
        }

        public a q(long j2) {
            this.h = j2;
            return this;
        }

        public a r(String str) {
            this.i = str;
            this.a.put("rrule", str);
            return this;
        }

        public a s(String str) {
            this.f = str;
            this.a.put("dtstart", str);
            return this;
        }

        public a t(String str) {
            this.f19518c = str;
            this.a.put("title", str);
            return this;
        }
    }

    public ContentValues a() {
        return this.f19517j;
    }

    public long b() {
        return this.g;
    }

    public String toString() {
        return "CalendarParam{id='" + this.a + "', title='" + this.b + "', description='" + this.f19515c + "', location='" + this.d + "', startTime='" + this.f19516e + "', endTime='" + this.f + "', previousDate=" + this.g + ", rrule='" + this.h + "', duration='" + this.i + "', contentValues=" + this.f19517j + '}';
    }

    public zq2(a aVar) {
        this.a = aVar.b;
        this.b = aVar.f19518c;
        this.f19515c = aVar.d;
        this.d = aVar.f19519e;
        this.f19516e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.h;
        this.f19517j = aVar.a;
        this.h = aVar.i;
        this.i = aVar.f19520j;
    }
}
