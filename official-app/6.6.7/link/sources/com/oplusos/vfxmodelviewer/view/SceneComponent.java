package com.oplusos.vfxmodelviewer.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/SceneComponent;", "", "modelScene", "Lcom/oplusos/vfxmodelviewer/view/ModelScene;", "(Lcom/oplusos/vfxmodelviewer/view/ModelScene;)V", "mDestroyed", "", "mEnable", "mScene", "getMScene", "()Lcom/oplusos/vfxmodelviewer/view/ModelScene;", "mSceneEnable", "mUserEnable", "destroy", "", "enable", "getEnable", "onDestroy", "onDisable", "onEnable", "onUpdate", "deltaTime", "", "sceneEnable", "update", "updateEnable", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class SceneComponent {
    private boolean mDestroyed;
    private boolean mEnable;

    @NotNull
    private final ModelScene mScene;
    private boolean mSceneEnable;
    private boolean mUserEnable;

    public SceneComponent(@NotNull ModelScene modelScene) {
        Intrinsics.checkNotNullParameter(modelScene, "modelScene");
        this.mScene = modelScene;
        this.mUserEnable = true;
    }

    private final void updateEnable() {
        boolean z = this.mUserEnable & this.mSceneEnable;
        if (z == this.mEnable) {
            return;
        }
        this.mEnable = z;
        if (z) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public final void destroy() {
        if (this.mDestroyed) {
            return;
        }
        this.mDestroyed = true;
        enable(false);
        onDestroy();
    }

    public final void enable(boolean enable) {
        this.mUserEnable = enable;
        updateEnable();
    }

    /* JADX INFO: renamed from: getEnable, reason: from getter */
    public final boolean getMEnable() {
        return this.mEnable;
    }

    @NotNull
    public final ModelScene getMScene() {
        return this.mScene;
    }

    public void onDestroy() {
    }

    public void onDisable() {
    }

    public void onEnable() {
    }

    public void onUpdate(float deltaTime) {
    }

    public final void sceneEnable(boolean enable) {
        this.mSceneEnable = enable;
        updateEnable();
    }

    public final void update(float deltaTime) {
        if (this.mEnable) {
            onUpdate(deltaTime);
        }
    }
}
