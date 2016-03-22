package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=MigrationCapability, data=[xbzrle, rdma-pin-all, auto-converge, zero-blocks, compress, events, x-postcopy-ram], fields=null}</pre>
 */
// QApiEnumDescriptor{name=MigrationCapability, data=[xbzrle, rdma-pin-all, auto-converge, zero-blocks, compress, events, x-postcopy-ram], fields=null}
public enum MigrationCapability {
	xbzrle("xbzrle"),
	rdma_pin_all("rdma-pin-all"),
	auto_converge("auto-converge"),
	zero_blocks("zero-blocks"),
	compress("compress"),
	events("events"),
	x_postcopy_ram("x-postcopy-ram"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ MigrationCapability(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
