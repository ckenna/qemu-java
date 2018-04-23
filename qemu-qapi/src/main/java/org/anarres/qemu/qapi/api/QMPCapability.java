package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=QMPCapability, data=[oob], fields=null}</pre>
 */
// QApiEnumDescriptor{name=QMPCapability, data=[oob], fields=null}
public enum QMPCapability {
	oob("oob"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ QMPCapability(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}