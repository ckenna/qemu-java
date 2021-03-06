package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=BlockdevOnError, data=[report, ignore, enospc, stop, auto], fields=null}</pre>
 */
// QApiEnumDescriptor{name=BlockdevOnError, data=[report, ignore, enospc, stop, auto], fields=null}
public enum BlockdevOnError {
	report("report"),
	ignore("ignore"),
	enospc("enospc"),
	stop("stop"),
	auto("auto"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ BlockdevOnError(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
