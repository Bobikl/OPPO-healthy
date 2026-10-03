package com.oplusos.vfxmodelviewer.view;

import android.app.ActivityManager;
import android.content.Context;
import android.view.Choreographer;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.statistics.OplusTrack;
import com.oplusos.vfxmodelviewer.BuildConfig;
import com.oplusos.vfxmodelviewer.filament.Engine;
import com.oplusos.vfxmodelviewer.filament.Filament;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0004J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0010J\b\u0010#\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/ModelViewer;", "", "()V", "mChoreographer", "Landroid/view/Choreographer;", "mEnable", "", "mEngine", "Lcom/oplusos/vfxmodelviewer/filament/Engine;", "mFrameScheduler", "Lcom/oplusos/vfxmodelviewer/view/ModelViewer$FrameCallback;", "mSceneList", "Ljava/util/ArrayList;", "Lcom/oplusos/vfxmodelviewer/view/ModelScene;", "Lkotlin/collections/ArrayList;", "mTrackContext", "Landroid/content/Context;", "commitTrack", "", "creatScene", "name", "", "destroy", "destroyScene", "scene", "enable", "enableCallBack", "finalize", "getEnable", "getEngine", "getScene", "getSceneCount", "", "initTrackSDK", "context", "isTrackCommitAvailable", "Companion", "FrameCallback", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ModelViewer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PerformanceChecker PERFORMANCE = new PerformanceChecker();

    @NotNull
    private static final String TAG = "ModelViewer";

    @NotNull
    private Choreographer mChoreographer;
    private boolean mEnable;

    @NotNull
    private Engine mEngine;

    @NotNull
    private final FrameCallback mFrameScheduler;

    @NotNull
    private ArrayList<ModelScene> mSceneList;

    @Nullable
    private Context mTrackContext;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/ModelViewer$Companion;", "", "()V", "PERFORMANCE", "Lcom/oplusos/vfxmodelviewer/view/PerformanceChecker;", "TAG", "", "extendHighModel", "", "modelArray", "", "([Ljava/lang/String;)V", "getGLVersion", "", "context", "Landroid/content/Context;", "getPerformanceLevel", "Lcom/oplusos/vfxmodelviewer/view/PerformanceChecker$PerformanceLevel;", "getSDKVersion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void extendHighModel(@NotNull String[] modelArray) {
            Intrinsics.checkNotNullParameter(modelArray, "modelArray");
            ModelViewer.PERFORMANCE.extendHighModel(modelArray);
        }

        public final float getGLVersion(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService(ParserTag.TAG_ACTIVITY);
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            String glEsVersion = ((ActivityManager) systemService).getDeviceConfigurationInfo().getGlEsVersion();
            Intrinsics.checkNotNullExpressionValue(glEsVersion, "configInfo.glEsVersion");
            return Float.parseFloat(glEsVersion);
        }

        @NotNull
        public final PerformanceChecker.PerformanceLevel getPerformanceLevel() {
            return ModelViewer.PERFORMANCE.getPerformanceLevel();
        }

        @NotNull
        public final String getSDKVersion() {
            return BuildConfig.SDK_VERSION;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/ModelViewer$FrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "(Lcom/oplusos/vfxmodelviewer/view/ModelViewer;)V", "doFrame", "", "frameTimeNanos", "", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class FrameCallback implements Choreographer.FrameCallback {
        final /* synthetic */ ModelViewer this$0;

        public FrameCallback(ModelViewer modelViewer) {
            Intrinsics.checkNotNullParameter(modelViewer, "this$0");
            this.this$0 = modelViewer;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            if (!this.this$0.getMEnable()) {
                return;
            }
            this.this$0.mChoreographer.postFrameCallback(this);
            int size = this.this$0.mSceneList.size();
            if (size <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                ((ModelScene) this.this$0.mSceneList.get(i)).update(frameTimeNanos);
                if (i2 >= size) {
                    return;
                } else {
                    i = i2;
                }
            }
        }
    }

    static {
        Filament.init();
    }

    public ModelViewer() {
        Engine engineCreate = Engine.create();
        Intrinsics.checkNotNullExpressionValue(engineCreate, "create()");
        this.mEngine = engineCreate;
        this.mFrameScheduler = new FrameCallback(this);
        this.mSceneList = new ArrayList<>();
        Choreographer choreographer = Choreographer.getInstance();
        Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
        this.mChoreographer = choreographer;
        enable(true);
    }

    private final void enableCallBack(boolean enable) {
        if (enable) {
            this.mChoreographer.postFrameCallback(this.mFrameScheduler);
        } else {
            this.mChoreographer.removeFrameCallback(this.mFrameScheduler);
        }
    }

    private final boolean isTrackCommitAvailable() {
        return (this.mTrackContext == null || this.mSceneList.size() == 0) ? false : true;
    }

    public final void commitTrack() {
        if (isTrackCommitAvailable()) {
            ArrayList<ModelScene> arrayList = this.mSceneList;
            ModelScene modelScene = arrayList.get(arrayList.size() - 1);
            Intrinsics.checkNotNullExpressionValue(modelScene, "mSceneList[mSceneList.size-1]");
            ModelScene.SceneTrackConfig sceneTrackConfig = modelScene.getSceneTrackConfig();
            ModelUtils.Companion companion = ModelUtils.INSTANCE;
            Context context = this.mTrackContext;
            Intrinsics.checkNotNull(context);
            int totalPss = companion.getTotalPss(context);
            HashMap map = new HashMap();
            map.put(TrackConfig.average_fps, String.valueOf(sceneTrackConfig.getFps()));
            map.put(TrackConfig.control_time, String.valueOf(sceneTrackConfig.getControlTime()));
            map.put(TrackConfig.show_time, String.valueOf(sceneTrackConfig.getRuningTime()));
            map.put(TrackConfig.scene_name, sceneTrackConfig.getName());
            map.put(TrackConfig.version_name, BuildConfig.SDK_VERSION);
            map.put(TrackConfig.cpu_time, "0");
            map.put(TrackConfig.gpu_time, "0");
            map.put(TrackConfig.load_time, String.valueOf(sceneTrackConfig.getLoadTime()));
            map.put(TrackConfig.memory_usage, String.valueOf(totalPss));
            Context context2 = this.mTrackContext;
            Intrinsics.checkNotNull(context2);
            OplusTrack.onCommon(context2, TrackConfig.app_id, TrackConfig.log_tag, TrackConfig.event_id, map);
        }
    }

    @NotNull
    public final ModelScene creatScene(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ModelScene modelScene = new ModelScene(this.mEngine, this);
        modelScene.setName(name);
        modelScene.enable(this.mEnable);
        this.mSceneList.add(modelScene);
        return modelScene;
    }

    public final void destroy() {
        if (this.mEngine.isValid()) {
            commitTrack();
            int i = 0;
            enable(false);
            int size = this.mSceneList.size();
            if (size > 0) {
                while (true) {
                    int i2 = i + 1;
                    this.mSceneList.get(i).destroy();
                    if (i2 >= size) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            this.mSceneList.clear();
            this.mEngine.destroy();
        }
    }

    public final void destroyScene(@NotNull ModelScene scene) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        scene.destroy();
        int size = this.mSceneList.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (Intrinsics.areEqual(this.mSceneList.get(i), scene)) {
                this.mSceneList.remove(i);
                return;
            } else if (i2 >= size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void enable(boolean enable) {
        if (this.mEnable == enable) {
            return;
        }
        this.mEnable = enable;
        enableCallBack(enable);
        int size = this.mSceneList.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.mSceneList.get(i).enable(this.mEnable);
            if (i2 >= size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void finalize() {
        destroy();
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

    @Nullable
    public final ModelScene getScene(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = this.mSceneList.size();
        if (size <= 0) {
            return null;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (Intrinsics.areEqual(this.mSceneList.get(i).getMName(), name)) {
                return this.mSceneList.get(i);
            }
            if (i2 >= size) {
                return null;
            }
            i = i2;
        }
    }

    public final int getSceneCount() {
        return this.mSceneList.size();
    }

    public final void initTrackSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OplusTrack.init(context);
        this.mTrackContext = context;
    }
}
