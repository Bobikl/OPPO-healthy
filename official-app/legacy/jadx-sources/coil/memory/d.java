package coil.memory;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcoil/memory/d;", "Lcoil/memory/MemoryCache;", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "b", "value", "", "c", "", "level", "a", "Lcoil/memory/f;", "Lcoil/memory/f;", "strongMemoryCache", "Lcoil/memory/g;", "Lcoil/memory/g;", "weakMemoryCache", "<init>", "(Lcoil/memory/f;Lcoil/memory/g;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class d implements MemoryCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final f strongMemoryCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g weakMemoryCache;

    public d(@NotNull f fVar, @NotNull g gVar) {
        this.strongMemoryCache = fVar;
        this.weakMemoryCache = gVar;
    }

    @Override // coil.memory.MemoryCache
    public void a(int level) {
        this.strongMemoryCache.a(level);
        this.weakMemoryCache.a(level);
    }

    @Override // coil.memory.MemoryCache
    @Nullable
    public MemoryCache.Value b(@NotNull MemoryCache.Key key) {
        MemoryCache.Value valueB = this.strongMemoryCache.b(key);
        return valueB == null ? this.weakMemoryCache.b(key) : valueB;
    }

    @Override // coil.memory.MemoryCache
    public void c(@NotNull MemoryCache.Key key, @NotNull MemoryCache.Value value) {
        this.strongMemoryCache.c(MemoryCache.Key.copy$default(key, null, com.oplus.aiunit.vision.c.b(key.getExtras()), 1, null), value.getBitmap(), com.oplus.aiunit.vision.c.b(value.b()));
    }
}
