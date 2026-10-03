package com.heytap.wearable.support.watchface.gl;

import android.opengl.Matrix;
import com.heytap.wearable.support.watchface.gl.material.ShaderProgram;
import com.heytap.wearable.support.watchface.gl.material.Texture;
import com.heytap.wearable.support.watchface.gl.shape.Mesh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class RenderObject {
    private float[] mModelMatrix;
    private ShaderProgram mShaderProgram = null;
    private Mesh[] mMeshes = null;
    private Object mTextures = null;
    private Camera mCamera = null;
    private TransformNode mTransformNode = null;
    private ArrayList<float[]> mParamList = new ArrayList<>();
    private float mPosX = 0.0f;
    private float mPosY = 0.0f;
    private float mPosZ = 0.0f;
    private float mScale = 1.0f;

    public RenderObject() {
        float[] fArr = new float[16];
        this.mModelMatrix = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    private void activeTexture(Texture[] textureArr) {
        for (int i = 0; i < textureArr.length; i++) {
            textureArr[i].activeTexture(i);
        }
    }

    private void drawMeshes(Mesh[] meshArr) {
        for (Mesh mesh : meshArr) {
            if (mesh != null && mesh.getIsShow()) {
                if (mesh.getChildMeshes() == null && this.mShaderProgram != null) {
                    mesh.beginDraw();
                    short texIndex = mesh.getTexIndex();
                    if (texIndex >= 0) {
                        Object obj = this.mTextures;
                        if (obj instanceof Texture[][]) {
                            activeTexture(((Texture[][]) obj)[texIndex]);
                        }
                    }
                    this.mShaderProgram.updateMeshData(mesh);
                    this.mShaderProgram.updateEdgeBlendParam(mesh.getEdgeBlendParam());
                    mesh.draw();
                    mesh.endDraw();
                } else if (mesh.getChildMeshes() != null) {
                    drawMeshes(mesh.getChildMeshes());
                }
            }
        }
    }

    private void drawMeshesInstanced(Mesh[] meshArr, int i, float f) {
        for (Mesh mesh : meshArr) {
            if (mesh != null && mesh.getIsShow()) {
                if (mesh.getChildMeshes() == null && this.mShaderProgram != null) {
                    mesh.beginDraw();
                    short texIndex = mesh.getTexIndex();
                    if (texIndex >= 0) {
                        Object obj = this.mTextures;
                        if (obj instanceof Texture[][]) {
                            activeTexture(((Texture[][]) obj)[texIndex]);
                        }
                    }
                    this.mShaderProgram.updateMeshData(mesh);
                    this.mShaderProgram.updateEdgeBlendParam(mesh.getEdgeBlendParam());
                    mesh.drawInstanced(i, f);
                    mesh.endDraw();
                } else if (mesh.getChildMeshes() != null) {
                    drawMeshes(mesh.getChildMeshes());
                }
            }
        }
    }

    public void ApplyTransform(TransformNode transformNode) {
        ShaderProgram shaderProgram = this.mShaderProgram;
        if (shaderProgram == null || transformNode == null) {
            return;
        }
        shaderProgram.useProgram();
        this.mShaderProgram.updateWorldMatrix(transformNode.getModelMatrix());
    }

    public void addParam(float[] fArr) {
        this.mParamList.add(fArr);
    }

    public void applyParam(int i) {
        ShaderProgram shaderProgram = this.mShaderProgram;
        if (shaderProgram != null) {
            shaderProgram.useProgram();
            this.mShaderProgram.updateParam(this.mParamList.get(i), i);
        }
    }

    public void draw() {
        ShaderProgram shaderProgram = this.mShaderProgram;
        if (shaderProgram != null) {
            shaderProgram.useProgram();
            Camera camera = this.mCamera;
            if (camera != null) {
                this.mShaderProgram.updateViewData(camera);
            }
            ApplyTransform(this.mTransformNode);
            int size = this.mParamList.size();
            for (int i = 0; i < size; i++) {
                applyParam(i);
            }
        }
        Object obj = this.mTextures;
        if (obj != null && (obj instanceof Texture[])) {
            activeTexture((Texture[]) obj);
        }
        Mesh[] meshArr = this.mMeshes;
        if (meshArr != null) {
            drawMeshes(meshArr);
        }
    }

    public void drawInstanced(int i, float f) {
        ShaderProgram shaderProgram = this.mShaderProgram;
        if (shaderProgram != null) {
            shaderProgram.useProgram();
            Camera camera = this.mCamera;
            if (camera != null) {
                this.mShaderProgram.updateViewData(camera);
            }
            ApplyTransform(this.mTransformNode);
            int size = this.mParamList.size();
            for (int i2 = 0; i2 < size; i2++) {
                applyParam(i2);
            }
        }
        Object obj = this.mTextures;
        if (obj != null && (obj instanceof Texture[])) {
            activeTexture((Texture[]) obj);
        }
        Mesh[] meshArr = this.mMeshes;
        if (meshArr != null) {
            drawMeshesInstanced(meshArr, i, f);
        }
    }

    public void setCamera(Camera camera) {
        this.mCamera = camera;
    }

    public void setMesh(Mesh[] meshArr) {
        this.mMeshes = meshArr;
    }

    public void setShaderProgram(ShaderProgram shaderProgram) {
        this.mShaderProgram = shaderProgram;
    }

    public void setTexture(Object obj) {
        this.mTextures = obj;
    }

    public void setTransform(TransformNode transformNode) {
        this.mTransformNode = transformNode;
    }
}
