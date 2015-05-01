package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=InputAxis, data=[X, Y], fields=null}</pre>
 */
// QApiEnumDescriptor{name=InputAxis, data=[X, Y], fields=null}
public enum InputAxis {
	X("X"),
	Y("Y"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ InputAxis(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
