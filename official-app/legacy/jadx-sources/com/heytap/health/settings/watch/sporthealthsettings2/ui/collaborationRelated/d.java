package com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.garmin.fit.i;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.mla;
import io.protostuff.MapSchema;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringNumberConversionsKt;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b*\u0010+J3\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\b\u0010\tJP\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000328\u0010\u0012\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bJ\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J \u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013H\u0002J \u0010#\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013H\u0002J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J \u0010'\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010(\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0017H\u0002¨\u0006,"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/d;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/File;", "tarFile", "Lkotlin/Function1;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/d$a;", "mapper", "d", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "targetRootDir", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "entryName", "", "isRegularFile", "resolveRelativeOutputPath", "", "c", "Ljava/io/BufferedInputStream;", "input", "", SpeechConstant.KEY_TTS_REQUEST_HEADER, "i", "", "size", "", MapSchema.FIELD_NAME_KEY, "a", "buffer", TypedValues.CycleType.S_WAVE_OFFSET, "length", b2n.f, "f", b2n.g, "Ljava/io/FileOutputStream;", "output", "b", "j", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTarExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TarExtractor.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/TarExtractor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n1#2:160\n288#3,2:161\n*S KotlinDebug\n*F\n+ 1 TarExtractor.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/TarExtractor\n*L\n105#1:161,2\n*E\n"})
public final class d {
    public static final int $stable = 0;

    @NotNull
    public static final d INSTANCE = new d();

    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.d$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/d$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "", "b", "J", "()J", "size", "c", "Z", "()Z", "isRegularFile", "<init>", "(Ljava/lang/String;JZ)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TarEntry {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long size;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isRegularFile;

        public TarEntry(@NotNull String name, long j2, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.size = j2;
            this.isRegularFile = z;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsRegularFile() {
            return this.isRegularFile;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TarEntry)) {
                return false;
            }
            TarEntry tarEntry = (TarEntry) other;
            return Intrinsics.areEqual(this.name, tarEntry.name) && this.size == tarEntry.size && this.isRegularFile == tarEntry.isRegularFile;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r3v2, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        public int hashCode() {
            int iHashCode = ((this.name.hashCode() * 31) + Long.hashCode(this.size)) * 31;
            boolean z = this.isRegularFile;
            ?? r3 = z;
            if (z) {
                r3 = 1;
            }
            return iHashCode + r3;
        }

        @NotNull
        public String toString() {
            return "TarEntry(name=" + this.name + ", size=" + this.size + ", isRegularFile=" + this.isRegularFile + ")";
        }
    }

    public final String a(byte[] header) {
        String strG = g(header, 0, 100);
        String strG2 = g(header, 345, i.O2ToxicityFieldNum);
        if (StringsKt__StringsJVMKt.isBlank(strG2)) {
            return strG;
        }
        return strG2 + "/" + strG;
    }

    public final void b(BufferedInputStream input, FileOutputStream output, long size) throws IOException {
        byte[] bArr = new byte[8192];
        while (size > 0) {
            int i = input.read(bArr, 0, (int) Math.min(8192, size));
            if (i <= 0) {
                throw new IllegalStateException("tar文件内容提前结束");
            }
            output.write(bArr, 0, i);
            size -= (long) i;
        }
    }

    public final int c(@NotNull File tarFile, @NotNull File targetRootDir, @NotNull Function2<? super String, ? super Boolean, String> resolveRelativeOutputPath) throws IOException {
        Intrinsics.checkNotNullParameter(tarFile, "tarFile");
        Intrinsics.checkNotNullParameter(targetRootDir, "targetRootDir");
        Intrinsics.checkNotNullParameter(resolveRelativeOutputPath, "resolveRelativeOutputPath");
        String str = targetRootDir.getCanonicalPath() + File.separator;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(tarFile));
        try {
            byte[] bArr = new byte[512];
            int i = 0;
            while (true) {
                d dVar = INSTANCE;
                TarEntry tarEntryI = dVar.i(bufferedInputStream, bArr);
                if (tarEntryI == null) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedInputStream, null);
                    return i;
                }
                String strInvoke = resolveRelativeOutputPath.invoke(tarEntryI.getName(), Boolean.valueOf(tarEntryI.getIsRegularFile()));
                if (tarEntryI.getIsRegularFile()) {
                    if (!(strInvoke == null || StringsKt__StringsJVMKt.isBlank(strInvoke))) {
                        File file = new File(targetRootDir, strInvoke);
                        String outCanonical = file.getCanonicalPath();
                        Intrinsics.checkNotNullExpressionValue(outCanonical, "outCanonical");
                        if (StringsKt__StringsJVMKt.startsWith$default(outCanonical, str, false, 2, null)) {
                            File parentFile = file.getParentFile();
                            if (parentFile == null || parentFile.isDirectory() || parentFile.mkdirs()) {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    dVar.b(bufferedInputStream, fileOutputStream, tarEntryI.getSize());
                                    Unit unit2 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(fileOutputStream, null);
                                    i++;
                                    dVar.k(bufferedInputStream, tarEntryI.getSize());
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        CloseableKt.closeFinally(fileOutputStream, th);
                                        throw th2;
                                    }
                                }
                            } else {
                                dVar.j(bufferedInputStream, tarEntryI.getSize());
                                dVar.k(bufferedInputStream, tarEntryI.getSize());
                            }
                        } else {
                            dVar.j(bufferedInputStream, tarEntryI.getSize());
                            dVar.k(bufferedInputStream, tarEntryI.getSize());
                        }
                    }
                }
                dVar.j(bufferedInputStream, tarEntryI.getSize());
                dVar.k(bufferedInputStream, tarEntryI.getSize());
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(bufferedInputStream, th3);
                throw th4;
            }
        }
    }

    @Nullable
    public final <T> T d(@NotNull File tarFile, @NotNull Function1<? super TarEntry, ? extends T> mapper) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(tarFile, "tarFile");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(tarFile));
        try {
            byte[] bArr = new byte[512];
            do {
                d dVar = INSTANCE;
                TarEntry tarEntryI = dVar.i(bufferedInputStream, bArr);
                if (tarEntryI == null) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedInputStream, null);
                    return null;
                }
                tInvoke = mapper.invoke(tarEntryI);
                dVar.j(bufferedInputStream, tarEntryI.getSize());
                dVar.k(bufferedInputStream, tarEntryI.getSize());
            } while (tInvoke == null);
            CloseableKt.closeFinally(bufferedInputStream, null);
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    public final boolean e(byte[] buffer) {
        for (byte b : buffer) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }

    public final long f(byte[] buffer, int offset, int length) {
        Long longOrNull;
        String string = StringsKt__StringsKt.trim((CharSequence) g(buffer, offset, length)).toString();
        if (StringsKt__StringsJVMKt.isBlank(string) || (longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(string, 8)) == null) {
            return 0L;
        }
        return longOrNull.longValue();
    }

    public final String g(byte[] buffer, int offset, int length) {
        Integer next;
        int iIntValue = length + offset;
        Iterator<Integer> it = RangesKt___RangesKt.until(offset, iIntValue).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(buffer[next.intValue()] == 0));
        Integer num = next;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return StringsKt__StringsKt.trim((CharSequence) new String(buffer, offset, iIntValue - offset, Charsets.US_ASCII)).toString();
    }

    public final int h(BufferedInputStream input, byte[] buffer) {
        int i;
        int i2 = 0;
        while (i2 < buffer.length && (i = input.read(buffer, i2, buffer.length - i2)) > 0) {
            i2 += i;
        }
        return i2;
    }

    public final TarEntry i(BufferedInputStream input, byte[] header) {
        int iH = h(input, header);
        if (iH == 0) {
            return null;
        }
        if (iH != 512) {
            throw new IllegalStateException("tar header不完整: read=" + iH);
        }
        if (e(header)) {
            return null;
        }
        boolean z = true;
        String strTrimStart = StringsKt__StringsKt.trimStart(StringsKt__StringsJVMKt.replace$default(a(header), '\\', mla.SEPARATOR, false, 4, (Object) null), mla.SEPARATOR);
        long jF = f(header, 124, 12);
        char c2 = (char) header[156];
        if (c2 != '0' && c2 != 0) {
            z = false;
        }
        return new TarEntry(strTrimStart, jF, z);
    }

    public final void j(BufferedInputStream input, long size) throws IOException {
        while (size > 0) {
            long jSkip = input.skip(size);
            if (jSkip > 0) {
                size -= jSkip;
            } else {
                if (input.read() < 0) {
                    throw new IllegalStateException("tar跳过内容时提前结束");
                }
                size--;
            }
        }
    }

    public final void k(BufferedInputStream input, long size) throws IOException {
        long j2 = 512;
        long j3 = (j2 - (size % j2)) % j2;
        if (j3 > 0) {
            j(input, j3);
        }
    }
}
