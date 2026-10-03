package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/ko4;", "", "Lcom/oplus/aiunit/vision/iuf;", "a", "()Lcom/oplus/aiunit/vision/iuf;", "<init>", "()V", "b", "c", "Lcom/oplus/aiunit/vision/ko4$a;", "Lcom/oplus/aiunit/vision/ko4$b;", "Lcom/oplus/aiunit/vision/ko4$c;", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public abstract class ko4 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/ko4$a;", "Lcom/oplus/aiunit/vision/ko4;", "Lcom/oplus/aiunit/vision/iuf$a;", "b", "()Lcom/oplus/aiunit/vision/iuf$a;", "", "a", "I", "rspCid", "<init>", "(I)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ko4 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int rspCid;

        public a(int i) {
            super(null);
            this.rspCid = i;
        }

        @Override // com.oplus.aiunit.vision.ko4
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public iuf.a a() {
            return new iuf.a(this.rspCid);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/ko4$b;", "Lcom/oplus/aiunit/vision/ko4;", "Lcom/oplus/aiunit/vision/iuf$b;", "b", "()Lcom/oplus/aiunit/vision/iuf$b;", "", "a", "I", "rspSid", "rspCid", "<init>", "(II)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ko4 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int rspSid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int rspCid;

        public b(int i, int i2) {
            super(null);
            this.rspSid = i;
            this.rspCid = i2;
        }

        @Override // com.oplus.aiunit.vision.ko4
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public iuf.b a() {
            return new iuf.b(this.rspSid, this.rspCid);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/ko4$c;", "Lcom/oplus/aiunit/vision/ko4;", "Lcom/oplus/aiunit/vision/iuf$c;", "b", "()Lcom/oplus/aiunit/vision/iuf$c;", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends ko4 {

        @NotNull
        public static final c INSTANCE = new c();

        public c() {
            super(null);
        }

        @Override // com.oplus.aiunit.vision.ko4
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public iuf.c a() {
            return iuf.c.INSTANCE;
        }
    }

    public ko4() {
    }

    public /* synthetic */ ko4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract iuf a();
}
