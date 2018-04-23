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
 * <pre>QApiStructDescriptor{name=BlockMeasureInfo, data={required=int, fully-allocated=int}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockMeasureInfo, data={required=int, fully-allocated=int}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockMeasureInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("required")
	@Nonnull
	public long required;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("fully-allocated")
	@Nonnull
	public long fullyAllocated;

	@Nonnull
	public BlockMeasureInfo withRequired(long value) {
		this.required = value;
		return this;
	}

	@Nonnull
	public BlockMeasureInfo withFullyAllocated(long value) {
		this.fullyAllocated = value;
		return this;
	}

	public BlockMeasureInfo() {
	}

	public BlockMeasureInfo(long required, long fullyAllocated) {
		this.required = required;
		this.fullyAllocated = fullyAllocated;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("required");
		names.add("fully-allocated");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("required".equals(name))
			return required;
		if ("fully-allocated".equals(name))
			return fullyAllocated;
		return super.getFieldByName(name);
	}
}
