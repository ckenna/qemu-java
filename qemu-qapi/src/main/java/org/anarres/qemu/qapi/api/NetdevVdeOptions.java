package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=NetdevVdeOptions, data={*sock=str, *port=uint16, *group=str, *mode=uint16}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=NetdevVdeOptions, data={*sock=str, *port=uint16, *group=str, *mode=uint16}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetdevVdeOptions extends QApiType {

	@JsonProperty("sock")
	@CheckForNull
	public java.lang.String sock;
	@JsonProperty("port")
	@CheckForNull
	public java.lang.Integer port;
	@JsonProperty("group")
	@CheckForNull
	public java.lang.String group;
	@JsonProperty("mode")
	@CheckForNull
	public java.lang.Integer mode;

	@Nonnull
	public NetdevVdeOptions withSock(java.lang.String value) {
		this.sock = value;
		return this;
	}

	@Nonnull
	public NetdevVdeOptions withPort(java.lang.Integer value) {
		this.port = value;
		return this;
	}

	@Nonnull
	public NetdevVdeOptions withGroup(java.lang.String value) {
		this.group = value;
		return this;
	}

	@Nonnull
	public NetdevVdeOptions withMode(java.lang.Integer value) {
		this.mode = value;
		return this;
	}

	public NetdevVdeOptions() {
	}

	public NetdevVdeOptions(java.lang.String sock, java.lang.Integer port, java.lang.String group, java.lang.Integer mode) {
		this.sock = sock;
		this.port = port;
		this.group = group;
		this.mode = mode;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("sock");
		names.add("port");
		names.add("group");
		names.add("mode");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("sock".equals(name))
			return sock;
		if ("port".equals(name))
			return port;
		if ("group".equals(name))
			return group;
		if ("mode".equals(name))
			return mode;
		return super.getFieldByName(name);
	}
}
