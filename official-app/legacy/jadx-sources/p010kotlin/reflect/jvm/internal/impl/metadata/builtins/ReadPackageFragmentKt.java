package p010kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p010kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nreadPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 readPackageFragment.kt\norg/jetbrains/kotlin/metadata/builtins/ReadPackageFragmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
public final class ReadPackageFragmentKt {
    @NotNull
    public static final Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> readBuiltinsPackageFragment(@NotNull InputStream inputStream) {
        ProtoBuf.PackageFragment from;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        try {
            BuiltInsBinaryVersion from2 = BuiltInsBinaryVersion.Companion.readFrom(inputStream);
            if (from2.isCompatibleWithCurrentCompilerVersion()) {
                ExtensionRegistryLite extensionRegistryLiteNewInstance = ExtensionRegistryLite.newInstance();
                BuiltInsProtoBuf.registerAllExtensions(extensionRegistryLiteNewInstance);
                from = ProtoBuf.PackageFragment.parseFrom(inputStream, extensionRegistryLiteNewInstance);
            } else {
                from = null;
            }
            Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> pair = TuplesKt.to(from, from2);
            CloseableKt.closeFinally(inputStream, null);
            return pair;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStream, th);
                throw th2;
            }
        }
    }
}
