package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.j;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.opos.process.bridge.base.BridgeConstant;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u000b\f\u0005J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H¦\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcoil/memory/MemoryCache;", "", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "b", "value", "", "c", "", "level", "a", "Key", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public interface MemoryCache {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcoil/memory/MemoryCache$a;", "", "Lcoil/memory/MemoryCache;", "a", "Landroid/content/Context;", "Landroid/content/Context;", "context", "", "b", "D", "maxSizePercent", "", "c", "I", "maxSizeBytes", "", "d", "Z", "strongReferencesEnabled", MapSchema.FIELD_NAME_ENTRY, "weakReferencesEnabled", "<init>", "(Landroid/content/Context;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public double maxSizePercent;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int maxSizeBytes;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean strongReferencesEnabled = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean weakReferencesEnabled = true;

        public a(@NotNull Context context) {
            this.context = context;
            this.maxSizePercent = j.e(context);
        }

        @NotNull
        public final MemoryCache a() {
            f aVar;
            g eVar = this.weakReferencesEnabled ? new e() : new b();
            if (this.strongReferencesEnabled) {
                double d = this.maxSizePercent;
                int iC = d > 0.0d ? j.c(this.context, d) : this.maxSizeBytes;
                aVar = iC > 0 ? new RealStrongMemoryCache(iC, eVar) : new coil.memory.a(eVar);
            } else {
                aVar = new coil.memory.a(eVar);
            }
            return new d(aVar, eVar);
        }
    }

    /* JADX INFO: renamed from: coil.memory.MemoryCache$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcoil/memory/MemoryCache$b;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", BridgeConstant.KEY_EXTRAS, "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static final class Value {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final Bitmap bitmap;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<String, Object> extras;

        public Value(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
            this.bitmap = bitmap;
            this.extras = map;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.extras;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Value) {
                Value value = (Value) other;
                if (Intrinsics.areEqual(this.bitmap, value.bitmap) && Intrinsics.areEqual(this.extras, value.extras)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.bitmap.hashCode() * 31) + this.extras.hashCode();
        }

        @NotNull
        public String toString() {
            return "Value(bitmap=" + this.bitmap + ", extras=" + this.extras + ')';
        }
    }

    void a(int level);

    @Nullable
    Value b(@NotNull Key key);

    void c(@NotNull Key key, @NotNull Value value);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "", "key", "", BridgeConstant.KEY_EXTRAS, "copy", "", "other", "", "equals", "", "hashCode", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Companion", "b", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n215#2,2:217\n*S KotlinDebug\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n*L\n86#1:217,2\n*E\n"})
    public static final class Key implements Parcelable {

        @NotNull
        private final Map<String, String> extras;

        @NotNull
        private final String key;

        @NotNull
        private static final b Companion = new b(null);

        @JvmField
        @Deprecated
        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new a();

        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"coil/memory/MemoryCache$Key$a", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, k = 1, mv = {1, 9, 0})
        public static final class a implements Parcelable.Creator<Key> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Key createFromParcel(@NotNull Parcel parcel) {
                String string = parcel.readString();
                Intrinsics.checkNotNull(string);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 < i; i2++) {
                    String string2 = parcel.readString();
                    Intrinsics.checkNotNull(string2);
                    String string3 = parcel.readString();
                    Intrinsics.checkNotNull(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new Key(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Key[] newArray(int size) {
                return new Key[size];
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcoil/memory/MemoryCache$Key$b;", "", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Key(@NotNull String str, @NotNull Map<String, String> map) {
            this.key = str;
            this.extras = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Key copy$default(Key key, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.key;
            }
            if ((i & 2) != 0) {
                map = key.extras;
            }
            return key.copy(str, map);
        }

        @NotNull
        public final Key copy(@NotNull String key, @NotNull Map<String, String> extras) {
            return new Key(key, extras);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Key) {
                Key key = (Key) other;
                if (Intrinsics.areEqual(this.key, key.key) && Intrinsics.areEqual(this.extras, key.extras)) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public final Map<String, String> getExtras() {
            return this.extras;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.extras.hashCode();
        }

        @NotNull
        public String toString() {
            return "Key(key=" + this.key + ", extras=" + this.extras + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.writeString(this.key);
            parcel.writeInt(this.extras.size());
            for (Map.Entry<String, String> entry : this.extras.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }

        public /* synthetic */ Key(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map);
        }
    }
}
