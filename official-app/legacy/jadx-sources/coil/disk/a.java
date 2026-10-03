package coil.disk;

import android.os.StatFs;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import java.io.Closeable;
import java.io.File;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0007\u0005\tJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H'R\u001a\u0010\r\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcoil/disk/a;", "", "", "key", "Lcoil/disk/a$c;", "b", "Lcoil/disk/a$b;", "a", "Lokio/FileSystem;", "c", "()Lokio/FileSystem;", "getFileSystem$annotations", "()V", "fileSystem", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public interface a {

    /* JADX INFO: renamed from: coil.disk.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcoil/disk/a$a;", "", "Ljava/io/File;", "directory", "b", "Lokio/Path;", "c", "Lcoil/disk/a;", "a", "Lokio/Path;", "Lokio/FileSystem;", "Lokio/FileSystem;", "fileSystem", "", "D", "maxSizePercent", "", "d", "J", "minimumMaxSizeBytes", MapSchema.FIELD_NAME_ENTRY, "maximumMaxSizeBytes", "f", "maxSizeBytes", "Lkotlinx/coroutines/CoroutineDispatcher;", b2n.f, "Lkotlinx/coroutines/CoroutineDispatcher;", "cleanupDispatcher", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskCache.kt\ncoil/disk/DiskCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
    public static final class C0132a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Path directory;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public long maxSizeBytes;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public FileSystem fileSystem = FileSystem.SYSTEM;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public double maxSizePercent = 0.02d;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long minimumMaxSizeBytes = 10485760;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long maximumMaxSizeBytes = 262144000;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public CoroutineDispatcher cleanupDispatcher = Dispatchers.getIO();

        @NotNull
        public final a a() {
            long jCoerceIn;
            Path path = this.directory;
            if (path == null) {
                throw new IllegalStateException("directory == null".toString());
            }
            if (this.maxSizePercent > 0.0d) {
                try {
                    File file = path.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jCoerceIn = RangesKt___RangesKt.coerceIn((long) (this.maxSizePercent * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    jCoerceIn = this.minimumMaxSizeBytes;
                }
            } else {
                jCoerceIn = this.maxSizeBytes;
            }
            return new coil.disk.b(jCoerceIn, path, this.fileSystem, this.cleanupDispatcher);
        }

        @NotNull
        public final C0132a b(@NotNull File directory) {
            return c(Path.Companion.get$default(Path.INSTANCE, directory, false, 1, (Object) null));
        }

        @NotNull
        public final C0132a c(@NotNull Path directory) {
            this.directory = directory;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcoil/disk/a$b;", "", "Lcoil/disk/a$c;", "b", "", "a", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public interface b {
        void a();

        @Nullable
        c b();

        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcoil/disk/a$c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lcoil/disk/a$b;", "q", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public interface c extends Closeable {
        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();

        @Nullable
        b q();
    }

    @Nullable
    b a(@NotNull String key);

    @Nullable
    c b(@NotNull String key);

    @NotNull
    /* JADX INFO: renamed from: c */
    FileSystem getFileSystem();
}
