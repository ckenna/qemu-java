package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiStructDescriptor{name=BlockdevCreateOptionsFile, data={filename=str, size=size, *preallocation=PreallocMode, *nocow=bool}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockdevCreateOptionsFile, data={filename=str, size=size, *preallocation=PreallocMode, *nocow=bool}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevCreateOptionsFile extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("filename")
	@Nonnull
	public java.lang.String filename;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("size")
	@Nonnull
	public long size;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("preallocation")
	@CheckForNull
	public PreallocMode preallocation;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("nocow")
	@CheckForNull
	public java.lang.Boolean nocow;

	@Nonnull
	public BlockdevCreateOptionsFile withFilename(java.lang.String value) {
		this.filename = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsFile withSize(long value) {
		this.size = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsFile withPreallocation(PreallocMode value) {
		this.preallocation = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsFile withNocow(java.lang.Boolean value) {
		this.nocow = value;
		return this;
	}

	public BlockdevCreateOptionsFile() {
	}

	public BlockdevCreateOptionsFile(java.lang.String filename, long size, PreallocMode preallocation, java.lang.Boolean nocow) {
		this.filename = filename;
		this.size = size;
		this.preallocation = preallocation;
		this.nocow = nocow;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("filename");
		names.add("size");
		names.add("preallocation");
		names.add("nocow");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("filename".equals(name))
			return filename;
		if ("size".equals(name))
			return size;
		if ("preallocation".equals(name))
			return preallocation;
		if ("nocow".equals(name))
			return nocow;
		return super.getFieldByName(name);
	}
}
