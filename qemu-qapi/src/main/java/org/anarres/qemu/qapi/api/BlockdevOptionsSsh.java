package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiStructDescriptor{name=BlockdevOptionsSsh, data={server=InetSocketAddress, path=str, *user=str, *host-key-check=SshHostKeyCheck}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockdevOptionsSsh, data={server=InetSocketAddress, path=str, *user=str, *host-key-check=SshHostKeyCheck}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsSsh extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("server")
	@Nonnull
	public InetSocketAddress server;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("path")
	@Nonnull
	public java.lang.String path;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("user")
	@CheckForNull
	public java.lang.String user;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("host-key-check")
	@CheckForNull
	public SshHostKeyCheck hostKeyCheck;

	@Nonnull
	public BlockdevOptionsSsh withServer(InetSocketAddress value) {
		this.server = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsSsh withPath(java.lang.String value) {
		this.path = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsSsh withUser(java.lang.String value) {
		this.user = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsSsh withHostKeyCheck(SshHostKeyCheck value) {
		this.hostKeyCheck = value;
		return this;
	}

	public BlockdevOptionsSsh() {
	}

	public BlockdevOptionsSsh(InetSocketAddress server, java.lang.String path, java.lang.String user, SshHostKeyCheck hostKeyCheck) {
		this.server = server;
		this.path = path;
		this.user = user;
		this.hostKeyCheck = hostKeyCheck;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("server");
		names.add("path");
		names.add("user");
		names.add("host-key-check");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("server".equals(name))
			return server;
		if ("path".equals(name))
			return path;
		if ("user".equals(name))
			return user;
		if ("host-key-check".equals(name))
			return hostKeyCheck;
		return super.getFieldByName(name);
	}
}
