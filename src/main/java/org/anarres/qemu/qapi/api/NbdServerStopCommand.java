package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=nbd-server-stop, returns=null, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=nbd-server-stop, returns=null, data=null}
public class NbdServerStopCommand extends QApiCommand<java.lang.Void, NbdServerStopCommand.Response> {

	/** Response to a NbdServerStopCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new NbdServerStopCommand. */
	public NbdServerStopCommand() {
		super("nbd-server-stop", Response.class, null);
	}

}
