package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=nbd-server-remove, returns=null, data={name=str, *mode=NbdServerRemoveMode}}</pre>
 */
// QApiCommandDescriptor{name=nbd-server-remove, returns=null, data={name=str, *mode=NbdServerRemoveMode}}
public class NbdServerRemoveCommand extends QApiCommand<NbdServerRemoveCommand.Arguments, NbdServerRemoveCommand.Response> {
	/** Compound arguments to a NbdServerRemoveCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("name")
		@Nonnull
		public java.lang.String name;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("mode")
		@CheckForNull
		public NbdServerRemoveMode mode;

		public Arguments() {
		}

		public Arguments(java.lang.String name, NbdServerRemoveMode mode) {
			this.name = name;
			this.mode = mode;
		}
	}

	/** Response to a NbdServerRemoveCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new NbdServerRemoveCommand. */
	public NbdServerRemoveCommand(@Nonnull NbdServerRemoveCommand.Arguments argument) {
		super("nbd-server-remove", Response.class, argument);
	}

	/** Constructs a new NbdServerRemoveCommand. */
	public NbdServerRemoveCommand(java.lang.String name, NbdServerRemoveMode mode) {
		this(new Arguments(name, mode));
	}
}
