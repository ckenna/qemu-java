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
 * <pre>QApiCommandDescriptor{name=migrate-start-postcopy, returns=null, data=null}</pre>
 */
// QApiCommandDescriptor{name=migrate-start-postcopy, returns=null, data=null}
public class MigrateStartPostcopyCommand extends QApiCommand<java.lang.Void, MigrateStartPostcopyCommand.Response> {

	/** Response to a MigrateStartPostcopyCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new MigrateStartPostcopyCommand. */
	public MigrateStartPostcopyCommand() {
		super("migrate-start-postcopy", Response.class, null);
	}

}
