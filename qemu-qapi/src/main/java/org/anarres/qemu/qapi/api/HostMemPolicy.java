package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=HostMemPolicy, data=[default, preferred, bind, interleave], fields=null}</pre>
 */
// QApiEnumDescriptor{name=HostMemPolicy, data=[default, preferred, bind, interleave], fields=null}
public enum HostMemPolicy {
	_default("default"),
	preferred("preferred"),
	bind("bind"),
	interleave("interleave"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ HostMemPolicy(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
