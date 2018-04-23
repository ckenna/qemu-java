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
 * <pre>QApiCommandDescriptor{name=query-memory-size-summary, returns=MemoryInfo, data=null}</pre>
 */
// QApiCommandDescriptor{name=query-memory-size-summary, returns=MemoryInfo, data=null}
public class QueryMemorySizeSummaryCommand extends QApiCommand<java.lang.Void, QueryMemorySizeSummaryCommand.Response> {

	/** Response to a QueryMemorySizeSummaryCommand. */
	public static class Response extends QApiResponse<MemoryInfo> {
	}

	/** Constructs a new QueryMemorySizeSummaryCommand. */
	public QueryMemorySizeSummaryCommand() {
		super("query-memory-size-summary", Response.class, null);
	}

}
