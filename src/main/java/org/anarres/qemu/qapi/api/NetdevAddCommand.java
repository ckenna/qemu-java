package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=netdev_add, returns=null, data={type=str, id=str, *props=**}}</pre></p>
 */
// QApiCommandDescriptor{name=netdev_add, returns=null, data={type=str, id=str, *props=**}}
public class NetdevAddCommand extends QApiCommand<NetdevAddCommand.Arguments, NetdevAddCommand.Response> {
	/** Compound arguments to a NetdevAddCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("type")
		@Nonnull
		public java.lang.String type;
		@JsonProperty("id")
		@Nonnull
		public java.lang.String id;
		@JsonProperty("props")
		@CheckForNull
		public java.lang.Object props;

		public Arguments() {
		}

		public Arguments(java.lang.String type, java.lang.String id, java.lang.Object props) {
			this.type = type;
			this.id = id;
			this.props = props;
		}
	}

	/** Response to a NetdevAddCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new NetdevAddCommand. */
	public NetdevAddCommand(@Nonnull NetdevAddCommand.Arguments argument) {
		super("netdev_add", Response.class, argument);
	}

	/** Constructs a new NetdevAddCommand. */
	public NetdevAddCommand(java.lang.String type, java.lang.String id, java.lang.Object props) {
		this(new Arguments(type, id, props));
	}
}
