package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=system_powerdown, returns=null, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=system_powerdown, returns=null, data=null}
public class SystemPowerdownCommand extends QApiCommand<java.lang.Void, SystemPowerdownCommand.Response> {

	/** Response to a SystemPowerdownCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new SystemPowerdownCommand. */
	public SystemPowerdownCommand() {
		super("system_powerdown", Response.class, null);
	}

}
