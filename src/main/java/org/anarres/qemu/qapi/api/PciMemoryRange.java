package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=PciMemoryRange, data={base=int, limit=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=PciMemoryRange, data={base=int, limit=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PciMemoryRange extends QApiType {

	@JsonProperty("base")
	@Nonnull
	public long base;
	@JsonProperty("limit")
	@Nonnull
	public long limit;

	@Nonnull
	public PciMemoryRange withBase(long value) {
		this.base = value;
		return this;
	}

	@Nonnull
	public PciMemoryRange withLimit(long value) {
		this.limit = value;
		return this;
	}

	public PciMemoryRange() {
	}

	public PciMemoryRange(long base, long limit) {
		this.base = base;
		this.limit = limit;
	}
}