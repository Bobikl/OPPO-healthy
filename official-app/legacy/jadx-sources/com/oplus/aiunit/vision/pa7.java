package com.oplus.aiunit.vision;

import android.media.MediaExtractor;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/pa7;", "Lcom/oplus/aiunit/vision/eq9;", "Landroid/media/MediaExtractor;", "extractor", "", "c", "a", "", "b", "", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", "read", "", CityBean.POS, "skip", "close", "Ljava/io/RandomAccessFile;", "Ljava/io/RandomAccessFile;", "randomAccessFile", "Ljava/io/File;", "Ljava/io/File;", Const.Scheme.SCHEME_FILE, "<init>", "(Ljava/io/File;)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class pa7 implements eq9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public RandomAccessFile randomAccessFile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final File file;

    public pa7(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkParameterIsNotNull(file, "file");
        this.file = file;
        q0.INSTANCE.d("AnimPlayer.FileContainer", "FileContainer init");
        if (file.exists() && file.isFile() && file.canRead()) {
            return;
        }
        throw new FileNotFoundException("Unable to read " + file);
    }

    @Override // com.oplus.aiunit.vision.eq9
    public void a() {
        this.randomAccessFile = new RandomAccessFile(this.file, "r");
    }

    @Override // com.oplus.aiunit.vision.eq9
    public void b() throws IOException {
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    @Override // com.oplus.aiunit.vision.eq9
    public void c(@NotNull MediaExtractor extractor) throws IOException {
        Intrinsics.checkParameterIsNotNull(extractor, "extractor");
        extractor.setDataSource(this.file.toString());
    }

    @Override // com.oplus.aiunit.vision.eq9
    public void close() {
    }

    @Override // com.oplus.aiunit.vision.eq9
    public int read(@NotNull byte[] b, int off, int len) {
        Intrinsics.checkParameterIsNotNull(b, "b");
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            return randomAccessFile.read(b, off, len);
        }
        return -1;
    }

    @Override // com.oplus.aiunit.vision.eq9
    public void skip(long pos) throws IOException {
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            randomAccessFile.skipBytes((int) pos);
        }
    }
}
