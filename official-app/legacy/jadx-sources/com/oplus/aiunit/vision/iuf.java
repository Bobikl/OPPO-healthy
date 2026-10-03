package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/iuf;", "", "<init>", "()V", "a", "b", "c", "Lcom/oplus/aiunit/vision/iuf$a;", "Lcom/oplus/aiunit/vision/iuf$b;", "Lcom/oplus/aiunit/vision/iuf$c;", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public abstract class iuf {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/iuf$a;", "Lcom/oplus/aiunit/vision/iuf;", "", "other", "", "equals", "", "hashCode", "a", "I", "()I", "rspCid", "<init>", "(I)V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends iuf {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int rspCid;

        public a(int i) {
            super(null);
            this.rspCid = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getRspCid() {
            return this.rspCid;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && super.equals(other) && this.rspCid == ((a) other).rspCid;
        }

        public int hashCode() {
            return (super.hashCode() * 31) + this.rspCid;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/iuf$b;", "Lcom/oplus/aiunit/vision/iuf;", "", "other", "", "equals", "", "hashCode", "a", "I", "b", "()I", "rspSid", "rspCid", "<init>", "(II)V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends iuf {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int rspSid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int rspCid;

        public b(int i, int i2) {
            super(null);
            this.rspSid = i;
            this.rspCid = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getRspCid() {
            return this.rspCid;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getRspSid() {
            return this.rspSid;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b) || !super.equals(other)) {
                return false;
            }
            b bVar = (b) other;
            return this.rspSid == bVar.rspSid && this.rspCid == bVar.rspCid;
        }

        public int hashCode() {
            return (((super.hashCode() * 31) + this.rspSid) * 31) + this.rspCid;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/iuf$c;", "Lcom/oplus/aiunit/vision/iuf;", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends iuf {

        @NotNull
        public static final c INSTANCE = new c();

        public c() {
            super(null);
        }
    }

    public iuf() {
    }

    public /* synthetic */ iuf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
