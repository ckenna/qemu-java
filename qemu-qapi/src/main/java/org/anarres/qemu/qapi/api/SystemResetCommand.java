package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=system_reset, returns=null, data=null}</pre>
 */
// QApiCommandDescriptor{name=system_reset, returns=null, data=null}
public class SystemResetCommand extends QApiCommand<java.lang.Void, SystemResetCommand.Response> {

	/** Response to a SystemResetCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new SystemResetCommand. */
	public SystemResetCommand() {
		super("system_reset", Response.class, null);
	}

}
