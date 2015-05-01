package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=BlockdevDiscardOptions, data=[ignore, unmap], fields=null}</pre>
 */
// QApiEnumDescriptor{name=BlockdevDiscardOptions, data=[ignore, unmap], fields=null}
public enum BlockdevDiscardOptions {
	ignore("ignore"),
	unmap("unmap"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ BlockdevDiscardOptions(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
