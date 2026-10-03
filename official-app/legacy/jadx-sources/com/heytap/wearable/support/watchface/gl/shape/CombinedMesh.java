package com.heytap.wearable.support.watchface.gl.shape;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class CombinedMesh extends Mesh {
    private float mExtend;
    private float mMinX;
    private ArrayList<CurveLine> mCurveLines = new ArrayList<>();
    private int mVertexCount = 0;
    private int mIndexCount = 0;

    public CombinedMesh(float f, float f2) {
        this.mMinX = f;
        this.mExtend = f2;
    }

    public void addCurveLine(CurveLine curveLine) {
        this.mCurveLines.add(curveLine);
        this.mVertexCount += curveLine.getVertexCount();
        this.mIndexCount += curveLine.getIndexCount();
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Mesh
    public void create() {
        beginUpdateVertex(this.mVertexCount, CurveLine.getVertexElementsNum());
        beginUpdateIndex(this.mIndexCount);
        int vertexCount = 0;
        int indexCount = 0;
        for (CurveLine curveLine : this.mCurveLines) {
            curveLine.createCombined(this, vertexCount, indexCount);
            vertexCount += curveLine.getVertexCount();
            indexCount += curveLine.getIndexCount();
        }
        endUpdateVertex();
        endUpdateIndex();
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Mesh
    public float getExtendX() {
        return this.mExtend;
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Mesh
    public float getMinX() {
        return this.mMinX;
    }
}
