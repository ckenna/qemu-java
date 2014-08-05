package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=rtc-reset-reinjection, returns=null, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=rtc-reset-reinjection, returns=null, data=null}
public class RtcResetReinjectionCommand extends QApiCommand<java.lang.Void, RtcResetReinjectionCommand.Response> {

	/** Response to a RtcResetReinjectionCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new RtcResetReinjectionCommand. */
	public RtcResetReinjectionCommand() {
		super("rtc-reset-reinjection", Response.class, null);
	}

}
