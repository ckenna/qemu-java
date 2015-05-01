package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=closefd, returns=null, data={fdname=str}}</pre>
 */
// QApiCommandDescriptor{name=closefd, returns=null, data={fdname=str}}
public class ClosefdCommand extends QApiCommand<ClosefdCommand.Arguments, ClosefdCommand.Response> {
	/** Compound arguments to a ClosefdCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("fdname")
		@Nonnull
		public java.lang.String fdname;

		public Arguments() {
		}

		public Arguments(java.lang.String fdname) {
			this.fdname = fdname;
		}
	}

	/** Response to a ClosefdCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new ClosefdCommand. */
	public ClosefdCommand(@Nonnull ClosefdCommand.Arguments argument) {
		super("closefd", Response.class, argument);
	}

	/** Constructs a new ClosefdCommand. */
	public ClosefdCommand(java.lang.String fdname) {
		this(new Arguments(fdname));
	}
}
