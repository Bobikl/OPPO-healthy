package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplusos.vfxmodelviewer.filament.proguard.UsedByReflection;

/* JADX INFO: loaded from: classes9.dex */
public class Engine {

    @NonNull
    private final EntityManager mEntityManager;

    @NonNull
    private final LightManager mLightManager;
    private long mNativeObject;

    @NonNull
    private final RenderableManager mRenderableManager;

    @NonNull
    private final TransformManager mTransformManager;

    public enum Backend {
        DEFAULT,
        OPENGL,
        VULKAN,
        METAL,
        NOOP
    }

    private Engine(long j2) {
        this.mNativeObject = j2;
        this.mTransformManager = new TransformManager(nGetTransformManager(j2));
        this.mLightManager = new LightManager(nGetLightManager(j2));
        this.mRenderableManager = new RenderableManager(nGetRenderableManager(j2));
        this.mEntityManager = new EntityManager(nGetEntityManager(j2));
    }

    private static void assertDestroy(boolean z) {
        if (!z) {
            throw new IllegalStateException("Object couldn't be destroyed (double destroy()?)");
        }
    }

    private void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    @NonNull
    public static Engine create() {
        long jNCreateEngine = nCreateEngine(0L, 0L);
        if (jNCreateEngine != 0) {
            return new Engine(jNCreateEngine);
        }
        throw new IllegalStateException("Couldn't create Engine");
    }

    private static native long nCreateCamera(long j2, int i);

    private static native long nCreateEngine(long j2, long j3);

    private static native long nCreateFence(long j2);

    private static native long nCreateNativeWindow(Object obj);

    private static native long nCreateRenderer(long j2);

    private static native long nCreateScene(long j2);

    private static native long nCreateSwapChain(long j2, long j3, long j4);

    private static native long nCreateSwapChainFromRawPointer(long j2, long j3, long j4);

    private static native long nCreateSwapChainHeadless(long j2, int i, int i2, long j3);

    private static native long nCreateView(long j2);

    private static native void nDestroyCameraComponent(long j2, int i);

    private static native boolean nDestroyColorGrading(long j2, long j3);

    private static native void nDestroyEngine(long j2);

    private static native void nDestroyEntity(long j2, int i);

    private static native boolean nDestroyFence(long j2, long j3);

    private static native boolean nDestroyIndexBuffer(long j2, long j3);

    private static native boolean nDestroyIndirectLight(long j2, long j3);

    private static native boolean nDestroyMaterial(long j2, long j3);

    private static native boolean nDestroyMaterialInstance(long j2, long j3);

    private static native void nDestroyNativeWindow(long j2);

    private static native boolean nDestroyRenderTarget(long j2, long j3);

    private static native boolean nDestroyRenderer(long j2, long j3);

    private static native boolean nDestroyScene(long j2, long j3);

    private static native boolean nDestroySkybox(long j2, long j3);

    private static native boolean nDestroyStream(long j2, long j3);

    private static native boolean nDestroySwapChain(long j2, long j3);

    private static native boolean nDestroyTexture(long j2, long j3);

    private static native boolean nDestroyVertexBuffer(long j2, long j3);

    private static native boolean nDestroyView(long j2, long j3);

    private static native void nFlushAndWait(long j2);

    private static native long nGetBackend(long j2);

    private static native long nGetCameraComponent(long j2, int i);

    private static native long nGetEntityManager(long j2);

    private static native long nGetJobSystem(long j2);

    private static native long nGetLightManager(long j2);

    private static native long nGetRenderableManager(long j2);

    private static native long nGetTransformManager(long j2);

    @NonNull
    public Camera createCamera(@Entity int i) {
        long jNCreateCamera = nCreateCamera(getNativeObject(), i);
        if (jNCreateCamera != 0) {
            return new Camera(jNCreateCamera, i);
        }
        throw new IllegalStateException("Couldn't create Camera");
    }

    @NonNull
    public Fence createFence() {
        long jNCreateFence = nCreateFence(getNativeObject());
        if (jNCreateFence != 0) {
            return new Fence(jNCreateFence);
        }
        throw new IllegalStateException("Couldn't create Fence");
    }

    public long createNativeWindow(@NonNull Object obj) {
        return nCreateNativeWindow(obj);
    }

    @NonNull
    public Renderer createRenderer() {
        long jNCreateRenderer = nCreateRenderer(getNativeObject());
        if (jNCreateRenderer != 0) {
            return new Renderer(this, jNCreateRenderer);
        }
        throw new IllegalStateException("Couldn't create Renderer");
    }

    @NonNull
    public Scene createScene() {
        long jNCreateScene = nCreateScene(getNativeObject());
        if (jNCreateScene != 0) {
            return new Scene(jNCreateScene);
        }
        throw new IllegalStateException("Couldn't create Scene");
    }

    @NonNull
    public SwapChain createSwapChain(@NonNull Object obj) {
        return createSwapChain(obj, 0L);
    }

    @NonNull
    public SwapChain createSwapChainFromNativeSurface(@NonNull NativeSurface nativeSurface, long j2) {
        long jNCreateSwapChainFromRawPointer = nCreateSwapChainFromRawPointer(getNativeObject(), nativeSurface.getNativeObject(), j2);
        if (jNCreateSwapChainFromRawPointer != 0) {
            return new SwapChain(jNCreateSwapChainFromRawPointer, nativeSurface);
        }
        throw new IllegalStateException("Couldn't create SwapChain");
    }

    @NonNull
    public View createView() {
        long jNCreateView = nCreateView(getNativeObject());
        if (jNCreateView != 0) {
            return new View(jNCreateView);
        }
        throw new IllegalStateException("Couldn't create View");
    }

    public void destroy() {
        nDestroyEngine(getNativeObject());
        clearNativeObject();
    }

    public void destroyCameraComponent(@Entity int i) {
        nDestroyCameraComponent(getNativeObject(), i);
    }

    public void destroyColorGrading(@NonNull ColorGrading colorGrading) {
        assertDestroy(nDestroyColorGrading(getNativeObject(), colorGrading.getNativeObject()));
        colorGrading.clearNativeObject();
    }

    public void destroyEntity(@Entity int i) {
        nDestroyEntity(getNativeObject(), i);
    }

    public void destroyFence(@NonNull Fence fence) {
        assertDestroy(nDestroyFence(getNativeObject(), fence.getNativeObject()));
        fence.clearNativeObject();
    }

    public void destroyIndexBuffer(@NonNull IndexBuffer indexBuffer) {
        assertDestroy(nDestroyIndexBuffer(getNativeObject(), indexBuffer.getNativeObject()));
        indexBuffer.clearNativeObject();
    }

    public void destroyIndirectLight(@NonNull IndirectLight indirectLight) {
        assertDestroy(nDestroyIndirectLight(getNativeObject(), indirectLight.getNativeObject()));
        indirectLight.clearNativeObject();
    }

    public void destroyMaterial(@NonNull Material material) {
        assertDestroy(nDestroyMaterial(getNativeObject(), material.getNativeObject()));
        material.clearNativeObject();
    }

    public void destroyMaterialInstance(@NonNull MaterialInstance materialInstance) {
        assertDestroy(nDestroyMaterialInstance(getNativeObject(), materialInstance.getNativeObject()));
        materialInstance.clearNativeObject();
    }

    public void destroyNativeWindow(long j2) {
        nDestroyNativeWindow(j2);
    }

    public void destroyRenderTarget(@NonNull RenderTarget renderTarget) {
        nDestroyRenderTarget(getNativeObject(), renderTarget.getNativeObject());
        renderTarget.clearNativeObject();
    }

    public void destroyRenderer(@NonNull Renderer renderer) {
        assertDestroy(nDestroyRenderer(getNativeObject(), renderer.getNativeObject()));
        renderer.clearNativeObject();
    }

    public void destroyScene(@NonNull Scene scene) {
        assertDestroy(nDestroyScene(getNativeObject(), scene.getNativeObject()));
        scene.clearNativeObject();
    }

    public void destroySkybox(@NonNull Skybox skybox) {
        assertDestroy(nDestroySkybox(getNativeObject(), skybox.getNativeObject()));
        skybox.clearNativeObject();
    }

    public void destroyStream(@NonNull Stream stream) {
        assertDestroy(nDestroyStream(getNativeObject(), stream.getNativeObject()));
        stream.clearNativeObject();
    }

    public void destroySwapChain(@NonNull SwapChain swapChain) {
        assertDestroy(nDestroySwapChain(getNativeObject(), swapChain.getNativeObject()));
        swapChain.clearNativeObject();
        flushAndWait();
        swapChain.destroyNativeWindow(this);
    }

    public void destroyTexture(@NonNull Texture texture) {
        assertDestroy(nDestroyTexture(getNativeObject(), texture.getNativeObject()));
        texture.clearNativeObject();
    }

    public void destroyVertexBuffer(@NonNull VertexBuffer vertexBuffer) {
        assertDestroy(nDestroyVertexBuffer(getNativeObject(), vertexBuffer.getNativeObject()));
        vertexBuffer.clearNativeObject();
    }

    public void destroyView(@NonNull View view) {
        assertDestroy(nDestroyView(getNativeObject(), view.getNativeObject()));
        view.clearNativeObject();
    }

    public void flushAndWait() {
        nFlushAndWait(getNativeObject());
    }

    @NonNull
    public Backend getBackend() {
        return Backend.values()[(int) nGetBackend(getNativeObject())];
    }

    @Nullable
    public Camera getCameraComponent(@Entity int i) {
        long jNGetCameraComponent = nGetCameraComponent(getNativeObject(), i);
        if (jNGetCameraComponent == 0) {
            return null;
        }
        return new Camera(jNGetCameraComponent, i);
    }

    @NonNull
    public EntityManager getEntityManager() {
        return this.mEntityManager;
    }

    @NonNull
    public LightManager getLightManager() {
        return this.mLightManager;
    }

    @UsedByReflection("MaterialBuilder.java")
    public long getNativeJobSystem() {
        if (this.mNativeObject != 0) {
            return nGetJobSystem(getNativeObject());
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }

    @UsedByReflection("TextureHelper.java")
    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }

    @NonNull
    public RenderableManager getRenderableManager() {
        return this.mRenderableManager;
    }

    @NonNull
    public TransformManager getTransformManager() {
        return this.mTransformManager;
    }

    public boolean isValid() {
        return this.mNativeObject != 0;
    }

    @NonNull
    public SwapChain createSwapChain(@NonNull Object obj, long j2) {
        if (!Platform.get().validateSurface(obj)) {
            throw new IllegalArgumentException("Invalid surface " + obj);
        }
        long jNCreateNativeWindow = nCreateNativeWindow(obj);
        if (jNCreateNativeWindow == 0) {
            throw new IllegalStateException("Couldn't create SwapChain");
        }
        long jNCreateSwapChain = nCreateSwapChain(getNativeObject(), jNCreateNativeWindow, j2);
        if (jNCreateSwapChain != 0) {
            return new SwapChain(jNCreateSwapChain, jNCreateNativeWindow, obj);
        }
        throw new IllegalStateException("Couldn't create SwapChain");
    }

    @NonNull
    public static Engine create(@NonNull Backend backend) {
        long jNCreateEngine = nCreateEngine(backend.ordinal(), 0L);
        if (jNCreateEngine != 0) {
            return new Engine(jNCreateEngine);
        }
        throw new IllegalStateException("Couldn't create Engine");
    }

    @NonNull
    public static Engine create(@NonNull Object obj) {
        if (Platform.get().validateSharedContext(obj)) {
            long jNCreateEngine = nCreateEngine(0L, Platform.get().getSharedContextNativeHandle(obj));
            if (jNCreateEngine != 0) {
                return new Engine(jNCreateEngine);
            }
            throw new IllegalStateException("Couldn't create Engine");
        }
        throw new IllegalArgumentException("Invalid shared context " + obj);
    }

    @NonNull
    public SwapChain createSwapChain(int i, int i2, long j2) {
        if (i >= 0 && i2 >= 0) {
            long jNCreateSwapChainHeadless = nCreateSwapChainHeadless(getNativeObject(), i, i2, j2);
            if (jNCreateSwapChainHeadless != 0) {
                return new SwapChain(jNCreateSwapChainHeadless, null);
            }
            throw new IllegalStateException("Couldn't create SwapChain");
        }
        throw new IllegalArgumentException("Invalid parameters");
    }
}
