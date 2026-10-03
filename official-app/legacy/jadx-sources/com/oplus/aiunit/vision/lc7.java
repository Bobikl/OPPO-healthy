package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/lc7;", "", "Ljava/io/File;", Const.Scheme.SCHEME_FILE, "Lokio/Source;", b2n.f, "Lokio/Sink;", b2n.g, MapSchema.FIELD_NAME_ENTRY, "", "c", "", "d", "", "f", "from", TypedValues.TransitionType.S_TO, "b", "directory", "a", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public interface lc7 {

    @JvmField
    @NotNull
    public static final lc7 SYSTEM = new Companion.C0898a();

    void a(@NotNull File directory) throws IOException;

    void b(@NotNull File from, @NotNull File to) throws IOException;

    void c(@NotNull File file) throws IOException;

    boolean d(@NotNull File file);

    @NotNull
    Sink e(@NotNull File file) throws FileNotFoundException;

    long f(@NotNull File file);

    @NotNull
    Source g(@NotNull File file) throws FileNotFoundException;

    @NotNull
    Sink h(@NotNull File file) throws FileNotFoundException;
}
