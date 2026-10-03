package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.oplus.aiunit.vision.gte;
import com.oplus.aiunit.vision.wtg;
import com.oplus.aiunit.vision.xba;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class DefaultPrettyPrinter implements gte, xba<DefaultPrettyPrinter>, Serializable {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    private static final long serialVersionUID = 1;
    protected a _arrayIndenter;
    protected transient int _nesting;
    protected String _objectFieldValueSeparatorWithSpaces;
    protected a _objectIndenter;
    protected final wtg _rootSeparator;
    protected Separators _separators;
    protected boolean _spacesInObjectEntries;

    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
            jsonGenerator.f0(StringUtil.SPACE);
        }
    }

    public static class NopIndenter implements a, Serializable {
        public static final NopIndenter instance = new NopIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
        }
    }

    public interface a {
        boolean isInline();

        void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException;
    }

    public DefaultPrettyPrinter() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public DefaultPrettyPrinter _withSpaces(boolean z) {
        if (this._spacesInObjectEntries == z) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._spacesInObjectEntries = z;
        return defaultPrettyPrinter;
    }

    @Override // com.oplus.aiunit.vision.gte
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // com.oplus.aiunit.vision.gte
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void indentArraysWith(a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        this._arrayIndenter = aVar;
    }

    public void indentObjectsWith(a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        this._objectIndenter = aVar;
    }

    public DefaultPrettyPrinter withArrayIndenter(a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        if (this._arrayIndenter == aVar) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._arrayIndenter = aVar;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withObjectIndenter(a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        if (this._objectIndenter == aVar) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._objectIndenter = aVar;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withRootSeparator(wtg wtgVar) {
        wtg wtgVar2 = this._rootSeparator;
        return (wtgVar2 == wtgVar || (wtgVar != null && wtgVar.equals(wtgVar2))) ? this : new DefaultPrettyPrinter(this, wtgVar);
    }

    public DefaultPrettyPrinter withSeparators(Separators separators) {
        this._separators = separators;
        this._objectFieldValueSeparatorWithSpaces = " " + separators.getObjectFieldValueSeparator() + " ";
        return this;
    }

    public DefaultPrettyPrinter withSpacesInObjectEntries() {
        return _withSpaces(true);
    }

    public DefaultPrettyPrinter withoutSpacesInObjectEntries() {
        return _withSpaces(false);
    }

    @Override // com.oplus.aiunit.vision.gte
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.f0(this._separators.getArrayValueSeparator());
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // com.oplus.aiunit.vision.gte
    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.f0(StringUtil.SPACE);
        }
        jsonGenerator.f0(']');
    }

    @Override // com.oplus.aiunit.vision.gte
    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.f0(StringUtil.SPACE);
        }
        jsonGenerator.f0('}');
    }

    @Override // com.oplus.aiunit.vision.gte
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.f0(this._separators.getObjectEntrySeparator());
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // com.oplus.aiunit.vision.gte
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        if (this._spacesInObjectEntries) {
            jsonGenerator.h0(this._objectFieldValueSeparatorWithSpaces);
        } else {
            jsonGenerator.f0(this._separators.getObjectFieldValueSeparator());
        }
    }

    @Override // com.oplus.aiunit.vision.gte
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        wtg wtgVar = this._rootSeparator;
        if (wtgVar != null) {
            jsonGenerator.g0(wtgVar);
        }
    }

    @Override // com.oplus.aiunit.vision.gte
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.f0('[');
    }

    @Override // com.oplus.aiunit.vision.gte
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.f0('{');
        if (this._objectIndenter.isInline()) {
            return;
        }
        this._nesting++;
    }

    public DefaultPrettyPrinter(String str) {
        this(str == null ? null : new SerializedString(str));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.oplus.aiunit.vision.xba
    public DefaultPrettyPrinter createInstance() {
        if (getClass() == DefaultPrettyPrinter.class) {
            return new DefaultPrettyPrinter(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    public DefaultPrettyPrinter(wtg wtgVar) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._rootSeparator = wtgVar;
        withSeparators(gte.DEFAULT_SEPARATORS);
    }

    public DefaultPrettyPrinter withRootSeparator(String str) {
        return withRootSeparator(str == null ? null : new SerializedString(str));
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, wtg wtgVar) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._separators = defaultPrettyPrinter._separators;
        this._objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        this._rootSeparator = wtgVar;
    }
}
