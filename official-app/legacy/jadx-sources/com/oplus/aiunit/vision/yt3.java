package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yt3 {
    protected JsonFormat.Value _format;
    protected JsonIgnoreProperties.Value _ignorals;
    protected JsonInclude.Value _include;
    protected JsonInclude.Value _includeAsProperty;
    protected Boolean _isIgnoredType;
    protected Boolean _mergeable;
    protected JsonSetter.Value _setterInfo;
    protected JsonAutoDetect.Value _visibility;

    public static final class a extends yt3 {
        public static final a i = new a();
    }

    public yt3() {
    }

    public yt3(yt3 yt3Var) {
        this._format = yt3Var._format;
        this._include = yt3Var._include;
        this._includeAsProperty = yt3Var._includeAsProperty;
        this._ignorals = yt3Var._ignorals;
        this._setterInfo = yt3Var._setterInfo;
        this._visibility = yt3Var._visibility;
        this._isIgnoredType = yt3Var._isIgnoredType;
        this._mergeable = yt3Var._mergeable;
    }

    public static yt3 empty() {
        return a.i;
    }

    public JsonFormat.Value getFormat() {
        return this._format;
    }

    public JsonIgnoreProperties.Value getIgnorals() {
        return this._ignorals;
    }

    public JsonInclude.Value getInclude() {
        return this._include;
    }

    public JsonInclude.Value getIncludeAsProperty() {
        return this._includeAsProperty;
    }

    public Boolean getIsIgnoredType() {
        return this._isIgnoredType;
    }

    public Boolean getMergeable() {
        return this._mergeable;
    }

    public JsonSetter.Value getSetterInfo() {
        return this._setterInfo;
    }

    public JsonAutoDetect.Value getVisibility() {
        return this._visibility;
    }
}
