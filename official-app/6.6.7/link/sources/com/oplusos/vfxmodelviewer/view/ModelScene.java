package com.oplusos.vfxmodelviewer.view;

import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import com.oplusos.vfxmodelviewer.filament.Colors;
import com.oplusos.vfxmodelviewer.filament.Engine;
import com.oplusos.vfxmodelviewer.filament.EntityManager;
import com.oplusos.vfxmodelviewer.filament.IndirectLight;
import com.oplusos.vfxmodelviewer.filament.LightManager;
import com.oplusos.vfxmodelviewer.filament.MaterialInstance;
import com.oplusos.vfxmodelviewer.filament.Renderer;
import com.oplusos.vfxmodelviewer.filament.Scene;
import com.oplusos.vfxmodelviewer.filament.Skybox;
import com.oplusos.vfxmodelviewer.filament.SwapChain;
import com.oplusos.vfxmodelviewer.filament.TransformManager;
import com.oplusos.vfxmodelviewer.filament.View;
import com.oplusos.vfxmodelviewer.filament.Viewport;
import com.oplusos.vfxmodelviewer.gltfio.Animator;
import com.oplusos.vfxmodelviewer.gltfio.AssetLoader;
import com.oplusos.vfxmodelviewer.gltfio.FilamentAsset;
import com.oplusos.vfxmodelviewer.gltfio.ResourceLoader;
import com.oplusos.vfxmodelviewer.gltfio.UbershaderLoader;
import com.oplusos.vfxmodelviewer.utils.Float3;
import com.oplusos.vfxmodelviewer.utils.Float4;
import com.oplusos.vfxmodelviewer.utils.KTXLoader;
import com.oplusos.vfxmodelviewer.utils.Mat4;
import com.oplusos.vfxmodelviewer.utils.MatrixKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b8\u0018\u0000 Ú\u00012\u00020\u00012\u00020\u0002:\nØ\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010I\u001a\u00020JH\u0002J\b\u0010K\u001a\u00020JH\u0002J\u0006\u0010L\u001a\u00020JJ\u0006\u0010M\u001a\u00020JJ\b\u0010N\u001a\u00020JH\u0002J\u0006\u0010O\u001a\u00020JJ\u0006\u0010P\u001a\u00020JJ\u0006\u0010Q\u001a\u00020JJ\b\u0010R\u001a\u00020JH\u0002J\u000e\u0010S\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018J\u000e\u0010T\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018J\u000e\u0010U\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018J\u000e\u0010V\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018J\u0010\u0010W\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018H\u0002J\u0010\u0010X\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018H\u0002J\u000e\u0010Y\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018J\u000e\u0010Z\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018J\u000e\u0010[\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018J\u000e\u0010\\\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018J\u0010\u0010]\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018H\u0002J\u0006\u0010^\u001a\u00020\fJ\u001a\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020\tH\u0002J\u0006\u0010c\u001a\u00020\u0014J\u000e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gJ\u000e\u0010h\u001a\u00020i2\u0006\u0010f\u001a\u00020gJ\u0006\u0010j\u001a\u00020\u0018J\u0006\u0010k\u001a\u00020\u0004J\u0006\u0010l\u001a\u00020\u0012J\u0006\u0010m\u001a\u00020#J\u0006\u0010n\u001a\u00020\u0012J\u0006\u0010o\u001a\u00020#J\b\u0010p\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010s\u001a\u00020\tJ\u0006\u0010t\u001a\u00020#J\u0006\u0010u\u001a\u000200J\u0006\u0010v\u001a\u000209J\u0006\u0010w\u001a\u00020;J\u0006\u0010x\u001a\u00020#J\u0006\u0010y\u001a\u00020\u001fJ\u0006\u0010z\u001a\u00020{J\u001a\u0010|\u001a\u0004\u0018\u00010`2\u0006\u0010}\u001a\u0002002\u0006\u0010f\u001a\u00020gH\u0002J\u0012\u0010~\u001a\u0004\u0018\u00010`2\u0006\u0010\u007f\u001a\u000200H\u0002J\u0019\u0010\u0080\u0001\u001a\u00020J2\u0006\u0010}\u001a\u0002002\u0006\u0010f\u001a\u00020gH\u0002J\u0019\u0010\u0081\u0001\u001a\u00020J2\u0006\u0010}\u001a\u0002002\u0006\u0010f\u001a\u00020gH\u0002J\u0010\u0010\u0082\u0001\u001a\u00020J2\u0007\u0010\u0083\u0001\u001a\u00020`J\u0017\u0010\u0084\u0001\u001a\u00020J2\u0006\u0010}\u001a\u0002002\u0006\u0010f\u001a\u00020gJ\u0010\u0010\u0085\u0001\u001a\u00020J2\u0007\u0010\u0083\u0001\u001a\u00020`J\u0012\u0010\u0086\u0001\u001a\u00020J2\u0007\u0010\u0083\u0001\u001a\u00020`H\u0002J+\u0010\u0087\u0001\u001a\u00020J2\u0007\u0010\u0083\u0001\u001a\u00020`2\u0017\u0010\u0088\u0001\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0007\u0012\u0005\u0018\u00010\u008a\u00010\u0089\u0001H\u0002J\u0017\u0010\u008b\u0001\u001a\u00020J2\u0006\u0010}\u001a\u0002002\u0006\u0010f\u001a\u00020gJ\u0010\u0010\u008c\u0001\u001a\u00020J2\u0007\u0010\u0083\u0001\u001a\u00020`J\u000f\u0010\u008d\u0001\u001a\u00020J2\u0006\u0010\u007f\u001a\u000200J\u0011\u0010\u008e\u0001\u001a\u00020J2\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001J\u0019\u0010\u0091\u0001\u001a\u00020J2\u0006\u0010}\u001a\u0002002\u0006\u0010f\u001a\u00020gH\u0002J\u0010\u0010\u0092\u0001\u001a\u00020J2\u0007\u0010\u0083\u0001\u001a\u00020`J\u000f\u0010\u0093\u0001\u001a\u00020J2\u0006\u0010S\u001a\u00020\u0018J!\u0010\u0094\u0001\u001a\u00020J2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J\u001b\u0010\u0098\u0001\u001a\u00020J2\u0007\u0010\u0099\u0001\u001a\u00020\t2\u0007\u0010\u009a\u0001\u001a\u00020\tH\u0016J\u0012\u0010\u009b\u0001\u001a\u00020J2\u0007\u0010\u009c\u0001\u001a\u00020\u000eH\u0002J\u0012\u0010\u009d\u0001\u001a\u00020J2\u0007\u0010\u009e\u0001\u001a\u00020\u001fH\u0002J\u0010\u0010\u009f\u0001\u001a\u00020J2\u0007\u0010 \u0001\u001a\u00020\tJ\u0010\u0010¡\u0001\u001a\u00020J2\u0007\u0010¢\u0001\u001a\u00020\tJ\u0011\u0010£\u0001\u001a\u00020J2\b\u0010¤\u0001\u001a\u00030¥\u0001J\u0010\u0010¦\u0001\u001a\u00020J2\u0007\u0010§\u0001\u001a\u00020\tJ\t\u0010¨\u0001\u001a\u00020JH\u0002J\"\u0010©\u0001\u001a\u00020J2\u0007\u0010ª\u0001\u001a\u00020#2\u0007\u0010«\u0001\u001a\u00020#2\u0007\u0010¬\u0001\u001a\u00020#J\u0010\u0010\u00ad\u0001\u001a\u00020J2\u0007\u0010®\u0001\u001a\u00020#J\"\u0010¯\u0001\u001a\u00020J2\u0007\u0010ª\u0001\u001a\u00020#2\u0007\u0010«\u0001\u001a\u00020#2\u0007\u0010¬\u0001\u001a\u00020#J\u0010\u0010°\u0001\u001a\u00020J2\u0007\u0010®\u0001\u001a\u00020#J\t\u0010±\u0001\u001a\u00020JH\u0002J\u0010\u0010²\u0001\u001a\u00020J2\u0007\u0010³\u0001\u001a\u00020+J\t\u0010´\u0001\u001a\u00020JH\u0002J\u0010\u0010µ\u0001\u001a\u00020J2\u0007\u0010¶\u0001\u001a\u00020#J\u0010\u0010·\u0001\u001a\u00020J2\u0007\u0010¸\u0001\u001a\u00020#J\u0010\u0010¹\u0001\u001a\u00020J2\u0007\u0010º\u0001\u001a\u000200J\u0010\u0010»\u0001\u001a\u00020J2\u0007\u0010¼\u0001\u001a\u00020\u0018J\u0010\u0010½\u0001\u001a\u00020J2\u0007\u0010¾\u0001\u001a\u000203J$\u0010¿\u0001\u001a\u00020J2\u0007\u0010À\u0001\u001a\u00020\t2\u0007\u0010Á\u0001\u001a\u00020\t2\u0007\u0010Â\u0001\u001a\u00020#H\u0002J\u0007\u0010Ã\u0001\u001a\u00020JJ\u0010\u0010Ä\u0001\u001a\u00020J2\u0007\u0010¶\u0001\u001a\u00020#J+\u0010Å\u0001\u001a\u00020J2\u0007\u0010Æ\u0001\u001a\u00020#2\u0007\u0010Ç\u0001\u001a\u00020#2\u0007\u0010È\u0001\u001a\u00020#2\u0007\u0010É\u0001\u001a\u00020#J+\u0010Ê\u0001\u001a\u00020J2\u0007\u0010Æ\u0001\u001a\u00020#2\u0007\u0010Ç\u0001\u001a\u00020#2\u0007\u0010È\u0001\u001a\u00020#2\u0007\u0010É\u0001\u001a\u00020#J\u001b\u0010Ë\u0001\u001a\u00020J2\u0007\u0010Ì\u0001\u001a\u00020e2\t\b\u0002\u0010Í\u0001\u001a\u00020\u0018J\u001b\u0010Î\u0001\u001a\u00020J2\u0007\u0010Ï\u0001\u001a\u00020i2\t\b\u0002\u0010Í\u0001\u001a\u00020\u0018J\u0019\u0010Ð\u0001\u001a\u00020J2\u0007\u0010\u0099\u0001\u001a\u00020\t2\u0007\u0010\u009a\u0001\u001a\u00020\tJ\t\u0010Ñ\u0001\u001a\u00020JH\u0002J\t\u0010Ò\u0001\u001a\u00020JH\u0002J\u0010\u0010Ó\u0001\u001a\u00020J2\u0007\u0010\u009e\u0001\u001a\u00020\u001fJ\t\u0010Ô\u0001\u001a\u00020JH\u0002J\t\u0010Õ\u0001\u001a\u00020JH\u0002J\t\u0010Ö\u0001\u001a\u00020JH\u0002J\t\u0010×\u0001\u001a\u00020JH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Ý\u0001"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/ModelScene;", "Lcom/oplusos/vfxmodelviewer/view/RenderView$OnRenderViewChangeListener;", "Lcom/oplusos/vfxmodelviewer/view/RenderView$OnViewSizeChangeListener;", "engine", "Lcom/oplusos/vfxmodelviewer/filament/Engine;", "modelViewer", "Lcom/oplusos/vfxmodelviewer/view/ModelViewer;", "(Lcom/oplusos/vfxmodelviewer/filament/Engine;Lcom/oplusos/vfxmodelviewer/view/ModelViewer;)V", "mAAMask", "", "mAASampleCount", "mAnimationController", "Lcom/oplusos/vfxmodelviewer/view/AnimationController;", "mAsset", "Lcom/oplusos/vfxmodelviewer/gltfio/FilamentAsset;", "mAssetLoader", "Lcom/oplusos/vfxmodelviewer/gltfio/AssetLoader;", "mBackgroundColor", "", "mCameraController", "Lcom/oplusos/vfxmodelviewer/view/CameraController;", "mColorSkybox", "Lcom/oplusos/vfxmodelviewer/filament/Skybox;", "mDestroyed", "", "mEnable", "mEnableSkyBox", "mEngine", "mFetchResourcesJob", "Lkotlinx/coroutines/Job;", "mFramCount", "", "mFrameStep", "mIBLAngle", "mIBLIntensity", "", "mLight", "mLightDir", "mLightIntensity", "mLoadBufferTime", "mLoadFileTime", "mLocalEnable", "mMaterials", "Lcom/oplusos/vfxmodelviewer/view/MaterialGroupConfig;", "mModelScale", "mModelViewPecent", "mModelViewer", "mName", "", "mNormalizeSkinningWeights", "mQualityLevel", "Lcom/oplusos/vfxmodelviewer/view/ModelScene$QualityLevel;", "mReadyRenderables", "", "mRecomputeBoundingBoxes", "mRenderDirty", "mRenderView", "Lcom/oplusos/vfxmodelviewer/view/RenderView;", "mRenderer", "Lcom/oplusos/vfxmodelviewer/filament/Renderer;", "mResolutionScale", "mResourceLoader", "Lcom/oplusos/vfxmodelviewer/gltfio/ResourceLoader;", "mRunningLastTime", "mRunningTime", "mScene", "Lcom/oplusos/vfxmodelviewer/filament/Scene;", "mTextureSize", "mTextureSkybox", "mTransparentValue", "mUserEnable", "mView", "Lcom/oplusos/vfxmodelviewer/filament/View;", "applyIBLAngle", "", "autoSetQuality", "clearView", "destroy", "destroyColorSkyBox", "destroyIBL", "destroyModel", "destroySkybox", "destroyTextureSkyBox", "enable", "enableAnimation", "enableBloom", "enableControl", "enableFXAA", "enableMSAA", "enableSSAO", "enableShadow", "enableSkyTransparent", "enableSkybox", "enableTAA", "getAnimationController", "getByteBuffer", "Ljava/nio/ByteBuffer;", "byteBuffer", "length", "getCameraController", "getCreatSurfaceView", "Landroid/view/SurfaceView;", "context", "Landroid/content/Context;", "getCreatTextureView", "Landroid/view/TextureView;", "getEnable", "getEngine", "getIBLAngle", "getIBLIntensity", "getLightDir", "getLightIntensity", "getMAsset", "getMaterialInstance", "Lcom/oplusos/vfxmodelviewer/filament/MaterialInstance;", "index", "getModelScale", "getName", "getRenderView", "getRenderer", "getResolutionScale", "getRunningTime", "getSceneTrackConfig", "Lcom/oplusos/vfxmodelviewer/view/ModelScene$SceneTrackConfig;", "loadBufferFromAssets", "fileName", "loadFileBuffer", "path", "loadGLTFFromAssets", "loadIBLFromAssets", "loadIBLFromBuffer", "buffer", "loadModelFromAssets", "loadModelFromBuffer", "loadModelGlbBuffer", "loadModelGltfBuffer", "callback", "Lkotlin/Function1;", "Ljava/nio/Buffer;", "loadSceneFromAsset", "loadSceneFromBuffer", "loadSceneFromFile", "loadSettings", "config", "Lcom/oplusos/vfxmodelviewer/view/ModelSceneConfig;", "loadSkyboxFromAssets", "loadSkyboxFromBuffer", "localEnable", "onViewChange", "newView", "Landroid/view/View;", "oldView", "onViewSizeChange", "width", "height", "populateScene", ParserTag.ASSET_NAME, "render", "frameTimeNanos", "setAAMask", "mask", "setAASampleCount", "sampleCount", "setAAType", "type", "Lcom/oplusos/vfxmodelviewer/view/ModelScene$AAType;", "setFrameStep", "step", "setHighQuality", "setIBLAngle", "x", "y", "z", "setIBLIntensity", "intensity", "setLightDir", "setLightIntensity", "setLowQuality", "setMaterials", "materials", "setMediumQuality", "setModelScale", "scale", "setModelScaleByViewPecent", "pecent", "setName", "name", "setOpaque", "isOpaque", "setQualityLevel", "level", "setQualityValue", "aaMask", "frameStep", "resolutionScale", "setRenderDirty", "setResolutionScale", "setSkyboxColor", "r", "g", "b", "a", "setSkyboxColorGammaCorrect", "setSurfaceView", "surfaceView", "applySize", "setTextureView", "textureView", "setViewSize", "setupPostProcessing", "transformToUnitCube", "update", "updateEnable", "updateMaterial", "updateModelScaleByViewPecent", "updateScale", "AAMask", "AAType", "Companion", "QualityLevel", "SceneTrackConfig", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ModelScene implements RenderView.OnRenderViewChangeListener, RenderView.OnViewSizeChangeListener {

    @NotNull
    private static final Float3 DEFAULT_MODEL_POS = new Float3(vr3.UNSET, vr3.UNSET, -4.0f);

    @NotNull
    public static final String MAGIC_WORD = "VFXMODELSCENE";

    @NotNull
    private static final String TAG = "ModelScene";
    private int mAAMask;
    private int mAASampleCount;

    @NotNull
    private AnimationController mAnimationController;

    @Nullable
    private FilamentAsset mAsset;

    @Nullable
    private AssetLoader mAssetLoader;

    @NotNull
    private float[] mBackgroundColor;

    @NotNull
    private CameraController mCameraController;

    @Nullable
    private Skybox mColorSkybox;
    private boolean mDestroyed;
    private boolean mEnable;
    private boolean mEnableSkyBox;

    @NotNull
    private final Engine mEngine;

    @Nullable
    private Job mFetchResourcesJob;
    private long mFramCount;
    private int mFrameStep;

    @NotNull
    private float[] mIBLAngle;
    private float mIBLIntensity;
    private final int mLight;

    @NotNull
    private float[] mLightDir;
    private float mLightIntensity;
    private long mLoadBufferTime;
    private long mLoadFileTime;
    private boolean mLocalEnable;

    @Nullable
    private MaterialGroupConfig mMaterials;
    private float mModelScale;
    private float mModelViewPecent;

    @NotNull
    private ModelViewer mModelViewer;

    @NotNull
    private String mName;
    private boolean mNormalizeSkinningWeights;

    @NotNull
    private QualityLevel mQualityLevel;

    @NotNull
    private final int[] mReadyRenderables;
    private boolean mRecomputeBoundingBoxes;
    private boolean mRenderDirty;

    @NotNull
    private RenderView mRenderView;

    @NotNull
    private final Renderer mRenderer;
    private float mResolutionScale;

    @Nullable
    private ResourceLoader mResourceLoader;
    private long mRunningLastTime;
    private long mRunningTime;

    @NotNull
    private final Scene mScene;

    @NotNull
    private int[] mTextureSize;

    @Nullable
    private Skybox mTextureSkybox;
    private float mTransparentValue;
    private boolean mUserEnable;

    @NotNull
    private final View mView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/ModelScene$AAMask;", "", "()V", "Companion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AAMask {
        public static final int All = -1;
        public static final int FXAA = 1;
        public static final int MSAA = 4;
        public static final int None = 0;
        public static final int TAA = 2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/ModelScene$AAType;", "", "(Ljava/lang/String;I)V", "None", "FXAA", "TAA", "MSAA", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum AAType {
        None,
        FXAA,
        TAA,
        MSAA
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/ModelScene$QualityLevel;", "", "(Ljava/lang/String;I)V", "Auto", "Low", "Medium", "High", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum QualityLevel {
        Auto,
        Low,
        Medium,
        High
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006$"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/ModelScene$SceneTrackConfig;", "", "loadTime", "", "runingTime", "controlTime", "fps", "name", "", "(JJJJLjava/lang/String;)V", "getControlTime", "()J", "setControlTime", "(J)V", "getFps", "setFps", "getLoadTime", "setLoadTime", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getRuningTime", "setRuningTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class SceneTrackConfig {
        private long controlTime;
        private long fps;
        private long loadTime;

        @NotNull
        private String name;
        private long runingTime;

        public SceneTrackConfig() {
            this(0L, 0L, 0L, 0L, null, 31, null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getLoadTime() {
            return this.loadTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getRuningTime() {
            return this.runingTime;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getControlTime() {
            return this.controlTime;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getFps() {
            return this.fps;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final SceneTrackConfig copy(long loadTime, long runingTime, long controlTime, long fps, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new SceneTrackConfig(loadTime, runingTime, controlTime, fps, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SceneTrackConfig)) {
                return false;
            }
            SceneTrackConfig sceneTrackConfig = (SceneTrackConfig) other;
            return this.loadTime == sceneTrackConfig.loadTime && this.runingTime == sceneTrackConfig.runingTime && this.controlTime == sceneTrackConfig.controlTime && this.fps == sceneTrackConfig.fps && Intrinsics.areEqual(this.name, sceneTrackConfig.name);
        }

        public final long getControlTime() {
            return this.controlTime;
        }

        public final long getFps() {
            return this.fps;
        }

        public final long getLoadTime() {
            return this.loadTime;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final long getRuningTime() {
            return this.runingTime;
        }

        public int hashCode() {
            return (((((((Long.hashCode(this.loadTime) * 31) + Long.hashCode(this.runingTime)) * 31) + Long.hashCode(this.controlTime)) * 31) + Long.hashCode(this.fps)) * 31) + this.name.hashCode();
        }

        public final void setControlTime(long j) {
            this.controlTime = j;
        }

        public final void setFps(long j) {
            this.fps = j;
        }

        public final void setLoadTime(long j) {
            this.loadTime = j;
        }

        public final void setName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.name = str;
        }

        public final void setRuningTime(long j) {
            this.runingTime = j;
        }

        @NotNull
        public String toString() {
            return "SceneTrackConfig(loadTime=" + this.loadTime + ", runingTime=" + this.runingTime + ", controlTime=" + this.controlTime + ", fps=" + this.fps + ", name=" + this.name + ')';
        }

        public SceneTrackConfig(long j, long j2, long j3, long j4, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            this.loadTime = j;
            this.runingTime = j2;
            this.controlTime = j3;
            this.fps = j4;
            this.name = str;
        }

        public /* synthetic */ SceneTrackConfig(long j, long j2, long j3, long j4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? "none" : str);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AAType.values().length];
            iArr[AAType.None.ordinal()] = 1;
            iArr[AAType.FXAA.ordinal()] = 2;
            iArr[AAType.MSAA.ordinal()] = 3;
            iArr[AAType.TAA.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QualityLevel.values().length];
            iArr2[QualityLevel.Auto.ordinal()] = 1;
            iArr2[QualityLevel.Low.ordinal()] = 2;
            iArr2[QualityLevel.Medium.ordinal()] = 3;
            iArr2[QualityLevel.High.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PerformanceChecker.PerformanceLevel.values().length];
            iArr3[PerformanceChecker.PerformanceLevel.Low.ordinal()] = 1;
            iArr3[PerformanceChecker.PerformanceLevel.Medium.ordinal()] = 2;
            iArr3[PerformanceChecker.PerformanceLevel.High.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public ModelScene(@NotNull Engine engine, @NotNull ModelViewer modelViewer) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(modelViewer, "modelViewer");
        this.mNormalizeSkinningWeights = true;
        this.mReadyRenderables = new int[128];
        this.mTransparentValue = 1.0f;
        this.mAASampleCount = 2;
        this.mQualityLevel = QualityLevel.Medium;
        this.mFrameStep = 1;
        this.mFramCount = -1L;
        this.mLightDir = new float[]{vr3.UNSET, -1.0f, vr3.UNSET};
        this.mLightIntensity = 100000.0f;
        this.mIBLIntensity = 30000.0f;
        this.mIBLAngle = new float[]{vr3.UNSET, vr3.UNSET, vr3.UNSET};
        this.mRenderDirty = true;
        this.mModelScale = 1.0f;
        this.mResolutionScale = 1.0f;
        this.mName = "";
        this.mBackgroundColor = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
        this.mEngine = engine;
        this.mModelViewer = modelViewer;
        Renderer rendererCreateRenderer = engine.createRenderer();
        Intrinsics.checkNotNullExpressionValue(rendererCreateRenderer, "mEngine.createRenderer()");
        this.mRenderer = rendererCreateRenderer;
        Scene sceneCreateScene = engine.createScene();
        Intrinsics.checkNotNullExpressionValue(sceneCreateScene, "mEngine.createScene()");
        this.mScene = sceneCreateScene;
        View viewCreateView = engine.createView();
        Intrinsics.checkNotNullExpressionValue(viewCreateView, "mEngine.createView()");
        this.mView = viewCreateView;
        viewCreateView.setScene(sceneCreateScene);
        Renderer.ClearOptions clearOptions = rendererCreateRenderer.getClearOptions();
        Intrinsics.checkNotNullExpressionValue(clearOptions, "mRenderer.clearOptions");
        clearOptions.clear = true;
        clearOptions.clearColor = this.mBackgroundColor;
        rendererCreateRenderer.setClearOptions(clearOptions);
        View.RenderQuality renderQuality = viewCreateView.getRenderQuality();
        Intrinsics.checkNotNullExpressionValue(renderQuality, "mView.renderQuality");
        renderQuality.hdrColorBuffer = View.QualityLevel.HIGH;
        viewCreateView.setRenderQuality(renderQuality);
        Skybox.Builder builder = new Skybox.Builder();
        float[] fArr = this.mBackgroundColor;
        this.mColorSkybox = builder.color(fArr[0], fArr[1], fArr[2], fArr[3] * this.mTransparentValue).build(engine);
        int iCreate = getMEngine().getEntityManager().create();
        this.mLight = iCreate;
        float[] fArrCct = Colors.cct(6500.0f);
        Intrinsics.checkNotNullExpressionValue(fArrCct, "cct(6_500.0f)");
        LightManager.Builder builderIntensity = new LightManager.Builder(LightManager.Type.DIRECTIONAL).color(fArrCct[0], fArrCct[1], fArrCct[2]).intensity(this.mLightIntensity);
        float[] fArr2 = this.mLightDir;
        builderIntensity.direction(fArr2[0], fArr2[1], fArr2[2]).castShadows(true).build(engine, iCreate);
        sceneCreateScene.addEntity(iCreate);
        RenderView renderView = new RenderView(this);
        this.mRenderView = renderView;
        renderView.setListener(this);
        setupPostProcessing();
        this.mTextureSize = new int[]{1080, 1080};
        this.mAnimationController = new AnimationController(this);
        CameraController cameraController = new CameraController(this);
        this.mCameraController = cameraController;
        viewCreateView.setCamera(cameraController.getMCamera());
        enableSkybox(false);
    }

    private final void applyIBLAngle() {
        IndirectLight indirectLight = this.mScene.getIndirectLight();
        if (indirectLight == null) {
            return;
        }
        Mat4 mat4 = new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
        Quaternion quaternion = new Quaternion(vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null);
        float[] fArr = this.mIBLAngle;
        quaternion.fromEuler(fArr[0], fArr[1], fArr[2]);
        Math.Companion companion = Math.INSTANCE;
        companion.composeMatrix(mat4, new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET), quaternion, new Float3(1.0f, 1.0f, 1.0f));
        float[] fArr2 = new float[9];
        companion.mat3ToFloatArray(mat4, fArr2);
        indirectLight.setRotation(fArr2);
    }

    private final void autoSetQuality() {
        int i = WhenMappings.$EnumSwitchMapping$2[ModelViewer.INSTANCE.getPerformanceLevel().ordinal()];
        if (i == 1) {
            setLowQuality();
        } else if (i == 2) {
            setMediumQuality();
        } else {
            if (i != 3) {
                return;
            }
            setHighQuality();
        }
    }

    private final void destroyColorSkyBox() {
        Skybox skybox = this.mColorSkybox;
        if (skybox != null) {
            getMEngine().destroySkybox(skybox);
        }
        this.mColorSkybox = null;
    }

    private final void destroyTextureSkyBox() {
        Skybox skybox = this.mTextureSkybox;
        if (skybox != null) {
            getMEngine().destroySkybox(skybox);
        }
        this.mTextureSkybox = null;
    }

    private final void enableFXAA(boolean enable) {
        if (enable) {
            this.mView.setAntiAliasing(View.AntiAliasing.FXAA);
        } else {
            this.mView.setAntiAliasing(View.AntiAliasing.NONE);
        }
    }

    private final void enableMSAA(boolean enable) {
        View.MultiSampleAntiAliasingOptions multiSampleAntiAliasingOptions = this.mView.getMultiSampleAntiAliasingOptions();
        Intrinsics.checkNotNullExpressionValue(multiSampleAntiAliasingOptions, "mView.multiSampleAntiAliasingOptions");
        multiSampleAntiAliasingOptions.enabled = enable;
        if (enable) {
            multiSampleAntiAliasingOptions.sampleCount = this.mAASampleCount;
        } else {
            multiSampleAntiAliasingOptions.sampleCount = 1;
        }
        this.mView.setMultiSampleAntiAliasingOptions(multiSampleAntiAliasingOptions);
    }

    private final void enableTAA(boolean enable) {
        View.TemporalAntiAliasingOptions temporalAntiAliasingOptions = this.mView.getTemporalAntiAliasingOptions();
        Intrinsics.checkNotNullExpressionValue(temporalAntiAliasingOptions, "mView.temporalAntiAliasingOptions");
        temporalAntiAliasingOptions.enabled = enable;
        this.mView.setTemporalAntiAliasingOptions(temporalAntiAliasingOptions);
    }

    private final ByteBuffer getByteBuffer(ByteBuffer byteBuffer, int length) {
        if (length <= 0) {
            return null;
        }
        byte[] bArr = new byte[length];
        byteBuffer.get(bArr, 0, length);
        return ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ByteBuffer loadBufferFromAssets(String fileName, Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(fileName);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            return ByteBuffer.wrap(bArr);
        } catch (Exception e) {
            LogUtils.INSTANCE.printStackTrace(e);
            return null;
        }
    }

    private final ByteBuffer loadFileBuffer(String path) throws IOException {
        File file = new File(path);
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(ByteStreamsKt.readBytes(fileInputStream));
        fileInputStream.close();
        return byteBufferWrap;
    }

    private final void loadGLTFFromAssets(final String fileName, final Context context) {
        ByteBuffer byteBufferLoadBufferFromAssets = loadBufferFromAssets(fileName, context);
        if (byteBufferLoadBufferFromAssets == null) {
            return;
        }
        loadModelGltfBuffer(byteBufferLoadBufferFromAssets, new Function1<String, Buffer>() { // from class: com.oplusos.vfxmodelviewer.view.ModelScene.loadGLTFFromAssets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Nullable
            public final Buffer invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "path");
                String str2 = fileName;
                int iLastIndexOf$default = StringsKt.lastIndexOf$default(str2, '/', 0, false, 6, (Object) null);
                if (iLastIndexOf$default >= 0) {
                    int i = iLastIndexOf$default + 1;
                    if (str2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String strSubstring = str2.substring(0, i);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    str = Intrinsics.stringPlus(strSubstring, str);
                }
                return this.loadBufferFromAssets(str, context);
            }
        });
        transformToUnitCube();
    }

    private final void loadIBLFromAssets(String fileName, Context context) {
        ByteBuffer byteBufferLoadBufferFromAssets = loadBufferFromAssets(fileName, context);
        if (byteBufferLoadBufferFromAssets == null) {
            return;
        }
        loadIBLFromBuffer(byteBufferLoadBufferFromAssets);
    }

    private final void loadModelGlbBuffer(ByteBuffer buffer) {
        destroyModel();
        Engine engine = this.mEngine;
        this.mAssetLoader = new AssetLoader(engine, new UbershaderLoader(engine), EntityManager.get());
        this.mResourceLoader = new ResourceLoader(this.mEngine, this.mNormalizeSkinningWeights, this.mRecomputeBoundingBoxes);
        AssetLoader assetLoader = this.mAssetLoader;
        Intrinsics.checkNotNull(assetLoader);
        FilamentAsset filamentAssetCreateAssetFromBinary = assetLoader.createAssetFromBinary(buffer);
        this.mAsset = filamentAssetCreateAssetFromBinary;
        if (filamentAssetCreateAssetFromBinary == null) {
            return;
        }
        ResourceLoader resourceLoader = this.mResourceLoader;
        Intrinsics.checkNotNull(resourceLoader);
        resourceLoader.asyncBeginLoad(filamentAssetCreateAssetFromBinary);
        AnimationController animationController = this.mAnimationController;
        Animator animator = filamentAssetCreateAssetFromBinary.getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "asset.animator");
        animationController.setAnimator(animator);
        if (this.mMaterials != null) {
            updateMaterial();
        }
        filamentAssetCreateAssetFromBinary.releaseSourceData();
    }

    private final void loadModelGltfBuffer(ByteBuffer buffer, Function1<? super String, ? extends Buffer> callback) {
        destroyModel();
        Engine engine = this.mEngine;
        this.mAssetLoader = new AssetLoader(engine, new UbershaderLoader(engine), EntityManager.get());
        this.mResourceLoader = new ResourceLoader(this.mEngine, this.mNormalizeSkinningWeights, this.mRecomputeBoundingBoxes);
        AssetLoader assetLoader = this.mAssetLoader;
        Intrinsics.checkNotNull(assetLoader);
        FilamentAsset filamentAssetCreateAssetFromJson = assetLoader.createAssetFromJson(buffer);
        this.mAsset = filamentAssetCreateAssetFromJson;
        if (filamentAssetCreateAssetFromJson == null) {
            return;
        }
        String[] resourceUris = filamentAssetCreateAssetFromJson.getResourceUris();
        Intrinsics.checkNotNullExpressionValue(resourceUris, "asset.resourceUris");
        int length = resourceUris.length;
        int i = 0;
        while (i < length) {
            String str = resourceUris[i];
            i++;
            Intrinsics.checkNotNullExpressionValue(str, ParserTag.TAG_URI);
            Buffer buffer2 = (Buffer) callback.invoke(str);
            if (buffer2 != null) {
                ResourceLoader resourceLoader = this.mResourceLoader;
                Intrinsics.checkNotNull(resourceLoader);
                resourceLoader.addResourceData(str, buffer2);
            }
        }
        ResourceLoader resourceLoader2 = this.mResourceLoader;
        Intrinsics.checkNotNull(resourceLoader2);
        resourceLoader2.asyncBeginLoad(filamentAssetCreateAssetFromJson);
        AnimationController animationController = this.mAnimationController;
        Animator animator = filamentAssetCreateAssetFromJson.getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "asset.animator");
        animationController.setAnimator(animator);
        if (this.mMaterials != null) {
            updateMaterial();
        }
        filamentAssetCreateAssetFromJson.releaseSourceData();
    }

    private final void loadSkyboxFromAssets(String fileName, Context context) {
        ByteBuffer byteBufferLoadBufferFromAssets = loadBufferFromAssets(fileName, context);
        if (byteBufferLoadBufferFromAssets == null) {
            return;
        }
        loadSkyboxFromBuffer(byteBufferLoadBufferFromAssets);
    }

    private final void populateScene(final FilamentAsset asset) {
        final Ref.IntRef intRef = new Ref.IntRef();
        Function0<Boolean> function0 = new Function0<Boolean>() { // from class: com.oplusos.vfxmodelviewer.view.ModelScene$populateScene$popRenderables$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @NotNull
            public final Boolean invoke() {
                intRef.element = asset.popRenderables(this.mReadyRenderables);
                return Boolean.valueOf(intRef.element != 0);
            }
        };
        while (((Boolean) function0.invoke()).booleanValue()) {
            this.mScene.addEntities(CollectionsKt.toIntArray(ArraysKt.take(this.mReadyRenderables, intRef.element)));
        }
        this.mScene.addEntities(asset.getLightEntities());
    }

    private final void render(long frameTimeNanos) {
        SwapChain swapChain = this.mRenderView.getMSwapChain();
        if (swapChain == null || !this.mRenderDirty) {
            return;
        }
        if (this.mRenderer.beginFrame(swapChain, frameTimeNanos)) {
            this.mRenderer.render(this.mView);
            this.mRenderer.endFrame();
        }
        this.mRenderDirty = false;
    }

    private final void setHighQuality() {
        setQualityValue(5, 1, 1.0f);
    }

    private final void setLowQuality() {
        setQualityValue(4, 2, 0.8f);
    }

    private final void setMediumQuality() {
        setQualityValue(4, 1, 1.0f);
    }

    private final void setQualityValue(int aaMask, int frameStep, float resolutionScale) {
        setAAMask(aaMask);
        this.mFrameStep = frameStep;
        setResolutionScale(resolutionScale);
        enableShadow(false);
        enableBloom(false);
        enableSSAO(false);
    }

    public static /* synthetic */ void setSurfaceView$default(ModelScene modelScene, SurfaceView surfaceView, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        modelScene.setSurfaceView(surfaceView, z);
    }

    public static /* synthetic */ void setTextureView$default(ModelScene modelScene, TextureView textureView, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        modelScene.setTextureView(textureView, z);
    }

    private final void setupPostProcessing() {
        this.mView.setAntiAliasing(View.AntiAliasing.NONE);
    }

    private final void transformToUnitCube() {
        updateScale();
    }

    private final void updateEnable() {
        boolean z = this.mUserEnable & this.mLocalEnable;
        if (this.mEnable == z) {
            return;
        }
        this.mEnable = z;
        this.mCameraController.sceneEnable(z);
        this.mAnimationController.sceneEnable(z);
        this.mRenderView.sceneEnable(z);
        if (this.mEnable) {
            this.mRunningLastTime = System.nanoTime();
        }
    }

    private final void updateMaterial() {
        MaterialGroupConfig materialGroupConfig;
        FilamentAsset filamentAsset = this.mAsset;
        if (filamentAsset == null || (materialGroupConfig = this.mMaterials) == null) {
            return;
        }
        materialGroupConfig.applyRender(filamentAsset);
    }

    private final void updateModelScaleByViewPecent() {
        Float3[] float3Arr = {new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null), new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null), new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null), new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null)};
        this.mCameraController.getFrustumCorners(float3Arr, 5.0f);
        Math.Companion companion = Math.INSTANCE;
        Float3 float3 = float3Arr[0];
        Float3 float4 = float3Arr[1];
        setModelScale(companion.magnitude(new Float3(float3.getX() - float4.getX(), float3.getY() - float4.getY(), float3.getZ() - float4.getZ())) * this.mModelViewPecent * 0.5f);
    }

    private final void updateScale() {
        FilamentAsset filamentAsset = this.mAsset;
        if (filamentAsset == null) {
            return;
        }
        TransformManager transformManager = this.mEngine.getTransformManager();
        Intrinsics.checkNotNullExpressionValue(transformManager, "mEngine.transformManager");
        float[] center = filamentAsset.getBoundingBox().getCenter();
        Float3 float3 = new Float3(center[0], center[1], center[2]);
        float[] halfExtent = filamentAsset.getBoundingBox().getHalfExtent();
        Float3 float4 = new Float3(halfExtent[0], halfExtent[1], halfExtent[2]);
        float fMax = (this.mModelScale * 2.0f) / (java.lang.Math.max(float4.getX(), java.lang.Math.max(float4.getY(), float4.getZ())) * 2.0f);
        Float3 float5 = DEFAULT_MODEL_POS;
        Float3 float6 = new Float3(float5.getX() / fMax, float5.getY() / fMax, float5.getZ() / fMax);
        transformManager.setTransform(transformManager.getInstance(filamentAsset.getRoot()), MatrixKt.transpose(MatrixKt.scale(new Float3(fMax)).times(MatrixKt.translation(new Float3(float3.getX() - float6.getX(), float3.getY() - float6.getY(), float3.getZ() - float6.getZ()).unaryMinus()))).toFloatArray());
    }

    public final void clearView() {
        this.mRenderView.clearView();
    }

    public final void destroy() {
        if (this.mDestroyed) {
            return;
        }
        this.mDestroyed = true;
        this.mRenderView.destroy();
        this.mCameraController.destroy();
        this.mAnimationController.destroy();
        destroyModel();
        destroyColorSkyBox();
        destroyTextureSkyBox();
        destroyIBL();
        this.mEngine.getLightManager().destroy(this.mLight);
        this.mEngine.destroyEntity(this.mLight);
        this.mEngine.destroyRenderer(this.mRenderer);
        this.mEngine.destroyView(this.mView);
        this.mEngine.destroyScene(this.mScene);
    }

    public final void destroyIBL() {
        IndirectLight indirectLight = this.mScene.getIndirectLight();
        if (indirectLight != null) {
            getMEngine().destroyIndirectLight(indirectLight);
        }
        this.mScene.setIndirectLight(null);
    }

    public final void destroyModel() {
        Job job = this.mFetchResourcesJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        ResourceLoader resourceLoader = this.mResourceLoader;
        if (resourceLoader != null) {
            resourceLoader.asyncCancelLoad();
            resourceLoader.evictResourceData();
            resourceLoader.destroy();
            this.mResourceLoader = null;
        }
        AssetLoader assetLoader = this.mAssetLoader;
        if (assetLoader != null) {
            FilamentAsset filamentAsset = this.mAsset;
            if (filamentAsset != null) {
                Scene scene = this.mScene;
                Intrinsics.checkNotNull(filamentAsset);
                scene.removeEntities(filamentAsset.getEntities());
                FilamentAsset filamentAsset2 = this.mAsset;
                Intrinsics.checkNotNull(filamentAsset2);
                assetLoader.destroyAsset(filamentAsset2);
                this.mAsset = null;
            }
            assetLoader.destroy();
            this.mAssetLoader = null;
        }
        this.mAnimationController.clear();
    }

    public final void destroySkybox() {
        destroyTextureSkyBox();
        if (this.mEnableSkyBox) {
            this.mScene.setSkybox(this.mColorSkybox);
        }
    }

    public final void enable(boolean enable) {
        this.mUserEnable = enable;
        updateEnable();
    }

    public final void enableAnimation(boolean enable) {
        if (enable) {
            this.mAnimationController.play(0, 0, 1.0f, vr3.UNSET, AnimationController.WrapMode.Clamp);
        } else {
            this.mAnimationController.stop(0);
        }
    }

    public final void enableBloom(boolean enable) {
        View.BloomOptions bloomOptions = this.mView.getBloomOptions();
        Intrinsics.checkNotNullExpressionValue(bloomOptions, "mView.bloomOptions");
        bloomOptions.enabled = enable;
        this.mView.setBloomOptions(bloomOptions);
    }

    public final void enableControl(boolean enable) {
        this.mCameraController.enable(enable);
    }

    public final void enableSSAO(boolean enable) {
        View.AmbientOcclusionOptions ambientOcclusionOptions = this.mView.getAmbientOcclusionOptions();
        Intrinsics.checkNotNullExpressionValue(ambientOcclusionOptions, "mView.ambientOcclusionOptions");
        ambientOcclusionOptions.enabled = enable;
        this.mView.setAmbientOcclusionOptions(ambientOcclusionOptions);
    }

    public final void enableShadow(boolean enable) {
        this.mView.setShadowingEnabled(enable);
    }

    public final void enableSkyTransparent(boolean enable) {
        float f = enable ? vr3.UNSET : 1.0f;
        this.mTransparentValue = f;
        Skybox skybox = this.mColorSkybox;
        if (skybox == null) {
            return;
        }
        float[] fArr = this.mBackgroundColor;
        skybox.setColor(fArr[0], fArr[1], fArr[2], fArr[3] * f);
    }

    public final void enableSkybox(boolean enable) {
        Skybox skybox;
        this.mEnableSkyBox = enable;
        if (!enable || (skybox = this.mTextureSkybox) == null) {
            this.mScene.setSkybox(this.mColorSkybox);
        } else {
            this.mScene.setSkybox(skybox);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getAnimationController, reason: from getter */
    public final AnimationController getMAnimationController() {
        return this.mAnimationController;
    }

    @NotNull
    /* JADX INFO: renamed from: getCameraController, reason: from getter */
    public final CameraController getMCameraController() {
        return this.mCameraController;
    }

    @NotNull
    public final SurfaceView getCreatSurfaceView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.mRenderView.getCreatSurfaceView(context);
    }

    @NotNull
    public final TextureView getCreatTextureView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.mRenderView.getCreatTextureView(context);
    }

    /* JADX INFO: renamed from: getEnable, reason: from getter */
    public final boolean getMEnable() {
        return this.mEnable;
    }

    @NotNull
    /* JADX INFO: renamed from: getEngine, reason: from getter */
    public final Engine getMEngine() {
        return this.mEngine;
    }

    @NotNull
    /* JADX INFO: renamed from: getIBLAngle, reason: from getter */
    public final float[] getMIBLAngle() {
        return this.mIBLAngle;
    }

    /* JADX INFO: renamed from: getIBLIntensity, reason: from getter */
    public final float getMIBLIntensity() {
        return this.mIBLIntensity;
    }

    @NotNull
    /* JADX INFO: renamed from: getLightDir, reason: from getter */
    public final float[] getMLightDir() {
        return this.mLightDir;
    }

    /* JADX INFO: renamed from: getLightIntensity, reason: from getter */
    public final float getMLightIntensity() {
        return this.mLightIntensity;
    }

    @Nullable
    public final FilamentAsset getMAsset() {
        return this.mAsset;
    }

    @Nullable
    public final MaterialInstance getMaterialInstance(int index) {
        FilamentAsset filamentAsset = this.mAsset;
        if (filamentAsset == null) {
            return null;
        }
        MaterialInstance[] materialInstances = filamentAsset.getMaterialInstances();
        Intrinsics.checkNotNullExpressionValue(materialInstances, "it.materialInstances");
        if (index < 0 || index >= materialInstances.length) {
            return null;
        }
        return materialInstances[index];
    }

    /* JADX INFO: renamed from: getModelScale, reason: from getter */
    public final float getMModelScale() {
        return this.mModelScale;
    }

    @NotNull
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getMName() {
        return this.mName;
    }

    @NotNull
    /* JADX INFO: renamed from: getRenderView, reason: from getter */
    public final RenderView getMRenderView() {
        return this.mRenderView;
    }

    @NotNull
    /* JADX INFO: renamed from: getRenderer, reason: from getter */
    public final Renderer getMRenderer() {
        return this.mRenderer;
    }

    /* JADX INFO: renamed from: getResolutionScale, reason: from getter */
    public final float getMResolutionScale() {
        return this.mResolutionScale;
    }

    public final long getRunningTime() {
        return (long) (this.mRunningTime / ((double) 1000000));
    }

    @NotNull
    public final SceneTrackConfig getSceneTrackConfig() {
        return new SceneTrackConfig((long) ((this.mLoadFileTime + this.mLoadBufferTime) / ((double) 1000000)), getRunningTime(), this.mCameraController.getControlTime(), this.mRenderView.getFPS(), this.mName);
    }

    public final void loadIBLFromBuffer(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        IndirectLight indirectLight = this.mScene.getIndirectLight();
        if (indirectLight != null) {
            this.mEngine.destroyIndirectLight(indirectLight);
        }
        this.mScene.setIndirectLight(KTXLoader.createIndirectLight$default(KTXLoader.INSTANCE, this.mEngine, buffer, null, 4, null));
        IndirectLight indirectLight2 = this.mScene.getIndirectLight();
        Intrinsics.checkNotNull(indirectLight2);
        indirectLight2.setIntensity(this.mIBLIntensity);
        applyIBLAngle();
    }

    public final void loadModelFromAssets(@NotNull String fileName, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        ByteBuffer byteBufferLoadBufferFromAssets = loadBufferFromAssets(fileName, context);
        if (byteBufferLoadBufferFromAssets == null) {
            return;
        }
        loadModelFromBuffer(byteBufferLoadBufferFromAssets);
    }

    public final void loadModelFromBuffer(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        loadModelGlbBuffer(buffer);
        transformToUnitCube();
    }

    public final void loadSceneFromAsset(@NotNull String fileName, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        long jNanoTime = System.nanoTime();
        ByteBuffer byteBufferLoadBufferFromAssets = loadBufferFromAssets(fileName, context);
        if (byteBufferLoadBufferFromAssets == null) {
            return;
        }
        this.mLoadFileTime = System.nanoTime() - jNanoTime;
        loadSceneFromBuffer(byteBufferLoadBufferFromAssets);
    }

    public final void loadSceneFromBuffer(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        try {
            long jNanoTime = System.nanoTime();
            Head head = new Head();
            head.read(buffer);
            ModelSceneConfig modelSceneConfig = new ModelSceneConfig();
            ByteBuffer byteBuffer = getByteBuffer(buffer, head.getConfigLength());
            Intrinsics.checkNotNull(byteBuffer);
            modelSceneConfig.read(byteBuffer);
            ByteBuffer byteBuffer2 = getByteBuffer(buffer, head.getGlbLength());
            ByteBuffer byteBuffer3 = getByteBuffer(buffer, head.getIblLength());
            ByteBuffer byteBuffer4 = getByteBuffer(buffer, head.getSkyboxLength());
            loadSettings(modelSceneConfig);
            if (byteBuffer3 != null) {
                loadIBLFromBuffer(byteBuffer3);
            }
            if (byteBuffer4 != null) {
                loadSkyboxFromBuffer(byteBuffer4);
            }
            if (byteBuffer2 != null) {
                loadModelFromBuffer(byteBuffer2);
            }
            this.mLoadBufferTime = System.nanoTime() - jNanoTime;
        } catch (Exception e) {
            LogUtils.INSTANCE.printStackTrace(e);
        }
    }

    public final void loadSceneFromFile(@NotNull String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        long jNanoTime = System.nanoTime();
        ByteBuffer byteBufferLoadFileBuffer = loadFileBuffer(path);
        this.mLoadFileTime = System.nanoTime() - jNanoTime;
        if (byteBufferLoadFileBuffer == null) {
            return;
        }
        loadSceneFromBuffer(byteBufferLoadFileBuffer);
    }

    public final void loadSettings(@NotNull ModelSceneConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        setAAType(config.getAaType());
        enableBloom(config.getEnableBloom());
        enableSSAO(config.getEnableSSAO());
        enableShadow(config.getEnableShadow());
        enableSkybox(config.getEnableSkyBox());
        setSkyboxColor(config.getBackgroundColor().getR(), config.getBackgroundColor().getG(), config.getBackgroundColor().getB(), config.getBackgroundColor().getA());
        setMaterials(config.getMaterials());
        setModelScale(config.getModelScale());
        setLightIntensity(config.getLight().getIntensity());
        setLightDir((float) config.getLight().getDirection()[0], (float) config.getLight().getDirection()[1], (float) config.getLight().getDirection()[2]);
        setIBLIntensity(config.getLight().getIblIntensity());
        setIBLAngle((float) config.getLight().getIblAngle()[0], (float) config.getLight().getIblAngle()[1], (float) config.getLight().getIblAngle()[2]);
    }

    public final void loadSkyboxFromBuffer(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Skybox skybox = this.mTextureSkybox;
        if (skybox != null) {
            this.mEngine.destroySkybox(skybox);
        }
        Skybox skyboxCreateSkybox$default = KTXLoader.createSkybox$default(KTXLoader.INSTANCE, this.mEngine, buffer, null, 4, null);
        this.mTextureSkybox = skyboxCreateSkybox$default;
        if (this.mEnableSkyBox) {
            this.mScene.setSkybox(skyboxCreateSkybox$default);
        }
    }

    public final void localEnable(boolean enable) {
        this.mLocalEnable = enable;
        updateEnable();
    }

    @Override // com.oplusos.vfxmodelviewer.view.RenderView.OnRenderViewChangeListener
    public void onViewChange(@Nullable android.view.View newView, @Nullable android.view.View oldView) {
        this.mCameraController.setView(newView);
    }

    @Override // com.oplusos.vfxmodelviewer.view.RenderView.OnViewSizeChangeListener
    public void onViewSizeChange(int width, int height) {
        this.mView.setViewport(new Viewport(0, 0, width, height));
        this.mCameraController.onResize(width, height);
        if (this.mModelViewPecent == vr3.UNSET) {
            return;
        }
        updateModelScaleByViewPecent();
    }

    public final void setAAMask(int mask) {
        this.mAAMask = mask;
        ModelUtils.Companion companion = ModelUtils.INSTANCE;
        enableFXAA(companion.isContainsLayer(mask, 1));
        enableMSAA(companion.isContainsLayer(mask, 4));
        enableTAA(companion.isContainsLayer(mask, 2));
    }

    public final void setAASampleCount(int sampleCount) {
        this.mAASampleCount = sampleCount;
        if (ModelUtils.INSTANCE.isContainsLayer(this.mAAMask, 4)) {
            View.MultiSampleAntiAliasingOptions multiSampleAntiAliasingOptions = this.mView.getMultiSampleAntiAliasingOptions();
            Intrinsics.checkNotNullExpressionValue(multiSampleAntiAliasingOptions, "mView.multiSampleAntiAliasingOptions");
            multiSampleAntiAliasingOptions.sampleCount = this.mAASampleCount;
            this.mView.setMultiSampleAntiAliasingOptions(multiSampleAntiAliasingOptions);
        }
    }

    public final void setAAType(@NotNull AAType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            setAAMask(0);
            return;
        }
        if (i == 2) {
            setAAMask(1);
        } else if (i == 3) {
            setAAMask(4);
        } else {
            if (i != 4) {
                return;
            }
            setAAMask(2);
        }
    }

    public final void setFrameStep(int step) {
        this.mFrameStep = step;
    }

    public final void setIBLAngle(float x, float y, float z) {
        float[] fArr = this.mIBLAngle;
        fArr[0] = x;
        fArr[1] = y;
        fArr[2] = z;
        applyIBLAngle();
    }

    public final void setIBLIntensity(float intensity) {
        this.mIBLIntensity = intensity;
        IndirectLight indirectLight = this.mScene.getIndirectLight();
        if (indirectLight == null) {
            return;
        }
        indirectLight.setIntensity(intensity);
    }

    public final void setLightDir(float x, float y, float z) {
        float[] fArr = this.mLightDir;
        fArr[0] = x;
        fArr[1] = y;
        fArr[2] = z;
        int lightManager = this.mEngine.getLightManager().getInstance(this.mLight);
        LightManager lightManager2 = this.mEngine.getLightManager();
        float[] fArr2 = this.mLightDir;
        lightManager2.setDirection(lightManager, fArr2[0], fArr2[1], fArr2[2]);
    }

    public final void setLightIntensity(float intensity) {
        this.mLightIntensity = intensity;
        this.mEngine.getLightManager().setIntensity(this.mEngine.getLightManager().getInstance(this.mLight), this.mLightIntensity);
    }

    public final void setMaterials(@NotNull MaterialGroupConfig materials) {
        Intrinsics.checkNotNullParameter(materials, "materials");
        this.mMaterials = materials;
        updateMaterial();
    }

    public final void setModelScale(float scale) {
        this.mModelScale = scale;
        updateScale();
    }

    public final void setModelScaleByViewPecent(float pecent) {
        this.mModelViewPecent = pecent;
        if (pecent == vr3.UNSET) {
            return;
        }
        updateModelScaleByViewPecent();
    }

    public final void setName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.mName = name;
    }

    public final void setOpaque(boolean isOpaque) {
        Renderer.ClearOptions clearOptions = this.mRenderer.getClearOptions();
        Intrinsics.checkNotNullExpressionValue(clearOptions, "mRenderer.clearOptions");
        clearOptions.clear = !isOpaque;
        this.mRenderer.setClearOptions(clearOptions);
        this.mView.setBlendMode(View.BlendMode.OPAQUE);
        this.mRenderView.enableAlpha(!isOpaque);
    }

    public final void setQualityLevel(@NotNull QualityLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.mQualityLevel = level;
        int i = WhenMappings.$EnumSwitchMapping$1[level.ordinal()];
        if (i == 1) {
            autoSetQuality();
            return;
        }
        if (i == 2) {
            setLowQuality();
        } else if (i == 3) {
            setMediumQuality();
        } else {
            if (i != 4) {
                return;
            }
            setHighQuality();
        }
    }

    public final void setRenderDirty() {
        this.mRenderDirty = true;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005 A[PHI: r0
  0x0005: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public final void setResolutionScale(float scale) {
        float f = vr3.UNSET;
        if (scale < vr3.UNSET) {
            scale = f;
        } else {
            f = 1.0f;
            if (scale > 1.0f) {
                scale = f;
            }
        }
        this.mResolutionScale = scale;
        this.mRenderer.setResolutionScale(scale);
    }

    public final void setSkyboxColor(float r, float g, float b, float a) {
        float[] fArr = this.mBackgroundColor;
        if (r < vr3.UNSET) {
            r = 0.0f;
        } else if (r > 1.0f) {
            r = 1.0f;
        }
        fArr[0] = r;
        if (g < vr3.UNSET) {
            g = 0.0f;
        } else if (g > 1.0f) {
            g = 1.0f;
        }
        fArr[1] = g;
        if (b < vr3.UNSET) {
            b = 0.0f;
        } else if (b > 1.0f) {
            b = 1.0f;
        }
        fArr[2] = b;
        if (a < vr3.UNSET) {
            a = 0.0f;
        } else if (a > 1.0f) {
            a = 1.0f;
        }
        fArr[3] = a;
        Skybox skybox = this.mColorSkybox;
        Intrinsics.checkNotNull(skybox);
        float[] fArr2 = this.mBackgroundColor;
        skybox.setColor(fArr2[0], fArr2[1], fArr2[2], fArr2[3] * this.mTransparentValue);
    }

    public final void setSkyboxColorGammaCorrect(float r, float g, float b, float a) {
        if (r < vr3.UNSET) {
            r = 0.0f;
        } else if (r > 1.0f) {
            r = 1.0f;
        }
        if (g < vr3.UNSET) {
            g = 0.0f;
        } else if (g > 1.0f) {
            g = 1.0f;
        }
        if (b < vr3.UNSET) {
            b = 0.0f;
        } else if (b > 1.0f) {
            b = 1.0f;
        }
        if (a < vr3.UNSET) {
            a = 0.0f;
        } else if (a > 1.0f) {
            a = 1.0f;
        }
        double d = 2.2f;
        this.mBackgroundColor[0] = (float) StrictMath.pow(r, d);
        this.mBackgroundColor[1] = (float) StrictMath.pow(g, d);
        this.mBackgroundColor[2] = (float) StrictMath.pow(b, d);
        this.mBackgroundColor[3] = a;
        Skybox skybox = this.mColorSkybox;
        Intrinsics.checkNotNull(skybox);
        float[] fArr = this.mBackgroundColor;
        skybox.setColor(fArr[0], fArr[1], fArr[2], fArr[3] * this.mTransparentValue);
    }

    public final void setSurfaceView(@NotNull SurfaceView surfaceView, boolean applySize) {
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        this.mRenderView.setSurfaceView(surfaceView, applySize);
    }

    public final void setTextureView(@NotNull TextureView textureView, boolean applySize) {
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        this.mRenderView.setTextureView(textureView, applySize);
    }

    public final void setViewSize(int width, int height) {
        this.mRenderView.setViewSize(width, height);
    }

    public final void update(long frameTimeNanos) {
        FilamentAsset filamentAsset;
        if (!this.mEnable || this.mDestroyed) {
            return;
        }
        long jNanoTime = System.nanoTime() - this.mRunningLastTime;
        if (jNanoTime <= 10000000) {
            return;
        }
        long j = this.mFramCount + 1;
        this.mFramCount = j;
        if (j % ((long) this.mFrameStep) != 0) {
            return;
        }
        float f = (float) (jNanoTime / ((double) 1000000000));
        this.mRunningTime += jNanoTime;
        this.mRunningLastTime = System.nanoTime();
        ResourceLoader resourceLoader = this.mResourceLoader;
        if (resourceLoader != null) {
            resourceLoader.asyncUpdateLoad();
            if ((resourceLoader.asyncGetLoadProgress() == 1.0f) && (filamentAsset = this.mAsset) != null) {
                Intrinsics.checkNotNull(filamentAsset);
                populateScene(filamentAsset);
            }
        }
        this.mAnimationController.update(f);
        this.mRenderView.update(f);
        this.mCameraController.update(f);
        render(frameTimeNanos);
    }
}
