package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=balloon, returns=null, data={value=int}}</pre>
 */
// QApiCommandDescriptor{name=balloon, returns=null, data={value=int}}
public class BalloonCommand extends QApiCommand<BalloonCommand.Arguments, BalloonCommand.Response> {
	/** Compound arguments to a BalloonCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("value")
		@Nonnull
		public long value;

		public Arguments() {
		}

		public Arguments(long value) {
			this.value = value;
		}
	}

	/** Response to a BalloonCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BalloonCommand. */
	public BalloonCommand(@Nonnull BalloonCommand.Arguments argument) {
		super("balloon", Response.class, argument);
	}

	/** Constructs a new BalloonCommand. */
	public BalloonCommand(long value) {
		this(new Arguments(value));
	}
}
