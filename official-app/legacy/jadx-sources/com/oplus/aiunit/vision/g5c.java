package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__IndentKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0005\u0005\t\u0010\u0016\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\u000b\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u0012\u001a\b\u0018\u00010\fR\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0018\u001a\b\u0018\u00010\u0013R\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/g5c;", "", "", "toString", "Lcom/oplus/aiunit/vision/g5c$c;", "a", "Lcom/oplus/aiunit/vision/g5c$c;", "getMpfHeader", "()Lcom/oplus/aiunit/vision/g5c$c;", "b", "(Lcom/oplus/aiunit/vision/g5c$c;)V", "mpfHeader", "Lcom/oplus/aiunit/vision/g5c$d;", "Lcom/oplus/aiunit/vision/g5c$d;", "getMpfIndexIFD", "()Lcom/oplus/aiunit/vision/g5c$d;", "c", "(Lcom/oplus/aiunit/vision/g5c$d;)V", "mpfIndexIFD", "Lcom/oplus/aiunit/vision/g5c$e;", "Lcom/oplus/aiunit/vision/g5c$e;", "()Lcom/oplus/aiunit/vision/g5c$e;", "d", "(Lcom/oplus/aiunit/vision/g5c$e;)V", "mpfValue", "<init>", "()V", "Companion", MapSchema.FIELD_NAME_ENTRY, "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class g5c {
    public static final Logger d = Logger.getLogger("MpfInfo");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public MPFHeader mpfHeader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public d mpfIndexIFD;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MPFValue mpfValue;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0013\u0010\u001bR\"\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u0017\u0010\u001b¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/g5c$b;", "", "", "toString", "", "a", "[B", "getTypeCode", "()[B", b2n.f, "([B)V", "typeCode", "", "b", "I", "()I", "f", "(I)V", "imageSize", "c", MapSchema.FIELD_NAME_ENTRY, "imageDataOffset", "", "d", "S", "getEntryNo1", "()S", "(S)V", "entryNo1", "getEntryNo2", "entryNo2", "<init>", "(Lcom/oplus/aiunit/vision/g5c;)V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
    public final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public byte[] typeCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int imageSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int imageDataOffset;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public short entryNo1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public short entryNo2;
        public final /* synthetic */ g5c f;

        public b(g5c this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f = this$0;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getImageDataOffset() {
            return this.imageDataOffset;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getImageSize() {
            return this.imageSize;
        }

        public final void c(short s) {
            this.entryNo1 = s;
        }

        public final void d(short s) {
            this.entryNo2 = s;
        }

        public final void e(int i) {
            this.imageDataOffset = i;
        }

        public final void f(int i) {
            this.imageSize = i;
        }

        public final void g(@Nullable byte[] bArr) {
            this.typeCode = bArr;
        }

        @NotNull
        public String toString() {
            String string;
            StringBuilder sb = new StringBuilder();
            sb.append("\n                    MPEntry(\n                    typeCode=");
            byte[] bArr = this.typeCode;
            if (bArr == null) {
                string = null;
            } else {
                string = Arrays.toString(bArr);
                Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            }
            sb.append((Object) string);
            sb.append(", \n                    imageSize=");
            sb.append(this.imageSize);
            sb.append(", \n                    imageDataOffset=");
            sb.append(this.imageDataOffset);
            sb.append(",\n                    entryNo1=");
            sb.append((int) this.entryNo1);
            sb.append(", \n                    entryNo2=");
            sb.append((int) this.entryNo2);
            sb.append("\n                    )");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.g5c$c, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/g5c$c;", "", "", "toString", "Ljava/nio/ByteOrder;", "a", "Ljava/nio/ByteOrder;", "getMpEndian", "()Ljava/nio/ByteOrder;", "setMpEndian", "(Ljava/nio/ByteOrder;)V", "mpEndian", "", "b", "I", "offsetOfFirstIFD", "<init>", "(Lcom/oplus/aiunit/vision/g5c;Ljava/nio/ByteOrder;I)V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
    public final class MPFHeader {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public ByteOrder mpEndian;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int offsetOfFirstIFD;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g5c f11641c;

        public MPFHeader(@NotNull g5c this$0, ByteOrder mpEndian, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(mpEndian, "mpEndian");
            this.f11641c = this$0;
            this.mpEndian = mpEndian;
            this.offsetOfFirstIFD = i;
        }

        @NotNull
        public String toString() {
            return "MPFHeader(\n                mpEndian=" + this.mpEndian + ", \n                offsetOfFirstIFD=" + this.offsetOfFirstIFD + "\n                )";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u000b\u0010\u0018R$\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u0013\u0010!R$\u0010%\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b#\u0010!R\"\u0010'\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b&\u0010\u0016\"\u0004\b\u001d\u0010\u0018¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/g5c$d;", "", "", "toString", "", "a", "S", "getCount", "()S", "(S)V", "count", "b", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", b2n.f, "(Ljava/lang/String;)V", "version", "", "c", "I", "getNumberOfImages", "()I", "d", "(I)V", "numberOfImages", "getEntryOffset", "entryOffset", "", MapSchema.FIELD_NAME_ENTRY, "[B", "getIndividualImageUniqueIdList", "()[B", "([B)V", "individualImageUniqueIdList", "f", "getTotalNumberOfCapturedFrames", "totalNumberOfCapturedFrames", "getOffsetOfNextIFD", "offsetOfNextIFD", "<init>", "(Lcom/oplus/aiunit/vision/g5c;)V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
    public final class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public short count;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String version;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int numberOfImages;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int entryOffset;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public byte[] individualImageUniqueIdList;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public byte[] totalNumberOfCapturedFrames;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public int offsetOfNextIFD;
        public final /* synthetic */ g5c h;

        public d(g5c this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.h = this$0;
            this.numberOfImages = -1;
        }

        public final void a(short s) {
            this.count = s;
        }

        public final void b(int i) {
            this.entryOffset = i;
        }

        public final void c(@Nullable byte[] bArr) {
            this.individualImageUniqueIdList = bArr;
        }

        public final void d(int i) {
            this.numberOfImages = i;
        }

        public final void e(int i) {
            this.offsetOfNextIFD = i;
        }

        public final void f(@Nullable byte[] bArr) {
            this.totalNumberOfCapturedFrames = bArr;
        }

        public final void g(@Nullable String str) {
            this.version = str;
        }

        @NotNull
        public String toString() {
            String string;
            StringBuilder sb = new StringBuilder();
            sb.append("MPFIndexIFD(\n                count=");
            sb.append((int) this.count);
            sb.append(", \n                version=");
            sb.append((Object) this.version);
            sb.append(", \n                numberOfImages=");
            sb.append(this.numberOfImages);
            sb.append(", \n                entryOffset=");
            sb.append(this.entryOffset);
            sb.append(",\n                individualImageUniqueIdList=");
            byte[] bArr = this.individualImageUniqueIdList;
            String string2 = null;
            if (bArr == null) {
                string = null;
            } else {
                string = Arrays.toString(bArr);
                Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            }
            sb.append((Object) string);
            sb.append(", \n                totalNumberOfCapturedFrames=");
            byte[] bArr2 = this.totalNumberOfCapturedFrames;
            if (bArr2 != null) {
                string2 = Arrays.toString(bArr2);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this)");
            }
            sb.append((Object) string2);
            sb.append(", \n                offsetOfNextIFD=");
            sb.append(this.offsetOfNextIFD);
            sb.append("\n                )");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.g5c$e, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R.\u0010\f\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/g5c$e;", "", "", "toString", "", "Lcom/oplus/aiunit/vision/g5c$b;", "Lcom/oplus/aiunit/vision/g5c;", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "(Ljava/util/List;)V", "mpEntries", "<init>", "(Lcom/oplus/aiunit/vision/g5c;)V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
    public final class MPFValue {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public List<b> mpEntries;
        public final /* synthetic */ g5c b;

        public MPFValue(g5c this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.b = this$0;
        }

        @Nullable
        public final List<b> a() {
            return this.mpEntries;
        }

        public final void b(@Nullable List<b> list) {
            this.mpEntries = list;
        }

        @NotNull
        public String toString() {
            return "MPFValue(mpEntries=" + this.mpEntries + ')';
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final MPFValue getMpfValue() {
        return this.mpfValue;
    }

    public final void b(@Nullable MPFHeader mPFHeader) {
        this.mpfHeader = mPFHeader;
    }

    public final void c(@Nullable d dVar) {
        this.mpfIndexIFD = dVar;
    }

    public final void d(@Nullable MPFValue mPFValue) {
        this.mpfValue = mPFValue;
    }

    @NotNull
    public String toString() {
        return StringsKt__IndentKt.trimIndent("\n            MPFData(\n            " + this.mpfHeader + ", \n            " + this.mpfIndexIFD + ", \n            " + this.mpfValue + "\n            )");
    }
}
