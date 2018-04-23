package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=NetClientDriver, data=[none, nic, user, tap, l2tpv3, socket, vde, bridge, hubport, netmap, vhost-user], fields=null}</pre>
 */
// QApiEnumDescriptor{name=NetClientDriver, data=[none, nic, user, tap, l2tpv3, socket, vde, bridge, hubport, netmap, vhost-user], fields=null}
public enum NetClientDriver {
	none("none"),
	nic("nic"),
	user("user"),
	tap("tap"),
	l2tpv3("l2tpv3"),
	socket("socket"),
	vde("vde"),
	bridge("bridge"),
	hubport("hubport"),
	netmap("netmap"),
	vhost_user("vhost-user"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ NetClientDriver(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}