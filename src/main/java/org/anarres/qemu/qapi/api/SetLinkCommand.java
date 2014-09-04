package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=set_link, returns=null, data={name=str, up=bool}}</pre></p>
 */
// QApiCommandDescriptor{name=set_link, returns=null, data={name=str, up=bool}}
public class SetLinkCommand extends QApiCommand<SetLinkCommand.Arguments, SetLinkCommand.Response> {
	/** Compound arguments to a SetLinkCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("name")
		@Nonnull
		public java.lang.String name;
		@JsonProperty("up")
		@Nonnull
		public boolean up;

		public Arguments() {
		}

		public Arguments(java.lang.String name, boolean up) {
			this.name = name;
			this.up = up;
		}
	}

	/** Response to a SetLinkCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new SetLinkCommand. */
	public SetLinkCommand(@Nonnull SetLinkCommand.Arguments argument) {
		super("set_link", Response.class, argument);
	}

	/** Constructs a new SetLinkCommand. */
	public SetLinkCommand(java.lang.String name, boolean up) {
		this(new Arguments(name, up));
	}
}
