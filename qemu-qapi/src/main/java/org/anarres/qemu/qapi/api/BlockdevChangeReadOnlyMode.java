package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=BlockdevChangeReadOnlyMode, data=[retain, read-only, read-write], fields=null}</pre>
 */
// QApiEnumDescriptor{name=BlockdevChangeReadOnlyMode, data=[retain, read-only, read-write], fields=null}
public enum BlockdevChangeReadOnlyMode {
	retain("retain"),
	read_only("read-only"),
	read_write("read-write"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ BlockdevChangeReadOnlyMode(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
