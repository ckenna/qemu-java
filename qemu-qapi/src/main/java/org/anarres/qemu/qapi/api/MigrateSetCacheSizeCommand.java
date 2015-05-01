package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=migrate-set-cache-size, returns=null, data={value=int}}</pre>
 */
// QApiCommandDescriptor{name=migrate-set-cache-size, returns=null, data={value=int}}
public class MigrateSetCacheSizeCommand extends QApiCommand<MigrateSetCacheSizeCommand.Arguments, MigrateSetCacheSizeCommand.Response> {
	/** Compound arguments to a MigrateSetCacheSizeCommand. */
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

	/** Response to a MigrateSetCacheSizeCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new MigrateSetCacheSizeCommand. */
	public MigrateSetCacheSizeCommand(@Nonnull MigrateSetCacheSizeCommand.Arguments argument) {
		super("migrate-set-cache-size", Response.class, argument);
	}

	/** Constructs a new MigrateSetCacheSizeCommand. */
	public MigrateSetCacheSizeCommand(long value) {
		this(new Arguments(value));
	}
}
