package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.oplus.aiunit.vision.a82;
import com.oplus.aiunit.vision.acf;
import com.oplus.aiunit.vision.dia;
import com.oplus.aiunit.vision.euc;
import com.oplus.aiunit.vision.ex7;
import com.oplus.aiunit.vision.f83;
import com.oplus.aiunit.vision.f9a;
import com.oplus.aiunit.vision.fx7;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.l3e;
import com.oplus.aiunit.vision.nd2;
import com.oplus.aiunit.vision.od2;
import com.oplus.aiunit.vision.pfk;
import com.oplus.aiunit.vision.qfk;
import com.oplus.aiunit.vision.sfk;
import com.oplus.aiunit.vision.t4m;
import com.oplus.aiunit.vision.wtg;
import com.oplus.aiunit.vision.yad;
import com.oplus.aiunit.vision.z72;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;

/* JADX INFO: loaded from: classes13.dex */
public class JsonFactory extends TokenStreamFactory {
    public static final char DEFAULT_QUOTE_CHAR = '\"';
    public static final String FORMAT_NAME_JSON = "JSON";
    private static final long serialVersionUID = 2;
    protected final transient nd2 _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected int _maximumNonEscapedChar;
    protected yad _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final char _quoteChar;
    protected final transient f83 _rootCharSymbols;
    protected wtg _rootValueSeparator;
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    public static final wtg DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    public enum Feature implements dia {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        @Override // com.oplus.aiunit.vision.dia
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (getMask() & i) != 0;
        }

        @Override // com.oplus.aiunit.vision.dia
        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this((yad) null);
    }

    private final boolean _isJSONFactory() {
        return getFormatName() == FORMAT_NAME_JSON;
    }

    private final void _requireJSONFactory(String str) {
        if (!_isJSONFactory()) {
            throw new UnsupportedOperationException(String.format(str, getFormatName()));
        }
    }

    public static c<?, ?> builder() {
        return new b();
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    public ContentReference _createContentReference(Object obj) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj);
    }

    public ht9 _createContext(ContentReference contentReference, boolean z) {
        if (contentReference == null) {
            contentReference = ContentReference.unknown();
        }
        return new ht9(_getBufferRecycler(), contentReference, z);
    }

    public JsonGenerator _createGenerator(Writer writer, ht9 ht9Var) throws IOException {
        t4m t4mVar = new t4m(ht9Var, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            t4mVar.B(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            t4mVar.y(characterEscapes);
        }
        wtg wtgVar = this._rootValueSeparator;
        if (wtgVar != DEFAULT_ROOT_VALUE_SEPARATOR) {
            t4mVar.D(wtgVar);
        }
        return t4mVar;
    }

    public ht9 _createNonBlockingContext(Object obj) {
        return new ht9(_getBufferRecycler(), _createContentReference(obj), false);
    }

    public JsonParser _createParser(InputStream inputStream, ht9 ht9Var) throws IOException {
        return new od2(ht9Var, inputStream).c(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    public JsonGenerator _createUTF8Generator(OutputStream outputStream, ht9 ht9Var) throws IOException {
        qfk qfkVar = new qfk(ht9Var, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            qfkVar.B(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            qfkVar.y(characterEscapes);
        }
        wtg wtgVar = this._rootValueSeparator;
        if (wtgVar != DEFAULT_ROOT_VALUE_SEPARATOR) {
            qfkVar.D(wtgVar);
        }
        return qfkVar;
    }

    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, ht9 ht9Var) throws IOException {
        return jsonEncoding == JsonEncoding.UTF8 ? new sfk(ht9Var, outputStream) : new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    public final InputStream _decorate(InputStream inputStream, ht9 ht9Var) throws IOException {
        InputStream inputStreamDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (inputStreamDecorate = inputDecorator.decorate(ht9Var, inputStream)) == null) ? inputStream : inputStreamDecorate;
    }

    public z72 _getBufferRecycler() {
        return Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures) ? a82.a() : new z72();
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canHandleBinaryNatively() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canParseAsync() {
        return _isJSONFactory();
    }

    public boolean canUseCharArrays() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canUseSchema(fx7 fx7Var) {
        String formatName;
        return (fx7Var == null || (formatName = getFormatName()) == null || !formatName.equals(fx7Var.a())) ? false : true;
    }

    @Deprecated
    public final JsonFactory configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, (yad) null);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        ht9 ht9Var_createContext = _createContext(_createContentReference(outputStream), false);
        ht9Var_createContext.u(jsonEncoding);
        return jsonEncoding == JsonEncoding.UTF8 ? _createUTF8Generator(_decorate(outputStream, ht9Var_createContext), ht9Var_createContext) : _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, ht9Var_createContext), ht9Var_createContext), ht9Var_createContext);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(outputStream, jsonEncoding);
    }

    @Deprecated
    public JsonParser createJsonParser(File file) throws IOException {
        return createParser(file);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new euc(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.A(this._factoryFeatures));
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(File file) throws IOException {
        ht9 ht9Var_createContext = _createContext(_createContentReference(file), true);
        return _createParser(_decorate(new FileInputStream(file), ht9Var_createContext), ht9Var_createContext);
    }

    @Deprecated
    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (~feature.getMask()) & this._factoryFeatures;
        return this;
    }

    @Deprecated
    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return this;
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public yad getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public int getFormatGeneratorFeatures() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return FORMAT_NAME_JSON;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public int getFormatParserFeatures() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Class<? extends ex7> getFormatReadFeatureType() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Class<? extends ex7> getFormatWriteFeatureType() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getGeneratorFeatures() {
        return this._generatorFeatures;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getParserFeatures() {
        return this._parserFeatures;
    }

    public String getRootValueSeparator() {
        wtg wtgVar = this._rootValueSeparator;
        if (wtgVar == null) {
            return null;
        }
        return wtgVar.getValue();
    }

    public MatchStrength hasFormat(f9a f9aVar) throws IOException {
        if (getClass() == JsonFactory.class) {
            return hasJSONFormat(f9aVar);
        }
        return null;
    }

    public MatchStrength hasJSONFormat(f9a f9aVar) throws IOException {
        return od2.h(f9aVar);
    }

    public final boolean isEnabled(Feature feature) {
        return (this._factoryFeatures & feature.getMask()) != 0;
    }

    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public c<?, ?> rebuild() {
        _requireJSONFactory("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new b(this);
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public JsonFactory setCodec(yad yadVar) {
        this._objectCodec = yadVar;
        return this;
    }

    @Deprecated
    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    @Deprecated
    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public JsonFactory setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new SerializedString(str);
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Version version() {
        return l3e.VERSION;
    }

    public JsonFactory(yad yadVar) {
        this._rootCharSymbols = f83.j();
        this._byteSymbolCanonicalizer = nd2.u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = yadVar;
        this._quoteChar = '\"';
    }

    public ContentReference _createContentReference(Object obj, int i, int i2) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj, i, i2);
    }

    public JsonParser _createParser(Reader reader, ht9 ht9Var) throws IOException {
        return new acf(ht9Var, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.n(this._factoryFeatures));
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(Writer writer) throws IOException {
        return createGenerator(writer);
    }

    @Deprecated
    public JsonParser createJsonParser(URL url) throws IOException {
        return createParser(url);
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures = (~feature.getMask()) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final boolean isEnabled(JsonParser.Feature feature) {
        return (this._parserFeatures & feature.getMask()) != 0;
    }

    @Deprecated
    public ht9 _createContext(Object obj, boolean z) {
        return new ht9(_getBufferRecycler(), _createContentReference(obj), z);
    }

    public final Reader _decorate(Reader reader, ht9 ht9Var) throws IOException {
        Reader readerDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (readerDecorate = inputDecorator.decorate(ht9Var, reader)) == null) ? reader : readerDecorate;
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(InputStream inputStream) throws IOException {
        return createParser(inputStream);
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public final boolean isEnabled(StreamReadFeature streamReadFeature) {
        return (this._parserFeatures & streamReadFeature.mappedFeature().getMask()) != 0;
    }

    public JsonParser _createParser(char[] cArr, int i, int i2, ht9 ht9Var, boolean z) throws IOException {
        return new acf(ht9Var, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.n(this._factoryFeatures), cArr, i, i + i2, z);
    }

    @Deprecated
    public JsonParser createJsonParser(Reader reader) throws IOException {
        return createParser(reader);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(URL url) throws IOException {
        ht9 ht9Var_createContext = _createContext(_createContentReference(url), true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), ht9Var_createContext), ht9Var_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (this._generatorFeatures & feature.getMask()) != 0;
    }

    public final DataInput _decorate(DataInput dataInput, ht9 ht9Var) throws IOException {
        DataInput dataInputDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (dataInputDecorate = inputDecorator.decorate(ht9Var, dataInput)) == null) ? dataInput : dataInputDecorate;
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr) throws IOException {
        return createParser(bArr);
    }

    public final boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return (this._generatorFeatures & streamWriteFeature.mappedFeature().getMask()) != 0;
    }

    public JsonParser _createParser(byte[] bArr, int i, int i2, ht9 ht9Var) throws IOException {
        return new od2(ht9Var, bArr, i, i2).c(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr, int i, int i2) throws IOException {
        return createParser(bArr, i, i2);
    }

    public JsonParser _createParser(DataInput dataInput, ht9 ht9Var) throws IOException {
        _requireJSONFactory("InputData source not (yet?) supported for this format (%s)");
        int iL = od2.l(dataInput);
        return new pfk(ht9Var, this._parserFeatures, dataInput, this._objectCodec, this._byteSymbolCanonicalizer.A(this._factoryFeatures), iL);
    }

    public final OutputStream _decorate(OutputStream outputStream, ht9 ht9Var) throws IOException {
        OutputStream outputStreamDecorate;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (outputStreamDecorate = outputDecorator.decorate(ht9Var, outputStream)) == null) ? outputStream : outputStreamDecorate;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(String str) throws IOException {
        return createParser(str);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(InputStream inputStream) throws IOException {
        ht9 ht9Var_createContext = _createContext(_createContentReference(inputStream), false);
        return _createParser(_decorate(inputStream, ht9Var_createContext), ht9Var_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(Writer writer) throws IOException {
        ht9 ht9Var_createContext = _createContext(_createContentReference(writer), false);
        return _createGenerator(_decorate(writer, ht9Var_createContext), ht9Var_createContext);
    }

    public final Writer _decorate(Writer writer, ht9 ht9Var) throws IOException {
        Writer writerDecorate;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (writerDecorate = outputDecorator.decorate(ht9Var, writer)) == null) ? writer : writerDecorate;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(Reader reader) throws IOException {
        ht9 ht9Var_createContext = _createContext(_createContentReference(reader), false);
        return _createParser(_decorate(reader, ht9Var_createContext), ht9Var_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(file);
        ht9 ht9Var_createContext = _createContext(_createContentReference(fileOutputStream), true);
        ht9Var_createContext.u(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(fileOutputStream, ht9Var_createContext), ht9Var_createContext);
        }
        return _createGenerator(_decorate(_createWriter(fileOutputStream, jsonEncoding, ht9Var_createContext), ht9Var_createContext), ht9Var_createContext);
    }

    public JsonFactory(JsonFactory jsonFactory, yad yadVar) {
        this._rootCharSymbols = f83.j();
        this._byteSymbolCanonicalizer = nd2.u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = yadVar;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
        this._quoteChar = jsonFactory._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(byte[] bArr) throws IOException {
        InputStream inputStreamDecorate;
        ht9 ht9Var_createContext = _createContext(_createContentReference(bArr), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(ht9Var_createContext, bArr, 0, bArr.length)) != null) {
            return _createParser(inputStreamDecorate, ht9Var_createContext);
        }
        return _createParser(bArr, 0, bArr.length, ht9Var_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStreamDecorate;
        ht9 ht9Var_createContext = _createContext(_createContentReference(bArr, i, i2), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(ht9Var_createContext, bArr, i, i2)) != null) {
            return _createParser(inputStreamDecorate, ht9Var_createContext);
        }
        return _createParser(bArr, i, i2, ht9Var_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), jsonEncoding);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), JsonEncoding.UTF8);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(String str) throws IOException {
        int length = str.length();
        if (this._inputDecorator == null && length <= 32768 && canUseCharArrays()) {
            ht9 ht9Var_createContext = _createContext(_createContentReference(str), true);
            char[] cArrI = ht9Var_createContext.i(length);
            str.getChars(0, length, cArrI, 0);
            return _createParser(cArrI, 0, length, ht9Var_createContext, true);
        }
        return createParser(new StringReader(str));
    }

    public JsonFactory(b bVar) {
        this._rootCharSymbols = f83.j();
        this._byteSymbolCanonicalizer = nd2.u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = bVar.a;
        this._parserFeatures = bVar.b;
        this._generatorFeatures = bVar.f2239c;
        this._inputDecorator = bVar.d;
        this._outputDecorator = bVar.f2240e;
        this._characterEscapes = bVar.i;
        this._rootValueSeparator = bVar.f2237j;
        this._maximumNonEscapedChar = bVar.k;
        this._quoteChar = bVar.f2238l;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(char[] cArr) throws IOException {
        return createParser(cArr, 0, cArr.length);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        if (this._inputDecorator != null) {
            return createParser(new CharArrayReader(cArr, i, i2));
        }
        return _createParser(cArr, i, i2, _createContext(_createContentReference(cArr, i, i2), true), false);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(DataInput dataInput) throws IOException {
        ht9 ht9Var_createContext = _createContext(_createContentReference(dataInput), false);
        return _createParser(_decorate(dataInput, ht9Var_createContext), ht9Var_createContext);
    }

    public JsonFactory(c<?, ?> cVar, boolean z) {
        this._rootCharSymbols = f83.j();
        this._byteSymbolCanonicalizer = nd2.u();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = cVar.a;
        this._parserFeatures = cVar.b;
        this._generatorFeatures = cVar.f2239c;
        this._inputDecorator = cVar.d;
        this._outputDecorator = cVar.f2240e;
        this._characterEscapes = null;
        this._rootValueSeparator = null;
        this._maximumNonEscapedChar = 0;
        this._quoteChar = '\"';
    }
}
