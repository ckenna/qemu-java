package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-block-jobs, returns=[BlockJobInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-block-jobs, returns=[BlockJobInfo], data=null}
public class QueryBlockJobsCommand extends QApiCommand<java.lang.Void, QueryBlockJobsCommand.Response> {

	/** Response to a QueryBlockJobsCommand. */
	public static class Response extends QApiResponse<java.util.List<BlockJobInfo>> {
	}

	/** Constructs a new QueryBlockJobsCommand. */
	public QueryBlockJobsCommand() {
		super("query-block-jobs", Response.class, null);
	}

}
